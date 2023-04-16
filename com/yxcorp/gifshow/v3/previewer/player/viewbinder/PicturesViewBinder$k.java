package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$k;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.view.ViewTreeObserver;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class PicturesViewBinder$k implements ViewTreeObserver$OnGlobalLayoutListener	// class@0015f7
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$k(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, PicturesViewBinder$k.class, "1")) {
          return;
       }
       if (this.b.p.getHeight() > 0) {
          this.b.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          ViewGroup$LayoutParams layoutParams = this.b.j.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          layoutParams.height = this.b.j.getHeight() - this.b.p.getHeight();
          layoutParams.gravity = 48;
          this.b.j.setLayoutParams(layoutParams);
          Object[] objArray = new Object[0];
          a.D().w("PicturesViewBinder", "mPictureRecyclerView height = "+layoutParams.height, objArray);
       }
       return;
    }
}
