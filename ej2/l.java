package ej2.l;
import android.content.DialogInterface$OnDismissListener;
import ej2.o;
import java.lang.Object;
import android.content.DialogInterface;

public final class l implements DialogInterface$OnDismissListener	// class@002732
{
    public final o b;

    public void l(o p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.s = null;
    }
}
