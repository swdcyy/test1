package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultStatusObjectiveStateAreaView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardCommonView;

public class RedPacketPopupResultStatusObjectiveStateAreaView extends FrameLayout	// class@000f0a
{
    public TextView b;
    public LinearLayout c;
    public KwaiImageView d;
    public TextView e;
    public TextView f;
    public CommonRedPacketCoverRewardCommonView g;
    public static final int h;

    static {
       RedPacketPopupResultStatusObjectiveStateAreaView.h = a1.e(32.00f);
    }
    public void RedPacketPopupResultStatusObjectiveStateAreaView(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketPopupResultStatusObjectiveStateAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketPopupResultStatusObjectiveStateAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupResultStatusObjectiveStateAreaView.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.k(this, R.layout.arg_RES_7f0d0da9, true);
       this.b = this.findViewById(0x7f0a3b54);
       this.c = this.findViewById(0x7f0a3876);
       this.d = this.findViewById(0x7f0a3875);
       this.e = this.findViewById(0x7f0a3ff6);
       this.f = this.findViewById(0x7f0a04b1);
       this.g = this.findViewById(0x7f0a35da);
       return;
    }
    public TextView getBottomLineTipsView(){
       return this.f;
    }
    public KwaiImageView getIconView(){
       return this.d;
    }
    public CommonRedPacketCoverRewardCommonView getRewardCommonView(){
       return this.g;
    }
    public LinearLayout getSendGiftRootView(){
       return this.c;
    }
    public TextView getStatusTextView(){
       return this.b;
    }
    public TextView getTopLineTipsView(){
       return this.e;
    }
}
