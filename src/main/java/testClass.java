public class testClass {

    public static void main(String[] args) {
        String test = "a\nab\n";

        System.out.println(new StringBuilder().append("codePointAt a : ").append(test.codePointAt(0)).toString());
        System.out.println(new StringBuilder().append("charAt a : ").append(test.charAt(0)).toString());

        System.out.println(new StringBuilder().append("codePointAt LF : ").append(test.codePointAt(1)).toString());
        System.out.println(new StringBuilder().append("charAt1 LF : ").append(test.charAt(1)).toString());

        System.out.println(new StringBuilder().append("charAt2 a : ").append(test.charAt(2)).toString());
        System.out.println(new StringBuilder().append("codePointAt2 a : ").append(test.codePointAt(2)).toString());

        System.out.println(new StringBuilder().append("charAt b : ").append(test.charAt(3)).toString());
        System.out.println(new StringBuilder().append("codePointAt b : ").append(test.codePointAt(3)).toString());

        System.out.println(new StringBuilder().append("codePointAt2 LF : ").append(test.codePointAt(4)).toString());
        System.out.println(new StringBuilder().append("charAt12 LF : ").append(test.charAt(4)).toString());


        String newTest = "1,2,3,4,5//;\n11;12;13";
        System.out.println("last comma in " + newTest.lastIndexOf(","));
        String[] splitCom = newTest.split(",", 7);
        for (String s : splitCom) {
            System.out.println(s.toString());
        }
        System.out.println(" END splitCom ,");
        System.out.println(newTest.codePointAt(9));
    }
}
