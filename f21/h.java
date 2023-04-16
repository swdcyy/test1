package f21.h;
import android.content.DialogInterface$OnDismissListener;
import f21.f;
import java.lang.Object;
import android.content.DialogInterface;

public final class h implements DialogInterface$OnDismissListener	// class@0022ab
{
    public final f b;

    public void h(f p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       p0.e = null;
    }
}
