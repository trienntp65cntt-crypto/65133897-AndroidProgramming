package thigk2.nguyentuphattrien_65133897;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChucNang2_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChucNang2_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ChucNang2_Fragment() {
        // Required empty public constructor
    }

    public ChucNang2_Fragment newInstance(String param1, String param2) {
        ChucNang2_Fragment fragment = new ChucNang2_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;


        ArrayList<String> dsTencakhuc = new ArrayList<String>(); // xin moi
        dsTencakhuc.add("ca khuc 1");
        dsTencakhuc.add("ca khuc 2");
        dsTencakhuc.add("ca khuc 3");
        dsTencakhuc.add("ca khuc 4");
        dsTencakhuc.add("ca khuc 5");

        //b2 tao adapter
        ArrayAdapter<String> adapterCakhuc = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTencakhuc);

        // b3 gan vao dk hien thi

        ListView lvcakhuc = lvcakhuc.findViewById(R.id.lvck);
        //3.2
        lvcakhuc.setAdapter(adapterCakhuc);


    }
}





