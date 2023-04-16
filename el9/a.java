package el9.a;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.comment.presenter.global.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kk9.d;
import java.lang.Object;
import android.content.DialogInterface;
import ek9.t0;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import brd.y;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.WeakHashMap;
import java.util.Iterator;
import java.util.List;
import xk9.d;

public final class a implements DialogInterface$OnDismissListener	// class@0021da
{
    public final a b;
    public final BaseEditorFragment c;
    public final GifshowActivity d;
    public final d e;

    public void a(a p0,BaseEditorFragment p1,GifshowActivity p2,d p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onDismiss(DialogInterface p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       tb.C.d();
       if (tb.Y8() != null) {
          n.Y(tb.Y8(), 8, true);
       }
       a a = tb.A;
       if (a != null) {
          a.onNext(Boolean.FALSE);
       }
       KwaiDialogFragment.o.remove(td.getSupportFragmentManager());
       tb.V8(false);
       Iterator iterator = tb.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(te, tc);
       }
       tb.G = null;
       return;
    }
}
