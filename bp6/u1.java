package bp6.u1;
import erd.g;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import nq6.s;
import java.util.Objects;
import java.util.Map;
import java.lang.Integer;
import java.util.HashMap;

public final class u1 implements g	// class@000552
{
    public final v b;
    public final KwaiMsg c;

    public void u1(v p0,KwaiMsg p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       s os = s.t(this.b.a);
       int tarType = this.c.getTargetType();
       Objects.requireNonNull(os);
       if (p0 == null) {
       }else {
          Map map = os.x(s.v(tarType, ".Delete"));
          map.put("messageCount", Integer.valueOf(1));
          os.c(map, -1, p0.getMessage());
          os.A(map);
       }
       return;
    }
}
