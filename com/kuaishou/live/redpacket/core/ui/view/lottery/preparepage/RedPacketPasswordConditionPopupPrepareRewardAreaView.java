package com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPasswordConditionPopupPrepareRewardAreaView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPrepareRewardAreaView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Integer;

public class RedPacketPasswordConditionPopupPrepareRewardAreaView extends RedPacketPopupPrepareRewardAreaView	// class@000f1b
{
    public TextView f;

    public void RedPacketPasswordConditionPopupPrepareRewardAreaView(Context p0){
       super(p0);
    }
    public void RedPacketPasswordConditionPopupPrepareRewardAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketPasswordConditionPopupPrepareRewardAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketPasswordConditionPopupPrepareRewardAreaView.class, "1")) {
          return;
       }
       super.a(p0);
       this.f = this.findViewById(0x7f0a31b7);
       return;
    }
    public int getLayoutResource(){
       return 0x7f0d0d9f;
    }
    public void setPasswordText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketPasswordConditionPopupPrepareRewardAreaView.class, "2")) {
          return;
       }
       this.f.setText(p0);
       return;
    }
    public void setPasswordTextViewVisibility(int p0){
       if (PatchProxy.isSupport(RedPacketPasswordConditionPopupPrepareRewardAreaView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RedPacketPasswordConditionPopupPrepareRewardAreaView.class, "3")) {
          return;
       }
       this.f.setVisibility(p0);
       return;
    }
}
