package com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.callercontext.ImageSource;
import java.lang.Integer;
import android.net.Uri;
import ekd.x0;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$a;
import android.content.res.Resources;
import android.widget.ImageView;
import android.util.DisplayMetrics;
import cw9.c;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$c;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;

public final class SelfAdaptiveImageView extends KwaiImageView	// class@001a5d
{
    public SelfAdaptiveImageView$b x;

    public void SelfAdaptiveImageView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void SelfAdaptiveImageView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void SelfAdaptiveImageView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public final void p0(String p0,SelfAdaptiveImageView$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelfAdaptiveImageView.class, "1")) {
          return;
       }
       this.q0(p0, ImageSource.FEED_COVER, p1, 0);
       return;
    }
    public final void q0(String p0,ImageSource p1,SelfAdaptiveImageView$b p2,int p3){
       if (PatchProxy.isSupport(SelfAdaptiveImageView.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, SelfAdaptiveImageView.class, "2")) {
          return;
       }
       a.p(p1, "imageSource");
       Uri uri = x0.f(p0);
       if (uri == null) {
          if (p2 != null) {
             p2.onFail();
          }
          return;
       }else {
          this.x = p2;
          a$a uoa = a.d();
          uoa.b(":ks-components:kwai-slide-base");
          uoa.d(p1);
          a uoa1 = uoa.a();
          a.o(uoa1, "KwaiImageCallerContext.n¡­eSource\)\n        .build\(\)");
          Resources resources = this.getResources();
          a.o(resources, "resources");
          this.I(uri, new SelfAdaptiveImageView$a(c.c(resources).density), new SelfAdaptiveImageView$c(this, p3), uoa1);
          return;
       }
    }
    public final void r0(int p0,int p1){
       if (PatchProxy.isSupport(SelfAdaptiveImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SelfAdaptiveImageView.class, "3")) {
          return;
       }
       if (this.getLayoutParams().width == p0 && this.getLayoutParams().height == p1) {
          return;
       }
       this.getLayoutParams().width = p0;
       p0.height = p1;
       this.requestLayout();
       return;
    }
    public final void s0(){
       this.x = null;
    }
}
