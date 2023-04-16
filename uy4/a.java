package uy4.a;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;

public interface abstract a	// class@0034ac
{

    void a(PlcEntryDataAdapter p0,QPhoto p1);
    void b(Activity p0,Fragment p1,int p2);
    void c(QPhoto p0,PlcEntryDataAdapter p1,Activity p2,PLCLogHelper p3);
    void onDestroy();
}
