package test.git.com.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GitActivity extends AppCompatActivity {

    TextView tv1;
    Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gitlayout);

        tv1= (TextView) findViewById(R.id.tv1);
        bn= (Button) findViewById(R.id.changetext);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bn.setText("张家界");
            }
        });

        tv1.setText("只有git1的修改");
        tv1.setText("GIT1 后来的修改");
        tv1.setText("GIT2的修改");

        //在git1中再添加一句注释

        //git中提交

    }
}
