package task1;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLabel extends JLabel {
    public TimeLabel()
    {
        createTimeListener();
    }

    private void createTimeListener()
    {
        final DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        ActionListener timerListener = e -> {
            Date date = new Date();
            String time = timeFormat.format(date);
            setText(time);
        };
        Timer timer = new Timer(1000, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
    }
}
