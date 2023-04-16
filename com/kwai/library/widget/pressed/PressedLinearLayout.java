package com.kwai.library.widget.pressed.PressedLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class PressedLinearLayout extends LinearLayout	// class@0009ac
{

    public void PressedLinearLayout(Context p0){
       super(p0);
    }
    public void PressedLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PressedLinearLayout(Context p0,AttributeSet p1,int p2){
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
