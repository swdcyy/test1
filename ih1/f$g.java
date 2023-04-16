package ih1.f$g;
import erd.r;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class f$g implements r	// class@0028df
{
    public static final f$g b;

    static {
       f$g.b = new f$g();
    }
    public void f$g(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, f$g.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0.mDelayRequestMillis >= 0)? true: false;
       }
       return b;
    }
}
