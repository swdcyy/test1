package eg1.k;
import uy2.a$a;
import eg1.j;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import lp3.a;
import xp5.i;
import lp3.c;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import pz2.c;
import java.util.Map;
import fg1.a;

public class k implements a$a	// class@002155
{
    public final j a;

    public void k(j p0){
       this.a = p0;
       super();
    }
    public ClientContent$LiveStreamPackage a(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.Po();
       if (obj != null && !obj.b()) {
          return obj.a(i.class).a();
       }
       b.P(j.q, "[ILiveServiceManager][LiveEffectManagerListenerImpl]serviceManager:"+obj);
       return objArray;
    }
    public Map b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.e(p0);
    }
}
