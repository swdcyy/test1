package com.yxcorp.gifshow.debugview.UntouchableRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class UntouchableRecyclerView extends RecyclerView	// class@0012a6
{

    public void UntouchableRecyclerView(Context p0){
       super(p0);
    }
    public void UntouchableRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void UntouchableRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
}
