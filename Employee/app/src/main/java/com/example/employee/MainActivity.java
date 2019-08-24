package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper employeeDb;
    EditText etFirstName, etLastName, etAddress, etCity, etState, etZip,
            etTaxId, etPosition, etDepartment;
    Button addEmployee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        employeeDb = new DatabaseHelper(this);

        etFirstName =  findViewById(R.id.etFName);
        etLastName = findViewById(R.id.etLName);
        etAddress =  findViewById(R.id.etAddress);
        etCity = findViewById(R.id.etCity);
        etTaxId = findViewById(R.id.etTaxId);
        etPosition = findViewById(R.id.etPosition);
        etDepartment = findViewById(R.id.etDepartment);
        etState = findViewById(R.id.etState);
        etZip = findViewById(R.id.etZip);

        addEmployee = findViewById(R.id.btnSend);

    }


}
