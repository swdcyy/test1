package bc2.e;
import android.content.DialogInterface$OnDismissListener;
import bc2.k;
import java.lang.Object;
import android.content.DialogInterface;

public final class e implements DialogInterface$OnDismissListener	// class@0003d0
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.d = null;
    }
}
