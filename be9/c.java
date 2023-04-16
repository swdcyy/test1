package be9.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.log.b;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.u1;

public final class c implements Runnable	// class@000478
{
    public final b b;
    public final long c;

    public void c(b p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.timeCost = this.c - tb.n;
       h$b uob = h$b.d(1, 431);
       uob.q(resultPackag);
       u1.r0(uob);
    }
}
