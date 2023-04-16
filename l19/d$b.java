package l19.d$b;
import a09.c;
import l19.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import a09.b;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import l19.e;
import erd.g;

public class d$b implements c	// class@002c75
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       d u = this.a.u;
       if (u != null && u.get() != null) {
          u = this.a.x;
          if (u != null && !u.get().b()) {
             return;
          }else {
             uob = this.a;
             uob.R8(false, false, uob.u.get());
             a.d().k(new PlayEvent(this.a.r, PlayEvent$Status.RESUME, 14));
             o.z().e(24, this.a.r.mEntity).d(new e(p0)).a();
          }
       }
       return;
    }
    public void b(int p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       d u = this.a.u;
       if (u != null && u.get() != null) {
          u = this.a.x;
          if (u != null && !u.get().b()) {
             return;
          }else {
             d$b ta = this.a;
             ta.R8(false, false, ta.u.get());
             a.d().k(new PlayEvent(this.a.r, PlayEvent$Status.RESUME, 14));
          }
       }
       return;
    }
}
