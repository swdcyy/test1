package bu1.c;
import yt1.g;
import ws1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.MultiPKPlayFashionInfo;
import yt1.e;
import au1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bu1.a;

public final class c implements g	// class@000416
{
    public final c a;

    public void c(c p0){
       a.p(p0, "multiPKContainerLayout");
       super();
       this.a = p0;
    }
    public a a(MultiPKPlayFashionInfo p0,e p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "playFashionInfo");
       a.p(p1, "playFashionDelegate");
       return new a(p1, this.a);
    }
}
