package com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView$a;
import java.lang.Runnable;
import com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.content.res.Resources;
import java.util.Objects;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.RectF;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.lang.Math;
import android.os.SystemClock;

public final class HaloSweepingImageView$a implements Runnable	// class@0015fe
{
    public final HaloSweepingImageView b;

    public void HaloSweepingImageView$a(HaloSweepingImageView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HaloSweepingImageView$a.class, "1")) {
          return;
       }
       HaloSweepingImageView$a tb = this.b;
       tb.setMSweepCount((tb.getMSweepCount() + 1));
       boolean b = false;
       this.b.setMForceStopRequired(b);
       tb = this.b;
       tb.setLayerType(2, tb.getMPaint());
       if (this.b.getMHaloBitmap() == null) {
          Resources resources = this.b.getResources();
          HaloSweepingImageView$a tb1 = this.b;
          Objects.requireNonNull(tb1);
          HaloSweepingImageView obj = PatchProxy.apply(objArray, tb1, HaloSweepingImageView.class, "7");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else {
             obj = tb1.s;
             i = (obj != Integer.MIN_VALUE)? obj: tb1.getLightBandDrawableId();
          }
          Drawable drawable = resources.getDrawable(i);
          Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
          tb1 = this.b;
          Objects.requireNonNull(tb1);
          obj = PatchProxy.applyOneRefs(drawable, tb1, HaloSweepingImageView.class, "6");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else if(tb1.h.width() <= 0 || tb1.h.height() <= 0){
             objArray = Bitmap.createBitmap((int)tb1.h.width(), (int)tb1.h.height(), Bitmap$Config.ARGB_8888);
             drawable.setBounds(b, b, (int)tb1.h.width(), (int)tb1.h.height());
             drawable.draw(new Canvas(objArray));
          }
          tb1.setMHaloBitmap(objArray);
       }
       Bitmap mHaloBitmap = this.b.getMHaloBitmap();
       if (mHaloBitmap != null) {
          this.b.getMHaloRect().set(0, ((- (float)this.b.getHeight()) * 0x3fc00000), ((float)this.b.getWidth() * this.b.getMHaloBandRatio()), (float)this.b.getHeight());
          this.b.getMHaloMatrix().setScale((this.b.getMHaloRect().width() / (float)mHaloBitmap.getWidth()), (this.b.getMHaloRect().height() / (float)mHaloBitmap.getHeight()), (this.b.getMHaloRect().width() / 2.00f), (this.b.getMHaloRect().height() / 2.00f));
          this.b.getMHaloMatrix().postTranslate(((- Math.abs((this.b.getMHaloRect().width() - (float)mHaloBitmap.getWidth()))) / 2.00f), (Math.abs((this.b.getMHaloRect().height() - (float)this.b.getHeight())) / 2.00f));
          HaloSweepingImageView$a tb2 = this.b;
          this.b.getMHaloMatrix().postRotate(tb2.n, 0, (Math.abs((tb2.getMHaloRect().height() - (float)mHaloBitmap.getHeight())) / 2.00f));
          this.b.getMHaloMatrix().postTranslate(((- this.b.getMHaloRect().width()) / 2.00f), 0);
          this.b.setMSweepingStartTime(SystemClock.uptimeMillis());
          this.b.setMIsSweeping(1);
          tb = this.b;
          tb.setMInitTranslateX(((Math.abs((tb.getMHaloRect().width() - (float)mHaloBitmap.getWidth())) / 2.00f) + (this.b.getMHaloRect().width() / 2.00f)));
          this.b.invalidate();
       }
       return;
    }
}
