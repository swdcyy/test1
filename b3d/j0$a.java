package b3d.j0$a;
import zwd.o;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;
import zwd.j;
import zwd.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zwd.k;
import zwd.q;
import java.util.Map;

public class j0$a implements o	// class@00032f
{
    public static final String a;

    static {
       j0$a.a = new String(new byte[6]{0x09,0x0a,0x0b,0x0c,0x0d,0x20}, Charset.forName("UTF-8"));
    }
    public void j0$a(){
       super();
    }
    public p a(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!(k.a(j0$a.a, p0.a())).length()) {
          return new p(true);
       }
       return new p(false, new q("ILLEGAL_WHITESPACE", null));
    }
}
