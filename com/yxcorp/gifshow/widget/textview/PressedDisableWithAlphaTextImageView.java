package com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaTextImageView;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import android.view.View;

public class PressedDisableWithAlphaTextImageView extends TextImageView	// class@0019d0
{
    public int p;
    public int q;

    public void PressedDisableWithAlphaTextImageView(Context p0){
       super(p0, null, 0);
    }
    public void PressedDisableWithAlphaTextImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PressedDisableWithAlphaTextImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.k4);
       this.p = (int)(typedArray.getFloat(1, 0.40f) * 0x437f0000);
       this.q = (int)(typedArray.getFloat(0, 0.40f) * 0x437f0000);
       typedArray.recycle();
    }
    public void setDisableAlpha(float p0){
       this.q = (int)(p0 * 0x437f0000);
    }
    public void setDisableAlpha(int p0){
       this.q = p0;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(PressedDisableWithAlphaTextImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedDisableWithAlphaTextImageView.class, "1")) {
          return;
       }
       super.setEnabled(p0);
       int i = (p0)? 255: this.q;
       this.setImageAlpha(i);
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressedDisableWithAlphaTextImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedDisableWithAlphaTextImageView.class, "2")) {
          return;
       }
       super.setPressed(p0);
       if (!this.isEnabled()) {
          return;
       }
       PressedDisableWithAlphaTextImageView tp = (p0)? this.p: 255;
       this.setImageAlpha(tp);
       return;
    }
    public void setPressedAlpha(float p0){
       this.p = (int)(p0 * 0x437f0000);
    }
    public void setPressedAlpha(int p0){
       this.p = p0;
    }
}
