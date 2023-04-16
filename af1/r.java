package af1.r;
import ok.h;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import df1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class r implements h	// class@00007c
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final Object apply(Object p0){
       f uof = PatchProxy.applyOneRefs(p0, null, f.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(p0);
       }
       return uof;
    }
}
