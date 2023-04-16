package com.kwai.feature.api.live.musicstation.a;
import android.view.animation.Interpolator;
import java.lang.Object;
import com.kwai.feature.api.live.musicstation.b;

public final class a implements Interpolator	// class@000fe8
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
