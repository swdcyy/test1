package androidx.transition.f;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Matrix;
import e3.w;
import android.graphics.RectF;
import java.lang.Math;
import android.widget.ImageView;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.view.ViewGroupOverlay;
import android.graphics.Picture;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.animation.Animator;
import android.animation.AnimatorSet;

public class f	// class@0009f8
{
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
       boolean b = true;
       f.a = b;
       f.b = b;
       if (Build$VERSION.SDK_INT >= 28) {
       }else {
          b = false;
       }
       f.c = b;
    }
    public static View a(ViewGroup p0,View p1,View p2){
       Matrix matrix = new Matrix();
       matrix.setTranslate((float)(- p2.getScrollX()), (float)(- p2.getScrollY()));
       w.k(p1, matrix);
       w.l(p0, matrix);
       RectF rectF = new RectF(0, 0, (float)p1.getWidth(), (float)p1.getHeight());
       matrix.mapRect(rectF);
       int i = Math.round(rectF.left);
       int i1 = Math.round(rectF.top);
       int i2 = Math.round(rectF.right);
       int i3 = Math.round(rectF.bottom);
       ImageView imageView = new ImageView(p1.getContext());
       imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
       Bitmap uBitmap = f.b(p1, matrix, rectF, p0);
       if (uBitmap != null) {
          imageView.setImageBitmap(uBitmap);
       }
       imageView.measure(View$MeasureSpec.makeMeasureSpec((i2 - i), 0x40000000), View$MeasureSpec.makeMeasureSpec((i3 - i1), 0x40000000));
       imageView.layout(i, i1, i2, i3);
       return imageView;
    }
    public static Bitmap b(View p0,Matrix p1,RectF p2,ViewGroup p3){
       int i;
       int b;
       ViewGroup parent;
       float f;
       if (f.a) {
          i = p0.isAttachedToWindow() ^ 0x01;
          if (p3 != null) {
             b = p3.isAttachedToWindow();
          label_0015 :
             boolean b1 = f.b;
             Bitmap uBitmap = null;
             if (b1 && i) {
                if (!b) {
                   return uBitmap;
                }else {
                   parent = p0.getParent();
                   b = parent.indexOfChild(p0);
                   p3.getOverlay().add(p0);
                }
             }else {
                parent = uBitmap;
                b = 0;
             }
             int i1 = Math.round(p2.width());
             int i2 = Math.round(p2.height());
             if (i1 > 0 && i2 > 0) {
                f = Math.min(0x3f800000, (1048576.00f / (float)(i1 * i2)));
                i1 = Math.round(((float)i1 * f));
                i2 = Math.round(((float)i2 * f));
                p1.postTranslate((- p2.left), (- p2.top));
                p1.postScale(f, f);
                if (f.c) {
                   Picture picture = new Picture();
                   Canvas uCanvas = picture.beginRecording(i1, i2);
                   uCanvas.concat(p1);
                   p0.draw(uCanvas);
                   picture.endRecording();
                   uBitmap = Bitmap.createBitmap(picture);
                }else {
                   uBitmap = Bitmap.createBitmap(i1, i2, Bitmap$Config.ARGB_8888);
                   Canvas uCanvas1 = new Canvas(uBitmap);
                   uCanvas1.concat(p1);
                   p0.draw(uCanvas1);
                }
             }
             if (b1 && i) {
                p3.getOverlay().remove(p0);
                parent.addView(p0, b);
             }
             return uBitmap;
          }
       }else {
          i = 0;
       }
       b = false;
       goto label_0015 ;
    }
    public static Animator c(Animator p0,Animator p1){
       if (p0 == null) {
          return p1;
       }
       if (p1 == null) {
          return p0;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{p0,p1};
       uAnimatorSet.playTogether(uAnimatorArr);
       return uAnimatorSet;
    }
}
