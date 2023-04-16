package com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPrepareActionAreaView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView$a;

public class RedPacketConditionPopupPrepareActionAreaView extends RedPacketPopupPrepareActionAreaView	// class@000f17
{
    public RedPacketConditionPopupPrepareActionAreaView$a c;

    public void RedPacketConditionPopupPrepareActionAreaView(Context p0){
       super(p0);
    }
    public void RedPacketConditionPopupPrepareActionAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketConditionPopupPrepareActionAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupPrepareActionAreaView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.c != null && !this.getVisibility()) {
          this.c.onAttachedToWindow();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupPrepareActionAreaView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.c != null && this.getVisibility() == 8) {
          this.c.onDetachedFromWindow();
       }
       return;
    }
    public void setVisibilityListener(RedPacketConditionPopupPrepareActionAreaView$a p0){
       this.c = p0;
    }
}
