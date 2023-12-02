import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("dimensione " + newFullHash(7).size());
        System.out.println("elementi " + newFullHash(7));
    }
    public static HashSet<Integer> newFullHash (int numElementi) {
        HashSet<Integer> nuovo = new HashSet<>();
        for (int i = 0; i < numElementi; i++) {
            nuovo.add(i);
        }
        return nuovo;
    }
}
