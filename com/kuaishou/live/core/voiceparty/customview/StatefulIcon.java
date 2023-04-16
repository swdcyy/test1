package com.kuaishou.live.core.voiceparty.customview.StatefulIcon;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.core.graphics.drawable.a;

public class StatefulIcon extends ImageView	// class@0014c1
{

    public void StatefulIcon(Context p0){
       super(p0, null);
    }
    public void StatefulIcon(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void StatefulIcon(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.t5);
       Drawable drawable = typedArray.getDrawable(1);
       ColorStateList colorStateLi = typedArray.getColorStateList(0);
       if (drawable != null && colorStateLi != null) {
          drawable = a.r(drawable);
          a.o(drawable, colorStateLi);
       }
       if (drawable != null) {
          this.setImageDrawable(drawable);
       }
       typedArray.recycle();
       return;
    }
}
