package com.yxcorp.gifshow.camera.record.widget.i$a;
import android.view.animation.Interpolator;
import java.lang.Object;

public class i$a implements Interpolator	// class@000feb
{

    public void i$a(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
