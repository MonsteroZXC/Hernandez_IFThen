package mcm.edu.ph.hernandez_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int con=0;
    int con1, con1a;
    String conditionsMain = "This is the main branch of the conditions. Pressing each buttons gets you deeper into the if-then statements of each conditions. Select a button to press.";
    String txtdialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("You woke up in a hospital full of zombies. \nYou are in a patient's room, Many zombies are waiting outside. What will you do?\n" +
                "DECISION 1 : GO OUTSIDE AND WALK SLOWLY TOWARDS THE ELEVATOR" +
                "\nDECISION 2 : WAIT UNTIL SUN RISES");


        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        TextView txtLore = findViewById(R.id.txtLore);
        TextView txtDecision = findViewById(R.id.txtDecision);


        if (view.getId() == R.id.btnDecision1) {
            if (con > 0 && con1 > 0) { // a hacky condition to catch the 3rd condition layer,
                con1a = 1; //upon the 3rd condition layer, pushing button 1 sets your outcome to first choice
            }
            if (con > 0) {
                con1 = 1;
            }
            if (con == 0) {
                con = 1;
            }

        } else if (view.getId() == R.id.btnDecision2) {
            if (con > 0 && con1 > 0) { // a hacky condition to catch the 3rd condition layer,
                con1a = 1; //upon the 3rd condition layer, pushing button 1 sets your outcome to first choice
            }
            if (con > 0) {
                con1 = 2;
            }
            if (con == 0) {
                con = 2;
            }
        }


        if(con==1){
            txtdialog = "You have chosen to walk outside! You are now in the elevator!\n Zombies are now approaching you \n Decision 1:Go downstairs and run away!\nDecision 2:Wait for the elevator to close";
            if(con1== 1){
                txtdialog = "You chosen to use the stairs and run away!\nYOU HAVE ESCAPED THE HOSPITAL!";
            }
            else if(con1 == 2) {
                txtdialog = "You chose to wait! Zombies has eaten you inside the elevator! You died!";

            }



                    txtLore.setText(txtdialog);
                }

            }
        }
