package com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import android.view.MotionEvent;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;

public class PhotosScaleHelpView$a extends GestureDetector$SimpleOnGestureListener	// class@00094e
{
    public final PhotosScaleHelpView b;

    public void PhotosScaleHelpView$a(PhotosScaleHelpView p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       PhotosScaleHelpView r = this.b.r;
       if (r != null) {
          r.onDoubleTap(p0);
       }
       return super.onDoubleTap(p0);
    }
    public boolean onDown(MotionEvent p0){
       PhotosScaleHelpView r = this.b.r;
       if (r != null) {
          r.onDown(p0);
       }
       return super.onDown(p0);
    }
    public void onLongPress(MotionEvent p0){
       PhotosScaleHelpView r = this.b.r;
       if (r != null) {
          r.onLongPress(p0);
       }
       super.onLongPress(p0);
       return;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       PhotosScaleHelpView r = this.b.r;
       if (r != null) {
          r.onSingleTapConfirmed(p0);
       }
       return super.onSingleTapConfirmed(p0);
    }
    public boolean onSingleTapUp(MotionEvent p0){
       PhotosScaleHelpView r = this.b.r;
       if (r != null) {
          r.onSingleTapUp(p0);
       }
       return super.onSingleTapUp(p0);
    }
}
