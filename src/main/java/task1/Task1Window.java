package task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Task1Window extends JFrame {
    public Task1Window() {
        JLabel timeLabel = new JLabel();
        JLabel christmasLabel = new JLabel();
        JButton christmasButton = new JButton("Days until Christmas");
        christmasButton.addActionListener(e -> {
            try {
                christmasLabel.setText(Long.toString(daysUntilChristmas()));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        });
        createLayout(timeLabel, christmasButton, christmasLabel);
        createTimeListener(timeLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }

    private void createLayout(JLabel timeLabel, JButton christmasButton, JLabel christmasLabel)
    {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(
                gl.createSequentialGroup()
                        .addComponent(timeLabel)
                        .addComponent(christmasButton)
                        .addComponent(christmasLabel)
        );
        gl.setVerticalGroup(
                gl.createSequentialGroup()
                        .addComponent(timeLabel)
                        .addComponent(christmasButton)
                        .addComponent(christmasLabel)
        );
    }

    private long daysUntilChristmas() throws ParseException {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        Date date2 = new Date();
        LocalDate localDate = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        Date date1 = myFormat.parse("25 12 " + year);
        long diff = date1.getTime() - date2.getTime();
        if (diff < 0)
        {
            date1 = myFormat.parse("25 12 " + (year + 1));
            diff = date1.getTime() - date2.getTime();
        }
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    private void createTimeListener(JLabel timeLabel)
    {
        final DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        ActionListener timerListener = e -> {
            Date date = new Date();
            String time = timeFormat.format(date);
            timeLabel.setText(time);
        };
        Timer timer = new Timer(1000, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
    }
}
