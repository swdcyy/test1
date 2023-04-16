package com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$startAnim$1;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import msd.a;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public final class MultiSelectSelectedItemViewBinder$startAnim$1 implements Animation$AnimationListener	// class@001af8
{
    public final MultiSelectSelectedItemViewBinder b;
    public final a c;

    public void MultiSelectSelectedItemViewBinder$startAnim$1(MultiSelectSelectedItemViewBinder p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectSelectedItemViewBinder$startAnim$1.class, "1")) {
          return;
       }
       CompatImageView uCompatImage = this.b.n();
       if (uCompatImage != null) {
          uCompatImage.setVisibility(8);
       }
       TextView textView = this.b.l();
       if (textView != null) {
          textView.setVisibility(8);
       }
       View view = this.b.k();
       if (view != null) {
          view.setVisibility(8);
       }
       this.c.invoke();
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
