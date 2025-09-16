package org.example.main;

import javax.swing.*;
import java.awt.*;
public class Main {

    public final static boolean ai_verses_ai = false;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(Color.gray);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(888, 888));
        frame.setLocationRelativeTo(null);

        Board board = new Board();

        Table table = new Table(board);
        table.add(board);
        frame.add(table);

        board.revalidate();
        board.repaint();

        frame.setVisible(true);

        if (ai_verses_ai)
            board.ai.aiMove();

        if (!ai_verses_ai) {
            board.addListeners();
        }
        board.repaint();

    }
}