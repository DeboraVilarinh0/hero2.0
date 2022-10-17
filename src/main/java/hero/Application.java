package hero;

import hero.arena.Arena;
import hero.arena.ArenaObserver;
import hero.commands.Command;
import hero.creator.ArenaCreator;
import hero.game.Game;

import java.io.IOException;

public class Application implements ArenaObserver {
    private Arena arena;
    private hero.game.Game game;

    public static void main(String[] args) throws IOException {
        new Game().run();
    }

    private void run() throws IOException {
        ArenaCreator creator = new ArenaCreator();
        arena = creator.createArena(120, 60, 10, 20, 50);
        arena.addObserver(this);

        game = new hero.game.Game(arena);
        game.draw();

        while (!arena.isFinished()) {
            Command command = game.getNextCommand();
            command.execute();
        }
    }

    @Override
    public void arenaChanged() {
        try {
            game.draw();
        } catch (IOException e) {

        }
    }
}