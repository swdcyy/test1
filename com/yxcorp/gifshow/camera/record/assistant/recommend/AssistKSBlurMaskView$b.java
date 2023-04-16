package com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView$b;
import m0d.a;
import com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import w46.b;
import android.graphics.drawable.BitmapDrawable;
import zsd.u;
import android.graphics.Bitmap;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.animation.ValueAnimator;
import java.lang.Math;
import android.graphics.Rect;
import android.view.View;

public final class AssistKSBlurMaskView$b extends a	// class@001d18
{
    public final WeakReference b;
    public final String c;

    public void AssistKSBlurMaskView$b(AssistKSBlurMaskView p0,String p1){
       a.p(p0, "view");
       a.p(p1, "url");
       super();
       this.b = new WeakReference(p0);
       this.c = p1;
    }
    public void onCompleted(Drawable p0){
       Object[] objArray1;
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistKSBlurMaskView$b.class, "1")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[i];
          a.D().t("KSBlurMaskView", "onCompleted: fetch image failed url="+this.c, objArray);
       }
       BitmapDrawable uBitmapDrawa = p0;
       if (!uBitmapDrawa) {
          objArray1 = new Object[i];
          a.D().t("KSBlurMaskView", "onCompleted: is not a BitmapDrawable "+p0, objArray1);
          return;
       }else {
          AssistKSBlurMaskView uAssistKSBlu = this.b.get();
          if (uAssistKSBlu != null && !u.H1(this.c, ".webp", i, 2, null)) {
             Bitmap bitmap = uBitmapDrawa.getBitmap();
             AssistKSBlurMaskView$b tc = this.c;
             if (!PatchProxy.applyVoidTwoRefs(bitmap, tc, uAssistKSBlu, AssistKSBlurMaskView.class, "3")) {
                Object[] objArray2 = new Object[i];
                a.D().s("KSBlurMaskView", "onFetchImage\(\) called with: bitmap = ["+bitmap+"], "+"url = ["+tc+"] mWaitingForUrl="+uAssistKSBlu.j, objArray2);
                if (bitmap == null || bitmap.isRecycled()) {
                   objArray1 = new Object[i];
                   a.D().t("KSBlurMaskView", "onFetchImage: failed ", objArray1);
                }else if(!TextUtils.equals(uAssistKSBlu.j, tc)){
                   objArray1 = new Object[i];
                   a.D().s("KSBlurMaskView", "onFetchImage: ignore this url is not equal ", objArray1);
                }else {
                   uAssistKSBlu.b = bitmap;
                   uAssistKSBlu.i.cancel();
                   uAssistKSBlu.i.start();
                   AssistKSBlurMaskView c = uAssistKSBlu.c;
                   int i1 = Integer.MAX_VALUE;
                   if (c == null) {
                      i2 = Integer.MAX_VALUE;
                   }else {
                      a.m(c);
                      i2 = c.getWidth();
                   }
                   AssistKSBlurMaskView c1 = uAssistKSBlu.c;
                   if (c1 != null) {
                      a.m(c1);
                      i1 = c1.getHeight();
                   }
                   AssistKSBlurMaskView b = uAssistKSBlu.b;
                   a.m(b);
                   b = uAssistKSBlu.b;
                   a.m(b);
                   uAssistKSBlu.d.set(i, i, Math.min(b.getWidth(), i2), Math.min(b.getHeight(), i1));
                   objArray1 = new Object[i];
                   a.D().s("KSBlurMaskView", "onFetchImage: mBackgroundRect="+uAssistKSBlu.d, objArray1);
                   uAssistKSBlu.invalidate();
                }
             }
          }
          return;
       }
    }
}
