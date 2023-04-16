package ha2.e;
import android.content.DialogInterface$OnDismissListener;
import java.lang.Object;
import android.content.DialogInterface;

public final class e implements DialogInterface$OnDismissListener	// class@002d3a
{
    public final DialogInterface$OnDismissListener b;

    public void e(DialogInterface$OnDismissListener p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       e tb = this.b;
       if (tb != null) {
          tb.onDismiss(p0);
       }
       return;
    }
}
