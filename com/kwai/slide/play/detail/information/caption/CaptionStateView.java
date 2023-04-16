package com.kwai.slide.play.detail.information.caption.CaptionStateView;
import com.kwai.slide.play.detail.information.caption.CaptionStateView$1;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import qp7.t0;
import com.kwai.slide.play.detail.information.caption.l;
import com.kwai.slide.play.detail.information.caption.k;
import java.lang.Float;
import android.content.Context;

public abstract class CaptionStateView	// class@0017c6
{
    public SpannableStringBuilder a;
    public boolean b;
    public View c;
    public final p d;

    public void CaptionStateView(int p0){
       super(new CaptionStateView$1(p0));
    }
    public void CaptionStateView(p p0){
       a.p(p0, "viewProvider");
       super();
       this.d = p0;
    }
    public final void a(int p0){
       CaptionStateView uCaptionStat = CaptionStateView.class;
       if (PatchProxy.isSupport(uCaptionStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCaptionStat, "7")) {
          return;
       }
       uCaptionStat = this.c;
       if (uCaptionStat != null) {
          ViewGroup$LayoutParams layoutParams = uCaptionStat.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = p0;
          }
       }
       CaptionStateView tc = this.c;
       if (tc != null) {
          tc.requestLayout();
       }
       return;
    }
    public final int b(){
       CaptionStateView obj = PatchProxy.apply(null, this, CaptionStateView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj != null) {
          ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
          if (layoutParams != null) {
             layoutParams = layoutParams.height;
          label_0022 :
             return layoutParams;
          }
       }
       int i = 0;
       goto label_0022 ;
    }
    public final int c(){
       CaptionStateView obj = PatchProxy.apply(null, this, CaptionStateView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int measuredHeig = (obj != null)? obj.getMeasuredHeight(): 0;
       return measuredHeig;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, CaptionStateView.class, "2")) {
          return;
       }
       this.b = false;
       CaptionStateView tc = this.c;
       if (tc != null) {
          tc.setVisibility(8);
       }
       return;
    }
    public abstract void e(SpannableStringBuilder p0);
    public abstract void f(View p0,ViewGroup p1,t0 p2,l p3,k p4);
    public final void g(float p0){
       CaptionStateView uCaptionStat = CaptionStateView.class;
       if (PatchProxy.isSupport(uCaptionStat) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uCaptionStat, "6")) {
          return;
       }
       uCaptionStat = this.c;
       if (uCaptionStat != null) {
          uCaptionStat.setAlpha(p0);
       }
       return;
    }
    public final void h(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CaptionStateView.class, "4")) {
          return;
       }
       this.a = p0;
       if (this.c != null) {
          this.e(p0);
       }
       return;
    }
    public final void i(Context p0,ViewGroup p1,t0 p2,l p3,k p4){
       Object[] objArray;
       View view;
       CaptionStateView tc1;
       CaptionStateView uCaptionStat = CaptionStateView.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       if (PatchProxy.isSupport(uCaptionStat)) {
          objArray = new Object[i3];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[i2] = p2;
          objArray[i1] = p3;
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, this, uCaptionStat, "1")) {
             return;
          }
       }
       a.p(p0, "context");
       a.p(p1, "parent");
       a.p(p2, "config");
       a.p(p3, "viewModel");
       a.p(p4, "eventBus");
       this.b = true;
       if (this.c == null) {
          if (PatchProxy.isSupport(uCaptionStat)) {
             objArray = new Object[i3];
             objArray[0] = p0;
             objArray[1] = p1;
             objArray[i2] = p2;
             objArray[i1] = p3;
             objArray[i] = p4;
             if (!PatchProxy.applyVoid(objArray, this, uCaptionStat, "3")) {
             }
          }else {
          }
       }
    label_007d :
       CaptionStateView tc = this.c;
       if (tc != null) {
          tc.setVisibility(0);
       }
       return;
    }
}
