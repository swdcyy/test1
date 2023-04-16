package f79.b;
import android.view.GestureDetector$OnDoubleTapListener;
import f79.a;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.drawee.view.DraweeView;
import f79.d;
import android.graphics.RectF;
import android.view.View;
import f79.g;

public class b implements GestureDetector$OnDoubleTapListener	// class@0022d5
{
    public a b;
    public boolean c;

    public void b(a p0){
       super();
       this.c = true;
       this.b = p0;
    }
    public boolean onDoubleTap(MotionEvent p0){
       boolean b;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj == null || this.c != null) {
          return false;
       }
       b = true;
       try{
          float scale = obj.getScale();
          float x = p0.getX();
          float y = p0.getY();
          if (scale - this.b.getMediumScale() < 0) {
             obj = this.b;
             obj.g(obj.getMediumScale(), x, y, b);
          }else if(scale - this.b.getMediumScale() >= 0 && scale - this.b.getMaximumScale() < 0){
             obj = this.b;
             obj.g(obj.getMaximumScale(), x, y, b);
          }else {
             obj = this.b;
             obj.g(obj.getMinimumScale(), x, y, b);
          }
          return b;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       return false;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       boolean b;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       b = false;
       if (obj == null) {
          return b;
       }
       DraweeView uDraweeView = obj.p();
       if (uDraweeView == null) {
          return b;
       }
       if (this.b.getOnPhotoTapListener() != null) {
          RectF rectF = this.b.m();
          if (rectF != null) {
             float x = p0.getX();
             float y = p0.getY();
             if (rectF.contains(x, y)) {
                this.b.getOnPhotoTapListener().a(uDraweeView, ((x - rectF.left) / rectF.width()), ((y - rectF.top) / rectF.height()));
                return true;
             }
          }
       }
       if (this.b.getOnViewTapListener() != null) {
          this.b.getOnViewTapListener().a(uDraweeView, p0.getX(), p0.getY());
          return true;
       }else {
          return b;
       }
    }
}
