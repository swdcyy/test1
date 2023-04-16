package com.kuaishou.kds.animate.core.c;
import java.util.Comparator;
import java.lang.Object;
import android.animation.Keyframe;
import vh0.k;

public final class c implements Comparator	// class@00079d
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i;
       float f = p0.getFraction() - p1.getFraction();
       if (f > 0) {
          i = 1;
       }else if(f < 0){
          i = -1;
       }else {
          i = 0;
       }
       return i;
    }
}
