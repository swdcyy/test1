package dl9.o0;
import android.view.View$OnClickListener;
import dl9.x0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.utils.d;
import dl9.u0;
import java.lang.Runnable;
import android.widget.TextView;
import java.util.Objects;
import ek9.t0;
import ek9.t0$a;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;

public final class o0 implements View$OnClickListener	// class@001f8b
{
    public final x0 b;

    public void o0(x0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o0 tb = this.b;
       x0 u = tb.u;
       if (PatchProxy.applyVoidOneRefs(u, tb, x0.class, "16")) {
       }else {
          QComment mParent = u.mParent;
          d.a(mParent);
          tb.S8();
          tb.r.postDelayed(new u0(tb, mParent), 100);
          x0 c = tb.C;
          x0 v = tb.v;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidTwoRefs(v, mParent, c, t0.class, "12")) {
             c.e.onNext(new t0$a(v, mParent));
          }
          tb.B.F(u, 310, "collapse_secondary_comment", mParent.getId(), f0.a(tb.w, tb.getActivity()));
       }
       return;
    }
}
