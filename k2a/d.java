package k2a.d;
import android.content.DialogInterface$OnDismissListener;
import k2a.e;
import java.lang.Object;
import android.content.DialogInterface;
import k2a.e$a;

public final class d implements DialogInterface$OnDismissListener	// class@002b9c
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.h.a(false);
    }
}
