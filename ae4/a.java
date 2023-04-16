package ae4.a;
import java.lang.Object;
import ae4.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;

public class a	// class@0000a8
{

    public void a(){
       super();
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x6ae8edd6);
    }
}
