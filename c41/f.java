package c41.f;
import aa1.a;
import java.lang.Object;
import java.util.List;
import xs5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import bu4.a;

public class f implements a	// class@00046f
{

    public void f(){
       super();
    }
    public List a(Object p0){
       List list = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          list = d.a(0x13be0446).FI(p0);
       }
       return list;
    }
}
