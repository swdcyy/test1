package com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker$mIsCpu64bit$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import mh7.a;
import java.lang.String;
import kotlin.collections.ArraysKt___ArraysKt;

public final class JeMallocHackOOMTracker$mIsCpu64bit$2 extends Lambda implements a	// class@00126e
{
    public static final JeMallocHackOOMTracker$mIsCpu64bit$2 INSTANCE;

    static {
       JeMallocHackOOMTracker$mIsCpu64bit$2.INSTANCE = new JeMallocHackOOMTracker$mIsCpu64bit$2();
    }
    public void JeMallocHackOOMTracker$mIsCpu64bit$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       return ArraysKt___ArraysKt.P7(a.p.d(), "arm64-v8a");
    }
}
