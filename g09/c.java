package g09.c;
import nx8.m;
import java.lang.Object;
import nx8.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import l09.a;
import h09.b;
import w49.a;

public class c implements m	// class@0023aa
{

    public void c(){
       super();
    }
    public l a(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public l b(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public l c(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
