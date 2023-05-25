package com.example.asm1_ph345654;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class dangnhapp extends AppCompatActivity {
    String kttk = null;
    String ktpass =null;

    ActivityResultLauncher<Intent> getData = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {


            EditText edtUsername = findViewById(R.id.edt_username);
            EditText edtPassword = findViewById(R.id.edt_password);

            Intent intent = result.getData();
            Bundle data =intent.getExtras();
            kttk=data.getString("username");
            ktpass=data.getString("password");
           if (result.getResultCode()==2){

               edtUsername.setText(kttk);
               edtPassword.setText(ktpass);
           }

        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);
        EditText usename =findViewById(R.id.edt_username);
        EditText passwrod =findViewById(R.id.edt_password);
        Button btnLogin = findViewById(R.id.btn_dangnhap);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check =false;
                String Usename= usename.getText().toString();
                String PassWord= passwrod.getText().toString();
                Intent data = new Intent(dangnhapp.this, trangchuu.class);
               if(kttk.equals(Usename)) {
                   if (ktpass.equals(PassWord)) {
                       check =true;
                       startActivity(data);
                   }

                   }
               if (check==false){
                   Toast.makeText(dangnhapp.this,"Vui lòng nhập lại",Toast.LENGTH_SHORT).show();
               }else{
                   Toast.makeText(dangnhapp.this,"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
               }


               }


        });
        Button btnRegisier = findViewById(R.id.btndangki);
        btnRegisier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(dangnhapp.this, dangkii.class);
                getData.launch(data);
            }
        });
    }
}