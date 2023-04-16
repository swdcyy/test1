package com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView;
import android.view.View;
import com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView$a;
import nsd.u;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;
import android.animation.ValueAnimator;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView$d;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import vb5.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class AssistKSBlurMaskView extends View	// class@001d1b
{
    public Bitmap b;
    public Bitmap c;
    public final Rect d;
    public final Rect e;
    public final Paint f;
    public final Paint g;
    public final ValueAnimator h;
    public final ValueAnimator i;
    public String j;
    public static final AssistKSBlurMaskView$a k;

    static {
       AssistKSBlurMaskView.k = new AssistKSBlurMaskView$a(null);
    }
    public void AssistKSBlurMaskView(Context p0){
       super(p0);
       this.d = new Rect();
       this.e = new Rect();
       this.f = new Paint();
       this.g = new Paint();
       this.h = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       this.i = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.a();
    }
    public void AssistKSBlurMaskView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new Rect();
       this.e = new Rect();
       this.f = new Paint();
       this.g = new Paint();
       this.h = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       this.i = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.a();
    }
    public void AssistKSBlurMaskView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new Rect();
       this.e = new Rect();
       this.f = new Paint();
       this.g = new Paint();
       this.h = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       this.i = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, AssistKSBlurMaskView.class, "1")) {
          return;
       }
       this.f.setAlpha(255);
       this.g.setAlpha(255);
       AssistKSBlurMaskView th = this.h;
       a.o(th, "mFadeOutAnimator");
       long l = (long)300;
       th.setDuration(l);
       th = this.i;
       a.o(th, "mFadeInAnimator");
       th.setDuration(l);
       this.i.addUpdateListener(new AssistKSBlurMaskView$c(this));
       this.h.addUpdateListener(new AssistKSBlurMaskView$d(this));
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistKSBlurMaskView.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       int i = 0;
       this.e.set(i, i, this.getWidth(), this.getHeight());
       AssistKSBlurMaskView tc = this.c;
       if (tc != null) {
          a.m(tc);
          p0.drawBitmap(tc, this.d, this.e, this.g);
       }
       tc = this.b;
       if (tc != null && (a.g(tc, this.c) ^ 0x01)) {
          Object[] objArray = new Object[i];
          a.D().y("KSBlurMaskView", "onDraw:mViewRect="+this.e+" mBackgroundRect="+this.d, objArray);
          tc = this.b;
          a.m(tc);
          p0.drawBitmap(tc, this.d, this.e, this.f);
       }
       return;
    }
    public final void setImageUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistKSBlurMaskView.class, "2")) {
          return;
       }
       a.p(p0, "url");
       Object[] objArray = new Object[0];
       a.D().s("KSBlurMaskView", "setImageUrl\(\) called with: url = ["+p0+']', objArray);
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.c = this.b;
       this.h.cancel();
       this.h.start();
       this.j = p0;
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(w0.f(p0));
       imageRequest.v(new d(90, 160));
       imageRequest.r(new a(50));
       a.d(imageRequest.a(), new AssistKSBlurMaskView$b(this, p0));
       return;
    }
}
