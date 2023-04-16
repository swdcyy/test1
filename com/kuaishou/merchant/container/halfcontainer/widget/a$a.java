package com.kuaishou.merchant.container.halfcontainer.widget.a$a;
import android.view.animation.Interpolator;
import java.lang.Object;

public class a$a implements Interpolator	// class@00163b
{

    public void a$a(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
