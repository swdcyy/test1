package cl9.i;
import android.content.DialogInterface$OnDismissListener;
import cl9.y;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.utility.n;
import ek9.t0;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.util.Iterator;
import xk9.d;
import kk9.d;
import com.yxcorp.gifshow.comment.utils.e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class i implements DialogInterface$OnDismissListener	// class@000637
{
    public final y b;

    public void i(y p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       i tb = this.b;
       n.Y(tb.G.b(R.id.comment_float_background), 8, true);
       tb.w.d();
       y w = tb.w;
       y l = tb.L;
       Objects.requireNonNull(w);
       t0 ot0 = t0.class;
       if (!PatchProxy.isSupport(ot0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(l), w, ot0, "1")) {
          w.k.onNext(Boolean.valueOf(l));
       }
       Iterator iterator = tb.M.Lh().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(tb.F.e(), tb.F.g());
       }
       return;
    }
}
