package task1;

import javax.swing.*;
import java.awt.*;

public class Task1Window extends JFrame {
    public Task1Window() {
        ChristmasButton christmasButton = new ChristmasButton();
        TimeLabel timeLabel = new TimeLabel();
        CsvButton csvButton = new CsvButton();
        createLayout(timeLabel, christmasButton, csvButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }

    private void createLayout(TimeLabel timeLabel, ChristmasButton christmasButton, CsvButton csvButton)
    {
        Container pane = getContentPane();
        GroupLayout layout = new GroupLayout(pane);
        pane.setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(timeLabel).addComponent(csvButton.getTableDisplay()))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(christmasButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(christmasButton.getChristmasLabel()))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(csvButton))
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(timeLabel)
                                .addComponent(christmasButton)
                                .addComponent(christmasButton.getChristmasLabel())
                                .addComponent(csvButton)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(csvButton.getTableDisplay()))
        );
    }
}
