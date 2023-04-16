package ay9.a;
import android.content.DialogInterface$OnDismissListener;
import ay9.q;
import java.lang.Object;
import android.content.DialogInterface;
import rf5.u;

public final class a implements DialogInterface$OnDismissListener	// class@0002eb
{
    public final q b;

    public void a(q p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       a tb = this.b;
       tb.v0(false);
       tb.I.F(true, 23);
    }
}
