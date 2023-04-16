package ox0.c;
import android.content.DialogInterface$OnDismissListener;
import ox0.l;
import java.lang.Object;
import android.content.DialogInterface;

public final class c implements DialogInterface$OnDismissListener	// class@0035b8
{
    public final l b;

    public void c(l p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.a = null;
    }
}
