package com.kwai.library.widget.pressed.PressedFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class PressedFrameLayout extends FrameLayout	// class@0009aa
{

    public void PressedFrameLayout(Context p0){
       super(p0);
    }
    public void PressedFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PressedFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setPressed(boolean p0){
       super.setPressed(p0);
       for (int i = 0; i < this.getChildCount(); i = i + 1) {
          View childAt = this.getChildAt(i);
          float f = (p0)? 0x3f000000: 0x3f800000;
          childAt.setAlpha(f);
       }
       return;
    }
}
