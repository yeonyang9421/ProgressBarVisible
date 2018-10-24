package kr.co.woobi.imyeon.progressbarvisible;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton) ;
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        textView=(TextView)findViewById(R.id.textView);
        progressBar.setVisibility(View.INVISIBLE);
    }

    public  void onClickWidget(View view){
        //progressBar.setVisibility(View.INVISIBLE);
        String text = toggleButton.getText() + "-" + toggleButton.isChecked();
        if(toggleButton.isChecked())
            progressBar.setVisibility(View.VISIBLE);
        else
            progressBar.setVisibility(View.GONE);
        Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT).show();
        textView.setText(text);
    }

}
