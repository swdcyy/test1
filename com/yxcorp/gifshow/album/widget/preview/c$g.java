package com.yxcorp.gifshow.album.widget.preview.c$g;
import android.view.GestureDetector$OnDoubleTapListener;
import com.yxcorp.gifshow.album.widget.preview.c;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;

public class c$g implements GestureDetector$OnDoubleTapListener	// class@001b32
{
    public final c b;

    public void c$g(c p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c$g.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       c$g tb = this.b;
       if (tb.g == null) {
          return false;
       }
       float maximumScale = tb.f.w().getMaximumScale();
       float minimumScale = this.b.f.w().getMinimumScale();
       if (this.b.f.w().getScale() - maximumScale < 0) {
          this.b.f.w().e(maximumScale, true);
       }else {
          this.b.f.w().e(minimumScale, true);
       }
       return true;
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       return false;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       return true;
    }
}
