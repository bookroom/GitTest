package test.git.com.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GitActivity extends AppCompatActivity {

    TextView tv1;
    Button bn;
    TextView tv2;
    TextView tv3;

    //提交一次
    //提交二次
    //提交三次
    //提交四次
    //提交五次
    //提交六次
    //提交七次
    //提交8次
    //提交10次


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gitlayout);

        tv1= (TextView) findViewById(R.id.tv1);
        bn= (Button) findViewById(R.id.git3bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("GIT3");
            }
        });
        tv2= (TextView) findViewById(R.id.git3tv2);
        tv3= (TextView) findViewById(R.id.git3tv3);
        tv3.setText("play/gittest/jiaru");

    }
}
