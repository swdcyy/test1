package com.kwai.slide.play.detail.information.caption.CaptionView;
import android.widget.FrameLayout;
import com.kwai.slide.play.detail.information.caption.CaptionView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView;
import zq7.f0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import com.kwai.slide.play.detail.information.caption.CaptionStateView;
import android.view.ViewGroup;
import qp7.t0;
import com.kwai.slide.play.detail.information.caption.l;
import com.kwai.slide.play.detail.information.caption.k;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import zq7.c0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import zq7.d0;
import android.animation.Animator$AnimatorListener;
import th0.e;
import android.animation.TimeInterpolator;
import com.kwai.slide.play.detail.information.caption.CaptionView$b;

public final class CaptionView extends FrameLayout	// class@0017cb
{
    public boolean b;
    public k c;
    public l d;
    public t0 e;
    public CaptionView$b f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final DefaultCaptionStateView j;
    public final f0 k;
    public ValueAnimator l;
    public HashMap m;
    public static final CaptionView$a n;

    static {
       CaptionView.n = new CaptionView$a(null);
    }
    public void CaptionView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.i = true;
       this.j = new DefaultCaptionStateView();
       this.k = new f0();
    }
    public final void a(boolean p0,boolean p1){
       Context context;
       if (PatchProxy.isSupport(CaptionView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CaptionView.class, "12")) {
          return;
       }
       if (this.h != null && this.i == p0) {
          return;
       }
       if (!p0 && this.b == null) {
          return;
       }
       this.h = true;
       this.i = p0;
       CaptionView tl = this.l;
       if (tl != null) {
          tl.cancel();
       }
       this.g = p1;
       this.j.g(0x3f800000);
       this.k.g(0x3f800000);
       String str = "mEventBus";
       String str1 = "mViewModel";
       String str2 = "mPageConfig";
       String str3 = "context";
       if (p0) {
          CaptionView tj = this.j;
          context = this.getContext();
          a.o(context, str3);
          CaptionView te = this.e;
          if (te == null) {
             a.S(str2);
          }
          CaptionView td = this.d;
          if (td == null) {
             a.S(str1);
          }
          CaptionView tc = this.c;
          if (tc == null) {
             a.S(str);
          }
          tj.i(context, this, te, td, tc);
          if (p1) {
             this.j.g(0);
          }else {
             this.k.d();
          }
       }else {
          CaptionView tk = this.k;
          Context context1 = this.getContext();
          a.o(context1, str3);
          CaptionView te1 = this.e;
          if (te1 == null) {
             a.S(str2);
          }
          CaptionView td1 = this.d;
          if (td1 == null) {
             a.S(str1);
          }
          CaptionView tc1 = this.c;
          if (tc1 == null) {
             a.S(str);
          }
          tk.i(context1, this, te1, td1, tc1);
          if (p1) {
             this.k.g(0);
          }else {
             this.j.d();
          }
       }
       return;
    }
    public final boolean b(){
       return this.i;
    }
    public final void c(float p0,int p1,int p2){
       if (PatchProxy.isSupport(CaptionView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, CaptionView.class, "11")) {
          return;
       }
       this.j.g(((float)1 - p0));
       this.k.g(p0);
       this.k.a((int)((float)p1 + (p0 * (float)(p2 - p1))));
       return;
    }
    public final k getMEventBus(){
       CaptionView obj = PatchProxy.apply(null, this, CaptionView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mEventBus");
       }
       return obj;
    }
    public final t0 getMPageConfig(){
       CaptionView obj = PatchProxy.apply(null, this, CaptionView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mPageConfig");
       }
       return obj;
    }
    public final l getMViewModel(){
       CaptionView obj = PatchProxy.apply(null, this, CaptionView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mViewModel");
       }
       return obj;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CaptionView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CaptionView.class, "9")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.g != null) {
          this.g = false;
          p0 = this.j.c();
          p1 = this.k.c();
          CaptionView ti = this.i;
          if (!PatchProxy.isSupport(CaptionView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(ti), this, CaptionView.class, "10")) {
             float[] uofloatArray = new float[2];
             uofloatArray = (ti != null)? {0x3f800000,0}: {0,0x3f800000};
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
             this.l = valueAnimato;
             if (valueAnimato != null) {
                valueAnimato.addUpdateListener(new c0(this, p0, p1));
             }
             CaptionView tl = this.l;
             if (tl != null) {
                tl.addListener(new d0(this, ti, p1, p0));
             }
             tl = this.l;
             if (tl != null) {
                tl.setDuration(300);
             }
             tl = this.l;
             if (tl != null) {
                tl.setInterpolator(new e());
             }
             tl = this.l;
             if (tl != null) {
                tl.start();
             }
             float f = (ti != null)? 0x3f800000: 0;
             this.c(f, p0, p1);
             if (this.getMeasuredHeight() > this.k.b()) {
                this.setMeasuredDimension(this.getMeasuredWidthAndState(), (this.k.b() | ((this.getMeasuredHeightAndState() >> 16) << 16)));
             }
          }
       }
       return;
    }
    public final void setAnimListener(CaptionView$b p0){
       this.f = p0;
    }
    public final void setMEventBus(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CaptionView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void setMPageConfig(t0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CaptionView.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void setMViewModel(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CaptionView.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
}
