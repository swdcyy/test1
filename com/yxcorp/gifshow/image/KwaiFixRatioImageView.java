package com.yxcorp.gifshow.image.KwaiFixRatioImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.facebook.drawee.view.DraweeView;
import android.widget.ImageView;
import android.view.View$MeasureSpec;
import ll8.c$b;
import android.content.res.TypedArray;

public class KwaiFixRatioImageView extends KwaiImageView	// class@001945
{
    public boolean x;
    public float y;

    public void KwaiFixRatioImageView(Context p0){
       super(p0);
       this.x = true;
       this.y = 0x3f800000;
       this.r(p0, null);
    }
    public void KwaiFixRatioImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x = true;
       this.y = 0x3f800000;
       this.r(p0, p1);
    }
    public void KwaiFixRatioImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = true;
       this.y = 0x3f800000;
       this.r(p0, p1);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KwaiFixRatioImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiFixRatioImageView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.x != null) {
          p1 = View$MeasureSpec.makeMeasureSpec((int)((float)this.getMeasuredWidth() / this.y), 0x40000000);
       }else {
          p0 = View$MeasureSpec.makeMeasureSpec((int)((float)this.getMeasuredHeight() * this.y), 0x40000000);
       }
       super.onMeasure(p0, p1);
       return;
    }
    public final void r(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiFixRatioImageView.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.K1);
          int i = 0;
          if (!typedArray.getInt(i, i)) {
             i = true;
          }
          this.x = i;
          this.y = typedArray.getFloat(1, 0x3f800000);
          typedArray.recycle();
       }
       return;
    }
    public void setUseWidth(boolean p0){
       this.x = p0;
    }
}
