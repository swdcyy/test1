package com.kwai.framework.model.decompose.metaext.KSModelMetaExtPathUtils$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSModelMetaExtPathUtils$State extends Enum	// class@0016ac
{
    public static final KSModelMetaExtPathUtils$State[] $VALUES;
    public static final KSModelMetaExtPathUtils$State Dot;
    public static final KSModelMetaExtPathUtils$State End;
    public static final KSModelMetaExtPathUtils$State Error;
    public static final KSModelMetaExtPathUtils$State IndexBeg;
    public static final KSModelMetaExtPathUtils$State IndexEnd;
    public static final KSModelMetaExtPathUtils$State Indexing;
    public static final KSModelMetaExtPathUtils$State Init;
    public static final KSModelMetaExtPathUtils$State Naming;

    static {
       KSModelMetaExtPathUtils$State state;
       KSModelMetaExtPathUtils$State[] stateArray = new KSModelMetaExtPathUtils$State[]{state,state,state,state,state,state,state,state};
       state = new KSModelMetaExtPathUtils$State("Init", 0);
       KSModelMetaExtPathUtils$State.Init = state;
       state = new KSModelMetaExtPathUtils$State("Naming", 1);
       KSModelMetaExtPathUtils$State.Naming = state;
       state = new KSModelMetaExtPathUtils$State("IndexBeg", 2);
       KSModelMetaExtPathUtils$State.IndexBeg = state;
       state = new KSModelMetaExtPathUtils$State("Indexing", 3);
       KSModelMetaExtPathUtils$State.Indexing = state;
       state = new KSModelMetaExtPathUtils$State("IndexEnd", 4);
       KSModelMetaExtPathUtils$State.IndexEnd = state;
       state = new KSModelMetaExtPathUtils$State("Dot", 5);
       KSModelMetaExtPathUtils$State.Dot = state;
       state = new KSModelMetaExtPathUtils$State("End", 6);
       KSModelMetaExtPathUtils$State.End = state;
       state = new KSModelMetaExtPathUtils$State("Error", 7);
       KSModelMetaExtPathUtils$State.Error = state;
       KSModelMetaExtPathUtils$State.$VALUES = stateArray;
    }
    public void KSModelMetaExtPathUtils$State(String p0,int p1){
       super(p0, p1);
    }
    public static KSModelMetaExtPathUtils$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSModelMetaExtPathUtils$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSModelMetaExtPathUtils$State.class, p0);
    }
    public static KSModelMetaExtPathUtils$State[] values(){
       Object obj = PatchProxy.apply(null, null, KSModelMetaExtPathUtils$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSModelMetaExtPathUtils$State.$VALUES.clone();
    }
}
