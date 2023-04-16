package be8.m;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import be8.l;
import java.util.Collection;
import z0.a;
import zi8.m;

public class m	// class@00033a
{

    public void m(){
       super();
    }
    public static List a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m.g(p0, l.a);
    }
}
