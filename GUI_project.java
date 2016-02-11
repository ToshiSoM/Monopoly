/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class GUI_project extends JFrame {
    private Spiel game;
    private JMenuBar menuBar;
    private JTextField txtMonopoly;
    private JTextField txtSpieler;
    private JTextField txtGuthaben;
    private JTextField txtWrfel;
    private JTextField txtLos;
    private JTextField txtStrae;
    private JTextField txtStrae_1;
    private JTextField txtStrae_2;
    private JTextField txtStrae_3;
    private JTextField txtStrae_4;
    private JTextField txtStrae_6;
    private JTextField txtStrae_5;
    private JTextField txtStrae_7;
    private JTextField txtStrae_8;
    private int wuerfel;

    //Constructor 
    public GUI_project(){


        this.setTitle("GUI_project");
        this.setSize(1172,796);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1172,796));
        contentPane.setBackground(new Color(192,192,192));

        txtMonopoly = new JTextField();
        txtMonopoly.setForeground(Color.RED);
        txtMonopoly.setBorder(null);
        txtMonopoly.setBackground(Color.BLUE);
        txtMonopoly.setFont(new Font("Times New Roman", Font.BOLD, 34));
        txtMonopoly.setHorizontalAlignment(SwingConstants.CENTER);
        txtMonopoly.setEditable(false);
        txtMonopoly.setText("Monopoly");
        txtMonopoly.setBounds(490, 21, 361, 46);

        txtMonopoly.setColumns(10);

        txtSpieler = new JTextField();
        txtSpieler.setHorizontalAlignment(SwingConstants.CENTER);
        txtSpieler.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtSpieler.setEditable(false);
        txtSpieler.setText("Spieler");
        txtSpieler.setBounds(27, 561, 128, 20);

        txtSpieler.setColumns(10);

        txtGuthaben = new JTextField();
        txtGuthaben.setText("Guthaben");
        txtGuthaben.setHorizontalAlignment(SwingConstants.CENTER);
        txtGuthaben.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtGuthaben.setEditable(false);
        txtGuthaben.setColumns(10);
        txtGuthaben.setBounds(27, 641, 128, 20);

        JButton btnNewButton = new JButton("Stra\u00DFe kaufen");
        btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    strassekaufen();

                }
            });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.setBounds(27, 682, 128, 23);

        JButton btnNewButton_1 = new JButton("Weiter");
        btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try{
                        gibFeld().setBackground(Color.white);
                    }
                    catch (Exception g) {}
                    weiter();
                    btnNewButton_1.setText("Weiter");
                }
            });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_1.setBounds(27, 740, 128, 23);

        txtWrfel = new JTextField();
        txtWrfel.setText("W\u00FCrfel");
        txtWrfel.setHorizontalAlignment(SwingConstants.CENTER);
        txtWrfel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtWrfel.setEditable(false);
        txtWrfel.setColumns(10);
        txtWrfel.setBounds(27, 598, 128, 20);

        txtLos = new JTextField();
        txtLos.setMargin(new Insets(2, 2, 40, 2));
        txtLos.setHorizontalAlignment(SwingConstants.CENTER);
        txtLos.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtLos.setText("LOS");
        txtLos.setAlignmentY(1.0f);
        txtLos.setBounds(261, 135, 146, 102);
        txtLos.setEditable(false);

        txtLos.setColumns(10);

        txtStrae = new JTextField();
        txtStrae.setText("Stra\u00DFe1");
        txtStrae.setMargin(new Insets(2, 2, 40, 2));
        txtStrae.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae.setColumns(10);
        txtStrae.setEditable(false);
        txtStrae.setAlignmentY(1.0f);
        txtStrae.setBounds(490, 135, 146, 102);

        txtStrae_1 = new JTextField();
        txtStrae_1.setText("Stra\u00DFe3");
        txtStrae_1.setMargin(new Insets(2, 2, 40, 2));
        txtStrae_1.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae_1.setColumns(10);
        txtStrae_1.setAlignmentY(1.0f);
        txtStrae_1.setBounds(924, 135, 146, 102);
        txtStrae_1.setEditable(false);
        

        txtStrae_2 = new JTextField();
        txtStrae_2.setText("Stra\u00DFe4");
        txtStrae_2.setMargin(new Insets(2, 2, 40, 2));
        txtStrae_2.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae_2.setColumns(10);
        txtStrae_2.setAlignmentY(1.0f);
        txtStrae_2.setBounds(924, 334, 146, 102);
        txtStrae_2.setEditable(false);

        txtStrae_3 = new JTextField();
        txtStrae_3.setText("Stra\u00DFe5");
        txtStrae_3.setMargin(new Insets(2, 2, 40, 2));
        txtStrae_3.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae_3.setColumns(10);
        txtStrae_3.setAlignmentY(1.0f);
        txtStrae_3.setBounds(924, 539, 146, 102);
        txtStrae_3.setEditable(false);

        txtStrae_4 = new JTextField();
        txtStrae_4.setText("Stra\u00DFe7");
        txtStrae_4.setMargin(new Insets(2, 2, 40, 2));
        txtStrae_4.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae_4.setColumns(10);
        txtStrae_4.setAlignmentY(1.0f);
        txtStrae_4.setBounds(490, 539, 146, 102);
        txtStrae_4.setEditable(false);

        txtStrae_6 = new JTextField();
        txtStrae_6.setText("Stra\u00DFe9");
        txtStrae_6.setMargin(new Insets(2, 2, 40, 2));
        txtStrae_6.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae_6.setColumns(10);
        txtStrae_6.setAlignmentY(1.0f);
        txtStrae_6.setBounds(261, 334, 146, 102);  
        txtStrae_6.setEditable(false);

        txtStrae_5 = new JTextField();
        txtStrae_5.setText("Stra\u00DFe8");
        txtStrae_5.setMargin(new Insets(2, 2, 40, 2));
        txtStrae_5.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae_5.setColumns(10);
        txtStrae_5.setAlignmentY(1.0f);
        txtStrae_5.setBounds(261, 539, 146, 102);
        txtStrae_5.setEditable(false);

        txtStrae_7 = new JTextField();
        txtStrae_7.setText("Stra\u00DFe2");
        txtStrae_7.setMargin(new Insets(2, 2, 40, 2));
        txtStrae_7.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae_7.setColumns(10);
        txtStrae_7.setAlignmentY(1.0f);
        txtStrae_7.setBounds(705, 135, 146, 102);
        txtStrae_7.setEditable(false);

        txtStrae_8 = new JTextField();
        txtStrae_8.setText("Stra\u00DFe6");
        txtStrae_8.setMargin(new Insets(2, 2, 40, 2));
        txtStrae_8.setHorizontalAlignment(SwingConstants.CENTER);
        txtStrae_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStrae_8.setColumns(10);
        txtStrae_8.setAlignmentY(1.0f);
        txtStrae_8.setBounds(705, 539, 146, 102);
        txtStrae_8.setEditable(false);

        //adding components to contentPane panel
        contentPane.add(txtMonopoly);
        contentPane.add(txtSpieler);
        contentPane.add(txtGuthaben);
        contentPane.add(txtStrae_1);
        contentPane.add(txtStrae_2);
        contentPane.add(txtStrae_3);
        contentPane.add(txtStrae_4);
        contentPane.add(txtStrae_5);
        contentPane.add(txtStrae_6);
        contentPane.add(txtStrae_7);
        contentPane.add(txtStrae_8);
        contentPane.add(txtStrae);
        contentPane.add(txtWrfel);
        contentPane.add(txtLos);
        contentPane.add(btnNewButton);
        contentPane.add(btnNewButton_1);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

        game = new Spiel(4, 200);

        btnNewButton_1.setText("Start");
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");

        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }

    public void spiel() {
        int zahl = game.wuerfeln();
        wuerfel = zahl;
        int aktpos = game.aktuellerSpieler().posGeben();
        game.aktuellerSpieler().ziehen(zahl);
        int aktpos2 = game.aktuellerSpieler().posGeben();
        // ZIEHEN
        int ziehen = aktpos2 - aktpos;
        int neufeldnr = game.aktuellerSpieler().feldnrGeben()+ ziehen;
        if(neufeldnr > 10)
        {
            neufeldnr = neufeldnr - 10;
        }
        game.aktuellerSpieler().feldnrSetzen(neufeldnr);
        // Ziehen Ende
        //Optionaler Kauf
        //kaufen(game.aktuellerSpieler());

        // Aprüfen der Miete

        if(game.knotenGeben(game.aktuellerSpieler().feldnrGeben()).karteGeben().gekauftGeben())
        {
            int mieteneu = (game.knotenGeben(game.aktuellerSpieler().feldnrGeben()).karteGeben().mieteGeben());
            game.aktuellerSpieler().guthabenAktualisieren(-mieteneu);
            game.knotenGeben(game.aktuellerSpieler().feldnrGeben()).karteGeben().besitzerGeben().guthabenAktualisieren(mieteneu);
        }

    }

    public void naechsterZug()
    {
        game.aktuellerSpielersetzen(game.aktuellerSpieler().naechsterGeben());
        spiel();
    }

    public void kaufen(Spieler e)
    {
        if(game.knotenGeben(game.aktuellerSpieler().feldnrGeben()).karteGeben().kaufmoeglichGeben() && !game.knotenGeben(game.aktuellerSpieler().feldnrGeben()).karteGeben().gekauftGeben())
        {
            int f = game.aktuellerSpieler().feldnrGeben();
            game.knotenGeben(f).karteGeben().kaufen(e);
            gibFeld().setText(gibFeld().getText() + "" + game.aktuellerSpieler().nameGeben()+"");

        }
    }

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new GUI_project();
                }
            });
    }

    public void weiter()
    {
        naechsterZug();
        gibFeld().setBackground(Color.red);

        int i = game.aktuellerSpieler().guthabenAusgeben();
        String f = ""+i;
        txtGuthaben.setText(f);
        String w = "" + wuerfel;
        txtWrfel.setText(w);
        txtSpieler.setText(game.aktuellerSpieler().nameGeben());
    }

    public void strassekaufen()
    {
        kaufen(game.aktuellerSpieler());
    }

    public JTextField gibFeld()
    {
        if(game.aktuellerSpieler().feldnrGeben() == 1)
        {
            return txtLos;
        }
        if(game.aktuellerSpieler().feldnrGeben() == 2)
        {
            return txtStrae;
        }
        if(game.aktuellerSpieler().feldnrGeben() == 3)
        {
            return txtStrae_1;
        }
        if(game.aktuellerSpieler().feldnrGeben() == 4)
        {
            return txtStrae_2;
        }
        if(game.aktuellerSpieler().feldnrGeben() == 5)
        {
            return txtStrae_3;
        }
        if(game.aktuellerSpieler().feldnrGeben() == 6)
        {
            return txtStrae_4;
        }
        if(game.aktuellerSpieler().feldnrGeben() == 7)
        {
            return txtStrae_5;
        }
        if(game.aktuellerSpieler().feldnrGeben() == 8)
        {
            return txtStrae_6;
        } if(game.aktuellerSpieler().feldnrGeben() == 9)
        {
            return txtStrae_7;
        }
        if(game.aktuellerSpieler().feldnrGeben() == 10)
        {
            return txtStrae_8;
        }
        return null;
    }

}