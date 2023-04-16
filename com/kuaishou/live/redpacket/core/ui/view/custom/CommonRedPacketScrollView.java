package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketScrollView;
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
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

public class CommonRedPacketScrollView extends ConstraintLayout	// class@000efa
{
    public FrameLayout B;
    public FrameLayout C;
    public FrameLayout D;
    public FrameLayout E;
    public RecyclerView F;

    public void CommonRedPacketScrollView(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketScrollView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketScrollView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d0211, this);
          this.B = this.findViewById(0x7f0a351d);
          this.C = this.findViewById(0x7f0a351a);
          this.F = this.findViewById(0x7f0a3519);
          this.D = this.findViewById(0x7f0a351b);
          this.E = this.findViewById(0x7f0a351c);
          this.B.setVisibility(8);
          this.C.setVisibility(8);
          this.D.setVisibility(8);
          this.E.setVisibility(8);
       }
       return;
    }
    public RecyclerView getRecyclerView(){
       return this.F;
    }
    public void setBottomFooterView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketScrollView.class, "4")) {
          return;
       }
       this.C.removeAllViews();
       this.C.addView(p0);
       this.C.setVisibility(0);
       return;
    }
    public void setLeftHeaderView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketScrollView.class, "6")) {
          return;
       }
       this.D.removeAllViews();
       this.D.addView(p0);
       this.D.setVisibility(0);
       return;
    }
    public void setRightFooterView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketScrollView.class, "8")) {
          return;
       }
       this.E.removeAllViews();
       this.E.addView(p0);
       this.E.setVisibility(0);
       return;
    }
    public void setTopHeaderView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketScrollView.class, "2")) {
          return;
       }
       this.B.removeAllViews();
       this.B.addView(p0);
       this.B.setVisibility(0);
       return;
    }
}
