package com.google.android.material.internal.CheckableImageButton;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.internal.CheckableImageButton$a;
import android.view.View;
import a2.a;
import a2.i0;
import android.widget.ImageView;
import android.widget.ImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable	// class@00169a
{
    public boolean d;
    public static final int[] e;

    static {
       int[] ointArray = new int[]{0x10100a0};
       CheckableImageButton.e = ointArray;
    }
    public void CheckableImageButton(Context p0){
       super(p0, null);
    }
    public void CheckableImageButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04045b);
    }
    public void CheckableImageButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       i0.s0(this, new CheckableImageButton$a(this));
    }
    public boolean isChecked(){
       return this.d;
    }
    public int[] onCreateDrawableState(int p0){
       if (this.d == null) {
          return super.onCreateDrawableState(p0);
       }
       int[] e = CheckableImageButton.e;
       return ImageButton.mergeDrawableStates(super.onCreateDrawableState((p0 + e.length)), e);
    }
    public void setChecked(boolean p0){
       if (this.d != p0) {
          this.d = p0;
          this.refreshDrawableState();
          this.sendAccessibilityEvent(2048);
       }
       return;
    }
    public void toggle(){
       this.setChecked((this.d ^ 0x01));
    }
}
