package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import android.widget.FrameLayout;

public final class VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2$a extends AnimatorListenerAdapter	// class@001bd6
{
    public final VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2 a;

    public void VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2$a(VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2$a.class, "1")) {
          return;
       }
       VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2 this$0 = this.a.this$0;
       if (this$0.V != null) {
          this$0.h9(this$0.V0);
       }
       this$0 = this.a.this$0;
       VerticalAtlasExpandPresenter r = this$0.R;
       VerticalAtlasExpandPresenter v0 = this$0.V0;
       if (r < v0) {
          this$0.h9((v0 - r));
       }
       this$0 = this.a.this$0;
       this$0.X = true;
       VerticalAtlasExpandPresenter i = this$0.I;
       if (i != null) {
          i.setBackgroundColor(R.color.arg_RES_7f060182);
       }
       return;
    }
}
