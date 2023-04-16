package com.yxcorp.gifshow.widget.v;
import java.util.Comparator;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import tyc.a2;

public final class v implements Comparator	// class@0019ef
{
    public static final v b;

    static {
       v.b = new v();
    }
    public void v(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i = -1;
       int i1 = (p0.get() == null)? -1: p0.get().getLevel();
       if (p1.get() != null) {
          i = p1.get().getLevel();
       }
       return (i - i1);
    }
}
