package com.yxcorp.gifshow.prettify.widget.RecycleViewWithIndicator;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.animation.TimeInterpolator;
import com.kwai.robust.PatchProxyResult;
import th0.e;
import android.view.View;
import java.lang.Float;
import java.lang.Boolean;
import xyb.a;
import q87.c;
import q1c.c;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import java.lang.Integer;
import q1c.d;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.prettify.widget.RecycleViewWithIndicator$a;
import androidx.recyclerview.widget.RecyclerView$r;

public class RecycleViewWithIndicator extends PostGroupWithIndicator	// class@0011e0
{
    public RecyclerView m;
    public View n;
    public int o;
    public int p;
    public static final int q;

    public void RecycleViewWithIndicator(Context p0){
       super(p0, null);
    }
    public void RecycleViewWithIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RecycleViewWithIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = -1;
       this.l();
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, RecycleViewWithIndicator.class, "5")) {
          return;
       }
       this.m.setClickable(false);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, RecycleViewWithIndicator.class, "4")) {
          return;
       }
       this.m.setClickable(true);
       return;
    }
    public long getAnimatorDuration(){
       return 300;
    }
    public TimeInterpolator getInterpolator(){
       Object obj = PatchProxy.apply(null, this, RecycleViewWithIndicator.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
    public View getParentView(){
       return this.m;
    }
    public void i(float p0){
       if (PatchProxy.isSupport(RecycleViewWithIndicator.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RecycleViewWithIndicator.class, "6")) {
          return;
       }
       if (this.p == -1) {
          return;
       }
       float f = (p0 - 0x3f000000 > 0)? 3.00f - (p0 * 2.00f): 0x3f800000 + (p0 * 2.00f);
       this.b.setScaleX(f);
       return;
    }
    public void l(){
       this.n = null;
       this.o = -1;
       this.p = -1;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, RecycleViewWithIndicator.class, "2")) {
          return;
       }
       RecycleViewWithIndicator tn = this.n;
       if (tn != null && (!PatchProxy.isSupport(RecycleViewWithIndicator.class) || !PatchProxy.applyVoidTwoRefs(tn, Boolean.FALSE, this, RecycleViewWithIndicator.class, "8"))) {
          Object[] objArray = new Object[0];
          a.D().s("RecycleViewWithIndicator", "scrollerIndicatorAfterLaidOut", objArray);
          f.G(tn, new c(this, tn, 0));
       }
       return;
    }
    public void n(View p0,int p1,boolean p2){
       if (PatchProxy.isSupport(RecycleViewWithIndicator.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, RecycleViewWithIndicator.class, "1")) {
          return;
       }
       String str = "RecycleViewWithIndicator";
       int i = 0;
       if (!p2) {
          if (p0 == this.n) {
             Object[] objArray = new Object[i];
             a.D().s(str, "unbind view", objArray);
             this.n = null;
             this.setIndicatorVisible(4);
          }
          return;
       }else if(p1 != this.o || p0 != this.n){
          Object[] objArray1 = new Object[i];
          a.D().s(str, "bind view", objArray1);
          this.setIndicatorVisible(i);
          p2 = (this.o != -1)? true: false;
          if (!PatchProxy.isSupport(RecycleViewWithIndicator.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p2), this, RecycleViewWithIndicator.class, "9")) {
             f.F(p0, new d(this, p0, p2));
          }
          RecycleViewWithIndicator to = this.o;
          if (to != -1 && p1 != to) {
             if (to <= p1) {
                i = 1;
             }
             this.p = i;
          }else {
             this.p = -1;
          }
          this.n = p0;
          this.o = p1;
       }
       return;
    }
    public void setRecyclerView(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecycleViewWithIndicator.class, "3")) {
          return;
       }
       this.m = p0;
       p0.addOnScrollListener(new RecycleViewWithIndicator$a(this));
       return;
    }
}
