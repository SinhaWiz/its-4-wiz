package EXAMPLE;
enum Directions{
    NORTH{
    public void showDirection(){
        System.out.println("North Direction");
    }
    },
    SOUTH{
        public void showDirection(){
            System.out.println("South Direction");
        }
    },
    EAST{
        public void showDirection(){
            System.out.println("East Direction");
        }
    },
    WEST{
        public void showDirection(){
            System.out.println("West Direction");
        }
    };
    public abstract void showDirection();
}
public class Direction {
    public static void main(String[] args) {
        Directions.NORTH.showDirection();
    }
}

