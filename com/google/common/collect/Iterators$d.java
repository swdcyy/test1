package com.google.common.collect.Iterators$d;
import qk.a;
import java.lang.Object;

public final class Iterators$d extends a	// class@001811
{
    public final Object[] d;
    public final int e;
    public static final u0 f;

    static {
       Object[] objArray = new Object[0];
       Iterators$d.f = new Iterators$d(objArray, 0, 0, 0);
    }
    public void Iterators$d(Object[] p0,int p1,int p2,int p3){
       super(p2, p3);
       this.d = p0;
       this.e = p1;
    }
    public Object a(int p0){
       return this.d[(this.e + p0)];
    }
}
