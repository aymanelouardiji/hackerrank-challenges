import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
///Given an array,A of N integers, print A's elements in reverse order as a single line of space-separated numbers.
public class Test7Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        for (int i = 0; i < arr.size() ; i ++) { //best-practice approach for (int i = n - 1; i >= 0; i--) { System.out.print(arr.get(i));
            System.out.print(arr.get(--n));
            if (n != 0){
                System.out.print(" ");
            }
        }
        bufferedReader.close();
    }
}
