package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardKCoinView;
import android.widget.LinearLayout;
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
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import po3.e;

public class CommonRedPacketCoverRewardKCoinView extends LinearLayout	// class@000ef3
{
    public KwaiImageView b;
    public TextView c;
    public int d;
    public b e;

    public void CommonRedPacketCoverRewardKCoinView(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketCoverRewardKCoinView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketCoverRewardKCoinView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonRedPacketCoverRewardKCoinView.class, "1")) {
       }else {
          this.d = a1.d(0x7f070d94);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketCoverRewardKCoinView.class, "2")) {
          a.c(p0, R.layout.arg_RES_7f0d0208, this);
          this.b = this.findViewById(0x7f0a3503);
          TextView textView = this.findViewById(R.id.red_packet_cover_reward_kcoin_count);
          this.c = textView;
          e.a(textView, p0);
          this.c.setTextSize(0, (float)this.d);
       }
       this.setOrientation(0);
       return;
    }
}
