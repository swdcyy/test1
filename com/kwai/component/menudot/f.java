package com.kwai.component.menudot.f;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.reddot.model.RedDot;

public final class f implements Comparator	// class@0009bc
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i;
       if ((v4 = p0.mUpdateTime - p1.mUpdateTime) > 0) {
          i = 1;
       }else if(!v4){
          i = p0.mPriority - p1.mPriority;
       }else {
          i = -1;
       }
       return i;
    }
}
