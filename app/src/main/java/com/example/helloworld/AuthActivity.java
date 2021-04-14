package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }
}

private class setup<title>() {
    signUpButton.setOnClickListener {
        if (emailEditText.text.isNoEmpty() && passwordEditText.text.isNoEmpty()) {

            FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(emailEditText.text.toString(),
                            passwordEditText.text.toString()).addOnCompleteListener {
                                if (it.isSuccessful){

                                }
                                else {
                                    showAlert();
                                }
            }
        }
    }
}

private class showAlert(){
    val builder =AlertDialog.Builder(this)
            builder.setTitle("Error"
            builder.setMessage("Se ha producido un error autenticando al usuario")
            builder.setPositiveButton("Aceptar", null)
            val dialog: AlertDialog = builder.create()
            dialog.show()
}

}
