package com.kuaishou.live.core.show.multieffect.LiveMultiMagicEffectRenderProviderImpl;
import zf1.b;
import com.kuaishou.live.core.show.multieffect.LiveMultiMagicEffectRenderProviderImpl$a;
import nsd.u;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import z1.k;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zf1.g;
import java.util.concurrent.ConcurrentHashMap;
import asd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.multieffect.LiveMultiMagicEffectRenderProviderImpl$get$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import dsd.a;
import pz2.e;
import zf1.a;
import ftd.j2;
import ftd.z0;
import com.kuaishou.live.core.show.multieffect.LiveMultiMagicEffectRenderProviderImpl$get$localRender$1;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;
import gz2.h;
import com.kuaishou.live.core.show.wishlight.render.a;
import java.util.Map;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class LiveMultiMagicEffectRenderProviderImpl implements b	// class@000d22
{
    public final g a;
    public ConcurrentHashMap b;
    public final k c;
    public static final List d;
    public static final LiveMultiMagicEffectRenderProviderImpl$a e;

    static {
       LiveMultiMagicEffectRenderProviderImpl.e = new LiveMultiMagicEffectRenderProviderImpl$a(null);
       LiveMultiMagicEffectRenderProviderImpl.d = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectRenderProviderImpl");
    }
    public void LiveMultiMagicEffectRenderProviderImpl(k p0){
       a.p(p0, "mLocalRenderSupplier");
       super();
       this.c = p0;
       this.a = new g();
       this.b = new ConcurrentHashMap();
    }
    public Object a(int p0,c p1){
       LiveMultiMagicEffectRenderProviderImpl$get$1 obj;
       LiveMultiMagicEffectRenderProviderImpl$get$1 i$0;
       Object obj2;
       LiveMultiMagicEffectRenderProviderImpl liveMultiMag = LiveMultiMagicEffectRenderProviderImpl.class;
       if (PatchProxy.isSupport(liveMultiMag)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveMultiMag, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 instanceof LiveMultiMagicEffectRenderProviderImpl$get$1) {
          obj = p1;
          LiveMultiMagicEffectRenderProviderImpl$get$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_002f :
             LiveMultiMagicEffectRenderProviderImpl$get$1 result = obj.result;
             Object obj1 = b.h();
             LiveMultiMagicEffectRenderProviderImpl$get$1 label1 = obj.label;
             int i1 = 1;
             if (label1 != null) {
                if (label1 == i1) {
                   i$0 = obj.I$0;
                   obj = obj.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                if (a.a(this.b.get(a.f(p0)))) {
                   obj2 = this.b.get(a.f(p0));
                   a.m(obj2);
                   return obj2;
                }else {
                   obj.L$0 = this;
                   obj.I$0 = p0;
                   obj.label = i1;
                   result = a.i(z0.g(), new LiveMultiMagicEffectRenderProviderImpl$get$localRender$1(this, null), obj);
                   if (result == obj1) {
                      return obj1;
                   }else {
                      liveMultiMag = this;
                   }
                }
             }
             if (a.a(obj.b.get(a.f(i$0)))) {
                obj2 = obj.b.get(a.f(i$0));
                a.m(obj2);
                return obj2;
             }else if(i$0 != i1){
                if (result != null) {
                   obj.b.put(a.f(i$0), new a(result));
                   obj2 = obj.b.get(a.f(i$0));
                   a.m(obj2);
                   return obj2;
                }else {
                   b.r(LiveMultiMagicEffectRenderProviderImpl.d, "[get]bizType:"+i$0+" localRender is null");
                }
             }
             return obj.a;
          }
       }
       obj = new LiveMultiMagicEffectRenderProviderImpl$get$1(this, p1);
       goto label_002f ;
    }
}
