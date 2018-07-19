public class Exercise6 {
    public static void main(String[] strings){
        String text = "Saturday, 26 November 27$ | Marina Sand Bay, Singapore";
        String[] parts = text.split("\\|");
        String part1 = parts[0];
        String part2 = parts[1];

        String[] result1 = part1.split("\\,");
        String[] result2 = part2.split("\\,");
        String a = result1[0];
        String b = result1[1];
        String c = result2[0];
        String d = result2[1];

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
