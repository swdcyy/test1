package com.yxcorp.gifshow.photo.download.widget.RatioKwaiImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.facebook.drawee.view.DraweeView;
import android.view.View$MeasureSpec;
import android.widget.ImageView;

public class RatioKwaiImageView extends KwaiImageView	// class@000f3e
{
    public float x;

    public void RatioKwaiImageView(Context p0){
       super(p0);
       this.x = 0xbf800000;
    }
    public void RatioKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x = 0xbf800000;
    }
    public void onMeasure(int p0,int p1){
       float f;
       RatioKwaiImageView tx;
       if (PatchProxy.isSupport(RatioKwaiImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RatioKwaiImageView.class, "1")) {
          return;
       }
       if (this.x <= 0) {
          super.onMeasure(p0, p1);
          return;
       }else if(View$MeasureSpec.getMode(p0) == 0x40000000){
          f = (float)View$MeasureSpec.getSize(p0);
          tx = this.x;
       }else {
          super.onMeasure(p0, p1);
          f = (float)this.getMeasuredWidth();
          tx = this.x;
       }
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec((int)(f * tx), 0x40000000));
       return;
    }
    public void setHeightRatio(float p0){
       this.x = p0;
    }
}
