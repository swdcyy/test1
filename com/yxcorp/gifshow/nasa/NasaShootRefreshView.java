package com.yxcorp.gifshow.nasa.NasaShootRefreshView;
import o17.j;
import ml8.d;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import java.lang.Float;
import java.lang.Math;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$b;
import k2b.k0;
import q87.c;
import android.os.Vibrator;
import java.util.Iterator;
import yqb.i;
import java.lang.Runnable;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import yqb.h;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import java.lang.StringBuilder;
import java.lang.Integer;

public class NasaShootRefreshView extends RelativeLayout implements j, d	// class@0020c0
{
    public PathLoadingView b;
    public TextView c;
    public boolean d;
    public boolean e;
    public boolean f;
    public RefreshLayout$g g;
    public final List h;
    public NasaShootRefreshView$b i;
    public static final float j;
    public static final int k;
    public static final float l;

    static {
       NasaShootRefreshView.j = (float)a1.d(0x7f070fb5);
       NasaShootRefreshView.k = a1.e(10.00f);
       NasaShootRefreshView.l = (float)a1.e(10.00f);
    }
    public void NasaShootRefreshView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = true;
       this.e = false;
       this.f = false;
       this.h = new ArrayList();
    }
    public void a(NasaShootRefreshView$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaShootRefreshView.class, "13")) {
          return;
       }
       this.h.add(p0);
       if (this.d()) {
          p0.a();
       }
       return;
    }
    public boolean c(){
       return this.d;
    }
    public final boolean d(){
       boolean b = (this.e != null && this.d == null)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaShootRefreshView.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a2d52);
       this.b = m1.f(p0, 0x7f0a2d70);
       return;
    }
    public void e(NasaShootRefreshView$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaShootRefreshView.class, "14")) {
          return;
       }
       this.h.remove(p0);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, NasaShootRefreshView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void pullProgress(float p0,float p1){
       float f1;
       if (PatchProxy.isSupport(NasaShootRefreshView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NasaShootRefreshView.class, "7")) {
          return;
       }
       int i = 0;
       this.b.setVisibility(i);
       if (this.f != null) {
          if (this.getTop() > 0) {
             this.setTop(i);
          }
          return;
       }else if(this.e != null){
          return;
       }else {
          float f = 2.00f;
          if (this.b != null) {
             p1 = NasaShootRefreshView.l;
             f1 = (p0 - p1 >= 0)? (p0 - p1) / (NasaShootRefreshView.j - p1): 0;
             this.b.m(Math.min(0x3f800000, ((f1 / f) + 0x3f000000)));
          }
          this.c.setVisibility(i);
          this.c.setAlpha(0x3f800000);
          int k = NasaShootRefreshView.k;
          f1 = Math.max(0, (0x3f800000 - (p0 / (float)k)));
          NasaShootRefreshView ti = this.i;
          if (ti != null) {
             ti.c(f1, Math.min(p0, (float)k));
          }
          k = NasaShootRefreshView.l;
          if (p0 - k < 0) {
             this.setAlpha(0);
             Object[] objArray = new Object[i];
             k0.C().w("NasaShootRefreshView", "pullProgress", objArray);
             this.setTopButtonClickable(true);
          }else {
             this.setAlpha(Math.min(0x3f800000, ((p0 - k) / (k * f))));
          }
          return;
       }
    }
    public void pullToRefresh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaShootRefreshView.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, NasaShootRefreshView.class, "8")) {
          Vibrator systemServic = a1.c().getSystemService("vibrator");
          if (systemServic != null && systemServic.hasVibrator()) {
             systemServic.vibrate(10);
          }
       }
       return;
    }
    public void refreshComplete(){
       if (PatchProxy.applyVoid(null, this, NasaShootRefreshView.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       k0.C().w("NasaShootRefreshView", "refreshComplete", objArray);
       this.d = true;
       this.b.a();
       this.setTopButtonClickable(true);
       this.setAlpha(0);
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          NasaShootRefreshView$c uoc = iterator.next();
          if (uoc != null) {
             uoc.b();
          }
       }
       return;
    }
    public int refreshedAnimatorDuration(){
       return 300;
    }
    public void refreshing(){
       if (PatchProxy.applyVoid(null, this, NasaShootRefreshView.class, "4")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       boolean b = true;
       this.e = b;
       boolean b1 = false;
       this.d = b1;
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          NasaShootRefreshView$c uoc = iterator.next();
          if (uoc != null) {
             uoc.a();
          }
       }
       if (this.f != null) {
          this.post(new i(this));
          return;
       }else {
          int[] ointArray = new int[]{this.getTop(),b1};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.setDuration(300);
          valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
          valueAnimato.addUpdateListener(new h(this));
          valueAnimato.addListener(new NasaShootRefreshView$a(this));
          valueAnimato.start();
          return;
       }
    }
    public void releaseToRefresh(){
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, NasaShootRefreshView.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       k0.C().w("NasaShootRefreshView", "reset", objArray);
       this.e = false;
       this.f = false;
       this.b.a();
       this.b.m(0x3f000000);
       this.setTopButtonClickable(true);
       NasaShootRefreshView ti = this.i;
       if (ti != null) {
          ti.reset();
       }
       return;
    }
    public void setIRefreshViewStateListener(NasaShootRefreshView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaShootRefreshView.class, "15")) {
          return;
       }
       this.i = p0;
       if (this.d()) {
          p0.a();
       }
       return;
    }
    public void setNotPullRefresh(boolean p0){
       if (PatchProxy.isSupport(NasaShootRefreshView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaShootRefreshView.class, "11")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.f = p0;
       if (p0) {
          this.c.setVisibility(8);
       }else {
          this.c.setVisibility(0);
       }
       this.b.m(0x3f000000);
       Object[] objArray = new Object[0];
       k0.C().w("NasaShootRefreshView", "setNotPullRefresh", objArray);
       this.setTopButtonClickable(0);
       return;
    }
    public void setOnRefreshListener(RefreshLayout$g p0){
       this.g = p0;
    }
    public void setTopButtonClickable(boolean p0){
       if (PatchProxy.isSupport(NasaShootRefreshView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaShootRefreshView.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       k0.C().w("NasaShootRefreshView", "setTopButtonClickable "+p0, objArray);
       NasaShootRefreshView ti = this.i;
       if (ti != null) {
          ti.b((p0 ^ 0x01));
       }
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(NasaShootRefreshView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NasaShootRefreshView.class, "9")) {
          return;
       }
       super.setVisibility(p0);
       return;
    }
}
