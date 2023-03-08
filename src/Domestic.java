public class Domestic extends Animal {
    protected Domestic(String name, Integer age) {
        super(name, age);
    }
}

class Cats extends Domestic {
    String type = "Кот";
    public Cats(String name, Integer age) {
        super(name, age);
    }
}

class Dogs extends Domestic {
    public Dogs(String name, Integer age) {
        super(name, age);
    }
}

class Hamsters extends Domestic {
    public Hamsters(String name, Integer age) {
        super(name, age);
    }
}