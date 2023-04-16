package com.kuaishou.live.common.core.component.pendant.pendantgroup.LiveRightPendantView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.LinearLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class LiveRightPendantView extends RelativeLayout	// class@001713
{
    public LinearLayout b;
    public LinearLayout c;

    public void LiveRightPendantView(Context p0){
       super(p0, null);
    }
    public void LiveRightPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRightPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       View view = a.c(p0, R.layout.arg_RES_7f0d0db8, this);
       this.b = m1.f(view, 0x7f0a2529);
       this.c = m1.f(view, 0x7f0a2522);
       this.setClipToPadding(false);
       this.setClipChildren(false);
    }
    public void a(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveRightPendantView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveRightPendantView.class, "5")) {
          return;
       }
       this.c.setPadding(p0, p1, p2, p3);
       return;
    }
    public int getBottomContainerChildCount(){
       Object obj = PatchProxy.apply(null, this, LiveRightPendantView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getChildCount();
    }
    public ViewGroup$LayoutParams getBottomContainerLayoutParams(){
       Object obj = PatchProxy.apply(null, this, LiveRightPendantView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getLayoutParams();
    }
    public View getBottomContainerView(){
       return this.c;
    }
    public int getBottomContainerVisibility(){
       Object obj = PatchProxy.apply(null, this, LiveRightPendantView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getVisibility();
    }
    public ViewGroup$LayoutParams getTopContainerLayoutParams(){
       Object obj = PatchProxy.apply(null, this, LiveRightPendantView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLayoutParams();
    }
    public int getTopContainerVisibility(){
       Object obj = PatchProxy.apply(null, this, LiveRightPendantView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getVisibility();
    }
    public void setBottomContainerVisibility(int p0){
       if (PatchProxy.isSupport(LiveRightPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRightPendantView.class, "9")) {
          return;
       }
       this.c.setVisibility(p0);
       return;
    }
    public void setDividerHeight(int p0){
       if (PatchProxy.isSupport(LiveRightPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRightPendantView.class, "16")) {
          return;
       }
       if (this.c.getDividerDrawable() instanceof GradientDrawable) {
          GradientDrawable dividerDrawa = this.c.getDividerDrawable();
          dividerDrawa.setSize(dividerDrawa.getIntrinsicWidth(), p0);
       }
       return;
    }
    public void setTopContainerVisibility(int p0){
       if (PatchProxy.isSupport(LiveRightPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRightPendantView.class, "8")) {
          return;
       }
       this.b.setVisibility(p0);
       return;
    }
}
