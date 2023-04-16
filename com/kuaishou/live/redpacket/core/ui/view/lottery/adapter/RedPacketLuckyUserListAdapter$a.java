package com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketLuckyUserListAdapter$a;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionRollUserView;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultLuckyAreaView$a;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.live.redpacket.core.ui.view.lottery.adapter.RedPacketLuckyUserListAdapter$a$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import rn3.b;
import java.lang.Class;
import androidx.lifecycle.ViewModel;

public class RedPacketLuckyUserListAdapter$a extends LifecycleRecyclerAdapter$b	// class@000f11
{
    public RedPacketConditionPopupResultLuckyAreaView$a e;
    public final b f;
    public final RedPacketConditionRollUserView g;

    public void RedPacketLuckyUserListAdapter$a(RedPacketConditionRollUserView p0,LifecycleOwner p1,RedPacketConditionPopupResultLuckyAreaView$a p2){
       super(p0, p1);
       this.e = p2;
       this.g = p0;
       b uob = new ViewModelProvider(this.getViewModelStore(), new RedPacketLuckyUserListAdapter$a$a(this)).get(b.class);
       this.f = uob;
       p0.c(this, uob);
    }
}
