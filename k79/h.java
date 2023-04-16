package k79.h;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import k79.h$a;
import k79.h$b;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class h	// class@002b52
{
    public final Handler a;

    public void h(){
       super();
       HandlerThread handlerThrea = new HandlerThread("ks-album-loader");
       handlerThrea.start();
       this.a = new Handler(handlerThrea.getLooper());
    }
    public void h(h$a p0){
       super();
       HandlerThread handlerThrea = new HandlerThread("ks-album-loader");
       handlerThrea.start();
       this.a = new Handler(handlerThrea.getLooper());
    }
    public static h a(){
       return h$b.a;
    }
    public void b(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.a.post(p0);
       return;
    }
}
