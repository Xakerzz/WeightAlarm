public class Fight {
    public static void main(String[] args) {
        Jonson jonson = new Jonson("Jonson", 100, 12, true);
        Bronson bronson = new Bronson("Bronson", 100, 11, true);
        while (bronson.isAlive && jonson.isAlive) {
            jonson.bit(bronson.forceBit);
            bronson.bit(jonson.forceBit);
            if (bronson.health <= 0 && jonson.health <= 0){
                System.out.println("Win Friendship");
                jonson.isAlive =false;
                bronson.isAlive =false;
                break;
            } else {
                if (jonson.health<=0){
                    System.out.println("Win Bronson");
                    System.out.println("Health Bronson: " + bronson.health + " Health Jonson: " + jonson.health);
                    jonson.isAlive = false;
                    break;
                }
                if (bronson.health<=0){
                    System.out.println("Win Jonson");
                    System.out.println("Health Jonson: " + jonson.health + " Health Jonson: " + bronson.health);
                    bronson.isAlive = false;
                    break;
                }
            }

        }
    }


    public static class Jonson {
        private String name;
        private int health;
        private int forceBit;
        private boolean isAlive = true;

        public Jonson(String name, int health, int forceBit, boolean isAlive) {
            this.name = name;
            this.health = health;
            this.forceBit = forceBit;
            this.isAlive = isAlive;
        }

        public void bit(int forceBit) {
            System.out.println("Bronson bit Jonson");
            this.health = this.health - forceBit;
            System.out.println("Jonson health: " + this.health);
        }


    }

    public static class Bronson {
        private String name;
        private int health;
        private int forceBit;
        private boolean isAlive = true;

        public Bronson(String name, int health, int forceBit, boolean isAlive) {
            this.name = name;
            this.health = health;
            this.forceBit = forceBit;
            this.isAlive = isAlive;
        }

        public void bit(int forceBit) {
            System.out.println("Jonson bit Bronson");
            this.health = this.health - forceBit;
            System.out.println("Bronson health: " + this.health);
        }
    }
}
