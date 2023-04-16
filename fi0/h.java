package fi0.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import kj0.h;
import okd.b;

public final class h	// class@002348
{
    public static h a;
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void a(String p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "3")) {
          return;
       }
       a.p(p0, "source");
       oh = PatchProxy.apply(null, this, oh, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = h.a;
          if (oh == null) {
             oh = b.a(0x191118df);
          }
       }
       if (oh != null) {
          oh.init(p0);
       }
       return;
    }
}
