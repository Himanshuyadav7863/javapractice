public class recursionset_01 {

    static int cut = 0;

    static void show() {
        if (cut >=3) {
            return;
        }

        System.out.println("Ashish");
        cut++;
        show();
    }

    public static void main(String[] args) {
        show();
    }
}