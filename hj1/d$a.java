package hj1.d$a;
import java.lang.Object;
import nsd.u;
import hj1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import hj1.a;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig$AttachGiftConfig;
import java.util.List;
import java.util.Collection;
import hj1.b;

public final class d$a	// class@0026f0
{

    public void d$a(){
       super();
    }
    public void d$a(u p0){
       super();
    }
    public final c a(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a(p0);
    }
    public final c b(LiveGiftGuideConfig p0,int p1){
       LiveGiftGuideConfig$AttachGiftConfig obj;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "guideConfig");
       p0 = p0.mAttachGiftConfigs;
       obj = null;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          LiveGiftGuideConfig$AttachGiftConfig uAttachGiftC = obj;
          while (iterator.hasNext()) {
             LiveGiftGuideConfig$AttachGiftConfig uAttachGiftC1 = iterator.next();
             if (uAttachGiftC1.mGiftId == p1) {
                uAttachGiftC = uAttachGiftC1;
             }
          }
          if (uAttachGiftC != null) {
             obj = uAttachGiftC.mSendGiftMsgKeys;
          }
          return this.c(obj, p1);
       }else {
          return this.c(obj, p1);
       }
    }
    public final c c(List p0,int p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && (p0.isEmpty() ^ 0x01)) {
          return new b(p0);
       }else {
          return this.a(p1);
       }
    }
}
