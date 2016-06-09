public class PifagorTable {

    public static void main(String[] args) {

        new PifagorTable().multiplicationWithFor();
        System.out.println("=============================");
        new PifagorTable().multiplicationWithWhile();
    }

    private void multiplicationWithFor() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    private void multiplicationWithWhile() {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
