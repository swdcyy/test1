package c5c.e;
import android.content.DialogInterface$OnDismissListener;
import w2c.a;
import java.lang.Object;
import android.content.DialogInterface;

public final class e implements DialogInterface$OnDismissListener	// class@000524
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.onDismiss();
    }
}
