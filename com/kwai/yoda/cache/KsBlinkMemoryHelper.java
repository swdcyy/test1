package com.kwai.yoda.cache.KsBlinkMemoryHelper;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.yoda.cache.KsBlinkMemoryHelper$injectedResources$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import zsd.u;
import java.util.Set;
import com.kuaishou.webkit.extension.MemoryCacheInjector;

public final class KsBlinkMemoryHelper	// class@00119a
{
    public static MemoryCacheInjector a;
    public static final Set b;
    public static final p c;
    public static final KsBlinkMemoryHelper d;

    static {
       KsBlinkMemoryHelper.d = new KsBlinkMemoryHelper();
       KsBlinkMemoryHelper.b = new CopyOnWriteArraySet();
       KsBlinkMemoryHelper.c = s.c(KsBlinkMemoryHelper$injectedResources$2.INSTANCE);
    }
    public void KsBlinkMemoryHelper(){
       super();
    }
    public final int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsBlinkMemoryHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (p0 != null) {
          int i1 = (u.S1(p0) ^ 0x01)? p0: 0;
          if (i1) {
             switch (p0.hashCode()){
                 case 0xc41cc621:
                   if (p0.equals("text/css")) {
                      i = 2;
                   }
                   break;
                 case 0x120a481c:
                   if (p0.equals("application/ecmascript")) {
                   label_004e :
                      i = 3;
                   }
                   break;
                 case 0x3b466c1f:
                   if (p0.equals("text/ecmascript")) {
                      goto label_004e ;
                   }
                   break;
                 case 0x55db338c:
                   if (p0.equals("application/javascript")) {
                      goto label_004e ;
                   }
                   break;
                 case 0x7f17578f:
                   if (p0.equals("text/javascript")) {
                      goto label_004e ;
                   }
                   break;
                 default:
             }
          }
       }
    label_0059 :
       return i;
    }
    public final Set b(){
       return KsBlinkMemoryHelper.b;
    }
    public final MemoryCacheInjector c(){
       return KsBlinkMemoryHelper.a;
    }
}
