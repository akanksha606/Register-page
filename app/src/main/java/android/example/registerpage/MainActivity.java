package android.example.registerpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,lname,email,pass,cpass;
    CheckBox check;
    Button sign;
    String fn,ln,ei,p,cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.first_name);
        lname=findViewById(R.id.last_name);
        email=findViewById(R.id.email_id);
        pass=findViewById(R.id.password);
        cpass=findViewById(R.id.confirm_pass);
        check=findViewById(R.id.checkbox);
        sign=findViewById(R.id.sign_up);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fn=fname.getText().toString();
                ln=lname.getText().toString();
                ei=email.getText().toString();
                p=pass.getText().toString();
                cp=cpass.getText().toString();
                if(fn.isEmpty()||ln.isEmpty()||ei.isEmpty()||p.isEmpty()||cp.isEmpty())
                    Toast.makeText(MainActivity.this,"Fill all the fields!!", Toast.LENGTH_LONG).show();
                else if(!p.equals(cp))
                    Toast.makeText(MainActivity.this,"Both the passwords did not match!!",Toast.LENGTH_LONG).show();
                else if(!check.isChecked())
                    Toast.makeText(MainActivity.this,"Checkbox not filled!!",Toast.LENGTH_LONG).show();
                    else
                    Toast.makeText(MainActivity.this,"You have signed up successfully!!",Toast.LENGTH_LONG).show();
            }
        });

    }
}
