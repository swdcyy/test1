package gka.q;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.fragment.d;
import java.lang.Object;
import android.content.DialogInterface;

public final class q implements DialogInterface$OnDismissListener	// class@002b16
{
    public final d b;

    public void q(d p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       d w = this.b.w;
       if (w != null) {
          w.onDismiss(p0);
       }
       return;
    }
}
