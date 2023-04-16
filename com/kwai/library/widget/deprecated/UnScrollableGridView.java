package com.kwai.library.widget.deprecated.UnScrollableGridView;
import android.widget.GridView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;

public class UnScrollableGridView extends GridView	// class@00091e
{

    public void UnScrollableGridView(Context p0){
       super(p0);
    }
    public void UnScrollableGridView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void UnScrollableGridView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(0x1fffffff, Integer.MIN_VALUE));
    }
}
