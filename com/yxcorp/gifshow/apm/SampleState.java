package com.yxcorp.gifshow.apm.SampleState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SampleState extends Enum	// class@001b94
{
    public static final SampleState[] $VALUES;
    public static final SampleState AFTER_BEGIN_TRACE;
    public static final SampleState AFTER_END_TRACE;
    public static final SampleState AFTER_INIT;
    public static final SampleState BEFORE_BEGIN_TRACE;
    public static final SampleState BEFORE_END_TRACE;
    public static final SampleState BEFORE_INIT;

    static {
       SampleState sampleState;
       SampleState[] sampleStateA = new SampleState[]{sampleState,sampleState,sampleState,sampleState,sampleState,sampleState};
       sampleState = new SampleState("BEFORE_INIT", 0);
       SampleState.BEFORE_INIT = sampleState;
       sampleState = new SampleState("AFTER_INIT", 1);
       SampleState.AFTER_INIT = sampleState;
       sampleState = new SampleState("BEFORE_BEGIN_TRACE", 2);
       SampleState.BEFORE_BEGIN_TRACE = sampleState;
       sampleState = new SampleState("AFTER_BEGIN_TRACE", 3);
       SampleState.AFTER_BEGIN_TRACE = sampleState;
       sampleState = new SampleState("BEFORE_END_TRACE", 4);
       SampleState.BEFORE_END_TRACE = sampleState;
       sampleState = new SampleState("AFTER_END_TRACE", 5);
       SampleState.AFTER_END_TRACE = sampleState;
       SampleState.$VALUES = sampleStateA;
    }
    public void SampleState(String p0,int p1){
       super(p0, p1);
    }
    public static SampleState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SampleState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SampleState.class, p0);
    }
    public static SampleState[] values(){
       Object obj = PatchProxy.apply(null, null, SampleState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SampleState.$VALUES.clone();
    }
}
