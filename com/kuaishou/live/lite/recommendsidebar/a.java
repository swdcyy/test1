package com.kuaishou.live.lite.recommendsidebar.a;
import android.view.animation.Interpolator;
import java.lang.Object;
import com.kuaishou.live.lite.recommendsidebar.b;

public final class a implements Interpolator	// class@000ae9
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
