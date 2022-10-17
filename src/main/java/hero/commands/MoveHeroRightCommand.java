package hero.commands;

import hero.arena.Arena;
import hero.arena.Position;

public class MoveHeroRightCommand extends Command {
    private final Arena arena;

    public MoveHeroRightCommand(Arena arena) {
        this.arena = arena;
    }

    @Override
    public void execute() {
        Position position = arena.getHeroPosition().moveRight();
        arena.moveHeroTo(position);
        arena.step();
    }
}
