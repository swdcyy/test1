package bc2.g;
import android.content.DialogInterface$OnDismissListener;
import bc2.k;
import java.lang.Object;
import android.content.DialogInterface;

public final class g implements DialogInterface$OnDismissListener	// class@0003d2
{
    public final k b;

    public void g(k p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.f = null;
    }
}
