package ekd.v;
import erd.a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import com.yxcorp.utility.f$c;

public final class v implements a	// class@000d80
{
    public final AtomicReference b;

    public void v(AtomicReference p0){
       this.b = p0;
    }
    public final void run(){
       v tb = this.b;
       if (tb.get() != null) {
          tb.get().dispose();
       }
       return;
    }
}
