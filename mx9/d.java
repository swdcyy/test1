package mx9.d;
import erd.g;
import mx9.f;
import java.lang.Object;
import qvb.i;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import al9.a;

public final class d implements g	// class@003090
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b;
       if (p0.d.isEmpty()) {
          p0.b();
          p0.d.e0(RequestTiming.DEFAULT);
       }
       return;
    }
}
