package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPrepareActionAreaView;
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
import lnc.a1;

public class RedPacketPopupPrepareActionAreaView extends FrameLayout	// class@000f02
{
    public TextView b;

    public void RedPacketPopupPrepareActionAreaView(Context p0){
       super(p0);
       this.a(p0);
    }
    public void RedPacketPopupPrepareActionAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public void RedPacketPopupPrepareActionAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketPopupPrepareActionAreaView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d0da0, this);
       this.b = this.findViewById(0x7f0a00b4);
       return;
    }
    public TextView getActionView(){
       return this.b;
    }
    public void setClickableStyle(boolean p0){
       if (PatchProxy.isSupport(RedPacketPopupPrepareActionAreaView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RedPacketPopupPrepareActionAreaView.class, "2")) {
          return;
       }
       this.b.setClickable(p0);
       if (p0) {
          this.b.setBackgroundResource(R.drawable.arg_RES_7f081e1b);
          this.b.setTextColor(a1.a(R.color.arg_RES_7f061d0a));
       }else {
          this.b.setBackgroundResource(R.drawable.arg_RES_7f081e1c);
          this.b.setTextColor(a1.a(R.color.arg_RES_7f061d0b));
       }
       return;
    }
}
