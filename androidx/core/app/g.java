package androidx.core.app.g;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import java.lang.Math;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.widget.ImageView;
import android.os.Bundle;
import java.lang.String;
import android.widget.ImageView$ScaleType;
import android.content.Context;
import java.util.List;
import androidx.core.app.g$a;
import androidx.core.app.a$f$a;

public abstract class g	// class@000708
{
    public Matrix a;

    public void g(){
       super();
    }
    public static Bitmap a(Drawable p0){
       int intrinsicWid = p0.getIntrinsicWidth();
       int intrinsicHei = p0.getIntrinsicHeight();
       if (intrinsicWid <= 0 || intrinsicHei <= 0) {
          return null;
       }
       float f = 0x3f800000;
       float f1 = Math.min(f, (1048576.00f / (float)(intrinsicWid * intrinsicHei)));
       if (p0 instanceof BitmapDrawable && !f1 - f) {
          return p0.getBitmap();
       }
       intrinsicWid = (int)((float)intrinsicWid * f1);
       intrinsicHei = (int)((float)intrinsicHei * f1);
       Bitmap uBitmap = Bitmap.createBitmap(intrinsicWid, intrinsicHei, Bitmap$Config.ARGB_8888);
       Rect bounds = p0.getBounds();
       p0.setBounds(0, 0, intrinsicWid, intrinsicHei);
       p0.draw(new Canvas(uBitmap));
       p0.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
       return uBitmap;
    }
    public Parcelable b(View p0,Matrix p1,RectF p2){
       if (p0 instanceof ImageView) {
          ImageView imageView = p0;
          Drawable drawable = imageView.getDrawable();
          Drawable background = imageView.getBackground();
          if (drawable != null && background == null) {
             Bitmap uBitmap = g.a(drawable);
             if (uBitmap != null) {
                Bundle uBundle = new Bundle();
                uBundle.putParcelable("sharedElement:snapshot:bitmap", uBitmap);
                uBundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView$ScaleType.MATRIX) {
                   float[] uofloatArray = new float[9];
                   imageView.getImageMatrix().getValues(uofloatArray);
                   uBundle.putFloatArray("sharedElement:snapshot:imageMatrix", uofloatArray);
                }
                return uBundle;
             }
          }
       }
       int i = Math.round(p2.width());
       int i1 = Math.round(p2.height());
       Parcelable parcelable = null;
       if (i > 0 && i1 > 0) {
          float f = Math.min(0x3f800000, (1048576.00f / (float)(i * i1)));
          i = (int)((float)i * f);
          i1 = (int)((float)i1 * f);
          if (this.a == null) {
             this.a = new Matrix();
          }
          this.a.set(p1);
          this.a.postTranslate((- p2.left), (- p2.top));
          this.a.postScale(f, f);
          parcelable = Bitmap.createBitmap(i, i1, Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(parcelable);
          uCanvas.concat(this.a);
          p0.draw(uCanvas);
       }
       return parcelable;
    }
    public View c(Context p0,Parcelable p1){
       View view = null;
       if (p1 instanceof Bundle) {
          Bitmap parcelable = p1.getParcelable("sharedElement:snapshot:bitmap");
          if (parcelable == null) {
             return view;
          }else {
             view = new ImageView(p0);
             view.setImageBitmap(parcelable);
             view.setScaleType(ImageView$ScaleType.valueOf(p1.getString("sharedElement:snapshot:imageScaleType")));
             if (view.getScaleType() == ImageView$ScaleType.MATRIX) {
                Matrix matrix = new Matrix();
                matrix.setValues(p1.getFloatArray("sharedElement:snapshot:imageMatrix"));
                view.setImageMatrix(matrix);
             }
          }
       }else if(p1 instanceof Bitmap){
          view = new ImageView(p0);
          view.setImageBitmap(p1);
       }
       return view;
    }
    public void d(List p0,List p1,g$a p2){
       p2.onSharedElementsReady();
    }
}
