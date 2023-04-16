package i61.a;
import android.content.DialogInterface$OnDismissListener;
import i61.j;
import java.lang.Object;
import android.content.DialogInterface;

public final class a implements DialogInterface$OnDismissListener	// class@002834
{
    public final j b;

    public void a(j p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.b = null;
    }
}
