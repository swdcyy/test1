package aegon.chrome.net.impl.CronetLibraryLoader$b;
import aegon.chrome.net.impl.CronetLibraryLoader$c;
import java.lang.Object;
import aegon.chrome.net.impl.CronetLibraryLoader$a;
import java.lang.Runnable;
import android.os.Handler;
import android.os.Looper;
import android.os.HandlerThread;
import java.lang.String;

public class CronetLibraryLoader$b implements CronetLibraryLoader$c	// class@0000a0
{
    public final Object a;
    public HandlerThread b;

    public void CronetLibraryLoader$b(){
       super();
       this.a = new Object();
    }
    public void CronetLibraryLoader$b(CronetLibraryLoader$a p0){
       super();
       this.a = new Object();
    }
    public void a(Runnable p0){
       this.c();
       if (this.b()) {
          p0.run();
       }else {
          new Handler(this.b.getLooper()).post(p0);
       }
       return;
    }
    public boolean b(){
       this.c();
       boolean b = (this.b.getLooper() == Looper.myLooper())? true: false;
       return b;
    }
    public final void c(){
       CronetLibraryLoader$b ta = this.a;
       _monitor_enter(ta);
       if (this.b == null) {
          this.b = new HandlerThread("CronetInit");
       }
       if (!this.b.isAlive()) {
          this.b.start();
       }
       _monitor_exit(ta);
       return;
    }
}
