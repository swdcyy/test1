package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsBaseFragment$a;
import gka.c;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsBaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;
import lnc.a1;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsBaseFragment$a$a;
import android.view.View$OnClickListener;

public class LiveFellowRedPacketRecordsBaseFragment$a extends c	// class@000e85
{
    public final LiveFellowRedPacketRecordsBaseFragment m;

    public void LiveFellowRedPacketRecordsBaseFragment$a(LiveFellowRedPacketRecordsBaseFragment p0,RecyclerFragment p1){
       this.m = p0;
       super(p1, 3);
    }
    public View J0(){
       View obj = PatchProxy.apply(null, this, LiveFellowRedPacketRecordsBaseFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.J0();
       obj.setBackgroundColor(a1.a(R.color.arg_RES_7f060cb6));
       return obj;
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LiveFellowRedPacketRecordsBaseFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.h(R.string.arg_RES_7f1021d3);
       return obj;
    }
    public KwaiEmptyStateView$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketRecordsBaseFragment$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.c(p0);
       uoa.p(new LiveFellowRedPacketRecordsBaseFragment$a$a(this));
       return uoa;
    }
    public View n(){
       View obj = PatchProxy.apply(null, this, LiveFellowRedPacketRecordsBaseFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.n();
       obj.setBackgroundColor(a1.a(R.color.arg_RES_7f060cb6));
       return obj;
    }
}
