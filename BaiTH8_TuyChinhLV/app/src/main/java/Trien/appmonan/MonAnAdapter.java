package Trien.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    //
    private ArrayList<MonAn>  dsMonAn;
   private LayoutInflater layoutInflater;
   private Context context;
   // khoi tao


    public MonAnAdapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View viewHienHanh = view;
        if (viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        // lay dl
        MonAn monAnHienTai = dsMonAn.get(i);
        TextView textView_TemMon = (TextView) viewHienHanh.findViewById(R.id.TenMonAn);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.DonGia);
        TextView textView_TemMoTa = (TextView) viewHienHanh.findViewById(R.id.TenMoTa);
        ImageView imageView = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);
        // set
        textView_TemMon.setText(monAnHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_TemMoTa.setText( monAnHienTai.getMoTa());
        imageView.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return  viewHienHanh;



    }
}
