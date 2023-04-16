package lt1.i$a;
import android.os.CountDownTimer;
import lt1.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public final class i$a extends CountDownTimer	// class@00302d
{
    public final i a;
    public final long b;

    public void i$a(i p0,long p1,long p2,long p3){
       this.a = p0;
       this.b = p1;
       super(p2, p3);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "2")) {
          return;
       }
       this.a.u0(0);
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, i$a.class, "1")) {
          return;
       }
       this.a.u0(p0);
       return;
    }
}
