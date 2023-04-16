package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;

public final class VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a extends AnimatorListenerAdapter	// class@001bd4
{
    public final VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2 a;

    public void VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a(VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a.class, "2")) {
          return;
       }
       VerticalAtlasExpandPresenter g = this.a.this$0.G;
       if (g != null) {
          g.setEnabled(true);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a.class, "1")) {
          return;
       }
       VerticalAtlasExpandPresenter i = this.a.this$0.I;
       if (i != null) {
          i.setVisibility(8);
       }
       i = this.a.this$0.G;
       boolean b = true;
       if (i != null) {
          i.setEnabled(b);
       }
       VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2 this$0 = this.a.this$0;
       this$0.W = b;
       this$0.X = false;
       i = this$0.I;
       if (i != null) {
          i.setBackground(null);
       }
       return;
    }
}
