package com.kwai.sdk.eve.InferenceState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class InferenceState extends Enum	// class@00143e
{
    public static final InferenceState[] $VALUES;
    public static final InferenceState ABORT;
    public static final InferenceState CANCEL;
    public static final InferenceState ERROR;
    public static final InferenceState SUCCESS;

    static {
       InferenceState inferenceSta1;
       InferenceState[] inferenceSta = new InferenceState[]{inferenceSta1,inferenceSta1,inferenceSta1,inferenceSta1};
       inferenceSta1 = new InferenceState("SUCCESS", 0);
       InferenceState.SUCCESS = inferenceSta1;
       inferenceSta1 = new InferenceState("CANCEL", 1);
       InferenceState.CANCEL = inferenceSta1;
       inferenceSta1 = new InferenceState("ERROR", 2);
       InferenceState.ERROR = inferenceSta1;
       inferenceSta1 = new InferenceState("ABORT", 3);
       InferenceState.ABORT = inferenceSta1;
       InferenceState.$VALUES = inferenceSta;
    }
    public void InferenceState(String p0,int p1){
       super(p0, p1);
    }
    public static InferenceState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InferenceState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(InferenceState.class, p0);
    }
    public static InferenceState[] values(){
       Object obj = PatchProxy.apply(null, null, InferenceState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return InferenceState.$VALUES.clone();
    }
}
