package a77.b;
import lf3.g;
import a77.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import ekd.j;
import com.kuaishou.livestream.message.nano.LiveGamePopupFeed;
import java.lang.System;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u37.d;
import u37.e;
import fq5.b;
import brd.t;
import ekd.k1;
import java.util.concurrent.TimeUnit;
import a77.e;
import erd.o;
import a77.d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import lf3.f;

public final class b implements g	// class@00006c
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && !j.h(p0.liveGamePopupFeed)) {
          object oobject = p0.liveGamePopupFeed[0];
          tb.w = p0;
          tb.z = oobject.type;
          tb.A = oobject.popupId;
          tb.B = oobject.randomTime;
          if (tb.q != null) {
             tb.s = tb.t;
             tb.t = System.currentTimeMillis();
             if (!PatchProxy.applyVoidOneRefs(oobject, tb, f.class, "5") && tb.P8()) {
                tb.v = t.timer(k1.k(tb.B), TimeUnit.MILLISECONDS).flatMap(new e(e.b().z(tb.C.getLiveStreamId(), oobject.popupId, (System.currentTimeMillis() - tb.y), oobject.type))).subscribe(new d(tb), Functions.e);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
