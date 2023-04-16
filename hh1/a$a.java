package hh1.a$a;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sl1.b;
import kotlin.jvm.internal.a;
import rl1.j;
import fh1.a;
import rl1.j$a;

public final class a$a implements o	// class@0026a8
{
    public static final a$a b;

    static {
       a$a.b = new a$a();
    }
    public void a$a(){
       super();
    }
    public Object apply(Object p0){
       j$a a;
       b uob = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          a = j.a;
          p0 = p0.a().mGiftNamingPbBase64;
          if (p0 == null) {
             p0 = "";
          }
          uob = a.a(p0);
       }
       return uob;
    }
}
