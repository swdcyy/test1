package cd9.k$a;
import java.lang.Runnable;
import cd9.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import com.yxcorp.gifshow.camera.record.base.d;
import bd9.d;

public class k$a implements Runnable	// class@0005aa
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       k$a tb = this.b;
       tb.r.removeCallbacks(tb.t);
       if (!this.b.q.a2()) {
          tb = this.b;
          tb.q.k2(tb.s);
       }
       return;
    }
}
