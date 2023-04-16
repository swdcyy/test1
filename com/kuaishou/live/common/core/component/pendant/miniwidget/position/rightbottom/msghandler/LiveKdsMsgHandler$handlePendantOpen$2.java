package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.LiveKdsMsgHandler$handlePendantOpen$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import bw1.a;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveNewActivityPendant;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import z51.h;
import z51.j;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityNewPendantKdsInfo;
import p91.m;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveKdsMsgHandler$handlePendantOpen$2 extends Lambda implements l	// class@001710
{
    public final LiveStreamMessages$SCLiveNewActivityPendant $message;
    public final String $traceId;
    public final a this$0;

    public void LiveKdsMsgHandler$handlePendantOpen$2(a p0,String p1,LiveStreamMessages$SCLiveNewActivityPendant p2){
       this.this$0 = p0;
       this.$traceId = p1;
       this.$message = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKdsMsgHandler$handlePendantOpen$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Objects.requireNonNull(a.f);
       List e = a.e;
       String str = j.a(this.$traceId, h.b)+"loadTkBundle failed:"+' '+p0.getLocalizedMessage();
       LiveStreamMessages$SCLiveNewActivityPendant kdsInfo = this.$message.kdsInfo;
       LiveStreamMessages$LiveActivityNewPendantKdsInfo bundleId = (kdsInfo != null)? kdsInfo.bundleId: null;
       b.v(e, str, "bundleId", bundleId, "liveStreamId", this.this$0.c.getLiveStreamId(), "pendantId", this.$message.pendantId, p0);
       return;
    }
}
