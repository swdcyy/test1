package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;

public final class HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2$a extends AnimatorListenerAdapter	// class@001bb9
{
    public final HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2 a;

    public void HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2$a(HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2$a.class, "1")) {
          return;
       }
       HorizontalAtlasExpandPresenterV4 w = this.a.this$0.w;
       if (w != null) {
          w.setVisibility(8);
       }
       w = this.a.this$0.F;
       if (w != null) {
          int currentItem = w.getCurrentItem();
          HorizontalAtlasExpandPresenterV4 b = this.a.this$0.B;
          if (b != null) {
             b.setCurrentItem(currentItem);
          }
       }
       return;
    }
}
