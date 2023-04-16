package g19.g0;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.k;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.HashMap;
import com.yxcorp.gifshow.widget.ViewStubInflater2;

public final class g0 implements g	// class@0023b8
{
    public final k b;

    public void g0(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f104b38));
       tb.r.getUser().setShowMissButton(false);
       p0 = tb.r.getUserId();
       k ok = k.class;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.FALSE, tb, ok, "10")) {
          tb.y.put(p0, Boolean.FALSE);
       }
       tb.q.g(false);
       return;
    }
}
