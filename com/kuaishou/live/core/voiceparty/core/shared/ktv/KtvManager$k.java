package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$k;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import com.yxcorp.gifshow.model.Lyrics;
import jp2.w;
import jp2.s;
import jp2.d;
import lp2.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$ktvSingPrepare$1$onEnter$1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$ktvSingPrepare$1$onEnter$2;
import msd.l;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$e$b;
import kp2.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$e$c;
import hp2.c;
import hp2.c$a;
import hp2.c$b;
import hp2.c$d;

public final class KtvManager$k extends c	// class@001434
{
    public c f;
    public final KtvManager g;

    public void KtvManager$k(KtvManager p0,String p1){
       this.g = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$k.class, "1")) {
       }else {
          a.p(p0, "music");
          a.p(p1, "reason");
          boolean b = this.a().m();
          this.a().h(p0);
          this.a().o(false);
          this.a().p(false);
          Lyrics lyrics = null;
          this.a().g(lyrics);
          this.a().i(lyrics);
          this.a().k(false);
          this.a().j(1);
          this.g.i().b2(p0);
          c uoc = this.g.h().a(this.a().n());
          this.f = uoc;
          if (uoc == null) {
             a.S("logic");
          }
          uoc.a(p0, b, new KtvManager$ktvSingPrepare$1$onEnter$1(this), new KtvManager$ktvSingPrepare$1$onEnter$2(this, p0));
       }
       return;
    }
    public void f(h p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$k.class, str)) {
          return;
       }
       a.p(p0, "reason");
       String str1 = "logic";
       if (p0 instanceof KtvManager$e$b) {
          KtvManager$k tf = this.f;
          if (tf == null) {
             a.S(str1);
          }
          tf.release();
          this.g.q.c(true, 0);
       }else {
          boolean b = this.a().m();
          KtvManager$k tf1 = this.f;
          if (tf1 == null) {
             a.S(str1);
          }
          tf1.b(b);
          int i = 7;
          if (this.a().h == null) {
             KtvManager$a r = KtvManager.r;
             Objects.requireNonNull(r);
             Object obj = PatchProxy.applyOneRefs(p0, r, KtvManager$a.class, str);
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(a.g(p0, KtvManager$e$c.d)){
                i = 3;
             }else if(p0 instanceof c){
                if (a.g(p0, c$a.d) || a.g(p0, c$b.d)) {
                   i = 5;
                }else if(a.g(p0, c$d.d)){
                   i = 6;
                }else {
                   i = 4;
                }
             }
          }
          this.g.q.c(0, i);
       }
       return;
    }
}
