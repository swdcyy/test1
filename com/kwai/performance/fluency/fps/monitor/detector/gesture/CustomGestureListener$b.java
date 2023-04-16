package com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$b;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$EventType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Enum;

public final class CustomGestureListener$b	// class@001073
{
    public final CustomGestureListener$EventType a;
    public final long b;

    public void CustomGestureListener$b(CustomGestureListener$EventType p0,long p1){
       a.p(p0, "type");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final long a(){
       return this.b;
    }
    public final CustomGestureListener$EventType b(){
       return this.a;
    }
    public String toString(){
       return this.a.name()+" - "+this.b;
    }
}
