package com.yxcorp.gifshow.image.KwaiZoomImageView$b;
import ub.a;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import jxa.a;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;

public class KwaiZoomImageView$b extends a	// class@001949
{
    public final KwaiZoomImageView b;

    public void KwaiZoomImageView$b(KwaiZoomImageView p0){
       this.b = p0;
       super();
    }
    public void KwaiZoomImageView$b(KwaiZoomImageView p0,a p1){
       super(p0);
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiZoomImageView$b.class, "1")) {
       }else if(p1 == null){
          p0.y = new RectF();
          this.b.getHierarchy().k(this.b.y);
          KwaiZoomImageView$b tb = this.b;
          tb.z = (tb.y.width() * 0x3f800000) / (float)p1.getWidth();
          this.b.setMaximumScale(Float.MAX_VALUE);
          this.b.setMediumScale(0x7f155555);
          this.b.setMinimumScale(0);
          this.b.d(p1.getWidth(), p1.getHeight());
          tb = this.b;
          if (tb.x != null) {
             float scale = tb.getScale();
             this.b.setMediumScale((0x3fe00000 * scale));
             this.b.setMaximumScale((3.00f * scale));
             this.b.setMinimumScale(scale);
          }
       }
       return;
    }
}
