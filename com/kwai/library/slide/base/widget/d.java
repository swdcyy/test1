package com.kwai.library.slide.base.widget.d;
import com.kwai.library.slide.base.widget.e$a;
import com.kwai.library.slide.base.widget.a;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.widget.a$a;
import com.kwai.library.slide.base.widget.d$a;
import java.lang.Boolean;
import com.kwai.library.slide.base.widget.e;
import java.util.Objects;
import android.view.View;
import android.view.ViewPropertyAnimator;
import bz6.d;
import java.lang.Runnable;
import java.lang.Float;
import yy6.b;
import java.lang.StringBuilder;
import q87.c;
import wy6.a;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import bz6.b;

public class d implements e$a, a	// class@0008fc
{
    public e b;
    public a c;
    public a$a d;
    public boolean e;
    public boolean f;
    public float g;
    public boolean h;
    public d$a i;
    public PublishSubject j;
    public static final int k;

    static {
       d.k = a1.e(56.00f);
    }
    public void d(){
       super();
       this.g = 2.00f;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.f = true;
       d td = this.d;
       if (td != null) {
          td.c();
       }
       td = this.i;
       if (td != null) {
          td.onShow();
          this.i.a();
       }
       return;
    }
    public boolean b(){
       return false;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.f = false;
       d ti = this.i;
       if (ti != null) {
          ti.c();
       }
       return;
    }
    public void d(boolean p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "6")) {
          return;
       }
       this.e = p0;
       if (this.b == null) {
          this.b = new e(this, this.g);
       }
       d ti = this.i;
       if (ti != null && (p1 && (this.f != null && ti.b != null))) {
          Objects.requireNonNull(ti);
          if (!PatchProxy.applyVoid(null, ti, d$a.class, "9")) {
             ti.b = false;
             ViewPropertyAnimator viewProperty = ti.getView().animate().alpha(0).setDuration(300).withEndAction(new d(ti));
             ti.c = viewProperty;
             viewProperty.start();
          }
       }
    label_0069 :
       return;
    }
    public void e(float p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "2")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       if (this.c != null) {
          Object[] objArray = new Object[0];
          b.C().w("GROOT", "SlideViewPagerFooterLoadMore, onTranslationY "+p0, objArray);
          this.c.setContentTranslationY((int)(- p0));
       }
       uod = this.i;
       if (uod != null) {
          uod.e((- p0));
       }
       uod = this.i;
       if (uod != null && uod.b != null) {
          uod.b((- p0));
       }
       return;
    }
    public boolean f(){
       return this.e;
    }
    public void g(float p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "4")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       uod = this.d;
       if (uod != null) {
          uod.b();
       }
       if (this.c != null) {
          Object[] objArray = new Object[0];
          b.C().w("GROOT", "SlideViewPagerFooterLoadMore, onBounceBackStart "+p0, objArray);
          this.c.setContentTranslationY((int)(- p0));
       }
       uod = this.i;
       if (uod != null && uod.b != null) {
          uod.b((- p0));
       }
       return;
    }
    public View getView(){
       return this.c;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       if (this.c != null) {
          int i = 0;
          Object[] objArray = new Object[i];
          b.C().w("GROOT", "SlideViewPagerFooterLoadMore, onBounceBackEnd 0", objArray);
          this.c.setContentTranslationY(i);
       }
       d ti = this.i;
       if (ti != null && ti.b != null) {
          ti.b(0);
          this.i.D();
       }
       return;
    }
    public int i(){
       d$a d;
       d ti = this.i;
       if (ti != null) {
          d = ti.d;
          if (d > null) {
             return d;
          }
       }
       return d.k;
    }
    public void j(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       this.i = new d$a(this, p0);
       return;
    }
    public void setContentView(View p0){
       this.c = p0;
    }
    public void setOnLoadingMoreListener(a$a p0){
       this.d = p0;
    }
}
