package com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$startAnim$2;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import msd.a;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;

public final class MultiSelectAlbumAssetItemViewBinder$startAnim$2 implements Animator$AnimatorListener	// class@001aef
{
    public final MultiSelectAlbumAssetItemViewBinder a;
    public final a b;
    public final AlbumFragment c;
    public final CompatImageView d;

    public void MultiSelectAlbumAssetItemViewBinder$startAnim$2(MultiSelectAlbumAssetItemViewBinder p0,a p1,AlbumFragment p2,CompatImageView p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectAlbumAssetItemViewBinder$startAnim$2.class, "2")) {
          return;
       }
       this.b.invoke();
       this.a.y(this.c, this.d);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectAlbumAssetItemViewBinder$startAnim$2.class, "1")) {
          return;
       }
       this.b.invoke();
       this.a.y(this.c, this.d);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectAlbumAssetItemViewBinder$startAnim$2.class, "3")) {
          return;
       }
       this.d.setX((float)this.a.m[0]);
       this.d.setY((float)this.a.m[1]);
       return;
    }
}
