package pwo.app;

import pwo.utils.SequenceTools;

/**
 * A class that extends the operation of the {@link pwo.app.SeqToFileApp}
 * function. Class adds the ability to write the results to the console screen.
 *
 * @author pidoras
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * A method that takes arguments from the super class, checking for data and
     * whether they are valid and return value or false
     *
     * @param args
     * @return
     */
    @Override
    protected boolean getArgs(String[] args) {

        if (super.getArgs(args)) {
            return true;
        }

        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * The method to do the target work
     *
     * @return
     */
    @Override
    protected boolean writeSeq() {

        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));

        return true;
    }

    /**
     * The method to run the application object
     *
     * @param args
     */
    @Override
    public void run(String[] args) {

        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }

        writeSeq();

    }

}
