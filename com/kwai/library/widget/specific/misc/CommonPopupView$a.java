package com.kwai.library.widget.specific.misc.CommonPopupView$a;
import android.view.animation.Interpolator;
import java.lang.Object;

public final class CommonPopupView$a implements Interpolator	// class@000a08
{

    public void CommonPopupView$a(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
