package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger;

public class LiveFellowRedPacketRecordsPanelFragment$a implements ViewPager$i	// class@000e88
{
    public final LiveFellowRedPacketRecordsPanelFragment b;

    public void LiveFellowRedPacketRecordsPanelFragment$a(LiveFellowRedPacketRecordsPanelFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       LiveFellowRedPacketRecordsPanelFragment$a uoa = LiveFellowRedPacketRecordsPanelFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       LiveFellowRedPacketLogger.d(this.b.B.b(), this.b.B.a(), this.b.B.y(), p0);
       return;
    }
}
