package b62.n;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.User;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public class n implements FollowHelper$a	// class@00034c
{
    public final i a;

    public void n(i p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,g p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, on, "1")) {
          return;
       }
       if (p1.a.getFollowStatus() == User$FollowStatus.FOLLOWING) {
          this.a.Z8(true, false);
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101020));
       }else {
          this.a.Z8(false, false);
       }
       return;
    }
}
