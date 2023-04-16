package k2a.c;
import android.content.DialogInterface$OnDismissListener;
import k2a.e;
import java.lang.Object;
import android.content.DialogInterface;
import k2a.e$a;

public final class c implements DialogInterface$OnDismissListener	// class@002b9b
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.h.a(false);
    }
}
