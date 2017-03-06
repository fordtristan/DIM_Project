package org.tristanford.dimproject.dim_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    //Creates a field to store patient data via textview
    private TextView PatientData;
    private Button PPbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        PPbutton = (Button) findViewById(R.id.add_button_user);
        PPbutton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent i = new Intent(UserActivity.this, PatientProfile.class);
                                            startActivity(i);
                                        }
                                    });


        //Use findViewById to get a reference to the Patient Data Textview
        PatientData = (TextView) findViewById(R.id.patient_data_textview);

        //Create an array of strings with fake patient names

        String[] patientdummydata = {
                "Freddie Jensen",
                "Gladys Swanson",
                "Lee Barnes",
                "Kimberly Houston",
                "Josephine Weber",
                "Felipe	Lloyd",
                "Ella Guerrero",
                "Margarita Allison",
                "Todd Reed",
                "Jill Pittman",
                "Arturo	Ferguson",
                "Marguerite	Powers",
                "Jerald	Bailey",
                "Pedro Mann",
                "Leigh Wong",
                "Thomas	Mckinney",
                "Debbie	Chambers",
                "Dwayne	Mendoza",
                "Jeanne	Carpenter",
                "Beth Murphy",
                "Myron Lynch",
                "Lee Wood",
                "Eloise	Thomas",
                "Donnie	Bass",
                "Tracy Russell",
        };
        // Append each String from the fake patient data array to the textview
        for (String patientdummy : patientdummydata) {
            PatientData.append(patientdummy + "\n\n\n");
        }

    }
}
