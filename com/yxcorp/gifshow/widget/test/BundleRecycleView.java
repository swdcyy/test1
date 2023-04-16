package com.yxcorp.gifshow.widget.test.BundleRecycleView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class BundleRecycleView extends RecyclerView	// class@0019c9
{

    public void BundleRecycleView(Context p0){
       super(p0);
    }
    public void BundleRecycleView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void BundleRecycleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
}
