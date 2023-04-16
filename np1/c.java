package np1.c;
import android.content.DialogInterface$OnDismissListener;
import np1.b;
import java.lang.Object;
import android.content.DialogInterface;

public final class c implements DialogInterface$OnDismissListener	// class@0033a5
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       p0.j = null;
    }
}
