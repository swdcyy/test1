package mi1.b$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import kotlin.jvm.internal.a;
import s00.b$a;
import s00.b;
import com.kuaishou.live.common.core.component.gift.domain.effect.log.LiveGiftEffectLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class b$a	// class@003184
{

    public void b$a(){
       super();
    }
    public void b$a(u p0){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().u("SOURCE_LIVE").d("enableShowDependResEffect", true) ^ true);
    }
    public final byte[] b(String p0){
       byte[] uobyteArray;
       String obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "str";
       try{
          a.p(p0, obj);
          uobyteArray = b.a().a(p0);
       }catch(java.lang.Exception e3){
          b.y(LiveGiftEffectLogTag.LIVE_GIFT_EFFECT.appendTag("LiveGiftEffectUtil"), "[parseString2Bytes] error", e3);
          uobyteArray = null;
       }
       return uobyteArray;
    }
}
