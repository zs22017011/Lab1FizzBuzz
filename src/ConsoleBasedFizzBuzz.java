class ConsoleBasedFizzBuzz implements FizzBuzz{
    @Override
    public void print(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            if (i % 3 == 0) System.out.println("Fizz");
            if (i % 5 == 0) System.out.println("Buzz");
            if (i % 3 != 0 && i % 5 != 0) System.out.println(i);
        }
    }
}