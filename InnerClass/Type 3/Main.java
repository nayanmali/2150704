abstract class PopCorn {
    public abstract void flavor();
}

class Cheese extends PopCorn {
    public void flavor() {
        System.out.println("Cheese PopCorn");
    }
}

class MasalaCheese extends PopCorn {
    public void flavor() {
        System.out.println("Masala Cheese PopCorn");
    }
}

class MaggiMasala extends PopCorn {
    public void flavor() {
        System.out.println("Maggi Masala PopCorn");
    }
}

class Main {
    public static void main(String[] args) {

        Cheese cheese = new Cheese();
        MasalaCheese masalaCheese = new MasalaCheese();
        MaggiMasala maggiMasala = new MaggiMasala();

        cheese.flavor();
        masalaCheese.flavor();
        maggiMasala.flavor();

        new PopCorn() {

            @Override
            public void flavor() {
                System.out.println("New Popcorn");
            }
        }.flavor();

    }
}