package autocompletetextviewdb.contentcontact;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
public boolean onCreateOptionsMenu(Menu menu){
    MenuInflater menuInflater=getMenuInflater();
    menuInflater.inflate(R.menu.menu,menu);


    return super.onCreateOptionsMenu(menu);

}

}
