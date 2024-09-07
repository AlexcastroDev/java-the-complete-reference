class OverloadExample {
    void test() {
        System.out.println("No parameter");
    }

    void test(int num) {
        System.out.println("With param " + num);
    }

    void test(int num, int num2) {
        System.out.println("Sum of number is " + num + num2);
    }
}


class Main {
    public static void main(String[] args) {
        var example = new OverloadExample();

        example.test();
        example.test(10);
        example.test(12);
        example.test(3, 5);
        example.test(8, 10);
    }
}
