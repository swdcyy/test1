package com.yxcorp.gifshow.corona.common.utils.ProgressHandleEggView;
import android.widget.RelativeLayout;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.corona.common.utils.ResourceUrlType;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.corona.common.utils.ProgressHandleEggView$a;
import java.lang.Enum;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;

public class ProgressHandleEggView extends RelativeLayout	// class@00126d
{
    public LottieAnimationView b;
    public KwaiImageView c;

    public void ProgressHandleEggView(Context p0){
       super(p0);
    }
    public void a(String p0,ResourceUrlType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProgressHandleEggView.class, "1")) {
          return;
       }
       int i = ProgressHandleEggView$a.a[p1.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i == 2 && this.c == null) {
             KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
             this.c = kwaiImageVie;
             kwaiImageVie.setImageURI(p0);
             this.c.setScaleType(ImageView$ScaleType.FIT_XY);
             this.addView(this.c, new RelativeLayout$LayoutParams(-1, -1));
          }
       }else if(this.b == null){
          LottieAnimationView lottieAnimat = new LottieAnimationView(this.getContext());
          this.b = lottieAnimat;
          lottieAnimat.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
          this.b.setAnimationFromUrl(p0);
          this.b.setRenderMode(RenderMode.HARDWARE);
          this.b.k(b);
          this.b.setRepeatCount(-1);
          this.b.setScaleType(ImageView$ScaleType.CENTER_CROP);
          this.b.s();
          this.addView(this.b);
       }
       return;
    }
}
