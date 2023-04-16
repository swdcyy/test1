package h92.b0;
import android.content.DialogInterface$OnDismissListener;
import h92.i0;
import java.lang.Object;
import android.content.DialogInterface;

public final class b0 implements DialogInterface$OnDismissListener	// class@002cff
{
    public final i0 b;

    public void b0(i0 p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.L = null;
    }
}
