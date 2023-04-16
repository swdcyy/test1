package gra.b;
import gra.h;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gra.b$a;
import io.reactivex.g;
import kotlin.jvm.internal.a;

public abstract class b extends h	// class@002ba5
{

    public void b(){
       super();
    }
    public final t a9(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = t.create(new b$a(this, p0, p1));
       a.o(ot, "Observable.create<Boolea¡­\), it\)\n          }\)\n    }");
       return ot;
    }
    public final String b9(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(172);
    }
    public abstract String c9();
    public abstract t d9();
}
