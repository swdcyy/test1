package com.yxcorp.gifshow.ad.widget.DetailCollapsedContainer;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import android.util.AttributeSet;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import android.view.ViewGroup;
import java.lang.Float;
import java.util.Iterator;
import java.lang.Integer;
import w59.j;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import w59.l;
import android.animation.Animator$AnimatorListener;
import w59.i;
import w59.k;

public class DetailCollapsedContainer extends BaseCollapsedContainer	// class@00191f
{
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public ValueAnimator k;
    public ValueAnimator l;
    public boolean m;
    public final List n;
    public static final int o;

    public void DetailCollapsedContainer(Context p0){
       super(p0);
       this.e = 0;
       this.f = 1;
       this.m = true;
       this.n = new CopyOnWriteArrayList();
    }
    public void DetailCollapsedContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = 0;
       this.f = 1;
       this.m = true;
       this.n = new CopyOnWriteArrayList();
    }
    public void DetailCollapsedContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 0;
       this.f = 1;
       this.m = true;
       this.n = new CopyOnWriteArrayList();
    }
    public void a(BaseCollapsedContainer$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailCollapsedContainer.class, "2")) {
          return;
       }
       this.n.add(p0);
       return;
    }
    public boolean b(){
       boolean b = (this.f == null)? true: false;
       return b;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, DetailCollapsedContainer.class, "3")) {
          return;
       }
       this.n.clear();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, DetailCollapsedContainer.class, "5")) {
          return;
       }
       if (this.f == 1) {
          return;
       }
       DetailCollapsedContainer tl = this.l;
       if (tl != null) {
          tl.cancel();
       }
       tl = this.l;
       if (tl != null) {
          tl.start();
       }
       this.f = 1;
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       DetailCollapsedContainer tj;
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailCollapsedContainer.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.f == null || this.m == null) {
          return super.dispatchTouchEvent(p0);
       }
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else {
                this.i = this.i + (p0.getX() - this.g);
                this.j = this.j + (p0.getY() - this.h);
             }
          }else {
          }
       }else {
          this.g = p0.getX();
          float y = p0.getY();
          this.h = y;
          if (y - (float)this.e < 0) {
             return super.dispatchTouchEvent(p0);
          }
       }
       return true;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, DetailCollapsedContainer.class, "4")) {
          return;
       }
       if (this.f == null) {
          return;
       }
       DetailCollapsedContainer tk = this.k;
       if (tk != null) {
          tk.cancel();
       }
       tk = this.k;
       if (tk != null) {
          tk.start();
       }
       this.f = 0;
       return;
    }
    public final void f(boolean p0,float p1){
       if (PatchProxy.isSupport(DetailCollapsedContainer.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Float.valueOf(p1), this, DetailCollapsedContainer.class, "11")) {
          return;
       }
       Iterator iterator = this.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void g(int p0){
       int[] ointArray;
       ValueAnimator valueAnimato;
       if (PatchProxy.isSupport(DetailCollapsedContainer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DetailCollapsedContainer.class, "1")) {
          return;
       }
       this.e = p0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, DetailCollapsedContainer.class, "8") && this.l == null) {
          ointArray = new int[]{- this.e,0};
          valueAnimato = ValueAnimator.ofInt(ointArray);
          this.l = valueAnimato;
          valueAnimato.setDuration(300);
          this.l.addUpdateListener(new j(this));
          this.l.addListener(new l(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, DetailCollapsedContainer.class, "7") && this.k == null) {
          ointArray = new int[]{0,this.e};
          valueAnimato = ValueAnimator.ofInt(ointArray);
          this.k = valueAnimato;
          valueAnimato.setDuration(300);
          this.k.addUpdateListener(new i(this));
          this.k.addListener(new k(this));
       }
       return;
    }
    public void setCollapseSupport(boolean p0){
       this.m = p0;
    }
}
