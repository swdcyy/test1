package k2a.b;
import android.content.DialogInterface$OnCancelListener;
import k2a.e;
import java.lang.Object;
import android.content.DialogInterface;
import k2a.e$a;

public final class b implements DialogInterface$OnCancelListener	// class@002b9a
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       this.b.h.a(false);
    }
}
