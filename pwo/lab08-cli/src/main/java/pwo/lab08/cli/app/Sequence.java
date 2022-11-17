package pwo.app;

/**
 * The main class of the program that is responsible for running a specific
 * sequence in depending on the number of arguments provided
 *
 * @author pidoras
 */
public class Sequence {

    /**
     * The first function that is run when the program starts.
     *
     * @param args
     */
    public static void main(String[] args) {

        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Illegal arguments\n"
                        + "Legal usage: seqName from to [fileName]");
        }
    }
}
