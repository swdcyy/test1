package com.kwai.sdk.eve.internal.statistics.inference.InferencePerfRecorderKt$processorRecords$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import en7.t;
import wn7.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.inference.a;

public final class InferencePerfRecorderKt$processorRecords$2 extends Lambda implements l	// class@0015b7
{
    public static final InferencePerfRecorderKt$processorRecords$2 INSTANCE;

    static {
       InferencePerfRecorderKt$processorRecords$2.INSTANCE = new InferencePerfRecorderKt$processorRecords$2();
    }
    public void InferencePerfRecorderKt$processorRecords$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final g invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InferencePerfRecorderKt$processorRecords$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new g(p0.l());
    }
}
