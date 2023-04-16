package cp1.c$a$a;
import tz2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import u91.a;
import pz2.c;
import java.lang.Number;
import kotlin.jvm.internal.a;
import ii1.a;
import ki1.a;
import java.util.Objects;
import xy2.a;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import yy2.a;
import d03.a;
import cp1.c$a$a$a;

public final class c$a$a implements a	// class@001e1f
{

    public void c$a$a(){
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, c$a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveLowDiskMode", true);
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, c$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveEffectDependencyDownload", true);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, c$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d(a.h, false);
    }
    public int d(c p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a$a.class, "5");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       a.p(p0, "effectTask");
       int i = 3000;
       if (!p0 instanceof a || !p0.K()) {
          if (p0 instanceof a) {
             obj = p0;
             Objects.requireNonNull(obj);
             Object obj1 = PatchProxy.apply(null, obj, a.class, "3");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(obj.K() == 1){
                b = true;
             }else {
                b = false;
             }
             if (!b) {
             label_0051 :
                if (!p0 instanceof a || !a.a(p0.L())) {
                   i = 2000;
                }
             }
          }else {
             goto label_0051 ;
          }
       }
    label_0064 :
       return i;
    }
    public a e(){
       Object obj = PatchProxy.apply(null, this, c$a$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c$a$a$a();
    }
    public String f(){
       String obj = PatchProxy.apply(null, this, c$a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().u("SOURCE_LIVE").c("liveEffectDependencyDownloadBlacklist", "");
       a.o(obj, "SwitchConfigManager.getI¡­efaultValue\n            \)");
       return obj;
    }
}
