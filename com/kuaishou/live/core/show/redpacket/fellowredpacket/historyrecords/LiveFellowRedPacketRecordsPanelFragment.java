package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import p91.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment$a;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment$d;
import java.lang.Enum;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment$c;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketGrabbedRecordsFragment;
import android.os.Bundle;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment$b;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketSentRecordsFragment;
import android.view.View;
import tg2.b;
import android.view.View$OnClickListener;
import ekd.m1;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import java.util.List;
import java.util.ArrayList;

public class LiveFellowRedPacketRecordsPanelFragment extends TabHostFragment implements d	// class@000e8c
{
    public m B;
    public final ViewPager$i C;
    public static final int D;

    public void LiveFellowRedPacketRecordsPanelFragment(m p0){
       super();
       this.C = new LiveFellowRedPacketRecordsPanelFragment$a(this);
       this.B = p0;
    }
    public final b Qh(String p0,LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType p1){
       PagerSlidingTabStrip$d obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveFellowRedPacketRecordsPanelFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PagerSlidingTabStrip$d(String.valueOf(p1), p0);
       int i = LiveFellowRedPacketRecordsPanelFragment$d.a[p1.ordinal()];
       if (i == 1) {
          return new LiveFellowRedPacketRecordsPanelFragment$b(this, obj, LiveFellowRedPacketSentRecordsFragment.class, null);
       }
       if (i != 2) {
          return null;
       }
       return new LiveFellowRedPacketRecordsPanelFragment$c(this, obj, LiveFellowRedPacketGrabbedRecordsFragment.class, null);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketRecordsPanelFragment.class, "1")) {
          return;
       }
       m1.a(p0, new b(this), R.id.live_fellow_redpack_history_records_list_panel_back_button);
       this.Oh(this.C);
       LiveFellowRedPacketLogger.d(this.B.b(), this.B.a(), this.B.y(), 0);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0b0e;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFellowRedPacketRecordsPanelFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.t.setTabLayoutParams(new LinearLayout$LayoutParams(0, a1.e(48.00f), 0x3f800000));
       return;
    }
    public List wh(){
       ArrayList obj = PatchProxy.apply(null, this, LiveFellowRedPacketRecordsPanelFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(this.Qh(a1.p(R.string.arg_RES_7f1021e1), LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.SENT));
       obj.add(this.Qh(a1.p(R.string.arg_RES_7f1021d0), LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.GRABBED));
       return obj;
    }
}
