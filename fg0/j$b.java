package fg0.j$b;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public final class j$b implements x	// class@002329
{
    public static final j$b b;

    static {
       j$b.b = new j$b();
    }
    public void j$b(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, j$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.valueOf(a.t().d("disablePendantShowByGRVideo", false));
       }
       return uBoolean;
    }
}
