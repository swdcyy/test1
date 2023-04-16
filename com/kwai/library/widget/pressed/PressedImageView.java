package com.kwai.library.widget.pressed.PressedImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class PressedImageView extends AppCompatImageView	// class@0009ab
{

    public void PressedImageView(Context p0){
       super(p0);
    }
    public void PressedImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PressedImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setPressed(boolean p0){
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
