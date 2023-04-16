package c54.h;
import erd.g;
import c54.o;
import c54.o$b;
import java.lang.Object;
import java.lang.Throwable;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import androidx.fragment.app.Fragment;
import java.lang.String;

public final class h implements g	// class@0004b9
{
    public final o b;
    public final o$b c;

    public void h(o p0,o$b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tc = this.c;
       b.a.b(this.b.c, LiveCartNode.SIGNAL_UPDATE, "RealTimeUpdateManager", "realTimeUpdate request error", p0);
       if (tc != null) {
          tc.onFailure(p0);
       }
       return;
    }
}
