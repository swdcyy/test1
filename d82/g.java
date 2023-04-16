package d82.g;
import android.content.DialogInterface$OnDismissListener;
import d82.n;
import java.lang.Object;
import android.content.DialogInterface;

public final class g implements DialogInterface$OnDismissListener	// class@002490
{
    public final n b;

    public void g(n p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.s = null;
    }
}
