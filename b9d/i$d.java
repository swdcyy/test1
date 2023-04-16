package b9d.i$d;
import v9d.b;
import b9d.i;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.HomeGuideConfig;
import v9d.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class i$d implements b	// class@0003c6
{
    public final i b;

    public void i$d(i p0){
       this.b = p0;
       super();
    }
    public c Ia(HomeGuideConfig p0){
       i obj = PatchProxy.applyOneRefs(p0, this, i$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.p;
       if (obj instanceof b) {
          return obj.Ia(p0);
       }
       return null;
    }
}
