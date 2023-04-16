package azb.o;
import ok.o;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.lang.Object;
import s36.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class o implements o	// class@00037b
{
    public final GrowthGuideItemConfig b;

    public void o(GrowthGuideItemConfig p0){
       this.b = p0;
       super();
    }
    public boolean apply(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null){
          p0 = p0.c();
          if (p0 != null) {
             p0 = p0.getGuideItemId();
          label_0023 :
             b = a.g(p0, this.b.getGuideItemId());
          }
       }
       p0 = null;
       goto label_0023 ;
       return b;
    }
}
