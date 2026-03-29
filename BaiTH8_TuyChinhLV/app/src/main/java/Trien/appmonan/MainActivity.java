package Trien.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvdsmonan);
        //cb dl
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();

        dsMonAn.add(new MonAn( "Com Tam Suon ", 20000, "mota" , R .drawable.suon)) ;
        dsMonAn.add(new MonAn( "Com Tam Suon t", 20000, "mota" , R .drawable.st)) ;
        dsMonAn.add(new MonAn( "Com ga xm", 20000, "mota" , R .drawable.xm)) ;
        dsMonAn.add(new MonAn( "Com sbc ", 20000, "mota" , R .drawable.sbc)) ;
        dsMonAn.add(new MonAn( "Com Tam Suon  db", 20000, "mota" , R .drawable.db)) ;

        //
        MonAnAdapter adapter = new MonAnAdapter(this,dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        //
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                //
                MonAn   monAnChon = dsMonAn.get(i);
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}