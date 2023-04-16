package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterTab;
import ix2.e;

public class VoicePartyTheaterPanelFragment$a implements ViewPager$i	// class@0019f9
{
    public final VoicePartyTheaterPanelFragment b;

    public void VoicePartyTheaterPanelFragment$a(VoicePartyTheaterPanelFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       VoicePartyTheaterPanelFragment$a uoa = VoicePartyTheaterPanelFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.b.Sh(VoicePartyTheaterPanelFragment.Qh().get(p0).mTabId);
       e.c(VoicePartyTheaterPanelFragment.Qh().get(p0).mTabId);
       return;
    }
}
