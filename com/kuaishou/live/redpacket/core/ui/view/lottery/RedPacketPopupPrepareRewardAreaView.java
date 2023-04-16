package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPrepareRewardAreaView;
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
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketPopupPrepareRewardInfoView;
import com.yxcorp.gifshow.image.KwaiImageView;

public class RedPacketPopupPrepareRewardAreaView extends FrameLayout	// class@000f05
{
    public CommonRedPacketPopupPrepareRewardInfoView b;
    public ViewGroup c;
    public KwaiImageView d;
    public View e;

    public void RedPacketPopupPrepareRewardAreaView(Context p0){
       super(p0);
       this.a(p0);
    }
    public void RedPacketPopupPrepareRewardAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public void RedPacketPopupPrepareRewardAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketPopupPrepareRewardAreaView.class, "1")) {
          return;
       }
       a.c(p0, this.getLayoutResource(), this);
       this.b = this.findViewById(0x7f0a31b6);
       this.c = this.findViewById(0x7f0a45a1);
       this.d = this.findViewById(0x7f0a45a0);
       this.e = this.findViewById(0x7f0a2921);
       return;
    }
    public int getLayoutResource(){
       return 0x7f0d0da3;
    }
    public View getLoadingView(){
       return this.e;
    }
    public CommonRedPacketPopupPrepareRewardInfoView getRewardInfoView(){
       return this.b;
    }
    public KwaiImageView getWifiErrorIconView(){
       return this.d;
    }
    public ViewGroup getWifiErrorRootView(){
       return this.c;
    }
}
