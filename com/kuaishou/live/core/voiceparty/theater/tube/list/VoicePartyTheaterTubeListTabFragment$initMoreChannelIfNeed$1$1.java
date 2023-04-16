package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1;
import mrd.a;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;

public final class VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$1 extends Lambda implements l	// class@001a21
{
    public final a $selectedBehavior;
    public final VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1 this$0;

    public void VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$1(VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1 p0,a p1){
       this.this$0 = p0;
       this.$selectedBehavior = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabLayout$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0 = p0.d();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       int i = this.this$0.b.qh(p0.intValue());
       if (i != -1) {
          this.$selectedBehavior.onNext(Integer.valueOf(i));
       }
       return;
    }
}
