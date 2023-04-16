package f43.c$e;
import erd.o;
import f43.c;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class c$e implements o	// class@00286f
{
    public final c b;

    public void c$e(c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, c$e.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          boolean b = true;
          if (p0.intValue() != b && p0.intValue() != 2) {
             b = false;
          }
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
