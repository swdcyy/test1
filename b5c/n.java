package b5c.n;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.d;
import java.lang.String;
import java.lang.Object;
import ja6.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.framework.model.user.User;
import eda.s;
import com.kwai.robust.PatchProxyResult;

public final class n implements g	// class@0003b1
{
    public final d b;
    public final String c;

    public void n(d p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(p0, tc, tb, d.class, "8")) {
       }else if(p0.b == 2 && TextUtils.equals(tc, p0.a)){
          p0 = RxBus.f;
          User mId = tb.p.mId;
          s os = PatchProxy.applyTwoRefs(mId, "COMMERCIAL_LIVE", null, s.class, "3");
          if (os != PatchProxyResult.class) {
          }else {
             os = s.b(mId, "COMMERCIAL_LIVE", 0);
          }
          p0.b(os);
       }
       return;
    }
}
