package ha2.d;
import android.content.DialogInterface$OnDismissListener;
import java.lang.Object;
import android.content.DialogInterface;

public final class d implements DialogInterface$OnDismissListener	// class@002d39
{
    public final DialogInterface$OnDismissListener b;

    public void d(DialogInterface$OnDismissListener p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       d tb = this.b;
       if (tb != null) {
          tb.onDismiss(p0);
       }
       return;
    }
}
