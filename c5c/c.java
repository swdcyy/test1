package c5c.c;
import android.content.DialogInterface$OnDismissListener;
import w2c.a;
import java.lang.Object;
import android.content.DialogInterface;

public final class c implements DialogInterface$OnDismissListener	// class@000522
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.onDismiss();
    }
}
