package a01.a;
import android.content.DialogInterface$OnDismissListener;
import a01.i;
import java.lang.Object;
import android.content.DialogInterface;

public final class a implements DialogInterface$OnDismissListener	// class@000007
{
    public final i b;

    public void a(i p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.S = null;
    }
}
