package e92.d;
import e92.d$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class d	// class@0026b0
{
    public static final d$a a;

    static {
       d.a = new d$a(null);
    }
    public void d(){
       super();
    }
    public static final boolean a(GiftMessage p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$a obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = d.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, d$a.class, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "giftMessage");
          b = ((p0.mType & (long)0x4000) > 0)? true: false;
       }
       return b;
    }
}
