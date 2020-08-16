class Cat {

    public static int couter;
    String name;
    int age;
    // write static and instance variables

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        couter++;
        if (couter > 5 ) {
            System.out.println("You have too many cats");
        }

        // implement the constructor
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return  couter;
        // implement the static method
    }
}