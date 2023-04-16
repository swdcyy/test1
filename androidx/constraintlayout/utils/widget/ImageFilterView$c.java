package androidx.constraintlayout.utils.widget.ImageFilterView$c;
import java.lang.Object;
import android.graphics.ColorMatrix;
import android.widget.ImageView;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;
import java.lang.Math;

public class ImageFilterView$c	// class@0006aa
{
    public float[] a;
    public ColorMatrix b;
    public ColorMatrix c;
    public float d;
    public float e;
    public float f;
    public float g;

    public void ImageFilterView$c(){
       super();
       float[] uofloatArray = new float[20];
       this.a = uofloatArray;
       this.b = new ColorMatrix();
       this.c = new ColorMatrix();
       this.d = 0x3f800000;
       this.e = 0x3f800000;
       this.f = 0x3f800000;
       this.g = 0x3f800000;
    }
    public final void a(float p0){
       ImageFilterView$c ta = this.a;
       ta[0] = p0;
       ta[1] = 0;
       ta[2] = 0;
       ta[3] = 0;
       ta[4] = 0;
       ta[5] = 0;
       ta[6] = p0;
       ta[7] = 0;
       ta[8] = 0;
       ta[9] = 0;
       ta[10] = 0;
       ta[11] = 0;
       ta[12] = p0;
       ta[13] = 0;
       ta[14] = 0;
       ta[15] = 0;
       ta[16] = 0;
       ta[17] = 0;
       ta[18] = 0x3f800000;
       ta[19] = 0;
    }
    public final void b(float p0){
       float f = 0x3f800000 - p0;
       float f1 = 0.30f * f;
       float f2 = 0x3f1645a2 * f;
       f = f * 0.11f;
       ImageFilterView$c ta = this.a;
       ta[0] = f1 + p0;
       ta[1] = f2;
       ta[2] = f;
       ta[3] = 0;
       ta[4] = 0;
       ta[5] = f1;
       ta[6] = f2 + p0;
       ta[7] = f;
       ta[8] = 0;
       ta[9] = 0;
       ta[10] = f1;
       ta[11] = f2;
       ta[12] = f + p0;
       ta[13] = 0;
       ta[14] = 0;
       ta[15] = 0;
       ta[16] = 0;
       ta[17] = 0;
       ta[18] = 0x3f800000;
       ta[19] = 0;
    }
    public void c(ImageView p0){
       this.b.reset();
       ImageFilterView$c te = this.e;
       ImageFilterView$c uoc = 1;
       float f = 0x3f800000;
       if (te - f) {
          this.b(te);
          this.b.set(this.a);
          te = 1;
       }else {
          te = null;
       }
       ImageFilterView$c tf = this.f;
       if (tf - f) {
          this.c.setScale(tf, tf, tf, f);
          this.b.postConcat(this.c);
          te = 1;
       }
       tf = this.g;
       if (tf - f) {
          this.d(tf);
          this.c.set(this.a);
          this.b.postConcat(this.c);
          te = 1;
       }
       tf = this.d;
       if (tf - f) {
          this.a(tf);
          this.c.set(this.a);
          this.b.postConcat(this.c);
       }else {
          uoc = te;
       }
       if (uoc != null) {
          p0.setColorFilter(new ColorMatrixColorFilter(this.b));
       }else {
          p0.clearColorFilter();
       }
       return;
    }
    public final void d(float p0){
       float f2;
       float f3;
       if (p0 <= 0) {
          p0 = 0.01f;
       }
       float f = (5000.00f / p0) / 100.00f;
       p0 = 161.12f;
       float f1 = 0x42c6f10d;
       int i = 0x42840000;
       if (f - i > 0) {
          double d = (double)(f - 60.00f);
          f2 = (float)Math.pow(d, 0xbfc10cda80000000) * 329.70f;
          f3 = (float)Math.pow(d, 0x3fb354f0e0000000) * 0x43900fa3;
       }else {
          f3 = ((float)Math.log((double)f) * f1) - p0;
          f2 = 0x437f0000;
       }
       float f4 = 305.04f;
       if (f - i < 0) {
          f = (f - 0x41980000 > 0)? ((float)Math.log((double)(f - 10.00f)) * 138.52f) - f4: 0;
       }else {
          f = 0x437f0000;
       }
       ImageFilterView$c ta = this.a;
       ta[0] = Math.min(0x437f0000, Math.max(f2, 0)) / Math.min(0x437f0000, Math.max(0x437f0000, 0));
       ta[1] = 0;
       ta[2] = 0;
       ta[3] = 0;
       ta[4] = 0;
       ta[5] = 0;
       ta[6] = Math.min(0x437f0000, Math.max(f3, 0)) / Math.min(0x437f0000, Math.max((((float)Math.log((double)50.00f) * f1) - p0), 0));
       ta[7] = 0;
       ta[8] = 0;
       ta[9] = 0;
       ta[10] = 0;
       ta[11] = 0;
       ta[12] = Math.min(0x437f0000, Math.max(f, 0)) / Math.min(0x437f0000, Math.max((((float)Math.log((double)40.00f) * 138.52f) - f4), 0));
       ta[13] = 0;
       ta[14] = 0;
       ta[15] = 0;
       ta[16] = 0;
       ta[17] = 0;
       ta[18] = 0x3f800000;
       ta[19] = 0;
       return;
    }
}
