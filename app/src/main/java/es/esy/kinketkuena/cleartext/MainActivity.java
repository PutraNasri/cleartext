package es.esy.kinketkuena.cleartext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void kirim(View view){
        editText= (TextView)findViewById(R.id.editText);
        String text = editText.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Text",text);
        startActivity(intent);
        editText.setText("");

    }
}
