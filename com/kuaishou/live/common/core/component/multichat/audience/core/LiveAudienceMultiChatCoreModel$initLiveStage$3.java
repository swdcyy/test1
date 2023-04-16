package com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$initLiveStage$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import wp1.c;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lp1.d;
import java.util.Objects;
import jp1.c;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;

public final class LiveAudienceMultiChatCoreModel$initLiveStage$3 extends Lambda implements l	// class@0014c1
{
    public final LiveAudienceMultiChatCoreModel this$0;

    public void LiveAudienceMultiChatCoreModel$initLiveStage$3(LiveAudienceMultiChatCoreModel p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(LiveAudienceMultiChatCoreModel$initLiveStage$3.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAudienceMultiChatCoreModel$initLiveStage$3.class, "1")) {
          return;
       }
       if (this.this$0.s.V0() != StreamType.AUDIO.toInt()) {
          b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveStage PlayerVisibleChanged", "visible", Boolean.valueOf(p0));
          if (p0) {
             if (this.this$0.s.o()) {
                LiveAudienceMultiChatCoreModel$initLiveStage$3 tthis$0 = this.this$0;
                Objects.requireNonNull(tthis$0);
                if (!PatchProxy.applyVoid(null, tthis$0, LiveAudienceMultiChatCoreModel.class, "2")) {
                   tthis$0.u.addRenderListener(new c(tthis$0));
                }
             }
          }else {
             this.this$0.s.l(4);
          }
       }
       return;
    }
}
