package i71.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import android.util.SparseArray;
import java.lang.Class;
import i71.a$e;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i71.a$b;
import lp3.e;
import i71.a$d;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import o63.m;
import o63.m$a;
import java.util.Objects;
import java.lang.Boolean;
import i71.a$a;
import i71.a$a$a;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import i71.a$c;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import i71.a$f;
import java.lang.Runnable;
import t45.c;
import csd.b;
import dsd.e;

public final class a extends AbstractLiveJsCommand	// class@00284a
{
    public final SparseArray e;

    public void a(){
       super();
       this.e = new SparseArray();
    }
    public Class a(){
       return a$e.class;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.e.put(1, new a$b(this.h()));
       this.e.put(2, new a$d(this.h()));
       return;
    }
    public Object l(Object p0,j$a p1,c p2){
       boolean b;
       a$e pbString;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (!p0 instanceof a$e) {
          b.Z(LiveLogTag.LIVE_EFFECT, "LiveJsCmdMockEffectInfo: invalid paramType"+p0);
          return m.g.c("LiveJsCmdMockEffectInfo: invalid paramType"+p0);
       }else {
          LiveLogTag lIVE_EFFECT = LiveLogTag.LIVE_EFFECT;
          b.Z(lIVE_EFFECT, "LiveJsCmdMockEffectInfo: "+p0);
          Object obj = p0;
          Objects.requireNonNull(obj);
          Integer obj1 = PatchProxy.apply(null, obj, a$e.class, "1");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             a$e liveStreamId = obj.liveStreamId;
             a$a$a uoa$a = (liveStreamId == null || !liveStreamId.length())? 1: null;
             if (!uoa$a) {
                uoa$a = a$a.r;
                a$e businessType = obj.businessType;
                Objects.requireNonNull(uoa$a);
                Object obj2 = PatchProxy.applyOneRefs(businessType, uoa$a, a$a$a.class, "1");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }else if(businessType != null && businessType.intValue() == 1){
                   pbString = 2;
                   if (businessType == null || businessType.intValue() != pbString) {
                      b = false;
                   }
                }
                b = true;
                if (b) {
                   pbString = obj.pbString;
                   pbString = (pbString == null || !pbString.length())? 1: 0;
                   if (!pbString) {
                      b = true;
                   }
                }
             }
          label_00c2 :
             b = false;
          }
          if (!b) {
             b.Z(lIVE_EFFECT, "LiveJsCmdMockEffectInfo: invalid params");
             return m.g.c("LiveJsCmdMockEffectInfo: invalid params");
          }else {
             obj1 = obj.a();
             a.m(obj1);
             a$c uoc = this.e.get(obj1.intValue());
             if (uoc == null) {
                b.Z(lIVE_EFFECT, "LiveJsCmdMockEffectInfo: effectTaskFactory not register for "+obj.a());
                return m.g.c("effectTaskFactory not register for "+obj.a());
             }else {
                h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
                c.a(new a$f(oh, this, uoc, p0));
                p0 = oh.b();
                if (p0 == b.h()) {
                   e.c(p2);
                }
                return p0;
             }
          }
       }
    }
}
