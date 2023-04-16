package bp6.q1;
import erd.a;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import java.lang.String;
import nq6.s;
import java.util.Objects;
import java.util.Map;
import java.lang.Integer;
import java.util.HashMap;

public final class q1 implements a	// class@000546
{
    public final v b;
    public final KwaiMsg c;
    public final long d;

    public void q1(v p0,KwaiMsg p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       s os = s.t(this.b.a);
       Objects.requireNonNull(os);
       Map map = os.x(s.v(this.c.getTargetType(), ".Delete"));
       map.put("messageCount", Integer.valueOf(1));
       os.b(map, this.d);
       os.D(map);
    }
}
