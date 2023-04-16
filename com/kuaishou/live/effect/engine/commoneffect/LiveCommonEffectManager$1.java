package com.kuaishou.live.effect.engine.commoneffect.LiveCommonEffectManager$1;
import ky2.a$a;
import com.kuaishou.live.effect.engine.commoneffect.LiveCommonEffectManager;
import java.lang.Object;
import java.lang.String;
import sy2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.List;
import com.kuaishou.android.live.log.b;
import qy2.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.util.Iterator;
import java.lang.Iterable;
import py2.a;
import ry2.a;
import sz2.c;
import g03.a;
import ry2.a$a;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import kz2.a;
import java.util.Map;
import pz2.c;
import h03.a;
import ky2.a$a$a;

public final class LiveCommonEffectManager$1 implements a$a	// class@001afb
{
    public final LiveCommonEffectManager b;

    public void LiveCommonEffectManager$1(LiveCommonEffectManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       a$a a;
       a uoa1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveCommonEffectManager$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             LiveCommonEffectManager$1 tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p2, tb, LiveCommonEffectManager.class, "1")) {
                b.S(tb.c, "[handleCommonEffectInfo]", "info", p2);
                p1 = p2.b;
                if (tb.f.a != null) {
                   p2 = p1.extraResInfo;
                   if (p2 != null && p2.length > 0) {
                      b.S(tb.c, "[handleCommonEffectInfo][disableShowDependResEffect]", "extraResInfo", p1.extraInfo);
                   }
                }
                p2 = tb.e.iterator();
                while (true) {
                   if (p2.hasNext()) {
                      a uoa = p2.next();
                      if (uoa.L3(p1)) {
                         b.S(tb.c, "[handleCommonEffectInfo][business consumed]", "consumer", uoa);
                         break ;
                      }
                   }else if(tb.f.b != null){
                      b.P(tb.c, "[handleCommonEffectInfo][disableCommonEffect]");
                      break ;
                   }else {
                      a = a.a;
                      long l = tb.h.C1(p1.effectiveKey);
                      p2 = tb.h.Bl();
                      a.o(p2, "effectResourceLoader.liveEffectResourceProvider");
                      Objects.requireNonNull(a);
                      if (PatchProxy.isSupport(a$a.class)) {
                         uoa1 = PatchProxy.applyThreeRefs(p1, Long.valueOf(l), p2, a, a$a.class, "1");
                         if (uoa1 != PatchProxyResult.class) {
                         label_00cc :
                            tb.g.o1(uoa1);
                            break ;
                         }
                      }
                      a.p(p1, "commonEffectInfo");
                      a.p(p2, "resourceProvider");
                      uoa1 = new a(p1, l, null, p2);
                      goto label_00cc ;
                   }
                }
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveCommonEffectManager$1.class, "2")) {
       }else {
          a.p(p0, "source");
          a$a$a.a(this, p0, p1, p2);
       }
       return;
    }
}
