package mi1.b;
import mi1.b$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class b	// class@003185
{
    public static final b$a a;

    static {
       b.a = new b$a(null);
    }
    public void b(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a.a();
    }
    public static final boolean b(GiftMessage p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       b$a obj = PatchProxy.applyOneRefs(p0, null, b.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = b.a;
       Objects.requireNonNull(obj);
       b$a uoa = b$a.class;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "giftMessage");
          if (p0.mMagicFaceId > 0) {
             Object obj2 = PatchProxy.applyOneRefs(p0, obj, uoa, "2");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                a.p(p0, "giftMessage");
                b = ((p0.mType & (long)16) > 0)? true: false;
             }
             if (!b) {
                b = true;
             }
          }
          b = false;
       }
       return b;
    }
}
