package com.kuaishou.live.core.show.quiz.manager.LiveQuizStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveQuizStatus extends Enum	// class@000e0b
{
    public static final LiveQuizStatus[] $VALUES;
    public static final LiveQuizStatus Quiz_End;
    public static final LiveQuizStatus Quiz_NotStart;
    public static final LiveQuizStatus Quizing;

    static {
       LiveQuizStatus liveQuizStat = new LiveQuizStatus("Quiz_NotStart", 0);
       LiveQuizStatus.Quiz_NotStart = liveQuizStat;
       LiveQuizStatus liveQuizStat1 = new LiveQuizStatus("Quizing", 1);
       LiveQuizStatus.Quizing = liveQuizStat1;
       LiveQuizStatus liveQuizStat2 = new LiveQuizStatus("Quiz_End", 2);
       LiveQuizStatus.Quiz_End = liveQuizStat2;
       LiveQuizStatus[] liveQuizStat3 = new LiveQuizStatus[]{liveQuizStat,liveQuizStat1,liveQuizStat2};
       LiveQuizStatus.$VALUES = liveQuizStat3;
    }
    public void LiveQuizStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveQuizStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveQuizStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveQuizStatus.class, p0);
    }
    public static LiveQuizStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveQuizStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQuizStatus.$VALUES.clone();
    }
}
