package oa1.b;
import java.lang.Object;
import o63.a;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import p63.a;
import oa1.a;
import msd.l;
import o63.d;
import p63.a$a;
import p63.a$b;
import java.lang.String;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map;
import java.util.LinkedHashMap;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams$a;

public final class b	// class@0034bd
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static d d(b p0,a p1,LiveKrnPageKey p2,a p3,a p4,l p5,int p6,Object p7){
       a uoa = (p6 & 0x04)? a.b.a().b(): p3;
       a uoa1 = (p6 & 0x08)? new a(0, 0, 0, 0, 0, 0, null, false, 0, 511, null): p4;
       l ol = (p6 & 0x10)? null: p5;
       return p0.c(p1, p2, uoa, uoa1, ol);
    }
    public final d a(a p0,LiveKrnPageKey p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.d(this, p0, p1, p2, null, null, 24, null);
    }
    public final d b(a p0,LiveKrnPageKey p1,a p2,a p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.d(this, p0, p1, p2, p3, null, 16, null);
    }
    public final d c(a p0,LiveKrnPageKey p1,a p2,a p3,l p4){
       HashMap obj;
       a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, uob, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "jsBridgeService");
       a.p(p1, "pageKey");
       a.p(p2, "rnProps");
       a.p(p3, "rnDialogStyle");
       Objects.requireNonNull(p3);
       Map map = PatchProxy.apply(null, p3, a.class, str);
       if (map != patchProxyRe) {
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          a = p3.a;
          LiveKrnContainerParams liveKrnConta = -1;
          if (a != liveKrnConta) {
             linkedHashMa.put(LiveKrnContainerParams.WIDTH, String.valueOf(a));
          }
          a = p3.b;
          if (a != liveKrnConta) {
             linkedHashMa.put(LiveKrnContainerParams.HEIGHT, String.valueOf(a));
          }
          a = p3.g;
          if (a != null) {
             linkedHashMa.put(LiveKrnContainerParams.BG_COLOR, a);
          }
          linkedHashMa.put(LiveKrnContainerParams.WIDTH_RATIO, String.valueOf(p3.c));
          linkedHashMa.put(LiveKrnContainerParams.HEIGHT_RATIO, String.valueOf(p3.d));
          linkedHashMa.put(LiveKrnContainerParams.RADIUS, String.valueOf(p3.f));
          linkedHashMa.put(LiveKrnContainerParams.PLACE, String.valueOf(p3.e));
          LiveKrnContainerParams tRANSPARENT = LiveKrnContainerParams.TRANSPARENT;
          if (p3.h == null) {
             str = "0";
          }
          linkedHashMa.put(tRANSPARENT, str);
          linkedHashMa.put(LiveKrnContainerParams.THEME_TYPE, String.valueOf(p3.i));
          map = LiveKrnContainerParams$a.c(LiveKrnContainerParams.Companion, linkedHashMa, null, 2, null);
       }
       obj = new HashMap(map);
       obj.putAll(p2.a());
       return p0.Fj(p1, obj, p4);
    }
}
