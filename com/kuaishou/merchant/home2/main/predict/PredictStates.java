package com.kuaishou.merchant.home2.main.predict.PredictStates;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PredictStates extends Enum	// class@00181a
{
    public static final PredictStates[] $VALUES;
    public static final PredictStates ACTIVATED;
    public static final PredictStates DEFAULT;
    public static final PredictStates DISABLED;
    public static final PredictStates INITIALED;
    public static final PredictStates NO_MODEL;
    public static final PredictStates ON_ACTIVE;
    public static final PredictStates ON_INITIAL;
    public static final PredictStates ON_RELEASE;
    public static final PredictStates ON_START;
    public static final PredictStates RELEASED;
    public static final PredictStates STARTED;

    static {
       PredictStates[] predictState = new PredictStates[11];
       PredictStates predictState1 = new PredictStates("DEFAULT", 0);
       PredictStates.DEFAULT = predictState1;
       predictState[0] = predictState1;
       predictState1 = new PredictStates("ON_INITIAL", 1);
       PredictStates.ON_INITIAL = predictState1;
       predictState[1] = predictState1;
       predictState1 = new PredictStates("INITIALED", 2);
       PredictStates.INITIALED = predictState1;
       predictState[2] = predictState1;
       predictState1 = new PredictStates("ON_ACTIVE", 3);
       PredictStates.ON_ACTIVE = predictState1;
       predictState[3] = predictState1;
       predictState1 = new PredictStates("ACTIVATED", 4);
       PredictStates.ACTIVATED = predictState1;
       predictState[4] = predictState1;
       predictState1 = new PredictStates("NO_MODEL", 5);
       PredictStates.NO_MODEL = predictState1;
       predictState[5] = predictState1;
       predictState1 = new PredictStates("ON_START", 6);
       PredictStates.ON_START = predictState1;
       predictState[6] = predictState1;
       predictState1 = new PredictStates("STARTED", 7);
       PredictStates.STARTED = predictState1;
       predictState[7] = predictState1;
       predictState1 = new PredictStates("ON_RELEASE", 8);
       PredictStates.ON_RELEASE = predictState1;
       predictState[8] = predictState1;
       predictState1 = new PredictStates("RELEASED", 9);
       PredictStates.RELEASED = predictState1;
       predictState[9] = predictState1;
       predictState1 = new PredictStates("DISABLED", 10);
       PredictStates.DISABLED = predictState1;
       predictState[10] = predictState1;
       PredictStates.$VALUES = predictState;
    }
    public void PredictStates(String p0,int p1){
       super(p0, p1);
    }
    public static PredictStates valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PredictStates.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PredictStates.class, p0);
    }
    public static PredictStates[] values(){
       Object obj = PatchProxy.apply(null, null, PredictStates.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PredictStates.$VALUES.clone();
    }
}
