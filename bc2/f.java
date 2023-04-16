package bc2.f;
import android.content.DialogInterface$OnDismissListener;
import bc2.k;
import java.lang.Object;
import android.content.DialogInterface;

public final class f implements DialogInterface$OnDismissListener	// class@0003d1
{
    public final k b;

    public void f(k p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.e = null;
    }
}
