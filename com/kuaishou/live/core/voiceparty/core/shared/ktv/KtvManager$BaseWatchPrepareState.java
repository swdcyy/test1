package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ut7.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$e$e;
import mp2.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import jp2.d;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState$prepareWatch$1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState$prepareWatch$2;
import msd.l;

public abstract class KtvManager$BaseWatchPrepareState extends c	// class@001404
{
    public c f;
    public final KtvManager g;

    public void KtvManager$BaseWatchPrepareState(KtvManager p0,String p1){
       a.p(p1, "name");
       this.g = p0;
       super(p1);
    }
    public void f(h p0){
       KtvManager$BaseWatchPrepareState tf;
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$BaseWatchPrepareState.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       if (p0 instanceof KtvManager$e$e) {
          tf = this.f;
          if (tf == null) {
             a.S("logic");
          }
          tf.release();
       }else {
          tf = this.f;
          if (tf == null) {
             a.S("logic");
          }
          tf.abort();
       }
       return;
    }
    public abstract KtvManager$f h();
    public abstract boolean j();
    public final void k(){
       if (PatchProxy.applyVoid(null, this, KtvManager$BaseWatchPrepareState.class, "1")) {
          return;
       }
       c uoc = this.g.h().b(this.h().m(), this.j());
       this.f = uoc;
       if (uoc == null) {
          a.S("logic");
       }
       uoc.a(this.h().b(), new KtvManager$BaseWatchPrepareState$prepareWatch$1(this), new KtvManager$BaseWatchPrepareState$prepareWatch$2(this));
       return;
    }
}
