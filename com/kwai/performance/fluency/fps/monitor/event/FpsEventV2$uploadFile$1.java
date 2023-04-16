package com.kwai.performance.fluency.fps.monitor.event.FpsEventV2$uploadFile$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.h;

public final class FpsEventV2$uploadFile$1 extends Lambda implements l	// class@001080
{
    public static final FpsEventV2$uploadFile$1 INSTANCE;

    static {
       FpsEventV2$uploadFile$1.INSTANCE = new FpsEventV2$uploadFile$1();
    }
    public void FpsEventV2$uploadFile$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       h.d("FpsMonitor", a.C("uploadFile: ", Boolean.valueOf(p0)));
    }
}
