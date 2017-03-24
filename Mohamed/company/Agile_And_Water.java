package Mohamed.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by mash4 on 3/23/2017.
 */
public class Agile_And_Water  extends JFrame{


    private JTextField questiontextField;
    private JCheckBox lessthancheckBox;
    private JCheckBox fixdDeadlinecheckBox;
    private JCheckBox progrmmerSExperienceCheckBox;
    private JCheckBox earlyIntegrationcheckBox;
    private JCheckBox prototypesAreNeededCheckBox;
    private JTextField recomendedtextField1;
    private JPanel rootpanel;
    private JCheckBox morethan30PeopleCheckBox;
    private JCheckBox programmersAreNOTExpertsCheckBox;
    private JCheckBox flexibleDeadlineCheckBox;
    private JCheckBox noearlyIntegrationOfCompenetsCheckBox;
    private JCheckBox noprotypesCheckBox;
    private JButton showResultbtn;

    //Here, I am initializing two variables
    // with  hold and make a counter to base decisions.

    private   static  int agile_counter = 0;
    private static int waterFall_Counter = 0;

    private  boolean numberOfProgrammers, fixed_Schedule,
            experience, components_Integrations, prototypes,
            moreProgrammers, noExpereinces, flexableDeadLine,
            noEarlyIntegrations, noPrototypesNeeded;
// This is my constaractor
    public Agile_And_Water() {
        // A title for the GUI
        super("Agile and water methodology ");

        setContentPane(rootpanel); // sets the contents of the windows to be the rootpanel
        pack(); //Adds the compnenets to the window
        setSize(800, 700); // Setting the size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Closing
        setVisible(true); // To make the contents visible to the user

        // Adding an item listenner when the user selects this check box
        lessthancheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Making the bollean variable equals the checked box
                numberOfProgrammers = lessthancheckBox.isSelected();
                // Trying to prevent incase the user
                // wants to select two check points that are opposite
                // For instance, Number of programmers are either
                // morethan 30 or less than 30.
                if(lessthancheckBox.isSelected()){
                    morethan30PeopleCheckBox.setVisible(false);

                }
                else {
                    morethan30PeopleCheckBox.setVisible(true);
                }


                // Updates the result, incase I select or unselect a check box
                // I dont need to restart the program.
                updateResults();

            }
        });
        //An items listener that is added in the checkbox
        progrmmerSExperienceCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                experience = progrmmerSExperienceCheckBox.isSelected();
                if(progrmmerSExperienceCheckBox.isSelected()) {
                    programmersAreNOTExpertsCheckBox.setVisible(false);
                }
                else{
                    programmersAreNOTExpertsCheckBox.setVisible(true);
                }
                updateResults();
                // Agile gets when point if the user clicks to the checkbox
                agile_counter++;

            }

        });
        // A fixed deadline checkbox is selected in this method
        fixdDeadlinecheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fixed_Schedule = fixdDeadlinecheckBox.isSelected();
                if(fixdDeadlinecheckBox.isSelected()) {
                    flexibleDeadlineCheckBox.setVisible(false);
                }
                else {
                    flexibleDeadlineCheckBox.setVisible(true);
                }
                updateResults();
                agile_counter ++;
            }
        });
        //Incase, an early integration is checked
        earlyIntegrationcheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                components_Integrations = earlyIntegrationcheckBox.isSelected();
                if(earlyIntegrationcheckBox.isSelected()) {
                    noearlyIntegrationOfCompenetsCheckBox.setVisible(false);
                }
                else {
                    noearlyIntegrationOfCompenetsCheckBox.setVisible(true);
                }
                updateResults();
                agile_counter++;
            }
        });

        prototypesAreNeededCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                prototypes = prototypesAreNeededCheckBox.isSelected();
                if(prototypesAreNeededCheckBox.isSelected()){
                    noprotypesCheckBox.setVisible(false);

                }
                else {
                    noprotypesCheckBox.setVisible(true);
                }

                updateResults();
                agile_counter++;
            }
        });
        morethan30PeopleCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                moreProgrammers = morethan30PeopleCheckBox.isSelected();
                if(morethan30PeopleCheckBox.isSelected()) {
                    lessthancheckBox.setVisible(false);
                }
                else {
                    lessthancheckBox.setVisible(true);
                }
                updateResults();
                waterFall_Counter ++;

            }
        });
        programmersAreNOTExpertsCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                noExpereinces = programmersAreNOTExpertsCheckBox.isSelected();
                if(programmersAreNOTExpertsCheckBox.isSelected()) {
                    progrmmerSExperienceCheckBox.setVisible(false);
                }
                else {
                    progrmmerSExperienceCheckBox.setVisible(true);
                }
                updateResults();
                waterFall_Counter ++;
            }
        });
        flexibleDeadlineCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                flexableDeadLine = flexibleDeadlineCheckBox.isSelected();
                if(flexibleDeadlineCheckBox.isSelected()) {
                    fixdDeadlinecheckBox.setVisible(false);
                }
                else {
                    fixdDeadlinecheckBox.setVisible(true);
                }
                updateResults();
                waterFall_Counter ++;
            }
        });
        noearlyIntegrationOfCompenetsCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                noEarlyIntegrations = noearlyIntegrationOfCompenetsCheckBox.isSelected();
                if(noearlyIntegrationOfCompenetsCheckBox.isSelected()) {
                    earlyIntegrationcheckBox.setVisible(false);
                }
                else{
                    earlyIntegrationcheckBox.setVisible(true);
                }
                updateResults();
                waterFall_Counter++;
            }
        });
        noprotypesCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                noPrototypesNeeded = noprotypesCheckBox.isSelected();
                if(noprotypesCheckBox.isSelected()) {
                    prototypesAreNeededCheckBox.setVisible(false);
                }
                else {
                    prototypesAreNeededCheckBox.setVisible(true);
                }
                updateResults();
                waterFall_Counter ++ ;

            }
        });
        //Here this method shows the result when the show button is clicked
        showResultbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This is if Agile_counter is greather than waterFall_counter
                // print out agile and vise verse is true.

                if(agile_counter > waterFall_Counter){
                    recomendedtextField1.setText("Agile may be a good methodology in this "
                            +  questiontextField.getText()+ " project !!!");
                }
                else{
                    recomendedtextField1.setText("Waterfall is recommended for  "
                            + questiontextField.getText() + " project. ");

                }

            }
        });
    }

        private void updateResults (){
        //This iternary works like if and else statements
            String hasLessThan_thirty_Programmers = numberOfProgrammers? "There are less than 30 programmers ": "There are not less than thirty programmers";
            String hasExeprience = experience? "Programmers are  experts in this filed. " : "Programmers are NOT experts ";
            String hasComponentsOdearlyIntegration  = components_Integrations ? "An early integrations are needed " :" An early integrations are NOT  needed";
            String prt = prototypes ? "Customers needs a prototype of the program. " : "Customers  DOESNT needs a prototype of the program. ";
            String number_programmers= moreProgrammers? "There are more programmers. " : "There are NOT more programmers. ";
            String littleExcpereinces= noExpereinces ? "Ther are no experts ": "There are little experts " ;
            String flexibleDates = flexableDeadLine ? "There are no flexible due dates" : "There are flexible due dates ";
            String noEarlyIntegration = noEarlyIntegrations? "There are  early integration compenets ": "There are NO early integration compenets ";
            String noProtypes = noPrototypesNeeded? "There are  prototypes in this project  " : "There are Not prototypes in this program";

        }
}


