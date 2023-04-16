package com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketRollingUserListAdapter$a$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketRollingUserListAdapter$a;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rn3.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultLuckyAreaView$a;

public class RedPacketRollingUserListAdapter$a$a implements ViewModelProvider$Factory	// class@000f13
{
    public final RedPacketRollingUserListAdapter$a a;

    public void RedPacketRollingUserListAdapter$a$a(RedPacketRollingUserListAdapter$a p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, RedPacketRollingUserListAdapter$a$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new b(this.a.b(), false, null);
    }
}
