package h73.b;
import android.content.DialogInterface$OnDismissListener;
import h73.t;
import java.lang.Object;
import android.content.DialogInterface;

public final class b implements DialogInterface$OnDismissListener	// class@002caf
{
    public final t b;

    public void b(t p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.a = null;
    }
}
