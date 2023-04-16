package b8a.h2;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.d0;
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

public final class h2 implements g	// class@0003ac
{
    public final d0 b;

    public void h2(d0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h2 tb = this.b;
       Objects.requireNonNull(tb);
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f104b38));
       tb.r.getUser().setShowMissButton(false);
       p0 = tb.r.getUserId();
       d0 uod0 = d0.class;
       if (!PatchProxy.isSupport(uod0) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.FALSE, tb, uod0, "10")) {
          tb.y.put(p0, Boolean.FALSE);
       }
       tb.q.g(false);
       return;
    }
}
