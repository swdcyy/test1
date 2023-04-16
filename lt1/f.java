package lt1.f;
import android.os.CountDownTimer;
import lt1.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public final class f extends CountDownTimer	// class@003028
{
    public final e a;
    public final long b;

    public void f(e p0,long p1,long p2,long p3){
       this.a = p0;
       this.b = p1;
       super(p2, p3);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.a.y0(0);
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, f.class, "1")) {
          return;
       }
       this.a.y0(p0);
       return;
    }
}
