package f4a.g0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class g0	// class@0022a5
{
    public static final g0 a;

    static {
       g0.a = new g0();
    }
    public void g0(){
       super();
    }
    public static final boolean a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !p0.isVideoType())? true: false;
       return b;
    }
}
