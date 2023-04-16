package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$h$a;
import p79.k;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.Button;
import o79.i;

public final class AlbumSelectedContainer$h$a extends k	// class@001a9e
{
    public final AlbumSelectedContainer$h a;

    public void AlbumSelectedContainer$h$a(AlbumSelectedContainer$h p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$h$a.class, "1")) {
          return;
       }
       View view = this.a.a.E();
       Animator$AnimatorListener uAnimatorLis = null;
       if (view != null) {
          ViewPropertyAnimator viewProperty = view.animate();
          if (viewProperty != null) {
             viewProperty.setListener(uAnimatorLis);
          }
       }
       view = this.a.a.E();
       ViewGroup$LayoutParams layoutParams = (view != null)? view.getLayoutParams(): uAnimatorLis;
       if (layoutParams != null) {
          layoutParams.width = -1;
       }
       View view1 = this.a.a.E();
       if (view1 != null) {
          view1.setLayoutParams(layoutParams);
       }
       Button uButton = this.a.a.A();
       if (uButton != null) {
          uAnimatorLis = uButton.getLayoutParams();
       }
       if (uAnimatorLis != null) {
          uAnimatorLis.height = i.d(39.00f);
       }
       uButton = this.a.a.A();
       if (uButton != null) {
          uButton.setLayoutParams(uAnimatorLis);
       }
       return;
    }
}
