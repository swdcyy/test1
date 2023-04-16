package com.yxcorp.gifshow.camerasdk.videosourcelayout.b;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.a;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$Type;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.b$a;
import java.lang.Enum;
import android.graphics.RectF;
import com.kwai.camerasdk.models.DisplayLayout;

public class b extends a	// class@001055
{
    public boolean j;
    public boolean k;

    public void b(VideoSourceLayoutFactory$Type p0,int p1,int p2,int p3,int p4,int p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public void a(){
       a ti;
       RectF rectF2;
       a ti1;
       RectF rectF3;
       boolean i2;
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       RectF rectF = 4;
       a uoa = 3;
       RectF rectF1 = 2;
       int i = 0;
       int i1 = 180;
       float f = Float.MIN_VALUE;
       if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          i2 = b$a.a[this.a.ordinal()];
          if (i2 != f) {
             if (i2 != rectF1) {
                if (i2 != uoa) {
                   if (i2 == rectF) {
                      ti1 = this.f;
                      b = (ti1 % 180)? true: false;
                      this.j = b;
                      i2 = (ti1 == 90 || ti1 == i1)? true: false;
                      this.k = i2;
                   }
                }else {
                   ti1 = this.f;
                   b = (ti1 % 180)? true: false;
                   this.j = b;
                   i2 = (ti1 == null || ti1 == 270)? true: false;
                   this.k = i2;
                }
             }else {
                ti1 = this.f;
                b = (!(ti1 % 180))? true: false;
                this.j = b;
                i2 = (ti1 >= i1)? true: false;
                this.k = i2;
             }
          }else {
             ti1 = this.f;
             b = (!(ti1 % 180))? true: false;
             this.j = b;
             i2 = (ti1 < i1)? true: false;
             this.k = i2;
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          i2 = b$a.a[this.a.ordinal()];
          if (i2 != f && i2 != rectF1) {
             if (i2 == uoa || i2 == rectF) {
                if (!(this.f % i1)) {
                   i2 = (this.b * this.e) / this.d;
                label_00d9 :
                   i = i2 * 2;
                }else {
                   i = ((this.b / rectF1) * this.d) / this.e;
                }
             }
          }else if(!(this.f % i1)){
             i = ((this.b / rectF1) * this.e) / this.d;
          }else {
             i2 = (this.b * this.d) / this.e;
             goto label_00d9 ;
          }
          ti1 = this.c;
          float f1 = 0x3f800000;
          float f2 = 0;
          if (i > ti1) {
             int i3 = (this.b * ti1) / i;
             a tb = this.b;
             f = (float)tb;
             this.i = new RectF((((float)(tb - i3) / 2.00f) / f), f2, (((float)(i3 + tb) / 2.00f) / f), f1);
          }else {
             a tc = this.c;
             f = (float)tc;
             this.i = new RectF(f2, (((float)(tc - i) / 2.00f) / f), f1, (((float)(i + tc) / 2.00f) / f));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          if (this.j != null) {
             ti = this.i;
             RectF left = ti.left;
             rectF2 = new RectF(left, ti.top, ((ti.width() / 2.00f) + left), this.i.bottom);
             ti1 = this.i;
             ti1 = this.i;
             rectF3 = new RectF((ti1.left + (ti1.width() / 2.00f)), ti1.top, ti1.right, ti1.bottom);
          }else {
             ti = this.i;
             rectF = ti.top;
             rectF2 = new RectF(ti.left, rectF, ti.right, ((ti.height() / 2.00f) + rectF));
             ti1 = this.i;
             ti1 = this.i;
             rectF3 = new RectF(ti1.left, (ti1.top + (ti1.height() / 2.00f)), ti1.right, ti1.bottom);
          }
          b tk = this.k;
          rectF = (tk != null)? rectF2: rectF3;
          this.h = rectF;
          if (tk != null) {
             rectF2 = rectF3;
          }
          this.g = rectF2;
       }
       return;
    }
    public DisplayLayout b(){
       return DisplayLayout.CENTER;
    }
}
