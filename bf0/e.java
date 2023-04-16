package bf0.e;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.HandlerThread;
import java.lang.StringBuilder;
import ye0.a;
import bf0.e$a;
import android.os.Looper;
import android.os.Handler;
import android.os.Message;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class e	// class@000369
{
    public final HandlerThread a;
    public final Handler b;

    public void e(String p0){
       a.p(p0, "threadName");
       super();
       HandlerThread handlerThrea = new HandlerThread(p0, 10);
       this.a = handlerThrea;
       a.f("PrtpThread#init : threadName = "+p0, false, 2, null);
       handlerThrea.start();
       a.f("PrtpThread#init : start Thread threadName = "+p0, false, 2, null);
       this.b = new e$a(this, handlerThrea.getLooper());
    }
    public final Handler a(){
       return this.b;
    }
    public abstract void b(Message p0);
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isAlive();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.quitSafely();
    }
}
