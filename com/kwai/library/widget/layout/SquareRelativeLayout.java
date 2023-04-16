package com.kwai.library.widget.layout.SquareRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;

public class SquareRelativeLayout extends RelativeLayout	// class@000960
{

    public void SquareRelativeLayout(Context p0){
       super(p0);
    }
    public void SquareRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SquareRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p0);
    }
}
