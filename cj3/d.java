package cj3.d;
import java.lang.Object;
import p5a.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v5a.f;

public class d	// class@000572
{

    public void d(){
       super();
    }
    public static c a(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
}
