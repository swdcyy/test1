package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardTextLabel;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import po3.e;
import java.lang.Integer;
import android.graphics.Typeface;

public class CommonRedPacketCoverRewardTextLabel extends FrameLayout	// class@000ef5
{
    public TextView b;
    public int c;

    public void CommonRedPacketCoverRewardTextLabel(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketCoverRewardTextLabel(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketCoverRewardTextLabel(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonRedPacketCoverRewardTextLabel.class, "1")) {
       }else {
          this.c = a1.d(0x7f070da7);
       }
       try{
          if (!PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketCoverRewardTextLabel.class, "2")) {
             a.c(p0, R.layout.arg_RES_7f0d0209, this);
             TextView textView = this.findViewById(R.id.red_packet_cover_reward_text);
             this.b = textView;
             String str = "sans-serif-medium";
             e uoe = e.class;
             if (!PatchProxy.applyVoidTwoRefs(textView, str, null, uoe, "3") && (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidThreeRefs(textView, str, Integer.valueOf(0), null, e.class, "1") && textView != null))) {
                textView.setTypeface(Typeface.create(str, 0));
             }
          label_0064 :
             this.b.setTextSize(0, (float)this.c);
          }
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
       return;
    }
}
