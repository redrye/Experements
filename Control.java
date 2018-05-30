import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Control extends JFrame{
 	JFrame frame;
    JButton nextButton = new JButton ("Next Screen");
    ApplicationPanel a = new ApplicationPanel();
    PlacesPanel p = new PlacesPanel();
    ShellPanel sh = new ShellPanel();
    SystemPanel sys = new SystemPanel();
    public void setup() {
        frame = new JFrame();
		frame.setLayout(new GridLayout(1, 4));
        frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(a);
        frame.add(p);
        frame.add(sh);
        frame.add(sys);
        frame.pack();
    }


    public class ApplicationPanel extends JPanel { {
    	String[] names = {"Notepad++", "Eclipse", "Firefox", "Cygwin", "Qemu", "Putty"};
    	
    	JButton[] apps = new JButton[names.length];
    	this.setBorder(BorderFactory.createTitledBorder("Applications"));
        this.setLayout(new GridLayout(names.length, 1));
        
        for (int i = 0; i < names.length; i++) {
        	apps[i] = new JButton(names[i]);
        	apps[i].addActionListener(new buttonListener());
        	apps[i].setActionCommand("xterm");
        	this.add(apps[i]);
        }
    } }
    
    public class PlacesPanel extends JPanel {{
    	String[] names = {"Desktop", "Downloads", "Toolkit", "FTP"};
    	
    	JButton[] apps = new JButton[names.length];
    	this.setBorder(BorderFactory.createTitledBorder("Places"));
        this.setLayout(new GridLayout(names.length, 1));
        
        for (int i = 0; i < names.length; i++) {
        	apps[i] = new JButton(names[i]);
        	this.add(apps[i]);
        }
    }}
    public class ShellPanel extends JPanel {{
    	String[] names = {"Bash", "Powershell", "CMD"};
    	
    	JButton[] apps = new JButton[names.length];
    	this.setBorder(BorderFactory.createTitledBorder("Shells"));
        this.setLayout(new GridLayout(names.length, 1));
        
        for (int i = 0; i < names.length; i++) {
        	apps[i] = new JButton(names[i]);
        	this.add(apps[i]);
        }
    }}
    public class SystemPanel extends JPanel {{
    	String[] names = {"Settings", "Shutdown", "About"};
    	
    	JButton[] apps = new JButton[names.length];
    	this.setBorder(BorderFactory.createTitledBorder("System"));
        this.setLayout(new GridLayout(names.length, 1));
        
        for (int i = 0; i < names.length; i++) {
        	apps[i] = new JButton(names[i]);
        	this.add(apps[i]);
        }
    }}
    public class buttonListener implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
    	String action = ae.getActionCommand();
    	String[] command = new String[] {action};
    	Runtime runtime = Runtime.getRuntime();
    	try {
    		Process process = runtime.exec(command);
    	} catch (IOException e) {
    		e.printStackTrace();
    		}
    	}
    	}
    
    public static void main (String[] args) {
        Control Control = new Control();
        Control.setup();
    }
}
