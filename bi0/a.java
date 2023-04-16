package bi0.a;
import o95.a;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import hw5.c;
import vv5.a0;

public class a implements a	// class@00038e
{

    public void a(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public t r(String p0,String p1,String p2,String p3){
       p2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return d.a(0x16b5eb97).r(p0, p1, "101", p3);
    }
}
