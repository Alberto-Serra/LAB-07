package pt.up.fe.ldts.example5;

public class Turtle {
    private int row;
    private int column;
    private char direction;

    public Turtle(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    public void execute(char command) {
        setMovement(command);
    }

    public void setMovement(char rotation) {
        if (rotation == 'F')
            moveForward();
        else
            switch (direction) {
                case 'N':
                    this.direction = rotation == 'L' ? 'W' : 'E';
                    break;
                case 'W':
                    this.direction = rotation == 'L' ? 'S' : 'N';
                    break;
                case 'S':
                    this.direction = rotation == 'L' ? 'E' : 'W';
                    break;
                case 'E':
                    this.direction = rotation == 'L' ? 'N' : 'S';
                    break;
            }
    }

    public void moveForward() {
        if (direction == 'N') row--;
        else if (direction == 'S') row++;
        else if (direction == 'W') column--;
        else column++;
    }
}

