package dac.c0;
import f7c.d;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import h7c.b;
import java.util.List;
import com.yxcorp.gifshow.pymk.log.h;

public final class c0 extends d	// class@002137
{
    public final int f;

    public void c0(int p0){
       this.f = p0;
       super();
    }
    public void Qe(BaseFeed p0,RecoUser p1,User p2,int p3){
       if (PatchProxy.isSupport(c0.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, c0.class, "1")) {
          return;
       }
       a.p(p0, "feed");
       a.p(p1, "recoUser");
       if (this.f == 1) {
          d td = this.d;
          if (td != null) {
             td.j(p0, new b(p2, p1.mFeedList), p3);
          }
       }else {
          super.Qe(p0, p1, p2, p3);
       }
       return;
    }
}
