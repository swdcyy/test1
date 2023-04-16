package com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketRollingUserListAdapter;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser;
import java.util.List;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import android.view.View;
import i2b.a;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionRollUserView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketRollingUserListAdapter$a;

public class RedPacketRollingUserListAdapter extends LifecycleRecyclerAdapter	// class@000f15
{

    public void RedPacketRollingUserListAdapter(LifecycleOwner p0){
       super(p0);
    }
    public Object K0(int p0){
       Object obj;
       RedPacketRollingUserListAdapter redPacketRol = RedPacketRollingUserListAdapter.class;
       if (PatchProxy.isSupport(redPacketRol)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, redPacketRol, "1");
          if (obj != PatchProxyResult.class) {
          label_002d :
             return obj;
          }
       }
       obj = this.J0().get((p0 % this.J0().size()));
       goto label_002d ;
    }
    public int getItemCount(){
       return Integer.MAX_VALUE;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       RedPacketRollingUserListAdapter$a uoa;
       RedPacketRollingUserListAdapter redPacketRol = RedPacketRollingUserListAdapter.class;
       if (PatchProxy.isSupport(redPacketRol)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, redPacketRol, "2");
          if (uoa != PatchProxyResult.class) {
          label_002b :
             return uoa;
          }
       }
       uoa = new RedPacketRollingUserListAdapter$a(a.i(p0, 0x7f0d0dab), this.L0());
       goto label_002b ;
    }
}
