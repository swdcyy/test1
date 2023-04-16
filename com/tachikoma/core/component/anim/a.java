package com.tachikoma.core.component.anim.a;
import java.util.Comparator;
import java.lang.Object;
import android.animation.Keyframe;

public final class a implements Comparator	// class@000d61
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (int)((p0.getFraction() * 10.00f) - (p1.getFraction() * 10.00f));
    }
}
