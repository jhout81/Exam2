//Questions 3 and 4

public class LogicKnowledge {
    public static void main(String[] args) {
        System.out.println(greenTicket(5, 5, 5));
        System.out.println(makeChocolate(4, 2, 7));
    }

    public static Integer greenTicket(int a, int b, int c) {
        if (b == a && c == a) {
            return 20;
        } else if (a != c && b != a) {
            return 0;
        }
        return 10;
    }

    public static Integer makeChocolate(int small, int large, int goal) {
        int largeLbs = large * 5;
        if ((largeLbs - goal) % 5 == 0 && largeLbs >= goal) {
            return 0;
        } else if (largeLbs - goal < 5 && largeLbs < goal && small >= goal - largeLbs) {
            return goal - largeLbs;
        } else if ((largeLbs - goal) % 5 != 0 && small >= (largeLbs - goal) / 5) {
            return goal - (largeLbs / large);
        }

        return -1;
    }


}
