package com.kwai.performance.overhead.battery.monitor.model.b;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.model.StackTree;
import java.lang.Integer;

public final class b implements Comparator	// class@001144
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p1.childCount.intValue() - p0.childCount.intValue());
    }
}
