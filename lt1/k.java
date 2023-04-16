package lt1.k;
import android.os.CountDownTimer;
import lt1.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public final class k extends CountDownTimer	// class@003032
{
    public final j a;
    public final long b;

    public void k(j p0,long p1,long p2,long p3){
       this.a = p0;
       this.b = p1;
       super(p2, p3);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       this.a.y0(0);
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, k.class, "1")) {
          return;
       }
       this.a.y0(p0);
       return;
    }
}
