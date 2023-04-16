package k91.c$b;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Object;
import k91.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.ref.WeakReference;
import q00.b;
import k91.e;
import java.lang.Exception;
import java.lang.Throwable;
import sj7.d;
import java.lang.Thread;
import k91.d;
import java.lang.Runnable;
import ekd.k1;

public class c$b implements c$c	// class@002ce0
{
    public boolean a;
    public WeakReference b;

    public void c$b(){
       super();
    }
    public void c$b(c$a p0){
       super();
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$b.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ARYA, "start ai in load task:"+this.a);
       if (this.a == null) {
          return;
       }
       c$b tb = this.b;
       if (tb != null) {
          objArray = tb.get();
       }
       if (objArray != null) {
          e.d(objArray, e.c());
       }
       return;
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "3")) {
          return;
       }
       b.I(LiveLogTag.LIVE_ARYA, "load so fail", p0);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
       }else {
          b.Z(LiveLogTag.LIVE_ARYA, "load so success "+p0+Thread.currentThread());
          this.a = true;
          k1.p(new d(this), this);
       }
       return;
    }
}
