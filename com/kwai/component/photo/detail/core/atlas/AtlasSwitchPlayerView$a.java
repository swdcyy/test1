package com.kwai.component.photo.detail.core.atlas.AtlasSwitchPlayerView$a;
import java.lang.Runnable;
import com.kwai.component.photo.detail.core.atlas.AtlasSwitchPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.ImageFeed;
import java.util.List;
import com.kuaishou.android.model.mix.ImageMeta;
import android.content.Context;
import android.widget.FrameLayout;
import ekd.p0;
import ekd.k1;
import java.util.Collection;
import jd5.g;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import java.util.Objects;
import com.kwai.component.photo.detail.core.atlas.ImageSwitcher;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import jd5.k;
import android.animation.Animator$AnimatorListener;

public class AtlasSwitchPlayerView$a implements Runnable	// class@000a16
{
    public final AtlasSwitchPlayerView b;

    public void AtlasSwitchPlayerView$a(AtlasSwitchPlayerView p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AtlasSwitchPlayerView$a.class, "1")) {
          return;
       }
       AtlasSwitchPlayerView$a tb = this.b;
       if (tb.f != null) {
          AtlasSwitchPlayerView c = tb.c;
          if (c != null && c.mImageModel.getAtlasList() != null) {
             int i = this.b.c.mImageModel.getAtlasList().size();
             int i1 = 1;
             if (i <= i1) {
                return;
             }else if(!p0.C(this.b.getContext())){
                k1.r(this.b.i, 2000);
                return;
             }else {
                AtlasSwitchPlayerView$a tb1 = this.b;
                int i2 = tb1.d + i1;
                tb1.d = i2;
                int i3 = 0;
                if (i2 >= i) {
                   tb1.d = i3;
                }
                g.o(tb1.h, tb1.d, i3, tb1.f);
                tb1 = this.b;
                i2 = tb1.d + i1;
                tb1.e = i2;
                if (i2 >= i) {
                   tb1.e = i3;
                }
                List list = r1.m0(tb1.c, tb1.e);
                ImageMeta$AtlasCoverSize[] uAtlasCoverS = r1.n0(this.b.c);
                if (uAtlasCoverS != null) {
                   AtlasSwitchPlayerView e = this.b.e;
                   if (uAtlasCoverS.length > e) {
                      objArray = uAtlasCoverS[e];
                   }
                }
                tb1 = this.b;
                Objects.requireNonNull(tb1);
                if (!PatchProxy.applyVoidTwoRefs(list, objArray, tb1, ImageSwitcher.class, "4")) {
                   KwaiImageView childAt = tb1.getChildAt(i3);
                   KwaiImageView childAt1 = tb1.getChildAt(i1);
                   float f = 0;
                   if (!childAt1.getAlpha() - f) {
                      f = 0x3f800000;
                   }
                   childAt1.animate().alpha(f).setDuration(300).setInterpolator(new LinearInterpolator()).setListener(new k(tb1, list, childAt1, childAt)).start();
                }
                k1.r(this.b.i, 2000);
                Objects.requireNonNull(this.b);
             }
          }
       }
       return;
    }
}
