package gd2.a;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.graphics.Matrix;
import android.view.View;

public final class a extends Animation implements Animation$AnimationListener	// class@002b03
{
    public final ImageView b;
    public final CropOverlayView c;
    public final float[] d;
    public final float[] e;
    public final RectF f;
    public final RectF g;
    public final float[] h;
    public final float[] i;
    public final RectF j;
    public final float[] k;
    public final float[] l;

    public void a(ImageView p0,CropOverlayView p1){
       super();
       float[] uofloatArray = new float[8];
       this.d = uofloatArray;
       uofloatArray = new float[8];
       this.e = uofloatArray;
       this.f = new RectF();
       this.g = new RectF();
       float[] uofloatArray1 = new float[9];
       this.h = uofloatArray1;
       uofloatArray1 = new float[9];
       this.i = uofloatArray1;
       this.j = new RectF();
       float[] uofloatArray2 = new float[8];
       this.k = uofloatArray2;
       uofloatArray2 = new float[9];
       this.l = uofloatArray2;
       this.b = p0;
       this.c = p1;
       this.setDuration(300);
       this.setFillAfter(true);
       this.setInterpolator(new AccelerateDecelerateInterpolator());
       this.setAnimationListener(this);
    }
    public void applyTransformation(float p0,Transformation p1){
       float f1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, a.class, "3")) {
          return;
       }
       a tj = this.j;
       a tf = this.f;
       RectF left = tf.left;
       a tg = this.g;
       tj.left = left + ((tg.left - left) * p0);
       left = tf.top;
       tj.top = left + ((tg.top - left) * p0);
       left = tf.right;
       tj.right = left + ((tg.right - left) * p0);
       RectF bottom = tf.bottom;
       tj.bottom = bottom + ((tg.bottom - bottom) * p0);
       this.c.setCropWindowRect(tj);
       int i = 0;
       int i1 = 0;
       a tk = this.k;
       while (i1 < tk.length) {
          tg = this.d;
          float f = this.e[i1] - tg[i1];
          f = f * p0;
          f1 = tg[i1] + f;
          tk[i1] = f1;
          i1 = i1 + 1;
       }
       this.c.l(tk, this.b.getWidth(), this.b.getHeight());
       tf = this.l;
       while (i < tf.length) {
          tk = this.h;
          f1 = this.i[i] - tk[i];
          f1 = f1 * p0;
          float f2 = tk[i] + f1;
          tf[i] = f2;
          i++;
       }
       Matrix imageMatrix = this.b.getImageMatrix();
       imageMatrix.setValues(this.l);
       this.b.setImageMatrix(imageMatrix);
       this.b.invalidate();
       this.c.invalidate();
       return;
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.b.clearAnimation();
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
