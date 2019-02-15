import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(solution(a,b,c));
    }

    public static List<Object> solution(double a, double b, double c){
        double disc = b*b - 4*a*c;
        int comp = Double.compare(disc, 0.0);
        if (comp < 0){
            return Collections.emptyList();
        }
        else if (comp == 0){
            return Arrays.asList((-1)*b/(2*a));
        }
        else{
            return Arrays.asList(((-1)*b-Math.sqrt(disc))/(2*a), ((-1)*b+Math.sqrt(disc))/(2*a));
        }
    }
}
