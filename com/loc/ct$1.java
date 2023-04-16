package com.loc.ct$1;
import java.util.Comparator;
import com.loc.ct;
import java.lang.Object;
import com.loc.dy;

public final class ct$1 implements Comparator	// class@0013cb
{
    public final ct a;

    public void ct$1(ct p0){
       this.a = p0;
       super();
    }
    public static int a(dy p0,dy p1){
       return (p1.c - p0.c);
    }
    public final int compare(Object p0,Object p1){
       return ct$1.a(p0, p1);
    }
}
