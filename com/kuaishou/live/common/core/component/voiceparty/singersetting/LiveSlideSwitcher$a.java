package com.kuaishou.live.common.core.component.voiceparty.singersetting.LiveSlideSwitcher$a;
import android.animation.TimeInterpolator;
import com.kuaishou.live.common.core.component.voiceparty.singersetting.LiveSlideSwitcher;
import java.lang.Object;

public class LiveSlideSwitcher$a implements TimeInterpolator	// class@0017c1
{
    public final LiveSlideSwitcher a;

    public void LiveSlideSwitcher$a(LiveSlideSwitcher p0){
       this.a = p0;
       super();
    }
    public float getInterpolation(float p0){
       float f = 2.00f;
       float f1 = p0 * f;
       float f2 = 0x3f000000;
       if (p0 - f2 < 0) {
          return (((((f2 * f1) * f1) * f1) * f1) * f1);
       }
       p0 = ((p0 - f2) * f) - 0x3f800000;
       return ((((((f2 * p0) * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
