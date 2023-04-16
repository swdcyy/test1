package com.kwai.library.slide.base.widget.d$a;
import bz6.b;
import com.kwai.library.slide.base.widget.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import com.kwai.library.slide.base.widget.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class d$a implements b	// class@0008fb
{
    public final b a;
    public boolean b;
    public ViewPropertyAnimator c;
    public int d;
    public final d e;

    public void d$a(d p0,b p1){
       this.e = p0;
       super();
       this.a = p1;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "7")) {
          return;
       }
       this.b = false;
       this.getView().setVisibility(8);
       this.a.D();
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "3")) {
          return;
       }
       this.a.a();
       return;
    }
    public void b(float p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.getView().setTranslationY(((float)this.e.i() - p0));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "4")) {
          return;
       }
       this.a.c();
       return;
    }
    public void e(float p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.a.e(p0);
       return;
    }
    public View getView(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getView();
    }
    public void onShow(){
       d$a uoa = d$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          return;
       }
       this.b = true;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          d$a tc = this.c;
          if (tc != null) {
             tc.cancel();
          }
          this.c = objArray;
       }
       this.getView().setVisibility(0);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6") && this.d <= null) {
          if (this.getView().getLayoutParams().height > null) {
             this.d = this.getView().getLayoutParams().height;
             this.getView().setTranslationY((float)this.d);
          }else {
             this.getView().getViewTreeObserver().addOnGlobalLayoutListener(new c(this));
          }
       }
       this.a.onShow();
       d j = this.e.j;
       if (j != null) {
          j.onNext(Boolean.TRUE);
       }
       return;
    }
}
