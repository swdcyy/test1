package com.feature.post.bridge.c1;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Integer;

public final class c1 implements Comparator	// class@001470
{
    public static final c1 b;

    static {
       c1.b = new c1();
    }
    public void c1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return p0.compareTo(p1);
    }
}
