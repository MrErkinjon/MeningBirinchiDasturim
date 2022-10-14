package uz.bdmgroup.meningbirinchidasturim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText ;
    EditText editText2 ;
    TextView textView;
    Button button;
    Integer a=0,b=0,c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp_layout);
//        editText=findViewById(R.id.editText);
//        editText2=findViewById(R.id.editText2);
//        textView=findViewById(R.id.textView);
//        button=findViewById(R.id.button);

//       button.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               a=Integer.parseInt(editText.getText().toString());
//               b=Integer.parseInt(editText2.getText().toString());
//               c=a+b;
//               textView.setText("Natija:"+c+"");
//           }
//       });
    }
}