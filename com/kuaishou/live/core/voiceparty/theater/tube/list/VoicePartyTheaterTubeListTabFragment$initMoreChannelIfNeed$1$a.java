package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper;

public final class VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$a extends RecyclerView$r	// class@001a23
{
    public final VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1 a;
    public final StaggeredGridLayoutManager b;

    public void VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$a(VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1 p0,StaggeredGridLayoutManager p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$a oinitMoreCha = VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$a.class;
       if (PatchProxy.isSupport(oinitMoreCha) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oinitMoreCha, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          this.a.b.z.d(this.b);
       }
       return;
    }
}
