class Counter implements AutoCloseable {
    private int counter;
    public Counter() {
        counter = 0;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int get() {
        return counter;
    }

    @Override
    public void close() throws Exception {
        System.out.println("try with resources");
    }
}