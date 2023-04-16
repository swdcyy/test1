package com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import android.widget.FrameLayout;
import hwc.a;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.timeline.MixVideoView;
import java.util.Objects;
import gwc.a;
import com.yxcorp.gifshow.v3.mixed.model.b;
import faa.a;
import q87.c;
import java.lang.Boolean;
import java.lang.StringBuilder;
import gwc.c;
import android.view.View;
import java.lang.Runnable;
import hwc.b;
import lnc.q4;
import com.yxcorp.gifshow.v3.mixed.model.MixStatus;
import com.yxcorp.gifshow.v3.mixed.model.DragStatus;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.HorizontalScrollView;
import java.lang.Integer;

public class MixTimeline extends FrameLayout	// class@00155f
{
    public b b;
    public MixTimelineScroller c;
    public MixDragHandle d;
    public MixVideoView e;
    public MixTranslationIndicators f;
    public View g;
    public View h;
    public List i;
    public double j;
    public int k;
    public int l;
    public int m;
    public double n;
    public i o;
    public static final int p;
    public static final int q;

    static {
       int a = a.a;
       MixTimeline.p = ((a / 2) - a.l) - a.h;
       MixTimeline.q = a / 2;
    }
    public void MixTimeline(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = Lists.b();
       this.j = (double)(a1.h() / 2);
       this.m = -1;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MixTimeline.class, "6")) {
          return;
       }
       int i = 0;
       int i1 = 0;
       while (i1 < this.i.size()) {
          MixVideoView mixVideoView = this.i.get(i1);
          Objects.requireNonNull(mixVideoView);
          if (!PatchProxy.applyVoid(objArray, mixVideoView, MixVideoView.class, "8") && mixVideoView.f != null) {
             mixVideoView = mixVideoView.g;
             if (mixVideoView != null && !PatchProxy.applyVoid(objArray, mixVideoView, a.class, "3")) {
                mixVideoView.j.invalidate();
             }
          }
          i1 = i1 + 1;
       }
       MixTimeline tb = this.b;
       if (tb != null && !tb.w0()) {
          Object[] objArray1 = new Object[i];
          a.D().w("MixTimeline", "refresh: with one track", objArray1);
          this.c();
       }
       return;
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport(MixTimeline.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MixTimeline.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MixTimeline", "snapCurrentVideoToCenterCursor left? "+p0, objArray);
       if (this.e == null) {
          return;
       }
       b.a(this, new c(this, p0));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, MixTimeline.class, "5")) {
          return;
       }
       MixTimeline te = this.e;
       if (te != null) {
          this.h.setTranslationX((float)q4.b((te.getContentLeftInScreen() + a1.e(0x3f000000)), a.l, a.a));
          int i = 0;
          te = (this.b.F0() == MixStatus.EDITING || !this.b.w0())? 1: 0;
          MixTimeline th = this.h;
          if (!te) {
             i = 8;
          }
          th.setVisibility(i);
       }
       return;
    }
    public final void d(DragStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTimeline.class, "12")) {
          return;
       }
       MixTimeline te = this.e;
       if (te == null) {
          return;
       }
       int contentLeftI = (p0.mIsLeft != null)? te.getContentLeftInScreen(): te.getContentRightInScreen();
       this.j = (double)contentLeftI;
       return;
    }
    public double getCursorPositionInTimeline(){
       Object obj = PatchProxy.apply(null, this, MixTimeline.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return ((double)(this.c.getScrollX() - a.l) + this.j);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(MixTimeline.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MixTimeline.class, "4")) {
             return;
          }
       }
       MixTimeline tb = this.b;
       if (tb == null || (tb.a.size() && this.b.a.size() == this.i.size())) {
          super.onLayout(p0, p1, p2, p3, p4);
          int i = MixTimeline.p + this.k;
          p1 = 0;
          while (p1 < this.b.a.size()) {
             View view = this.i.get(p1);
             p3 = view.getMeasuredWidth() + i;
             view.layout(i, 0, p3, view.getMeasuredHeight());
             p1++;
             i = p3;
          }
          this.g.setTranslationX((float)(int)(this.j - (double)a.b));
          this.c();
       }
    label_0091 :
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MixTimeline.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MixTimeline.class, "3")) {
          return;
       }
       MixTimeline tb = this.b;
       int i = 0;
       if (tb == null || !tb.a.size()) {
          this.setMeasuredDimension(i, i);
          return;
       }else {
          super.onMeasure(p0, p1);
          p0 = 0;
          for (; i < this.i.size(); i = i + 1) {
             p0 = p0 + this.i.get(i).getMeasuredWidth();
          }
          this.setMeasuredDimension(((((p0 + MixTimeline.p) + this.k) + MixTimeline.q) + this.l), this.getMeasuredHeight());
          return;
       }
    }
    public void setCurrentRound(boolean p0){
       MixTimeline te = this.e;
       if (te != null) {
          te.k = p0;
       }
       return;
    }
    public void setMaxTotalDuration(double p0){
       this.n = p0;
    }
}
