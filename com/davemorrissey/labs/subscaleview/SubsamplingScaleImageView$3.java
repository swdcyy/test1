package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$3;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import android.view.MotionEvent;
import android.view.View;

public class SubsamplingScaleImageView$3 extends GestureDetector$SimpleOnGestureListener	// class@000fad
{
    public final SubsamplingScaleImageView this$0;

    public void SubsamplingScaleImageView$3(SubsamplingScaleImageView p0){
       this.this$0 = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       this.this$0.performClick();
       return true;
    }
}
