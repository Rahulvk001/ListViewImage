package inc.rahul.listviewimage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;
    ArrayList progList;

    public static Integer[] proImage={R.drawable.image1,R.drawable.image2,R.drawable.image3,   R.drawable.image4,
                                      R.drawable.image5,R.drawable.image6,R.drawable.image7,
                                      R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11,R.drawable.image12,};

    public static String[]progName = {"check circle","chrome reader","class",
    "commute","dashboard","face","fingerprint","g_translate","language","lock","opacity"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      MyListAdapter adapter = new MyListAdapter(this,progName,proImage);
      lv = findViewById(R.id.listView2);
      lv.setAdapter(adapter);
      lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(MainActivity.this,progName[position],Toast.LENGTH_LONG).show();
          }
      });

    }
}
