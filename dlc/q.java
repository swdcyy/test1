package dlc.q;
import erd.g;
import dlc.s;
import java.lang.Object;
import xkc.a;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.lang.String;
import java.util.Map;
import alc.a;

public final class q implements g	// class@002267
{
    public final s b;

    public void q(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       if (tb.G.get() != null && !(tb.G.get().mId).equals(p0.a.mId)) {
          a.j(p0.a, null);
       }
       tb.S8(false);
       return;
    }
}
