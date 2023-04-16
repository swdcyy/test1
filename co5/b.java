package co5.b;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b	// class@00070b
{
    public final TabViewInfo$TabLottie a;
    public final boolean b;

    public void b(TabViewInfo$TabLottie p0,boolean p1){
       super();
       this.b = p1;
       this.a = p0;
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(null, false);
    }
    public static b b(TabViewInfo$TabLottie p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(p0, true);
    }
}
