package com.kuaishou.live.core.show.quiz.question.LiveQuizDialogType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveQuizDialogType extends Enum	// class@000e32
{
    public int mValue;
    public static final LiveQuizDialogType[] $VALUES;
    public static final LiveQuizDialogType USER_QUESTIONING;
    public static final LiveQuizDialogType USER_RESULT_RIGHT;
    public static final LiveQuizDialogType USER_RESULT_WRONG;

    static {
       LiveQuizDialogType liveQuizDial = new LiveQuizDialogType("USER_QUESTIONING", 0, 0);
       LiveQuizDialogType.USER_QUESTIONING = liveQuizDial;
       LiveQuizDialogType liveQuizDial1 = new LiveQuizDialogType("USER_RESULT_RIGHT", 1, 1);
       LiveQuizDialogType.USER_RESULT_RIGHT = liveQuizDial1;
       LiveQuizDialogType liveQuizDial2 = new LiveQuizDialogType("USER_RESULT_WRONG", 2, 2);
       LiveQuizDialogType.USER_RESULT_WRONG = liveQuizDial2;
       LiveQuizDialogType[] liveQuizDial3 = new LiveQuizDialogType[]{liveQuizDial,liveQuizDial1,liveQuizDial2};
       LiveQuizDialogType.$VALUES = liveQuizDial3;
    }
    public void LiveQuizDialogType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveQuizDialogType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveQuizDialogType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveQuizDialogType.class, p0);
    }
    public static LiveQuizDialogType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveQuizDialogType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQuizDialogType.$VALUES.clone();
    }
    public int value(){
       return this.mValue;
    }
}
