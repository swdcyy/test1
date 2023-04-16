package com.yxcorp.gifshow.widget.CropImageView;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;
import android.graphics.Matrix;
import com.kwai.robust.PatchProxyResult;

public class CropImageView extends ImageView	// class@00180d
{
    public int b;

    public void CropImageView(Context p0){
       super(p0);
       this.b = 1;
    }
    public void CropImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 1;
    }
    public void CropImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 1;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       float f6;
       int i = 3;
       if (PatchProxy.isSupport(CropImageView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CropImageView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (!PatchProxy.applyVoid(null, this, CropImageView.class, "4") && this.getDrawable() != null) {
          if (this.b == i) {
             this.setScaleType(ImageView$ScaleType.FIT_CENTER);
          }else {
             int i1 = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
             p1 = (this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom();
             p2 = this.getDrawable().getIntrinsicWidth();
             p3 = this.getDrawable().getIntrinsicHeight();
             this.setScaleType(ImageView$ScaleType.MATRIX);
             Matrix matrix = new Matrix();
             float f = (float)i1;
             float f1 = (float)p2;
             float f2 = f / f1;
             float f3 = (float)p3;
             float f4 = f3 * f2;
             CropImageView tb = this.b;
             float f5 = 0;
             if (tb == 2) {
                f4 = f4 - (float)p1;
             label_00a8 :
                f6 = - f4;
             }else if(tb == null){
                f4 = (f4 - (float)p1) / 2.00f;
                goto label_00a8 ;
             }else if(tb == 4){
                if ((p2 * p1) > (i1 * p3)) {
                   f6 = (float)p1 / f3;
                   f = (f - (f1 * f6)) * 0x3f000000;
                   f2 = f6;
                }else {
                   f6 = ((float)p1 - f4) * 0x3f000000;
                }
             }else {
                f = 0;
             }
             f5 = f;
             f6 = 0;
             matrix.setScale(f2, f2);
             matrix.postTranslate(f5, f6);
             this.setImageMatrix(matrix);
          }
       }
       return;
    }
    public void setDisplayType(int p0){
       if (PatchProxy.isSupport(CropImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CropImageView.class, "3")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
    public boolean setFrame(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CropImageView.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CropImageView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.setFrame(p0, p1, p2, p3);
    }
}
