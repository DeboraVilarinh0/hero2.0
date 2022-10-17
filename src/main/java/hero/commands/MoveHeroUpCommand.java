package hero.commands;

import hero.arena.Arena;
import hero.arena.Position;

public class MoveHeroUpCommand extends Command {
    private final Arena arena;

    public MoveHeroUpCommand(Arena arena) {
        this.arena = arena;
    }

    @Override
    public void execute() {
        Position position = arena.getHeroPosition().moveUp();
        arena.moveHeroTo(position);
        arena.step();
    }
}
