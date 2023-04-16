package androidx.appcompat.widget.AppCompatSpinner$e$a;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.widget.AppCompatSpinner$e;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import android.widget.Spinner;
import android.widget.ListAdapter;
import androidx.appcompat.widget.ListPopupWindow;

public class AppCompatSpinner$e$a implements AdapterView$OnItemClickListener	// class@0005f2
{
    public final AppCompatSpinner b;
    public final AppCompatSpinner$e c;

    public void AppCompatSpinner$e$a(AppCompatSpinner$e p0,AppCompatSpinner p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       this.c.O.setSelection(p2);
       if (this.c.O.getOnItemClickListener() != null) {
          AppCompatSpinner$e$a tc = this.c;
          tc.O.performItemClick(p1, p2, tc.L.getItemId(p2));
       }
       this.c.dismiss();
       return;
    }
}
