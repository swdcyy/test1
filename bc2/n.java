package bc2.n;
import android.content.DialogInterface$OnDismissListener;
import bc2.t;
import java.lang.Object;
import android.content.DialogInterface;

public final class n implements DialogInterface$OnDismissListener	// class@0003d9
{
    public final t b;

    public void n(t p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.e = null;
    }
}
