package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$f;
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
import android.view.ViewGroup$LayoutParams;
import android.widget.Button;
import o79.i;
import android.widget.TextView;
import android.widget.ImageView;

public final class AlbumSelectedContainer$f implements Animator$AnimatorListener	// class@001a9c
{
    public final AlbumSelectedContainer a;

    public void AlbumSelectedContainer$f(AlbumSelectedContainer p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$f.class, "2")) {
          return;
       }
       View view = this.a.s();
       if (view != null) {
          view.setVisibility(8);
       }
       k0 ok0 = AlbumSelectedContainer.g(this.a).s0().f();
       if (ok0 != null) {
          ok0.l(false, false);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$f.class, "1")) {
          return;
       }
       View view = this.a.F();
       if (view != null) {
          view.setVisibility(0);
       }
       if (this.a.O()) {
          view = this.a.E();
          ViewGroup$LayoutParams layoutParams = null;
          ViewGroup$LayoutParams layoutParams1 = (view != null)? view.getLayoutParams(): layoutParams;
          if (layoutParams1 != null) {
             layoutParams1.width = -1;
          }
          View view1 = this.a.E();
          if (view1 != null) {
             view1.setLayoutParams(layoutParams1);
          }
          view = this.a.E();
          if (view != null) {
             view.setVisibility(0);
          }
          Button uButton = this.a.A();
          if (uButton != null) {
             layoutParams = uButton.getLayoutParams();
          }
          if (layoutParams != null) {
             layoutParams.height = i.d(39.00f);
          }
          uButton = this.a.A();
          if (uButton != null) {
             uButton.setLayoutParams(layoutParams);
          }
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
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$f.class, "3")) {
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
       AlbumSelectedContainer$f ta = this.a;
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
       ta = this.a;
       if (ta.O != null) {
          view = ta.I();
          if (view != null) {
             view.setVisibility(0);
          }
       }
       if (this.a.O()) {
          view = this.a.E();
          if (view != null) {
             view.setVisibility(i);
          }
       }
       k0 ok0 = AlbumSelectedContainer.g(this.a).s0().f();
       if (ok0 != null) {
          ok0.l(0, true);
       }
       return;
    }
}
