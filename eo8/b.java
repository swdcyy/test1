package eo8.b;
import java.lang.Object;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import on8.b;
import on8.a;
import java.lang.System;

public class b	// class@00221e
{
    public b a;
    public a b;
    public long c;
    public long d;
    public int e;
    public int f;

    public void b(){
       super();
       this.e = -1;
       this.f = -1;
    }
    public void a(ViewGroup p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.onScrollBeginDrag(p0.getScrollX(), p0.getScrollY(), p1, p2);
       }
       return;
    }
    public void b(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "8")) {
          return;
       }
       uob = this.b;
       if (uob != null) {
          uob.onContentSizeChanged(p0, p1);
       }
       return;
    }
    public void c(){
       this.a = null;
       this.b = null;
    }
    public void d(ViewGroup p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "3")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.onScrollEndDrag(p0.getScrollX(), p0.getScrollY(), p1, p2);
       }
       return;
    }
    public void e(ViewGroup p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "5")) {
          return;
       }
       if (this.a != null) {
          long l = System.currentTimeMillis();
          if ((l - this.d) - 50 > 0) {
             this.d = l;
             this.a.onReachEnd(p0.getScrollX(), p0.getScrollY(), p1, p2);
          }
       }
       return;
    }
    public void f(ViewGroup p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "4")) {
          return;
       }
       if (this.a != null) {
          long l = System.currentTimeMillis();
          if ((l - this.c) - 50 > 0) {
             this.c = l;
             this.a.onReachStart(p0.getScrollX(), p0.getScrollY(), p1, p2);
          }
       }
       return;
    }
    public void g(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       uob = this.a;
       if (uob == null) {
          return;
       }
       if (this.e == p0 && this.f == p1) {
          return;
       }
       this.e = p0;
       this.f = p1;
       uob.onScroll(p0, p1);
       return;
    }
    public void h(ViewGroup p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "6")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.onMomentumScrollBegin(p0.getScrollX(), p0.getScrollY(), p1, p2);
       }
       return;
    }
    public void i(ViewGroup p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "7")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.onMomentumScrollEnd(p0.getScrollX(), p0.getScrollY(), p1, p2);
       }
       return;
    }
    public void j(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "9")) {
          return;
       }
       uob = this.a;
       if (uob != null) {
          uob.onScrollStateChanged(p0);
       }
       return;
    }
    public void k(b p0){
       this.a = p0;
    }
    public void l(a p0){
       this.b = p0;
    }
}
