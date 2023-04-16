package com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$b;
import tyc.g0;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import android.os.Handler;
import android.view.MotionEvent;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;

public class PhotosScaleHelpView$b extends g0	// class@00094f
{
    public final PhotosScaleHelpView D;

    public void PhotosScaleHelpView$b(PhotosScaleHelpView p0,Context p1,GestureDetector$OnGestureListener p2,Handler p3){
       this.D = p0;
       super(p1, p2, p3);
    }
    public boolean onTouchEvent(MotionEvent p0){
       PhotosScaleHelpView r = this.D.r;
       boolean b = (r == null || (r.onTouchEvent(p0) || super.onTouchEvent(p0)))? true: false;
       return b;
    }
}
