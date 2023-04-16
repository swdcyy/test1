package androidx.appcompat.app.AlertController$f$a;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$f;
import android.content.Context;
import java.lang.CharSequence;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class AlertController$f$a extends ArrayAdapter	// class@000560
{
    public final AlertController$RecycleListView b;
    public final AlertController$f c;

    public void AlertController$f$a(AlertController$f p0,Context p1,int p2,int p3,CharSequence[] p4,AlertController$RecycleListView p5){
       this.c = p0;
       this.b = p5;
       super(p1, p2, p3, p4);
    }
    public View getView(int p0,View p1,ViewGroup p2){
       p1 = super.getView(p0, p1, p2);
       AlertController$f f = this.c.F;
       if (f != null && f[p0]) {
          this.b.setItemChecked(p0, true);
       }
       return p1;
    }
}
