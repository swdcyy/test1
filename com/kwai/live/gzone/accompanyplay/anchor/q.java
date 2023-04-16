package com.kwai.live.gzone.accompanyplay.anchor.q;
import lf3.g;
import com.kwai.live.gzone.accompanyplay.anchor.p;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyStateRefresh;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.live.gzone.accompanyplay.edit.g;
import h37.f0;
import mrd.a;
import com.kwai.live.gzone.accompanyplay.anchor.f0$c;
import java.lang.Boolean;
import lf3.f;

public class q implements g	// class@000b2e
{
    public final p b;

    public void q(p p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       SCGzoneAccompanyStateRefresh accompanyId;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
       }else {
          b.d0(LiveLogTag.LIVE_GZONE_ACCOMPANY, "SCGzoneAccompanyStateRefresh", "accompanyId", p0.accompanyId, "roundId", p0.roundId);
          q tb = this.b;
          p t = tb.t;
          if (t != null) {
             accompanyId = p0.accompanyId;
             g n = t.n;
             if (n != null) {
                n.b = accompanyId;
             }
          }
          tb.x.b().onNext(Boolean.TRUE);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
