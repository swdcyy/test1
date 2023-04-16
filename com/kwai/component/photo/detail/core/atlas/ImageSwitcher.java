package com.kwai.component.photo.detail.core.atlas.ImageSwitcher;
import android.widget.FrameLayout;
import android.content.Context;
import xb.t$b;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import lnc.a1;
import com.facebook.drawee.generic.RoundingParams;
import yb.b;
import android.content.res.Resources;
import yb.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup;
import java.lang.IllegalStateException;

public class ImageSwitcher extends FrameLayout	// class@000a18
{
    public t$b b;

    public void ImageSwitcher(Context p0){
       super(p0);
       this.b = t$b.i;
       this.b(p0);
    }
    public void ImageSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = t$b.i;
       this.b(p0);
    }
    public void ImageSwitcher(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = t$b.i;
       this.b(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageSwitcher.class, "3")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
       KwaiImageView kwaiImageVie = new KwaiImageView(p0);
       kwaiImageVie.setLayoutParams(layoutParams);
       b uob = new b(this.getResources());
       uob.j(t$b.i);
       uob.z(RoundingParams.c((float)a1.e(8.00f)));
       uob.r(R.color.arg_RES_7f062057);
       uob.m(0);
       kwaiImageVie.setHierarchy(uob.a());
       this.addView(kwaiImageVie, layoutParams);
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(ImageSwitcher.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ImageSwitcher.class, "1")) {
          return;
       }
       if (this.getChildCount() >= 2) {
          throw new IllegalStateException("Can\'t add more than 2 views to a ViewSwitcher");
       }
       super.addView(p0, p1, p2);
       return;
    }
    public void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageSwitcher.class, "2")) {
          return;
       }
       this.a(p0);
       this.a(p0);
       return;
    }
}
