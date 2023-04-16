package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPreparePolicyAreaView;
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
import android.widget.TextView;
import java.lang.Boolean;

public class RedPacketPopupPreparePolicyAreaView extends FrameLayout	// class@000f04
{
    public View b;
    public TextView c;
    public TextView d;
    public TextView e;

    public void RedPacketPopupPreparePolicyAreaView(Context p0){
       super(p0);
       this.a(p0);
    }
    public void RedPacketPopupPreparePolicyAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public void RedPacketPopupPreparePolicyAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketPopupPreparePolicyAreaView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d0da2, this);
       this.b = this.findViewById(0x7f0a3f1d);
       this.d = this.findViewById(0x7f0a0ebe);
       this.e = this.findViewById(0x7f0a37ee);
       this.c = this.findViewById(0x7f0a353c);
       return;
    }
    public TextView getFirstLineTextView(){
       return this.d;
    }
    public TextView getRefreshView(){
       return this.c;
    }
    public TextView getSecondLineTextView(){
       return this.e;
    }
    public void setRefreshViewVisibility(boolean p0){
       if (PatchProxy.isSupport(RedPacketPopupPreparePolicyAreaView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RedPacketPopupPreparePolicyAreaView.class, "2")) {
          return;
       }
       if (p0) {
          this.c.setVisibility(0);
          this.b.setVisibility(8);
       }else {
          this.b.setVisibility(0);
          this.c.setVisibility(8);
       }
       return;
    }
}
