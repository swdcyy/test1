package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupSourceAreaView;
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
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketRewardSourceView;
import android.widget.TextView;

public class RedPacketPopupSourceAreaView extends FrameLayout	// class@000f0f
{
    public CommonRedPacketRewardSourceView b;
    public TextView c;

    public void RedPacketPopupSourceAreaView(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketPopupSourceAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketPopupSourceAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupSourceAreaView.class, "1")) {
          return;
       }
       a.k(this, R.layout.arg_RES_7f0d0da5, true);
       this.b = this.findViewById(0x7f0a08e6);
       this.c = this.findViewById(0x7f0a08e3);
       return;
    }
    public CommonRedPacketRewardSourceView getCommonRedPacketRewardSourceView(){
       return this.b;
    }
    public TextView getRewardDescView(){
       return this.c;
    }
}
