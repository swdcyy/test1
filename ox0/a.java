package ox0.a;
import android.content.DialogInterface$OnDismissListener;
import ox0.l;
import java.lang.Object;
import android.content.DialogInterface;

public final class a implements DialogInterface$OnDismissListener	// class@0035b6
{
    public final l b;

    public void a(l p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.a = null;
    }
}
