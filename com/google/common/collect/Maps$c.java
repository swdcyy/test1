package com.google.common.collect.Maps$c;
import qk.r0;
import java.util.Iterator;
import ok.h;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public final class Maps$c extends r0	// class@0004f9
{
    public final h c;

    public void Maps$c(Iterator p0,h p1){
       this.c = p1;
       super(p0);
    }
    public Object a(Object p0){
       return Maps.k(p0, this.c.apply(p0));
    }
}
