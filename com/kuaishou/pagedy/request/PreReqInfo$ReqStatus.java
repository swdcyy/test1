package com.kuaishou.pagedy.request.PreReqInfo$ReqStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PreReqInfo$ReqStatus extends Enum	// class@000a93
{
    public static final PreReqInfo$ReqStatus[] $VALUES;
    public static final PreReqInfo$ReqStatus COMPLETE;
    public static final PreReqInfo$ReqStatus ING;
    public static final PreReqInfo$ReqStatus NONE;

    static {
       PreReqInfo$ReqStatus reqStatus = new PreReqInfo$ReqStatus("NONE", 0);
       PreReqInfo$ReqStatus.NONE = reqStatus;
       PreReqInfo$ReqStatus reqStatus1 = new PreReqInfo$ReqStatus("ING", 1);
       PreReqInfo$ReqStatus.ING = reqStatus1;
       PreReqInfo$ReqStatus reqStatus2 = new PreReqInfo$ReqStatus("COMPLETE", 2);
       PreReqInfo$ReqStatus.COMPLETE = reqStatus2;
       PreReqInfo$ReqStatus[] reqStatusArr = new PreReqInfo$ReqStatus[]{reqStatus,reqStatus1,reqStatus2};
       PreReqInfo$ReqStatus.$VALUES = reqStatusArr;
    }
    public void PreReqInfo$ReqStatus(String p0,int p1){
       super(p0, p1);
    }
    public static PreReqInfo$ReqStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PreReqInfo$ReqStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PreReqInfo$ReqStatus.class, p0);
    }
    public static PreReqInfo$ReqStatus[] values(){
       Object obj = PatchProxy.apply(null, null, PreReqInfo$ReqStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PreReqInfo$ReqStatus.$VALUES.clone();
    }
}
