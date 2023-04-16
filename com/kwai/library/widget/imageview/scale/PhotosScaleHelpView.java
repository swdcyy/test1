package com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$b;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$a;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.view.View;
import tyc.g0;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;

public class PhotosScaleHelpView extends ScaleHelpView	// class@000952
{
    public Context q;
    public PhotosScaleHelpView$c r;
    public View s;
    public final g0 t;

    public void PhotosScaleHelpView(Context p0){
       super(p0, null, 0);
    }
    public void PhotosScaleHelpView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PhotosScaleHelpView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.t = new PhotosScaleHelpView$b(this, this.q, new PhotosScaleHelpView$a(this), new Handler(Looper.getMainLooper()));
       this.q = p0;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       PhotosScaleHelpView ts;
       if (!this.isEnabled()) {
          ts = this.s;
          if (ts != null) {
             ts.dispatchTouchEvent(p0);
          }
          return super.dispatchTouchEvent(p0);
       }else if(this.d == null){
          ts = this.s;
          if (ts != null) {
             ts.dispatchTouchEvent(p0);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (!this.isEnabled()) {
          return false;
       }
       this.t.onTouchEvent(p0);
       return super.onTouchEvent(p0);
    }
    public void setLongPressTimeOut(long p0){
       this.t.b(p0);
    }
    public void setSpecialView(View p0){
       this.s = p0;
    }
    public void setVerticalPhotosScaleHelper(PhotosScaleHelpView$c p0){
       this.r = p0;
    }
}
