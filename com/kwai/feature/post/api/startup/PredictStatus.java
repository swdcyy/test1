package com.kwai.feature.post.api.startup.PredictStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PredictStatus extends Enum	// class@00143c
{
    public static final PredictStatus[] $VALUES;
    public static final PredictStatus FN_DAY;
    public static final PredictStatus FN_LAUNCH;
    public static final PredictStatus POSITIVE;
    public static final PredictStatus TP_DAY;
    public static final PredictStatus TP_LAUNCH;

    static {
       PredictStatus predictStatu1;
       PredictStatus[] predictStatu = new PredictStatus[]{predictStatu1,predictStatu1,predictStatu1,predictStatu1,predictStatu1};
       predictStatu1 = new PredictStatus("POSITIVE", 0);
       PredictStatus.POSITIVE = predictStatu1;
       predictStatu1 = new PredictStatus("FN_LAUNCH", 1);
       PredictStatus.FN_LAUNCH = predictStatu1;
       predictStatu1 = new PredictStatus("TP_LAUNCH", 2);
       PredictStatus.TP_LAUNCH = predictStatu1;
       predictStatu1 = new PredictStatus("FN_DAY", 3);
       PredictStatus.FN_DAY = predictStatu1;
       predictStatu1 = new PredictStatus("TP_DAY", 4);
       PredictStatus.TP_DAY = predictStatu1;
       PredictStatus.$VALUES = predictStatu;
    }
    public void PredictStatus(String p0,int p1){
       super(p0, p1);
    }
    public static PredictStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PredictStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PredictStatus.class, p0);
    }
    public static PredictStatus[] values(){
       Object obj = PatchProxy.apply(null, null, PredictStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PredictStatus.$VALUES.clone();
    }
}
