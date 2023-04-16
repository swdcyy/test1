package hx9.d$c;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import kotlin.jvm.internal.a;

public final class d$c implements o	// class@00272a
{
    public static final d$c b;

    static {
       d$c.b = new d$c();
    }
    public void d$c(){
       super();
    }
    public Object apply(Object p0){
       Long longx = PatchProxy.applyOneRefs(p0, this, d$c.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          a.p(p0, "meta");
          longx = Long.valueOf(p0.mCollectCount);
       }
       return longx;
    }
}
