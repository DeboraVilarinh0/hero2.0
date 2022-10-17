package hero.commands;

import hero.arena.Arena;
import hero.arena.Position;

public class MoveHeroDownCommand extends Command {
    private final Arena arena;

    public MoveHeroDownCommand(Arena arena) {
        this.arena = arena;
    }

    @Override
    public void execute() {
        Position position = arena.getHeroPosition().moveDown();
        arena.moveHeroTo(position);
        arena.step();
    }
}
