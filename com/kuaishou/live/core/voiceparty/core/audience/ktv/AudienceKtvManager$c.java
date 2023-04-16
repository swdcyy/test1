package com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$c;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager;
import java.lang.Object;
import zo2.n0;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import x91.d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$HeartbeatError;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.util.Set;

public final class AudienceKtvManager$c implements RtcManager$c	// class@0013ba
{
    public final AudienceKtvManager b;

    public void AudienceKtvManager$c(AudienceKtvManager p0){
       this.b = p0;
       super();
    }
    public void H(){
       n0.f(this);
    }
    public void I(Object p0){
       n0.b(this, p0);
    }
    public void N(Object p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AudienceKtvManager$c.class, "1")) {
          return;
       }
       a.p(p1, "response");
       if (!d.a(p1) - 0x13901) {
          this.b.r(new KtvManager$HeartbeatError());
       }
       return;
    }
    public void X(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       n0.g(this, p0);
    }
    public void e(Set p0){
       n0.a(this, p0);
    }
    public void f(Object p0,int p1){
       n0.d(this, p0, p1);
    }
    public void i0(Object p0){
       n0.c(this, p0);
    }
}
