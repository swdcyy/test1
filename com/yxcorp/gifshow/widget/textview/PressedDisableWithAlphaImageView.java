package com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaImageView;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import android.view.View$OnClickListener;

public class PressedDisableWithAlphaImageView extends ImageView	// class@0019cf
{
    public int b;
    public int c;
    public View$OnClickListener d;

    public void PressedDisableWithAlphaImageView(Context p0){
       super(p0, null);
    }
    public void PressedDisableWithAlphaImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PressedDisableWithAlphaImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.j4);
       this.b = (int)(typedArray.getFloat(1, 0.40f) * 0x437f0000);
       this.c = (int)(typedArray.getFloat(0, 0.40f) * 0x437f0000);
       typedArray.recycle();
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, PressedDisableWithAlphaImageView.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!this.isEnabled() && (p0.getAction() == 1 && this.d != null)) {
          obj = PatchProxy.applyOneRefs(p0, this, PressedDisableWithAlphaImageView.class, "4");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             float rawX = p0.getRawX();
             float rawY = p0.getRawY();
             int[] ointArray = new int[2];
             this.getLocationOnScreen(ointArray);
             b = (rawX - (float)ointArray[0] >= 0 && (rawX - (float)(ointArray[0] + this.getWidth()) <= 0 && (rawY - (float)ointArray[1] >= 0 && rawY - (float)(ointArray[1] + this.getHeight()) <= 0)))? true: false;
          }
          if (b) {
             this.d.onClick(this);
             return true;
          }
       }
    label_0075 :
       return super.onTouchEvent(p0);
    }
    public void setClickListenerWithoutEnable(View$OnClickListener p0){
       this.d = p0;
    }
    public void setDisableAlpha(float p0){
       this.c = (int)(p0 * 0x437f0000);
    }
    public void setDisableAlpha(int p0){
       this.c = p0;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(PressedDisableWithAlphaImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedDisableWithAlphaImageView.class, "1")) {
          return;
       }
       super.setEnabled(p0);
       int i = (p0)? 255: this.c;
       this.setImageAlpha(i);
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressedDisableWithAlphaImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedDisableWithAlphaImageView.class, "2")) {
          return;
       }
       super.setPressed(p0);
       if (!this.isEnabled()) {
          return;
       }
       PressedDisableWithAlphaImageView tb = (p0)? this.b: 255;
       this.setImageAlpha(tb);
       return;
    }
    public void setPressedAlpha(float p0){
       this.b = (int)(p0 * 0x437f0000);
    }
    public void setPressedAlpha(int p0){
       this.b = p0;
    }
}
