package hl9.b0;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.comment.utils.e;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.WeakHashMap;

public final class b0 implements DialogInterface$OnDismissListener	// class@0026c3
{
    public final e b;
    public final DialogInterface$OnDismissListener c;

    public void b0(e p0,DialogInterface$OnDismissListener p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onDismiss(DialogInterface p0){
       b0 tb = this.b;
       b0 tc = this.c;
       Objects.requireNonNull(tb);
       if (tc != null) {
          tc.onDismiss(p0);
       }
       e a = tb.a;
       if (a instanceof GifshowActivity) {
          KwaiDialogFragment.o.remove(a.getSupportFragmentManager());
       }
       e i = tb.i;
       if (i != null) {
          i.onDismiss(p0);
       }
       return;
    }
}
