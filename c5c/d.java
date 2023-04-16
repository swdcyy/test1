package c5c.d;
import android.content.DialogInterface$OnDismissListener;
import w2c.a;
import java.lang.Object;
import android.content.DialogInterface;

public final class d implements DialogInterface$OnDismissListener	// class@000523
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.onDismiss();
    }
}
