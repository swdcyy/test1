package com.kwai.performance.stability.crash.monitor.util.d;
import java.util.Comparator;
import java.lang.Object;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.util.e;
import kotlin.jvm.internal.a;

public final class d implements Comparator	// class@000e44
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final int compare(Object p0,Object p1){
       a.p(p0, "obj");
       a.m(p1);
       return p0.compareTo(p1);
    }
}
