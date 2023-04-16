package androidx.appcompat.app.AlertController$f$c;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.app.AlertController$f;
import androidx.appcompat.app.AlertController;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import q0.e;

public class AlertController$f$c implements AdapterView$OnItemClickListener	// class@000562
{
    public final AlertController b;
    public final AlertController$f c;

    public void AlertController$f$c(AlertController$f p0,AlertController p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       this.c.x.onClick(this.b.b, p2);
       if (this.c.H == null) {
          this.b.b.dismiss();
       }
       return;
    }
}
