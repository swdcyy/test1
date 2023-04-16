package el9.g;
import android.content.DialogInterface$OnShowListener;
import com.yxcorp.gifshow.comment.presenter.global.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import kk9.d;
import java.lang.Object;
import android.content.DialogInterface;
import ek9.t0;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.lang.Boolean;
import brd.y;
import java.util.Iterator;
import java.util.List;
import xk9.d;

public final class g implements DialogInterface$OnShowListener	// class@0021ea
{
    public final a b;
    public final BaseEditorFragment c;
    public final d d;

    public void g(a p0,BaseEditorFragment p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onShow(DialogInterface p0){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       tb.C.g();
       if (tc.Kh() != null) {
          a a = tb.A;
          if (a != null) {
             a.onNext(Boolean.TRUE);
          }
          Iterator iterator = tb.v.iterator();
          while (iterator.hasNext()) {
             iterator.next().f(td, tc);
          }
       }
       return;
    }
}
