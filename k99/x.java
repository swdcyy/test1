package k99.x;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class x implements r	// class@002b9c
{
    public static final x b;

    static {
       x.b = new x();
    }
    public void x(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null){
          b = p0.booleanValue();
       }else {
          b = false;
       }
       return b;
    }
}
