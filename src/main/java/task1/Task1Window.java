package task1;

import javax.swing.*;
import java.awt.*;

public class Task1Window extends JFrame {
    public Task1Window() {
        ChristmasButton christmasButton = new ChristmasButton();
        TimeLabel timeLabel = new TimeLabel();
        TableDisplay tableDisplay = new TableDisplay();
        createLayout(timeLabel, christmasButton, tableDisplay);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }

    private void createLayout(TimeLabel timeLabel, ChristmasButton christmasButton, TableDisplay tableDisplay)
    {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(
                gl.createSequentialGroup()
                        .addComponent(timeLabel)
                        .addComponent(christmasButton)
                        .addComponent(christmasButton.getChristmasLabel())
                        .addComponent(tableDisplay)
        );
        gl.setVerticalGroup(
                gl.createSequentialGroup()
                        .addComponent(timeLabel)
                        .addComponent(christmasButton)
                        .addComponent(christmasButton.getChristmasLabel())
                        .addComponent(tableDisplay)
        );
    }
}
