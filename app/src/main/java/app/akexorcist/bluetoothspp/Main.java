package app.akexorcist.bluetoothspp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

//iSAFE

public class Main extends Activity implements OnClickListener {

    public static byte signal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.d("tag","main");
//        Queue<String> qe=new LinkedList<String>();

        Button btnTerminal = (Button) findViewById(R.id.btnTerminal);
        btnTerminal.setOnClickListener(this);

        Intent i = new Intent(this, Send.class);
        startService(i);
    }

    public void onClick(View v) {
        int id = v.getId();
        Intent intent = null;
        switch (id) {

            case R.id.btnTerminal:
                intent = new Intent(getApplicationContext(), TerminalActivity.class);
                startActivity(intent);
                break;
        }
    }
}
