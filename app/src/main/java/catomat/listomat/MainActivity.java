package catomat.listomat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnCreateList;
    private Button btnShowLists;
    private Spinner spnDropdownLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreateList = findViewById(R.id.createList);
        btnShowLists = findViewById(R.id.showLists);
        spnDropdownLists = findViewById(R.id.dropdownLists);

        btnCreateList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("CreateList is working.");

                Intent intent = new Intent(MainActivity.this, CreateList.class);
                startActivity(intent);
            }
        });

        btnShowLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("ShowLists is Working.");

                Intent intent = new Intent(MainActivity.this, ShowLists.class);
                startActivity(intent);
            }
        });

        List<String> testStrings = new ArrayList<>();
        testStrings.add("Hallo");
        testStrings.add("Hallo123");
        testStrings.add("HalloTest");

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, testStrings);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        spnDropdownLists.setAdapter(spinnerArrayAdapter);

    }
}
