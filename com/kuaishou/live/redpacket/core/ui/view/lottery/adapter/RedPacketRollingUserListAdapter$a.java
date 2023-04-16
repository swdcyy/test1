package com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketRollingUserListAdapter$a;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionRollUserView;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketRollingUserListAdapter$a$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import rn3.b;
import java.lang.Class;
import androidx.lifecycle.ViewModel;

public class RedPacketRollingUserListAdapter$a extends LifecycleRecyclerAdapter$b	// class@000f14
{
    public final RedPacketConditionRollUserView e;
    public final b f;

    public void RedPacketRollingUserListAdapter$a(RedPacketConditionRollUserView p0,LifecycleOwner p1){
       super(p0, p1);
       this.e = p0;
       b uob = new ViewModelProvider(this.getViewModelStore(), new RedPacketRollingUserListAdapter$a$a(this)).get(b.class);
       this.f = uob;
       p0.c(this, uob);
    }
}
