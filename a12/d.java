package a12.d;
import ie2.a;
import lb2.i;
import tq5.c;
import t02.a0;
import android.app.Activity;
import java.lang.Object;
import f12.d;
import f12.c;
import com.kuaishou.live.core.basic.utils.e;
import ge5.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.show.floatingwindow.z;
import com.kwai.feature.api.live.base.service.statistics.CloseLiveReason;
import joc.g;
import foc.m;
import joc.m;

public class d implements a	// class@000011
{
    public final i a;
    public final c b;
    public final a0 c;
    public final g d;
    public final m e;
    public final d f;

    public void d(i p0,c p1,a0 p2,Activity p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       d uod = c.b(p3);
       this.f = uod;
       if (e.s(p3) && uod.p() != null) {
          this.d = uod.p().c;
          this.e = uod.p().d;
       }else {
          this.d = null;
          this.e = null;
       }
       return;
    }
    public boolean a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.a.b() == null) {
          obj = this.c;
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, z.class, "6");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): z.f(obj, objArray);
          if (!b) {
             CloseLiveReason uCloseLiveRe = this.b.Qf();
             if (uCloseLiveRe == CloseLiveReason.CLICK_CLOSE_BUTTON || uCloseLiveRe == CloseLiveReason.CLICK_BACK_KEY) {
                return true;
             }else {
                d td = this.d;
                if (td != null && td.c.i()) {
                   return true;
                }else {
                   td = this.e;
                   if (td != null && td.c.i()) {
                      return true;
                   }else if(this.f.A()){
                      return true;
                   }else {
                      return false;
                   }
                }
             }
          }
       }
       return false;
    }
}
