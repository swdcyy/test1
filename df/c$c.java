package df.c$c;
import com.facebook.react.modules.core.a$a;
import df.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.bridge.UiThreadUtil;
import hg.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;

public class c$c extends a$a	// class@001e4e
{
    public boolean c;
    public boolean d;
    public final c e;

    public void c$c(c p0){
       this.e = p0;
       super();
       this.c = false;
       this.d = false;
    }
    public void a(long p0){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "1")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (this.d != null) {
          this.c = false;
       }else {
          this.d();
       }
       a.a(0, "ScheduleDispatchFrameCallback");
       this.e.f();
       if (this.e.q == null) {
          this.e.q = true;
          this.e.l.get();
          c$c te = this.e;
          te.d.runOnJSQueueThread(te.g);
       }
       a.c(0, "ScheduleDispatchFrameCallback");
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "2")) {
          return;
       }
       if (this.c == null) {
          this.c = true;
          this.d();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "3")) {
          return;
       }
       ReactChoreographer.a().d(ReactChoreographer$CallbackType.TIMERS_EVENTS, this.e.k);
       return;
    }
}
