package com.kwai.performance.overhead.battery.monitor.b$b;
import zk.a;
import com.kwai.performance.overhead.battery.monitor.b;
import java.lang.Object;
import java.lang.Class;
import zk.b;
import al.a;
import java.lang.annotation.Annotation;

public class b$b implements a	// class@001136
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public boolean shouldSkipClass(Class p0){
       return false;
    }
    public boolean shouldSkipField(b p0){
       a uoa = p0.a(a.class);
       boolean b = (uoa != null && !uoa.serialize())? true: false;
       return b;
    }
}
