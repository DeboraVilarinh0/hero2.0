package hero.commands;

import hero.arena.Arena;
import hero.arena.Position;

public class MoveHeroLeftCommand extends Command {
    private final Arena arena;

    public MoveHeroLeftCommand(Arena arena) {
        this.arena = arena;
    }

    @Override
    public void execute() {
        Position position = arena.getHeroPosition().moveLeft();
        arena.moveHeroTo(position);
        arena.step();
    }
}
