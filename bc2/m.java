package bc2.m;
import android.content.DialogInterface$OnDismissListener;
import bc2.t;
import java.lang.Object;
import android.content.DialogInterface;

public final class m implements DialogInterface$OnDismissListener	// class@0003d8
{
    public final t b;

    public void m(t p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.d = null;
    }
}
