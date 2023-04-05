public class Main {
    public static void main(String[] args) {
        boolean result = Base.base("rrRW__22","tUyy23y2_","tUyy23y2_");
        if (result) {
            System.out.println("Логин и пороль корректные");
        }
        else {
            System.out.println("Логин и/или пороль некорректные");
        }

    }
}