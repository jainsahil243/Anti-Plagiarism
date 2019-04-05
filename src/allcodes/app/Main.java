package allcodes.app;

import javax.swing.*;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ScoreBot sb = new ScoreBot();
        sb.processCodeFiles("C:\\Users\\sahil\\Desktop\\Anti-Plagiarism\\TestCode\\helloWorld.java", false);

        // Start all Swing applications on the EDT.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new appWindow(sb);
            }
        });
    }
}
