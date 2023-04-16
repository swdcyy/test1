package b08.d;
import erd.g;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.lang.Object;
import java.lang.Throwable;
import f08.f;
import java.lang.StringBuilder;
import java.lang.String;
import f08.f$a;
import java.util.Map;

public final class d implements g	// class@0002ec
{
    public final PendantDataServer b;
    public final SignalPendant c;

    public void d(PendantDataServer p0,SignalPendant p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       f$a.v(f.a, this.b.i, "new signal "+this.c.pendantCode+" call RNLive BusinessHandle failed", null, false, null, 28, null);
    }
}
