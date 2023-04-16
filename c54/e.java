package c54.e;
import erd.g;
import c54.o;
import java.lang.Object;
import java.lang.Throwable;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import androidx.fragment.app.Fragment;
import java.lang.String;

public final class e implements g	// class@0004b6
{
    public final o b;

    public void e(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b.a.b(this.b.c, LiveCartNode.SIGNAL_UPDATE, "RealTimeUpdateManager", "fail to update tab list", p0);
    }
}
