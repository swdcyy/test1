package com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketLuckyUserListAdapter;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultLuckyAreaView$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import android.view.View;
import i2b.a;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionRollUserView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketLuckyUserListAdapter$a;

public class RedPacketLuckyUserListAdapter extends LifecycleRecyclerAdapter	// class@000f12
{
    public RedPacketConditionPopupResultLuckyAreaView$a j;

    public void RedPacketLuckyUserListAdapter(LifecycleOwner p0,RedPacketConditionPopupResultLuckyAreaView$a p1){
       super(p0);
       this.j = p1;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       RedPacketLuckyUserListAdapter$a uoa;
       RedPacketLuckyUserListAdapter redPacketLuc = RedPacketLuckyUserListAdapter.class;
       if (PatchProxy.isSupport(redPacketLuc)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, redPacketLuc, "1");
          if (uoa != PatchProxyResult.class) {
          label_002d :
             return uoa;
          }
       }
       uoa = new RedPacketLuckyUserListAdapter$a(a.i(p0, 0x7f0d0dab), this.L0(), this.j);
       goto label_002d ;
    }
}
