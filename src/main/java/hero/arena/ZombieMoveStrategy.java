package hero.arena;

import java.util.Random;

public class ZombieMoveStrategy implements MoveStrategy {

    @Override
    public Position getNextMove(Position position) {
        int x = position.getX();
        int y = position.getY();

        Random random = new Random();
        int direction = random.nextInt(4);

        switch (direction) {
            case 0: return position.moveLeft();
            case 1: return position.moveRight();
            case 2: return position.moveUp();
            case 3: return position.moveDown();
        }

        return position;
    }
}
