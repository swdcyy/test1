package com.yxcorp.gifshow.widget.LiveCoverIconView$e;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import java.lang.Object;
import com.yxcorp.gifshow.widget.LiveCoverIconView$IconStyle;
import com.yxcorp.gifshow.widget.LiveCoverIconView$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.widget.LiveCoverIconView$LayoutStyle;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.graphics.Typeface;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.SpannableStringBuilder;
import ekd.j;
import android.text.style.ForegroundColorSpan;
import android.graphics.Color;
import com.yxcorp.gifshow.widget.LiveCoverIconView$d;
import android.text.TextPaint;
import brd.a0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import android.graphics.drawable.Drawable;
import tyc.v2;
import erd.g;
import tyc.r2;
import tyc.a3;
import tyc.u2;
import tyc.q2;
import tyc.z2;
import tyc.y2;
import tyc.w2;
import tyc.x2;
import io.reactivex.internal.functions.a;
import brd.e0;
import brd.h;
import cxd.b;
import io.reactivex.internal.operators.flowable.FlowableTakeLastOne;
import ird.a;
import tyc.s2;
import tyc.t2;
import com.yxcorp.gifshow.widget.LiveCoverIconView$c;
import com.yxcorp.gifshow.widget.LiveCoverIconView$f;

public class LiveCoverIconView$e	// class@001879
{
    public float a;
    public String b;
    public int c;
    public Drawable d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public CDNUrl[] k;
    public CDNUrl[] l;
    public Drawable m;
    public Drawable n;
    public CDNUrl[] o;
    public Drawable p;
    public String q;
    public String[] r;
    public LiveCoverIconView$f s;
    public Typeface t;
    public LiveCoverIconView$LayoutStyle u;
    public final LiveCoverIconView v;

