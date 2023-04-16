package com.yxcorp.gifshow.widget.SmartScaleTypeImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.Matrix;
import java.lang.Math;
import xb.t$b;
import ac.b;
import yb.a;

public class SmartScaleTypeImageView extends KwaiImageView	// class@0018c7
{

    public void SmartScaleTypeImageView(Context p0){
       super(p0);
    }
    public void SmartScaleTypeImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SmartScaleTypeImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, SmartScaleTypeImageView.class, "3")) {
          return;
       }
       super.o();
       return;
    }
    public void onDraw(Canvas p0){
       float f1;
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, SmartScaleTypeImageView.class, "2")) {
          return;
       }
       if (this.getDrawable() != null && (this.getDrawable().getIntrinsicWidth() > 0 && (this.getDrawable().getIntrinsicHeight() > 0 && (this.getWidth() > 0 && this.getHeight() > 0)))) {
          int intrinsicWid = this.getDrawable().getIntrinsicWidth();
          int intrinsicHei = this.getDrawable().getIntrinsicHeight();
          int i = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
          int i1 = (this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom();
          float f = 0;
          if ((intrinsicWid * i1) > (i * intrinsicHei)) {
             f1 = (float)i1 / (float)intrinsicHei;
             f = ((float)i - ((float)intrinsicWid * f1)) / 2.00f;
             f2 = 0;
          }else {
             f1 = (float)i / (float)intrinsicWid;
             f2 = ((float)i1 - ((float)intrinsicHei * f1)) / 2.00f;
          }
          if (f1 - 0x3f800000 < 0) {
             this.getImageMatrix().setScale(f1, f1);
             this.getImageMatrix().postTranslate((float)(int)Math.ceil((double)f), (float)(int)Math.ceil((double)f2));
          }else if(intrinsicWid > i || intrinsicHei > i1){
             this.getImageMatrix().setScale(0x3f800000, 0x3f800000);
             this.getImageMatrix().postTranslate((float)(int)Math.ceil((double)((float)(i - intrinsicWid) / 2.00f)), (float)(int)Math.ceil((double)((float)(i1 - intrinsicHei) / 2.00f)));
          }
       }
    label_00c4 :
       super.onDraw(p0);
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, SmartScaleTypeImageView.class, "4")) {
          return;
       }
       super.p();
       return;
    }
    public void p0(t$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SmartScaleTypeImageView.class, "1")) {
          return;
       }
       this.getHierarchy().u(p0);
       return;
    }
}
