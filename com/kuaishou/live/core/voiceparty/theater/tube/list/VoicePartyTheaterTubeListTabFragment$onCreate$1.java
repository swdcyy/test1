package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$onCreate$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterTab;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannelResponse;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class VoicePartyTheaterTubeListTabFragment$onCreate$1 extends Lambda implements p	// class@001a29
{
    public final VoicePartyTheaterTubeListTabFragment this$0;

    public void VoicePartyTheaterTubeListTabFragment$onCreate$1(VoicePartyTheaterTubeListTabFragment p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(LiveVoicePartyTheaterCommonConfig$TheaterTab p0,VoicePartyTheaterTubeChannelResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeListTabFragment$onCreate$1.class, "1")) {
          return;
       }
       a.p(p0, "tabConf");
       a.p(p1, "rsp");
       VoicePartyTheaterTubeListTabFragment$onCreate$1 tthis$0 = this.this$0;
       tthis$0.r = p0;
       VoicePartyTheaterTubeChannelResponse mTubeChannel = p1.mTubeChannels;
       if (mTubeChannel == null) {
          mTubeChannel = CollectionsKt__CollectionsKt.E();
       }
       tthis$0.s = mTubeChannel;
       VoicePartyTheaterTubeListTabFragment$onCreate$1 tthis$01 = this.this$0;
       tthis$01.u = p1.mDefaultChannelId;
       p1 = p1.mMaxExpandChannelCount;
       tthis$01.t = p1;
       if (p1 <= null) {
          tthis$01.t = Integer.MAX_VALUE;
       }
       tthis$01.t = tthis$01.t - 1;
       return;
    }
}
