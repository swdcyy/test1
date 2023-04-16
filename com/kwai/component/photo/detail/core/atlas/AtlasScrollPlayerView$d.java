package com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$e;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.facebook.drawee.view.DraweeView;

public class AtlasScrollPlayerView$d extends PresenterV2	// class@000a13
{
    public AtlasScrollPlayerView$e p;

    public void AtlasScrollPlayerView$d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, AtlasScrollPlayerView$d.class, "2")) {
          return;
       }
       KwaiImageView kwaiImageVie = this.m8();
       if (!q.f(this.p.b)) {
          kwaiImageVie.P(this.p.b);
       }
       AtlasScrollPlayerView$d tp = this.p;
       if (tp != null) {
          AtlasScrollPlayerView$e a = tp.a;
          if (a != null) {
             ImageMeta$AtlasCoverSize mWidth = a.mWidth;
             ImageMeta$AtlasCoverSize mHeight = a.mHeight;
             int i = 0;
             if (mWidth - i <= 0 || mHeight - i <= 0) {
                kwaiImageVie.setAspectRatio(0x3f800000);
             }else {
                kwaiImageVie.setAspectRatio((mWidth / mHeight));
             }
          }else {
          label_0044 :
             kwaiImageVie.setAspectRatio(0x3f800000);
          }
       }else {
          goto label_0044 ;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AtlasScrollPlayerView$d.class, "1")) {
          return;
       }
       this.p = this.q8(AtlasScrollPlayerView$e.class);
       return;
    }
}
