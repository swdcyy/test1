package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$f;
import gka.j;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.String;
import java.lang.Class;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;

public final class VoicePartyTheaterTubeListTabFragment$f extends j	// class@001a1f
{
    public final VoicePartyTheaterTubeListTabFragment d;
    public final TabLayout$f e;
    public final int f;
    public final String g;

    public void VoicePartyTheaterTubeListTabFragment$f(VoicePartyTheaterTubeListTabFragment p0,TabLayout$f p1,int p2,String p3,TabLayout$f p4,Class p5,Bundle p6){
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       super(p4, p5, p6);
    }
    public void d(int p0,Fragment p1){
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment$f.class) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VoicePartyTheaterTubeListTabFragment$f.class, "1") && p1 != null)) {
          p1.K = this.d.w;
       }
       return;
    }
}
