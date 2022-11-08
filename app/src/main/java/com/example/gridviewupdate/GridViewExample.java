package com.example.gridviewupdate;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GridViewExample extends AppCompatActivity {
    GridView gridView;
    EditText name,number,addres;
    Button add;


    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.gridview_item);

        gridView=findViewById(R.id.mygrid);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        addres=findViewById(R.id.address);

        add=findViewById(R.id.addbtn);
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String Name=name.getText().toString();
                    String Number=number.getText().toString();
                    String Address=addres.getText().toString();

                    Boolean checkinsertdata=DB.insertproductdetails(Name,Number,Address);
                    if(checkinsertdata==true)
                        Toast.makeText(GridViewExample.this, "new donar added", Toast.LENGTH_SHORT).show();

                    else
                        Toast.makeText(GridViewExample.this, "error adding donar", Toast.LENGTH_SHORT).show();
                }
            });

    }

}
