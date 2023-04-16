package cg1.b;
import rz2.e;
import java.lang.Object;
import cg1.b$a;
import cg1.b$b;
import pz2.c;
import rz2.f;
import rz2.b;
import rz2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cg1.a;

public class b implements e	// class@0004b0
{

    public void b(){
       super();
    }
    public void b(b$a p0){
       super();
    }
    public static b b(){
       return b$b.a;
    }
    public a a(c p0,f p1,b p2){
       a uoa = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(p0, p1, p2);
       }
       return uoa;
    }
}
