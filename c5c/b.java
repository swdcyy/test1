package c5c.b;
import android.content.DialogInterface$OnDismissListener;
import w2c.a;
import java.lang.Object;
import android.content.DialogInterface;

public final class b implements DialogInterface$OnDismissListener	// class@000521
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.onDismiss();
    }
}
