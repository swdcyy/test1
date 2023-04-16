package mj.a;
import ijc.b;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import oj.l;

public class a implements b	// class@00268e
{

    public void a(){
       super();
    }
    public t h(String p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-1882797052).h(p0, p1, p2);
    }
    public boolean isAvailable(){
       return true;
    }
}
