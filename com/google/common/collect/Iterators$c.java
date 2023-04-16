package com.google.common.collect.Iterators$c;
import qk.r0;
import java.util.Iterator;
import ok.h;
import java.lang.Object;

public final class Iterators$c extends r0	// class@001810
{
    public final h c;

    public void Iterators$c(Iterator p0,h p1){
       this.c = p1;
       super(p0);
    }
    public Object a(Object p0){
       return this.c.apply(p0);
    }
}
