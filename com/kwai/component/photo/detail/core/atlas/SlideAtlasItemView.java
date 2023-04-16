package com.kwai.component.photo.detail.core.atlas.SlideAtlasItemView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import qrd.l1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import yb.b;
import android.content.res.Resources;
import yb.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.view.View;

public final class SlideAtlasItemView extends FrameLayout	// class@000a19
{
    public final KwaiLoadingView b;
    public final KwaiImageView c;

    public void SlideAtlasItemView(Context p0){
       a.p(p0, "context");
       super(p0);
       KwaiLoadingView kwaiLoadingV = new KwaiLoadingView(p0);
       kwaiLoadingV.setVisibility(8);
       this.b = kwaiLoadingV;
       KwaiImageView kwaiImageVie = new KwaiImageView(p0);
       kwaiImageVie.setId(R.id.autoplay_image_item_image);
       b uob = new b(p0.getResources());
       uob.r(R.color.arg_RES_7f062057);
       uob.m(0);
       kwaiImageVie.setHierarchy(uob.a());
       this.c = kwaiImageVie;
       this.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       this.setBackground(a1.f(R.color.arg_RES_7f0600a6));
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
       layoutParams.gravity = 17;
       this.addView(kwaiLoadingV, layoutParams);
       layoutParams = new FrameLayout$LayoutParams(-1, -2);
       layoutParams.gravity = 17;
       this.addView(kwaiImageVie, layoutParams);
    }
    public final KwaiImageView getImageView(){
       return this.c;
    }
    public final KwaiLoadingView getLoadingView(){
       return this.b;
    }
}
