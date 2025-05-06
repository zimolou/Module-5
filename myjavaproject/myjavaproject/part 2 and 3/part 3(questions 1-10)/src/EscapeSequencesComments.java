public class EscapeSequencesComments {
    public static void main(String[] args){
        System.out.print("Learn\tJava\n\tthe\nHard\tWay\n\n");
        System.out.print("\tLearn Java the\"Hard\" Way!\n");

        System.out.print("Hello\n");
        System.out.print("Jello\by\n");

        System.out /* testing */ .println("Hard to beliece, eh?");
        System.out.println("Surprised? /* abcde */ Or what did you expect?");
        System.out.println("\\ // -=- \\ //");
        System.out.println("\\\\ \\\\\\ \\\\\\\\");
        System.out.println( "I hope you understan\"escape sequences\"now.\n");

    }
}
