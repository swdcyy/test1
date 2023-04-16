package com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultStatusObjectiveStateAreaView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultStatusObjectiveStateAreaView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultStatusObjectiveStateAreaView$a;

public class RedPacketConditionPopupResultStatusObjectiveStateAreaView extends RedPacketPopupResultStatusObjectiveStateAreaView	// class@000f2a
{
    public RedPacketConditionPopupResultStatusObjectiveStateAreaView$a i;

    public void RedPacketConditionPopupResultStatusObjectiveStateAreaView(Context p0){
       super(p0);
    }
    public void RedPacketConditionPopupResultStatusObjectiveStateAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketConditionPopupResultStatusObjectiveStateAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupResultStatusObjectiveStateAreaView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       RedPacketConditionPopupResultStatusObjectiveStateAreaView ti = this.i;
       if (ti != null) {
          ti.onAttachedToWindow();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupResultStatusObjectiveStateAreaView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       RedPacketConditionPopupResultStatusObjectiveStateAreaView ti = this.i;
       if (ti != null) {
          ti.onDetachedFromWindow();
       }
       return;
    }
    public void setVisibilityListener(RedPacketConditionPopupResultStatusObjectiveStateAreaView$a p0){
       this.i = p0;
    }
}
