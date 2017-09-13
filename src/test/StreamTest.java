package test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * lambda表达式
 */
public class StreamTest {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        //输出从0开始的连续10个偶数
        Stream.iterate(0, (Integer integer) -> integer + 2)
                .limit(10)
                .forEach(i ->System.out.print(i + " "));

        System.out.println();

        //随机输出0-1之间的数字，限制5个
        Stream<Double> s = Stream.generate(Math::random).limit(5);
        s.forEach(i -> System.out.print(i + " "));
    }
}
