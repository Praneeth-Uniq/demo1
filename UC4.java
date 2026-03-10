public class UC4 {

    public static void main(String[] args) {

        String gap = "   ";

        String[] lines = new String[7];

        lines[0] = String.join(gap, " ***** ", " ***** ", "*******", " ****** ");
        lines[1] = String.join(gap, "*     *", "*     *", "*     *", "*       ");
        lines[2] = String.join(gap, "*     *", "*     *", "*******", "*       ");
        lines[3] = String.join(gap, "*     *", "*     *", "*      ", " ****** ");
        lines[4] = String.join(gap, "*     *", "*     *", "*      ", "       *");
        lines[5] = String.join(gap, "*     *", "*     *", "*      ", "       *");
        lines[6] = String.join(gap, " ***** ", " ***** ", "*      ", " ****** ");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}