package com.yxcorp.gifshow.widget.PressKwaiImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import java.lang.Boolean;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;

public class PressKwaiImageView extends KwaiImageView	// class@00189b
{
    public int x;

    public void PressKwaiImageView(Context p0){
       super(p0);
       this.x = 153;
    }
    public void PressKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x = 153;
    }
    public void PressKwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = 153;
    }
    public void setFadeDuration(int p0){
       if (PatchProxy.isSupport(PressKwaiImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PressKwaiImageView.class, "3")) {
          return;
       }
       this.getHierarchy().x(p0);
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressKwaiImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressKwaiImageView.class, "1")) {
          return;
       }
       if (this.isEnabled()) {
          Drawable drawable = this.getDrawable();
          if (drawable != null) {
             PressKwaiImageView tx = (p0)? this.x: 255;
             drawable.setAlpha(tx);
          }
       }
       super.setPressed(p0);
       return;
    }
    public void setViewAsCircle(boolean p0){
       if (PatchProxy.isSupport(PressKwaiImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressKwaiImageView.class, "2")) {
          return;
       }
       RoundingParams roundingPara = (this.getHierarchy().n() == null)? new RoundingParams(): this.getHierarchy().n();
       roundingPara.q(p0);
       this.getHierarchy().L(roundingPara);
       return;
    }
}
