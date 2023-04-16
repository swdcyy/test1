package com.contrarywind.view.WheelViewEx;
import com.contrarywind.view.CustomWheelView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.contrarywind.view.WheelView;

public class WheelViewEx extends CustomWheelView	// class@000f84
{

    public void WheelViewEx(Context p0){
       super(p0, null);
    }
    public void WheelViewEx(Context p0,AttributeSet p1){
       super(p0, p1);
       int i = 0;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.k6, i, i);
          i = typedArray.getColor(i, i);
          typedArray.recycle();
       }
       if (i > 0) {
          this.setItemsVisible(i);
       }
       return;
    }
}
