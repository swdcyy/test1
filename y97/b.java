package y97.b;
import java.lang.Runnable;
import com.kwai.middleware.azeroth.sdk.SDKHandler;
import java.lang.Object;
import com.kwai.middleware.azeroth.Azeroth2;
import brd.t;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import y97.c;
import y97.d;
import erd.g;
import crd.b;

public final class b implements Runnable	// class@002863
{
    public final SDKHandler b;

    public void b(SDKHandler p0){
       this.b = p0;
       super();
    }
    public final void run(){
       b tb = this.b;
       if (tb.b != null) {
       }else {
          Azeroth2.B.x().observeOn(AzerothSchedulers.b.c()).subscribe(new c(tb), d.b);
          tb.b = true;
       }
       this.b.c();
       return;
    }
}
