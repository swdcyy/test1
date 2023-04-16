package h01.k;
import android.content.DialogInterface$OnDismissListener;
import h01.o;
import java.lang.Object;
import android.content.DialogInterface;

public final class k implements DialogInterface$OnDismissListener	// class@0025ed
{
    public final o b;

    public void k(o p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.I = false;
    }
}
