package com.kwai.performance.fluency.fps.monitor.detector.gesture.FrameGestureDetector$getFrameCount$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import ve7.a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class FrameGestureDetector$getFrameCount$1 extends Lambda implements l	// class@001078
{
    public final a $g;

    public void FrameGestureDetector$getFrameCount$1(a p0){
       this.$g = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Long p0){
       a.o(p0, "it");
       boolean b = (p0.longValue() - this.$g.a() <= 0)? true: false;
       return b;
    }
}
