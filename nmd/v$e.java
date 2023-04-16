package nmd.v$e;
import t36.f$a;
import java.lang.Object;
import voc.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class v$e implements f$a	// class@001e7d
{
    public static final v$e a;

    static {
       v$e.a = new v$e();
    }
    public void v$e(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$e.class, "1")) {
       }else {
          p0.e();
       }
       return;
    }
}
