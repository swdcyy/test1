package iv8.a;
import erd.o;
import java.lang.Object;
import pv8.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class a implements o	// class@00272b
{

    public void a(){
       super();
    }
    public Object apply(Object p0){
       b uob = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = p0.c;
       }
       return uob;
    }
}
