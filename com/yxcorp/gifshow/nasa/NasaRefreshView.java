package com.yxcorp.gifshow.nasa.NasaRefreshView;
import com.kwai.library.slide.base.widget.SlidePlayRefreshView;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView;
import o17.j;
import android.view.animation.Animation$AnimationListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import i2b.a;
import android.widget.TextView;
import yqb.f;
import java.lang.Runnable;
import ekd.k1;
import java.lang.ClassCastException;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Math;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$b;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import yqb.e;
import yqb.g;
import o17.b;
import com.kwai.robust.PatchProxyResult;
import yqb.d;

public class NasaRefreshView extends SlidePlayRefreshView	// class@0020bc
{
    public final float g1;
    public final float h1;
    public boolean i1;
    public RefreshLayout$g j1;
    public long k1;
    public static final int l1;

    public void NasaRefreshView(Context p0){
       super(p0);
       this.g1 = (float)a1.g();
       this.h1 = (float)a1.e(37.50f);
       this.i1 = false;
       this.k1 = 600;
    }
    public void NasaRefreshView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g1 = (float)a1.g();
       this.h1 = (float)a1.e(37.50f);
       this.i1 = false;
       this.k1 = 600;
    }
    public static void M(NasaRefreshView p0,boolean p1){
       if (!p0.u() && p0.S != null) {
          if (p0.i1 != null) {
             boolean b = false;
             p0.i1 = b;
             RefreshLayout n = p0.N;
             if (n instanceof NasaShootRefreshView) {
                n.setNotPullRefresh(b);
             }
          }
          p0.S.refreshComplete();
       }
       super.setRefreshing(p1);
       return;
    }
    public void d(int p0,Animation$AnimationListener p1){
       if (PatchProxy.isSupport(NasaRefreshView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, NasaRefreshView.class, "6")) {
          return;
       }
       if (!this.N.getTop() || !(float)this.N.getTop() - this.getRefreshTargetOffset()) {
          this.N.setTop(0);
          this.clearAnimation();
          p1.onAnimationStart(null);
          p1.onAnimationEnd(null);
       }else {
          super.d(p0, p1);
       }
       return;
    }
    public void l(AttributeSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaRefreshView.class, "4")) {
          return;
       }
       a.d(this.getContext(), R.layout.arg_RES_7f0d1069, this, true);
       View view = this.findViewById(R.id.slide_shoot_refresh_view);
       this.N = view;
       view.setVisibility(8);
       k1.o(new f(this.findViewById(R.id.nasa_pull_to_refresh_text)));
       RefreshLayout tN = this.N;
       if (!tN instanceof j) {
          throw new ClassCastException("the refreshView must implement the interface IRefreshStatus");
       }
       this.S = tN;
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NasaRefreshView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NasaRefreshView.class, "7")) {
             return;
          }
       }
       RefreshLayout tN = this.N;
       if (tN instanceof NasaShootRefreshView) {
          if (tN.c()) {
             super.onLayout(p0, p1, p2, p3, p4);
          }
       }else {
          super.onLayout(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void setDismissRefreshDelayTime(long p0){
       if (PatchProxy.isSupport(NasaRefreshView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, NasaRefreshView.class, "3")) {
          return;
       }
       this.k1 = Math.max(p0, 600);
       return;
    }
    public void setIRefreshViewStateListener(NasaShootRefreshView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaRefreshView.class, "8")) {
          return;
       }
       RefreshLayout tN = this.N;
       if (tN instanceof NasaShootRefreshView) {
          tN.setIRefreshViewStateListener(p0);
       }
       return;
    }
    public void setNotPullRefresh(boolean p0){
       this.i1 = p0;
    }
    public void setOnRefreshListener(RefreshLayout$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaRefreshView.class, "1")) {
          return;
       }
       this.j1 = p0;
       super.setOnRefreshListener(new e(this));
       return;
    }
    public void setRefreshing(boolean p0){
       if (PatchProxy.isSupport(NasaRefreshView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaRefreshView.class, "2")) {
          return;
       }
       if (!p0) {
          k1.r(new g(this, p0), this.k1);
       }else if(this.i1 != null){
          RefreshLayout tN = this.N;
          if (tN instanceof NasaShootRefreshView) {
             tN.setNotPullRefresh(true);
          }
       }
       super.setRefreshing(p0);
       return;
    }
    public b y(){
       Object obj = PatchProxy.apply(null, this, NasaRefreshView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this);
    }
}
