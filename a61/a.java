package a61.a;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import android.os.Message;

public class a extends Handler	// class@000048
{
    public final Runnable a;
    public boolean b;
    public long c;

    public void a(Looper p0,long p1,Runnable p2){
       super(p0);
       this.b = true;
       this.c = p1;
       this.a = p2;
    }
    public void a(long p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, a.class, "8")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.b = false;
       this.sendEmptyMessageDelayed(0x2713, p0);
       return;
    }
    public void b(long p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, a.class, "3")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.a.run();
       this.removeMessages(0x2713);
       this.sendEmptyMessageDelayed(0x2713, p0);
       return;
    }
    public boolean c(){
       return (this.b ^ 0x01);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.removeMessages(0x2713);
       return;
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.b(this.c);
       return;
    }
}
