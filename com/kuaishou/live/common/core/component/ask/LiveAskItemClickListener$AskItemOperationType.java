package com.kuaishou.live.common.core.component.ask.LiveAskItemClickListener$AskItemOperationType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAskItemClickListener$AskItemOperationType extends Enum	// class@000f59
{
    public static final LiveAskItemClickListener$AskItemOperationType[] $VALUES;
    public static final LiveAskItemClickListener$AskItemOperationType ANSWER;
    public static final LiveAskItemClickListener$AskItemOperationType FINISH;
    public static final LiveAskItemClickListener$AskItemOperationType THANKS;

    static {
       LiveAskItemClickListener$AskItemOperationType uAskItemOper1;
       LiveAskItemClickListener$AskItemOperationType[] uAskItemOper = new LiveAskItemClickListener$AskItemOperationType[]{uAskItemOper1,uAskItemOper1,uAskItemOper1};
       uAskItemOper1 = new LiveAskItemClickListener$AskItemOperationType("ANSWER", 0);
       LiveAskItemClickListener$AskItemOperationType.ANSWER = uAskItemOper1;
       uAskItemOper1 = new LiveAskItemClickListener$AskItemOperationType("FINISH", 1);
       LiveAskItemClickListener$AskItemOperationType.FINISH = uAskItemOper1;
       uAskItemOper1 = new LiveAskItemClickListener$AskItemOperationType("THANKS", 2);
       LiveAskItemClickListener$AskItemOperationType.THANKS = uAskItemOper1;
       LiveAskItemClickListener$AskItemOperationType.$VALUES = uAskItemOper;
    }
    public void LiveAskItemClickListener$AskItemOperationType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAskItemClickListener$AskItemOperationType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAskItemClickListener$AskItemOperationType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAskItemClickListener$AskItemOperationType.class, p0);
    }
    public static LiveAskItemClickListener$AskItemOperationType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAskItemClickListener$AskItemOperationType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAskItemClickListener$AskItemOperationType.$VALUES.clone();
    }
}
