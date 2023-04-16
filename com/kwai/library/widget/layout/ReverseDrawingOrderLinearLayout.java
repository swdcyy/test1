package com.kwai.library.widget.layout.ReverseDrawingOrderLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;

public class ReverseDrawingOrderLinearLayout extends LinearLayout	// class@00095b
{

    public void ReverseDrawingOrderLinearLayout(Context p0){
       super(p0, null);
    }
    public void ReverseDrawingOrderLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ReverseDrawingOrderLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setChildrenDrawingOrderEnabled(true);
    }
    public int getChildDrawingOrder(int p0,int p1){
       p0--;
       return (p0 - p1);
    }
}
