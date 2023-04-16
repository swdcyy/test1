package com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment$e;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Animatable;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment$e$a;
import java.lang.Runnable;
import ekd.k1;

public final class KSFeedListFragment$e extends RecyclerView$r	// class@001ad1
{
    public final KSFeedListFragment a;

    public void KSFeedListFragment$e(KSFeedListFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       KwaiImageView kwaiImageVie;
       Animatable animatable;
       KwaiImageView kwaiImageVie1;
       Animatable animatable1;
       KSFeedListFragment$e uoe = KSFeedListFragment$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          return;
       }
       a.p(p0, "recyclerView");
       int childCount = KSFeedListFragment.Gh(this.a).getChildCount();
       int i = 0;
       if (p1 == 1 && childCount >= 0) {
          int i1 = 0;
          while (true) {
             View childAt = KSFeedListFragment.Gh(this.a).getChildAt(i1);
             if (childAt != null) {
                kwaiImageVie = childAt.findViewById(R.id.ks_template_cover);
             label_0043 :
                if (kwaiImageVie != null) {
                   a controller = kwaiImageVie.getController();
                   if (controller != null) {
                      animatable = controller.getAnimatable();
                   label_0051 :
                      if (animatable != null && animatable.isRunning() == true) {
                         animatable.stop();
                      }
                      if (i1 != childCount) {
                         i1 = i1 + 1;
                      }
                   }
                }
                animatable = null;
                goto label_0051 ;
             }else {
                kwaiImageVie = null;
                goto label_0043 ;
             }
          }
       }
    label_0061 :
       if (!p1 && childCount >= 0) {
          while (true) {
             View childAt1 = KSFeedListFragment.Gh(this.a).getChildAt(i);
             if (childAt1 != null) {
                kwaiImageVie1 = childAt1.findViewById(R.id.ks_template_cover);
             label_0079 :
                if (kwaiImageVie1 != null) {
                   a controller1 = kwaiImageVie1.getController();
                   if (controller1 != null) {
                      animatable1 = controller1.getAnimatable();
                   label_0087 :
                      if (animatable1 != null) {
                         animatable1.start();
                      }
                      if (i != childCount) {
                         i = i + 1;
                      }
                   }
                }
                animatable1 = null;
                goto label_0087 ;
             }else {
                kwaiImageVie1 = null;
                goto label_0079 ;
             }
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(KSFeedListFragment$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KSFeedListFragment$e.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       k1.m(new KSFeedListFragment$e$a(this));
       k1.r(this.a.M, 10);
       return;
    }
}
