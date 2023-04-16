package nz9.z0$c;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import nz9.z0;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tkd.b;
import tkd.d;
import ayb.i;
import az6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;

public class z0$c implements FollowHelper$a	// class@00325a
{
    public final z0 a;

    public void z0$c(z0 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,g p1){
       z0$c uoc = z0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       if (p0) {
          z0$c ta = this.a;
          if (ta.N != null) {
             ta.L0(true);
             ta.N = false;
          }else {
             z0$c ta1 = this.a;
             d.a(0x4f878389).dO(ta1.E.mSource, ta1.u.getUserName());
          }
          c.a(12, this.a.u.mEntity);
       }
       return;
    }
}
