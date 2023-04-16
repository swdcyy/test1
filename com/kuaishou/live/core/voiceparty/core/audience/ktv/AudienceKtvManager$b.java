package com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager;
import java.lang.Object;
import zo2.n0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$RefreshWatch;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import jp2.u;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$a;
import jp2.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import jp2.z;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.util.Set;
import java.lang.Integer;

public final class AudienceKtvManager$b implements RtcManager$c	// class@0013b9
{
    public final AudienceKtvManager b;

    public void AudienceKtvManager$b(AudienceKtvManager p0){
       this.b = p0;
       super();
    }
    public void H(){
       n0.f(this);
    }
    public void I(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceKtvManager$b.class, "1")) {
          return;
       }
       this.b.r(new KtvManager$RefreshWatch());
       z.b(this.b.f(), this.b.t().k(), 7);
       return;
    }
    public void N(Object p0,Map p1){
       n0.e(this, p0, p1);
    }
    public void X(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       n0.g(this, p0);
    }
    public void e(Set p0){
       n0.a(this, p0);
    }
    public void f(Object p0,int p1){
       if (PatchProxy.isSupport(AudienceKtvManager$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AudienceKtvManager$b.class, "2")) {
          return;
       }
       this.b.r(new KtvManager$RefreshWatch());
       return;
    }
    public void i0(Object p0){
       n0.c(this, p0);
    }
}
