package i21.d$a;
import erd.r;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class d$a implements r	// class@00280d
{
    public static final d$a b;

    static {
       d$a.b = new d$a();
    }
    public void d$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0.mLiveCohesionPkJoinState != null)? true: false;
       }
       return b;
    }
}
