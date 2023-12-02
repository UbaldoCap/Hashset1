import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hash1 = newFullHash(7);
        System.out.println(hash1.size());
        System.out.println(hash1);
    }
    public static HashSet<Integer> newFullHash (int numElementi) {
        HashSet<Integer> nuovo = new HashSet<>();
        for (int i = 0; i < numElementi; i++) {
            nuovo.add(i);
        }
        return nuovo;
    }
}
