package com.google.common.reflect.f;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.Map;
import java.lang.Object;

public final class f extends Ordering	// class@001920
{
    public final Comparator b;
    public final Map c;

    public void f(Comparator p0,Map p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public int compare(Object p0,Object p1){
       return this.b.compare(this.c.get(p0), this.c.get(p1));
    }
}
