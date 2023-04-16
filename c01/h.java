package c01.h;
import android.content.DialogInterface$OnDismissListener;
import c01.e;
import java.lang.Object;
import android.content.DialogInterface;

public class h implements DialogInterface$OnDismissListener	// class@000443
{
    public final e b;

    public void h(e p0){
       this.b = p0;
       super();
    }
    public void onDismiss(DialogInterface p0){
       h tb = this.b;
       if (tb.x != null) {
          tb.x = null;
       }
       return;
    }
}
