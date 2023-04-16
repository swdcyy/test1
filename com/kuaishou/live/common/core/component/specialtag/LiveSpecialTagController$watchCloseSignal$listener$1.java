package com.kuaishou.live.common.core.component.specialtag.LiveSpecialTagController$watchCloseSignal$listener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vx1.c;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCLiveSpecialTagClose;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveSpecialTagController$watchCloseSignal$listener$1 extends Lambda implements l	// class@001779
{
    public final c this$0;

    public void LiveSpecialTagController$watchCloseSignal$listener$1(c p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SCLiveSpecialTagClose p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSpecialTagController$watchCloseSignal$listener$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       LiveSpecialTagController$watchCloseSignal$listener$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, c.class, "3")) {
          b.Z(c.k, "watchCloseSignal: id: "+p0.tagId+' '+tthis$0.a());
          if (!tthis$0.a() - p0.tagId) {
             tthis$0.d();
          }
       }
       return;
    }
}
