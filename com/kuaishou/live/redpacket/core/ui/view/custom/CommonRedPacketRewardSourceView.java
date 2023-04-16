package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketRewardSourceView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.redpacket.core.ui.view.custom.RoundAndBorderView;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketMoleculeFollowButton;
import ko3.i;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import ko3.h;

public class CommonRedPacketRewardSourceView extends LinearLayout	// class@000ef9
{
    public RoundAndBorderView b;
    public CommonRedPacketMoleculeFollowButton c;
    public View$OnClickListener d;
    public h e;
    public g f;
    public int g;

    public void CommonRedPacketRewardSourceView(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketRewardSourceView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketRewardSourceView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = -1;
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketRewardSourceView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d0210, this);
          this.b = this.findViewById(0x7f0a3517);
          CommonRedPacketMoleculeFollowButton uCommonRedPa = this.findViewById(R.id.red_packet_reward_source_follow_button);
          this.c = uCommonRedPa;
          uCommonRedPa.setOnClickListener(new i(this));
       }
       this.setOrientation(1);
       return;
    }
    public void setOnAvatarClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketRewardSourceView.class, "4")) {
          return;
       }
       this.b.setOnClickListener(p0);
       return;
    }
    public void setOnFollowButtonClickListener(View$OnClickListener p0){
       this.d = p0;
    }
    public void setRewardSourceShowListener(h p0){
       this.e = p0;
    }
}
