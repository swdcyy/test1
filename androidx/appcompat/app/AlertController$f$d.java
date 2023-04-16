package androidx.appcompat.app.AlertController$f$d;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.app.AlertController$f;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.AlertController;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListView;
import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;

public class AlertController$f$d implements AdapterView$OnItemClickListener	// class@000563
{
    public final AlertController$RecycleListView b;
    public final AlertController c;
    public final AlertController$f d;

    public void AlertController$f$d(AlertController$f p0,AlertController$RecycleListView p1,AlertController p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       AlertController$f f = this.d.F;
       if (f != null) {
          f[p2] = this.b.isItemChecked(p2);
       }
       this.d.J.onClick(this.c.b, p2, this.b.isItemChecked(p2));
       return;
    }
}
