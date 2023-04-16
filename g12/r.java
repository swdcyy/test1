package g12.r;
import joc.w$b;
import g12.q;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.liveslide.b;
import pw6.a;
import f12.o;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import yy6.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class r extends w$b	// class@002a39
{
    public final q b;

    public void r(q p0,Activity p1){
       this.b = p0;
       super(p1);
    }
    public void d(){
       SlidePlayLogger slidePlayLog;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r.class, "1")) {
          return;
       }
       this.b.q.mIsActivityClosedBySwipeOut = true;
       super.d();
       if (this.b.s.h().b() instanceof o) {
          o oo = this.b.s.h().b();
          Objects.requireNonNull(oo);
          slidePlayLog = PatchProxy.apply(objArray, oo, o.class, "5");
          if (slidePlayLog != PatchProxyResult.class) {
          }else {
             oo = oo.h;
             slidePlayLog = (oo != null)? oo.d1(): new PhotoDetailLogger();
          }
       }else {
          slidePlayLog = new PhotoDetailLogger();
       }
       slidePlayLog.setLeaveAction(true);
       return;
    }
}
