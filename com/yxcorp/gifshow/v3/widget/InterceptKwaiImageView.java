package com.yxcorp.gifshow.v3.widget.InterceptKwaiImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class InterceptKwaiImageView extends KwaiImageView	// class@00164e
{

    public void InterceptKwaiImageView(Context p0){
       super(p0);
    }
    public void InterceptKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void InterceptKwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       return true;
    }
}
