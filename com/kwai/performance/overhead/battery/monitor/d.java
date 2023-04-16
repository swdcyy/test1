package com.kwai.performance.overhead.battery.monitor.d;
import java.util.Comparator;
import java.lang.Object;
import bg7.a;
import com.kwai.performance.overhead.battery.monitor.ThreadInfoSampler;
import ag7.j;

public final class d implements Comparator	// class@00113a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final int compare(Object p0,Object p1){
       long l = p1.g - p0.g;
       if (!l) {
          l = p1.f.g - p0.f.g;
       }
       return (int)l;
    }
}
