package com.yxcorp.gifshow.widget.HaloSweepingImageView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.HaloSweepingImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.content.res.Resources;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import android.graphics.Matrix;
import java.lang.Math;
import android.os.SystemClock;

public final class HaloSweepingImageView$a implements Runnable	// class@00185f
{
    public final HaloSweepingImageView b;

    public void HaloSweepingImageView$a(HaloSweepingImageView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       HaloSweepingImageView$a tb1;
       HaloSweepingImageView$a obj;
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HaloSweepingImageView$a.class, "1")) {
          return;
       }
       this.b.setMForceStopRequired(false);
       HaloSweepingImageView$a tb = this.b;
       tb.setLayerType(2, tb.getMPaint());
       if (this.b.getMHaloBitmap() == null) {
          Resources resources = this.b.getResources();
          tb1 = this.b;
          Objects.requireNonNull(tb1);
          obj = PatchProxy.apply(objArray, tb1, HaloSweepingImageView.class, "8");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             i = tb1.L;
             if (i == Integer.MIN_VALUE) {
                i = tb1.getLightBandDrawableId();
             }
          }
          Drawable drawable = resources.getDrawable(i);
          obj = this.b;
          a.o(drawable, "haloDrawable");
          obj.setMHaloBitmap(obj.p0(drawable, this.b.getMHaloRect()));
       }
       Bitmap mHaloBitmap = this.b.getMHaloBitmap();
       if (mHaloBitmap != null) {
          this.b.getMHaloRect().set(0, ((- (float)this.b.getHeight()) * 0x3fc00000), ((float)this.b.getWidth() * this.b.getMHaloBandRatio()), (float)this.b.getHeight());
          this.b.getMHaloMatrix().setScale((this.b.getMHaloRect().width() / (float)mHaloBitmap.getWidth()), (this.b.getMHaloRect().height() / (float)mHaloBitmap.getHeight()), (this.b.getMHaloRect().width() / 2.00f), (this.b.getMHaloRect().height() / 2.00f));
          this.b.getMHaloMatrix().postTranslate(((- Math.abs((this.b.getMHaloRect().width() - (float)mHaloBitmap.getWidth()))) / 2.00f), (Math.abs((this.b.getMHaloRect().height() - (float)this.b.getHeight())) / 2.00f));
          tb1 = this.b;
          this.b.getMHaloMatrix().postRotate(tb1.G, 0, (Math.abs((tb1.getMHaloRect().height() - (float)mHaloBitmap.getHeight())) / 2.00f));
          this.b.getMHaloMatrix().postTranslate(((- this.b.getMHaloRect().width()) / 2.00f), 0);
          this.b.setMSweepingStartTime(SystemClock.uptimeMillis());
          this.b.setMIsSweeping(true);
          obj = this.b;
          obj.setMInitTranslateX(((Math.abs((obj.getMHaloRect().width() - (float)mHaloBitmap.getWidth())) / 2.00f) + (this.b.getMHaloRect().width() / 2.00f)));
          this.b.invalidate();
       }
       return;
    }
}
