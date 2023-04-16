package aec.h;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.helper.h;

public final class h implements r	// class@000102
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0.booleanValue() && h.a())? true: false;
       }
       return b;
    }
}
