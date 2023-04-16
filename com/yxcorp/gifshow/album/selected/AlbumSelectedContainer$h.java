package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$h;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import q79.d;
import r79.a;
import w69.k0;
import android.widget.TextView;
import android.widget.ImageView;
import w69.k;
import p79.c;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import android.view.ViewGroup;
import java.util.List;
import android.view.ViewPropertyAnimator;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$h$a;

public final class AlbumSelectedContainer$h implements Animator$AnimatorListener	// class@001a9f
{
    public final AlbumSelectedContainer a;

    public void AlbumSelectedContainer$h(AlbumSelectedContainer p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$h.class, "2")) {
          return;
       }
       View view = this.a.s();
       if (view != null) {
          view.setVisibility(8);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$h.class, "1")) {
          return;
       }
       View view = this.a.F();
       if (view != null) {
          view.setVisibility(0);
       }
       k0 ok0 = AlbumSelectedContainer.g(this.a).s0().f();
       if (ok0 != null) {
          ok0.l(0, 0);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       TextView textView;
       ViewPropertyAnimator viewProperty;
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$h.class, "3")) {
          return;
       }
       View view = this.a.z();
       if (view != null) {
          view.setVisibility(0);
       }
       view = this.a.s();
       int i = 8;
       if (view != null) {
          view.setVisibility(i);
       }
       AlbumSelectedContainer$h ta = this.a;
       if (ta.I != null) {
          textView = ta.G();
          if (textView != null) {
             textView.setVisibility(0);
          }
       }
       ta = this.a;
       if (ta.J != null) {
          textView = ta.H();
          if (textView != null) {
             textView.setVisibility(0);
          }
          ImageView imageView = this.a.v();
          if (imageView != null) {
             imageView.setVisibility(0);
          }
       }
       float f = 0x3f800000;
       if (AlbumSelectedContainer.g(this.a).s0().m().r()) {
          view = this.a.B();
          int i1 = 300;
          if (view == null || view.getAlpha() - f) {
             c.k(this.a.B(), true, i1, f);
          }
          AlbumSelectRecyclerView uAlbumSelect = this.a.D();
          if (uAlbumSelect == null || uAlbumSelect.getAlpha() - f) {
             c.k(this.a.D(), true, i1, f);
          }
       }
       ta = this.a;
       if (ta.O != null) {
          view = ta.I();
          if (view != null) {
             view.setVisibility(0);
          }
       }
       if (this.a.O()) {
          List list = AlbumSelectedContainer.g(this.a).m();
          if (list != null && !list.size()) {
             this.a.C().setVisibility(i);
          }
       }
       if (this.a.O()) {
          view = this.a.E();
          if (view != null) {
             view.setAlpha(f);
          }
          view = this.a.E();
          if (view != null) {
             view.setVisibility(0);
          }
          view = this.a.E();
          if (view != null) {
             viewProperty = view.animate();
             if (viewProperty != null) {
                viewProperty.setListener(null);
             }
          }
          view = this.a.E();
          if (view != null) {
             viewProperty = view.animate();
             if (viewProperty != null) {
                viewProperty = viewProperty.setDuration(50);
                if (viewProperty != null) {
                   viewProperty = viewProperty.setListener(new AlbumSelectedContainer$h$a(this));
                   if (viewProperty != null) {
                      viewProperty.start();
                   }
                }
             }
          }
       }
    label_011e :
       k0 ok0 = AlbumSelectedContainer.g(this.a).s0().f();
       if (ok0 != null) {
          ok0.l(0, true);
       }
       return;
    }
}
