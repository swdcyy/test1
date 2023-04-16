package com.google.android.material.tabs.a;
import com.google.android.material.tabs.KCubeTabLayout;
import java.lang.Object;
import android.view.View;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.animation.Animator$AnimatorListener;
import java.util.HashSet;
import jk.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.tabs.a$b;
import jk.a;
import com.google.android.material.tabs.a$a;
import android.view.ViewGroup;
import java.util.Collection;
import ekd.q;

public class a	// class@0016d4
{
    public boolean a;
    public final View b;
    public final KCubeTabLayout c;
    public HashSet d;
    public ValueAnimator e;
    public a$b f;

    public void a(KCubeTabLayout p0){
       super();
       this.c = p0;
       this.b = p0.getContainer();
    }
    public static void a(a p0,ValueAnimator p1){
       p0.n(p1);
    }
    public static void b(a p0,ValueAnimator p1){
       p0.m(p1);
    }
    private void m(ValueAnimator p0){
       this.b.setTranslationY(p0.getAnimatedValue().floatValue());
    }
    private void n(ValueAnimator p0){
       this.b.setTranslationY(p0.getAnimatedValue().floatValue());
    }
    public void c(Animator$AnimatorListener p0){
       if (this.d == null) {
          this.d = new HashSet();
       }
       this.d.add(p0);
       return;
    }
    public final void d(){
       a te = this.e;
       if (te != null) {
          te.removeAllListeners();
          this.e.cancel();
       }
       ValueAnimator valueAnimato = this.f();
       this.e = valueAnimato;
       valueAnimato.start();
       return;
    }
    public final void e(){
       a te = this.e;
       if (te != null) {
          te.removeAllListeners();
          this.e.cancel();
       }
       ValueAnimator valueAnimato = this.g();
       this.e = valueAnimato;
       valueAnimato.start();
       return;
    }
    public final ValueAnimator f(){
       float[] uofloatArray = new float[]{this.b.getTranslationY(),(float)this.b.getHeight()};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setDuration(250);
       valueAnimato.addUpdateListener(new b(this));
       valueAnimato.addListener(this.h());
       return valueAnimato;
    }
    public final ValueAnimator g(){
       float[] uofloatArray = new float[]{this.b.getTranslationY(),0};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setDuration(250);
       valueAnimato.addUpdateListener(new a(this));
       valueAnimato.addListener(this.h());
       return valueAnimato;
    }
    public final a$b h(){
       if (this.f == null) {
          this.f = new a$b(this, null);
       }
       return this.f;
    }
    public void i(boolean p0){
       if (this.a == null) {
          return;
       }
       this.a = false;
       if (p0) {
          this.d();
       }else {
          this.p();
       }
       return;
    }
    public void j(){
       int i = 0;
       while (i < this.b.getChildCount()) {
          View childAt = this.b.getChildAt(i);
          if (childAt.getId() != 0x7f0a2d4d) {
             childAt.setVisibility(8);
          }
          i = i + 1;
       }
       return;
    }
    public boolean k(){
       a te = this.e;
       boolean b = (te != null && te.isRunning())? true: false;
       return b;
    }
    public boolean l(){
       return this.a;
    }
    public void o(Animator$AnimatorListener p0){
       if (!q.f(this.d)) {
          this.d.remove(p0);
       }
       return;
    }
    public final void p(){
       a te = this.e;
       if (te != null && te.isRunning()) {
          this.e.cancel();
       }
       te = this.b;
       te.setTranslationY((float)te.getHeight());
       return;
    }
    public final void q(){
       a te = this.e;
       if (te != null && te.isRunning()) {
          this.e.cancel();
       }
       this.b.setTranslationY(0);
       return;
    }
    public void r(boolean p0){
       if (this.a != null) {
          return;
       }
       this.a = true;
       if (p0) {
          this.e();
       }else {
          this.q();
       }
       return;
    }
    public void s(){
       int i = 0;
       while (i < this.b.getChildCount()) {
          View childAt = this.b.getChildAt(i);
          if (childAt.getId() != 0x7f0a2d4d) {
             childAt.setVisibility(0);
          }
          i = i + 1;
       }
       return;
    }
}
