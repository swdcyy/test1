package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsBaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsBaseFragment$a;
import java.util.Map;
import java.lang.Boolean;
import qvb.i;
import java.util.List;
import java.util.Collection;
import ekd.q;
import android.widget.TextView;
import android.content.Context;
import androidx.fragment.app.Fragment;
import lnc.a1;
import java.lang.CharSequence;
import g9c.d;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import y8c.g;

public abstract class LiveFellowRedPacketRecordsBaseFragment extends RecyclerFragment	// class@000e86
{
    public boolean F;

    public void LiveFellowRedPacketRecordsBaseFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketRecordsBaseFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketRecordsBaseFragment$a(this, this);
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d0b0d;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketRecordsBaseFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveFellowRedPacketRecordsBaseFragment.class, null);
       return objectsByTag;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveFellowRedPacketRecordsBaseFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveFellowRedPacketRecordsBaseFragment.class, "2")) {
          return;
       }
       super.v2(p0, p1);
       if (q.f(this.q().getItems()) || (!this.q().hasMore() && (!PatchProxy.applyVoid(null, this, LiveFellowRedPacketRecordsBaseFragment.class, "3") && this.F == null))) {
          this.F = true;
          TextView textView = new TextView(this.getContext());
          textView.setTextSize(true, 12.00f);
          textView.setTextColor(a1.a(R.color.arg_RES_7f06146a));
          textView.setText(a1.p(R.string.arg_RES_7f1021cc));
          textView.setGravity(17);
          this.ia().M0(textView, new ViewGroup$LayoutParams(-1, a1.e(52.00f)));
       }
    label_0084 :
       return;
    }
    public abstract g vh();
    public abstract i yh();
}