    public void LiveCoverIconView$e(LiveCoverIconView p0){
       this.v = p0;
       super();
       p0 = p0.C;
       this.a = p0.mTextSizeDp;
       this.c = LiveCoverIconView.Q;
       this.e = p0.mLeftIconLeftMarginPx;
       this.f = LiveCoverIconView.O;
       this.g = LiveCoverIconView.P;
       this.h = p0.mTextHorizontalGoneMarginPx;
       this.i = p0.mLeftIconHeightPx;
       this.j = p0.mRightIconHeightPx;
    }
    public void LiveCoverIconView$e(LiveCoverIconView p0,LiveCoverIconView$a p1){
       super(p0);
    }
    public void a(){
       a0 uoa01;
       LiveCoverIconView k;
       View[] viewArray;
       ForegroundColorSpan uForegroundC;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveCoverIconView$e.class, "2")) {
          return;
       }
       LiveCoverIconView$e tv = this.v;
       Objects.requireNonNull(tv);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidOneRefs(this, tv, LiveCoverIconView.class, "8")) {
          if (!PatchProxy.applyVoid(objArray, tv, LiveCoverIconView.class, "6")) {
             b9.a(tv.M);
             tv.M = objArray;
          }
          LiveCoverIconView$e tu = this.u;
          String str = 8;
          if (!PatchProxy.applyVoidOneRefs(tu, tv, LiveCoverIconView.class, "26")) {
             int i = (tv.S(tu))? 0: 8;
             View[] viewArray1 = new View[]{tv.D};
             n.Z(i, viewArray1);
             int i1 = (tv.S(tu))? 8: 0;
             View[] viewArray2 = new View[]{tv.I,tv.F,tv.J};
             n.Z(i1, viewArray2);
          }
          if (!PatchProxy.applyVoidOneRefs(this, tv, LiveCoverIconView.class, "12")) {
             if (TextUtils.x(this.b)) {
                tv.H.setText(objArray);
                viewArray = new View[]{tv.H,tv.I,tv.J};
                n.Z(str, viewArray);
             }else if(PatchProxy.applyVoidOneRefs(this, tv, LiveCoverIconView.class, "18")){
                ConstraintLayout$LayoutParams layoutParams1 = tv.H.getLayoutParams();
                layoutParams1.x = this.h;
                layoutParams1.y = (tv.S(this.u))? this.j + LiveCoverIconView.S: this.h;
                tv.H.setLayoutParams(layoutParams1);
             }
             tv.H.setVisibility(0);
             tv.H.setText(this.b);
             tv.H.setTextSize(1, this.a);
             tv.H.setTextColor(this.c);
             if (TextUtils.x(this.q)) {
                tv.J.setText(objArray);
                viewArray = new View[]{tv.I,tv.J};
                n.Z(str, viewArray);
             }else {
                tu = this.t;
                if (tu != null) {
                   if (this.l != null) {
                      tv.J.setTypeface(tu, 0);
                   }else {
                      tv.J.setTypeface(tu);
                   }
                }
                if (!PatchProxy.applyVoidOneRefs(this, tv, LiveCoverIconView.class, "19")) {
                   ViewGroup$MarginLayoutParams layoutParams = tv.J.getLayoutParams();
                   layoutParams.rightMargin = this.h;
                   tv.J.setLayoutParams(layoutParams);
                }
                viewArray = new View[]{tv.I,tv.J};
                n.Z(0, viewArray);
                SpannableStringBuilder spannableStr = new SpannableStringBuilder(this.q);
                try{
                   uoa01 = -1;
                   if (j.h(this.r)) {
                      uForegroundC = new ForegroundColorSpan(uoa01);
                   }else if(this.r.length == 1){
                      uForegroundC = new ForegroundColorSpan(Color.parseColor(this.r[0]));
                   }else {
                      uForegroundC = new LiveCoverIconView$d(Color.parseColor(this.r[0]), Color.parseColor(this.r[1]), tv.J.getPaint().measureText(this.q));
                   }
                }catch(java.lang.Exception e0){
                   uForegroundC = new ForegroundColorSpan(uoa01);
                }
                spannableStr.setSpan(uForegroundC, 0, spannableStr.length(), 33);
                e0.J.setText(spannableStr);
             }
          }
          a0 uoa0 = PatchProxy.applyOneRefs(this, tv, LiveCoverIconView.class, "9");
          if (uoa0 != patchProxyRe) {
          }else if(!j.h(this.o)){
             uoa0 = LiveCoverIconView.T(tv.G, tv.getLayoutParams().height, this.o, this.n).q(new v2(tv));
          }else {
             uoa0 = a0.B(new Object()).q(new r2(tv, this));
          }
          uoa01 = PatchProxy.applyOneRefs(this, tv, LiveCoverIconView.class, "10");
          if (uoa01 != patchProxyRe) {
          }else if(!j.h(this.k)){
             uoa01 = LiveCoverIconView.T(tv.E, this.i, this.k, this.d).q(new a3(tv, this)).p(new u2(tv));
          }else {
             uoa01 = a0.B(new Object()).q(new q2(tv, this));
          }
          a0 uoa02 = PatchProxy.applyOneRefs(this, tv, LiveCoverIconView.class, "11");
          if (uoa02 != patchProxyRe) {
          }else if(tv.S(this.u)){
             k = tv.K;
          }else {
             k = tv.F;
          }
          if (!j.h(this.l)) {
             uoa02 = LiveCoverIconView.U(k, this.j, this.l, objArray, 1).q(new z2(tv, k, this)).r(new y2(tv, k)).p(new w2(tv, k));
          }else {
             uoa02 = a0.B(new Object()).q(new x2(tv, k));
          }
          a.c(uoa0, "source1 is null");
          a.c(uoa01, "source2 is null");
          a.c(uoa02, "source3 is null");
          e0[] uoe0Array = new e0[]{uoa0,uoa01,uoa02};
          h oh = a0.E(h.l(uoe0Array));
          Objects.requireNonNull(oh);
          tv.M = a.f(new FlowableTakeLastOne(oh)).A(new s2(this), new t2(this));
       }
       return;
    }
    public LiveCoverIconView$e b(){
       Object obj = PatchProxy.apply(null, this, LiveCoverIconView$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.p = this.v.getIconBackgroundFactory().create();
       return this;
    }
    public LiveCoverIconView$e c(Drawable p0){
       this.p = p0;
       return this;
    }
    public LiveCoverIconView$e d(CDNUrl[] p0){
       this.o = p0;
       return this;
    }
    public LiveCoverIconView$e e(LiveCoverIconView$LayoutStyle p0){
       this.u = p0;
       return this;
    }
    public LiveCoverIconView$e f(Drawable p0){
       this.m = p0;
       return this;
    }
    public LiveCoverIconView$e g(Drawable p0){
       this.d = p0;
       return this;
    }
    public LiveCoverIconView$e h(int p0){
       if (p0 > 0) {
          this.i = p0;
       }
       return this;
    }
    public LiveCoverIconView$e i(int p0){
       this.e = p0;
       return this;
    }
    public LiveCoverIconView$e j(int p0){
       this.f = p0;
       return this;
    }
    public LiveCoverIconView$e k(CDNUrl[] p0){
       this.k = p0;
       return this;
    }
    public LiveCoverIconView$e l(LiveCoverIconView$f p0){
       this.s = p0;
       return this;
    }
    public LiveCoverIconView$e m(CDNUrl[] p0){
       this.l = p0;
       return this;
    }
    public LiveCoverIconView$e n(Typeface p0){
       this.t = p0;
       return this;
    }
    public LiveCoverIconView$e o(int p0){
       this.c = p0;
       return this;
    }
    public LiveCoverIconView$e p(String p0){
       this.b = p0;
       return this;
    }
    public LiveCoverIconView$e q(int p0){
       this.h = p0;
       return this;
    }
    public LiveCoverIconView$e r(float p0){
       if (p0 > 0) {
          this.a = p0;
       }
       return this;
    }
}
