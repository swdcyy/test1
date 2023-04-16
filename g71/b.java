package g71.b;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import g71.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import kotlin.jvm.internal.a;
import lp3.e;
import gq1.l;
import lp3.c;
import mq1.b;
import gq1.o;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class b extends AbstractLiveJsChannel	// class@002431
{
    public boolean h;
    public final b i;

    public void b(){
       super();
       this.i = new b$b(this);
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.o();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.m(p0, p1);
       if (!PatchProxy.applyVoid(null, this, b.class, "4") && (!this.j().b() && this.h == null)) {
          this.h = true;
          l ol = this.j().c(l.class);
          if (ol != null) {
             ol.V(this.i);
          }
          o oo = this.j().c(o.class);
          if (oo != null) {
             oo.V(this.i);
          }
       }
    label_0056 :
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.n(p0);
       this.o();
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (this.j().b()) {
          return;
       }
       try{
          l ol = this.j().c(l.class);
          if (ol != null) {
             ol.x0(this.i);
          }
          o oo = this.j().c(o.class);
          if (oo != null) {
             oo.x0(this.i);
          }
          this.h = false;
       }catch(java.lang.Exception e0){
          b.y(LiveLogTag.LIVE_MULTI_LINE.appendTag("LiveJsMultiLineChatModeUpdate"), "removeObserverIfNeed", e0);
       }
       return;
    }
}
