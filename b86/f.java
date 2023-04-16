package b86.f;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.HandlerThread;
import b86.f$a;
import android.os.Looper;
import android.os.Handler;
import android.os.Message;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import y76.b;

public abstract class f	// class@00043b
{
    public final HandlerThread a;
    public final Handler b;
    public boolean c;
    public long d;

    public void f(String p0){
       a.p(p0, "threadName");
       super();
       HandlerThread handlerThrea = new HandlerThread(p0, 10);
       this.a = handlerThrea;
       handlerThrea.start();
       this.b = new f$a(this, handlerThrea.getLooper());
    }
    public final Handler a(){
       return this.b;
    }
    public abstract void b(Message p0);
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c == null && this.a.isAlive())? true: false;
       return b;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       b.e("KgiThread#stop : ["+this.a.getName()+"] <-------------++++++++++++++++++!!!!!!!!!", false, 2, null);
       this.c = true;
       this.a.quit();
       return;
    }
}
