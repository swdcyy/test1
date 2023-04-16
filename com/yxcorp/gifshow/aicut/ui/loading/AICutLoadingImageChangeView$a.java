package com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingImageChangeView$a;
import com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingImageChangeView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public final class AICutLoadingImageChangeView$a	// class@001970
{
    public final FrameLayout a;
    public final FrameLayout b;
    public final ImageView c;
    public final ImageView d;
    public final AICutLoadingImageChangeView e;

    public void AICutLoadingImageChangeView$a(AICutLoadingImageChangeView p0,Context p1){
       a.p(p1, "context");
       this.e = p0;
       super();
       FrameLayout uFrameLayout = new FrameLayout(p1);
       this.a = uFrameLayout;
       FrameLayout uFrameLayout1 = new FrameLayout(p1);
       this.b = uFrameLayout1;
       ImageView imageView = new ImageView(p1);
       this.c = imageView;
       ImageView imageView1 = new ImageView(p1);
       this.d = imageView1;
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(p0.getMImageViewSize(), p0.getMImageViewSize());
       layoutParams.gravity = 17;
       uFrameLayout1.addView(imageView1, layoutParams);
       uFrameLayout1.addView(imageView, new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1, new FrameLayout$LayoutParams(-1, -1));
    }
    public final FrameLayout a(){
       return this.a;
    }
    public final ImageView b(){
       return this.d;
    }
}
