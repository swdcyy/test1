package c41.e;
import aa1.b;
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

public class e implements b	// class@00046e
{

    public void e(){
       super();
    }
    public List a(Object p0){
       List list = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          list = d.a(0x13be0446).WQ(p0);
       }
       return list;
    }
}
