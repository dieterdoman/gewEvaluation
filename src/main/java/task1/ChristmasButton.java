package task1;

import javax.swing.*;
import java.text.ParseException;
import java.util.Date;

public class ChristmasButton extends JButton {
    private JLabel christmasLabel;

    public ChristmasButton()
    {
        super("Days until Christmas");
        christmasLabel = new JLabel("??");
        this.addActionListener(e -> {
            try {
                DateCalculator dateCalculator = new DateCalculator();
                christmasLabel.setText(Long.toString(dateCalculator.daysUntilChristmas(new Date())));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        });
    }

    public JLabel getChristmasLabel()
    {
        return christmasLabel;
    }
}
