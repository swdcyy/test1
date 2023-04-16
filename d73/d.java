package d73.d;
import uy2.a$a;
import xp5.i;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import pz2.c;
import java.util.Map;
import fg1.a;

public final class d implements a$a	// class@002485
{
    public final i a;

    public void d(i p0){
       this.a = p0;
       super();
    }
    public ClientContent$LiveStreamPackage a(){
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.a();
       a.o(obj, "logPackageProvider.liveStreamPackage");
       return obj;
    }
    public Map b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "renderTask");
       Map map = a.e(p0);
       a.o(map, "LiveEffectUtil.getEffect¡­duleLogParams\(renderTask\)");
       return map;
    }
}
