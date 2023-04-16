package com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelValueInfoView;
import ml8.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Integer;
import android.widget.FrameLayout;
import java.lang.CharSequence;
import android.widget.TextView;
import ekd.m1;
import d61.f0;

public class LiveConditionRedPacketPanelValueInfoView extends ConstraintLayout implements d	// class@000ace
{
    public TextView B;
    public TextView C;
    public FrameLayout D;

    public void LiveConditionRedPacketPanelValueInfoView(Context p0){
       super(p0, null);
    }
    public void LiveConditionRedPacketPanelValueInfoView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveConditionRedPacketPanelValueInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketPanelValueInfoView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d0ac8, this);
          this.doBindView(this);
       }
       return;
    }
    public void L(int p0){
       if (PatchProxy.isSupport(LiveConditionRedPacketPanelValueInfoView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveConditionRedPacketPanelValueInfoView.class, "5")) {
          return;
       }
       this.D.setVisibility(8);
       this.B.setText(String.valueOf(p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketPanelValueInfoView.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a1b9d);
       this.C = m1.f(p0, 0x7f0a1b6d);
       this.D = m1.f(p0, 0x7f0a1b6b);
       f0.i(this.C, this.getContext());
       f0.i(this.B, this.getContext());
       return;
    }
}
