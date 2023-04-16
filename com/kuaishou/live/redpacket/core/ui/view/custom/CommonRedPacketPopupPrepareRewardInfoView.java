package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketPopupPrepareRewardInfoView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardCommonView;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardPictureView;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardKCoinView;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardTextLabel;
import android.view.ViewGroup$LayoutParams;
import po3.h;

public class CommonRedPacketPopupPrepareRewardInfoView extends FrameLayout	// class@000ef7
{
    public CommonRedPacketCoverRewardCommonView b;
    public CommonRedPacketCoverRewardPictureView c;
    public CommonRedPacketCoverRewardKCoinView d;
    public CommonRedPacketCoverRewardTextLabel e;
    public c f;

    public void CommonRedPacketPopupPrepareRewardInfoView(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketPopupPrepareRewardInfoView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketPopupPrepareRewardInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketPopupPrepareRewardInfoView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d020c, this);
          this.b = this.findViewById(0x7f0a08e2);
          this.c = this.findViewById(0x7f0a08e5);
          this.d = this.findViewById(0x7f0a08e4);
          this.e = this.findViewById(0x7f0a08e7);
       }
       this.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       return;
    }
    public final void setUniqueVisibleView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketPopupPrepareRewardInfoView.class, "3")) {
          return;
       }
       h.e(this, 0);
       h.e(this.b, 8);
       h.e(this.d, 8);
       h.e(this.c, 8);
       h.e(this.e, 8);
       h.e(p0, 0);
       return;
    }
}
