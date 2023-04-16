package ao.c$a;
import p80.a;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.StringBuilder;
import java.lang.Throwable;
import brd.g;
import java.lang.Boolean;

public final class c$a implements a	// class@000206
{
    public final v a;

    public void c$a(v p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(){
    }
    public void c(){
    }
    public void d(){
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       a.p(p0, "error");
       Object[] objArray = new Object[0];
       KwaiPopLog.e.D("onCoreLoadFailed: "+p0, objArray);
       this.a.onError(new Throwable("onCoreLoadFailed: "+p0));
       this.a.onComplete();
       return;
    }
    public void onCoreLoadFinished(boolean p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.onNext(Boolean.TRUE);
       this.a.onComplete();
       return;
    }
}
