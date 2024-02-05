package Sprint0;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GUI extends JFrame {
    private JPanel linesPanel;
    private JCheckBox onCheckBox;
    private JRadioButton simpleGameRadioButton;
    private JRadioButton generalGameRadioButton;

    public GUI() {
        setTitle("First SOS GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
       
        //Build panel for radio buttons
        JPanel radioButtonPanel = new JPanel(new FlowLayout());
        simpleGameRadioButton = new JRadioButton("Simple Game");
        generalGameRadioButton = new JRadioButton("General Game");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(simpleGameRadioButton);
        radioButtonGroup.add(generalGameRadioButton);
        radioButtonPanel.add(simpleGameRadioButton);
        radioButtonPanel.add(generalGameRadioButton);
        
        //Build panel for check box
        JPanel checkBoxPanel = new JPanel(new FlowLayout());
        onCheckBox = new JCheckBox("On");
        checkBoxPanel.add(onCheckBox);

        //Build panel to draw lines;
        linesPanel = new JPanel() {
        	@Override
        	protected void paintComponent(Graphics line) {
        		super.paintComponent(line);
        		drawLines(line);
        	}
        };
        	
        //Build frame
        setLayout(new BorderLayout());
        
        //Put panels in frame
        add(radioButtonPanel, BorderLayout.NORTH);
        add(linesPanel, BorderLayout.CENTER);
        add(checkBoxPanel, BorderLayout.SOUTH);
        
        setVisible(true);    
    }

    private void drawLines(Graphics line) {
        int linesPanelWidth = linesPanel.getWidth();
        int linesPanelHeight = linesPanel.getHeight();

        line.setColor(Color.BLACK);
        
        //Draw horizontal lines
        int y = linesPanelHeight / 3;
        line.drawLine(0, y, linesPanelWidth, y);
        line.drawLine(0, (y * 2), linesPanelWidth, (y * 2));
        
        //Draw vertical lines
        int x = linesPanelWidth / 3;
        line.drawLine(x, 0, x, linesPanelHeight);
        line.drawLine((x * 2), 0, (x * 2), linesPanelHeight);
    }
    
    public static void main(String[] args) {
        new GUI();
    }
}
	
	

	

