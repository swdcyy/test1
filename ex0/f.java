package ex0.f;
import tj3.o;
import ex0.i;
import java.lang.Object;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveAnchorQosInfoSyncMessage;
import java.lang.Integer;

public final class f implements o	// class@002210
{
    public final i a;

    public void f(i p0){
       this.a = p0;
    }
    public final void a(Map p0){
       f ta = this.a;
       i n = ta.N;
       if (n == null) {
       }else {
          p0.put("anchorQosMaxQ", Integer.valueOf(n.maxQ));
          p0.put("anchorQosPushStreamType", Integer.valueOf(n.pushStreamType));
          p0.put("anchorQosVersion", Integer.valueOf(n.version));
          ta.N = null;
       }
       return;
    }
}
