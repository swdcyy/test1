package c5c.f;
import android.content.DialogInterface$OnDismissListener;
import w2c.a;
import java.lang.Object;
import android.content.DialogInterface;

public final class f implements DialogInterface$OnDismissListener	// class@000525
{
    public final a b;

    public void f(a p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.onDismiss();
    }
}
