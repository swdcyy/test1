package com.kwai.library.widget.pressed.PressedTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class PressedTextView extends AppCompatTextView	// class@0009ae
{

    public void PressedTextView(Context p0){
       super(p0);
    }
    public void PressedTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PressedTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setPressed(boolean p0){
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
