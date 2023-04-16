package com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AnswerType extends Enum	// class@000975
{
    public static final AnswerType[] $VALUES;
    public static final AnswerType ACTIVITY_PAUSE;
    public static final AnswerType ATLAS;
    public static final AnswerType DEFAULT;
    public static final AnswerType OPEN_OR_CLOSE_LONG_ALAS;
    public static final AnswerType SCALE_GESTURE;
    public static final AnswerType SEEK_BAR;
    public static final AnswerType SIDE_PROFILE;
    public static final AnswerType SLIDE_LONG_ALAS;
    public static final AnswerType SLIDE_MORE;
    public static final AnswerType SLIDE_PROFILE_FEED;
    public static final AnswerType SLIDE_REFRESH;
    public static final AnswerType SLIDE_VIEW_PAGE;
    public static final AnswerType SLIDING_PANEL;
    public static final AnswerType START_ACTIVITY;
    public static final AnswerType SWITCH_TAB;

    static {
       AnswerType[] uAnswerTypeA = new AnswerType[15];
       AnswerType uAnswerType = new AnswerType("SWITCH_TAB", 0);
       AnswerType.SWITCH_TAB = uAnswerType;
       uAnswerTypeA[0] = uAnswerType;
       uAnswerType = new AnswerType("SEEK_BAR", 1);
       AnswerType.SEEK_BAR = uAnswerType;
       uAnswerTypeA[1] = uAnswerType;
       uAnswerType = new AnswerType("SIDE_PROFILE", 2);
       AnswerType.SIDE_PROFILE = uAnswerType;
       uAnswerTypeA[2] = uAnswerType;
       uAnswerType = new AnswerType("ATLAS", 3);
       AnswerType.ATLAS = uAnswerType;
       uAnswerTypeA[3] = uAnswerType;
       uAnswerType = new AnswerType("SLIDE_VIEW_PAGE", 4);
       AnswerType.SLIDE_VIEW_PAGE = uAnswerType;
       uAnswerTypeA[4] = uAnswerType;
       uAnswerType = new AnswerType("SLIDE_REFRESH", 5);
       AnswerType.SLIDE_REFRESH = uAnswerType;
       uAnswerTypeA[5] = uAnswerType;
       uAnswerType = new AnswerType("SLIDE_MORE", 6);
       AnswerType.SLIDE_MORE = uAnswerType;
       uAnswerTypeA[6] = uAnswerType;
       uAnswerType = new AnswerType("SLIDING_PANEL", 7);
       AnswerType.SLIDING_PANEL = uAnswerType;
       uAnswerTypeA[7] = uAnswerType;
       uAnswerType = new AnswerType("DEFAULT", 8);
       AnswerType.DEFAULT = uAnswerType;
       uAnswerTypeA[8] = uAnswerType;
       uAnswerType = new AnswerType("ACTIVITY_PAUSE", 9);
       AnswerType.ACTIVITY_PAUSE = uAnswerType;
       uAnswerTypeA[9] = uAnswerType;
       uAnswerType = new AnswerType("START_ACTIVITY", 10);
       AnswerType.START_ACTIVITY = uAnswerType;
       uAnswerTypeA[10] = uAnswerType;
       uAnswerType = new AnswerType("SCALE_GESTURE", 11);
       AnswerType.SCALE_GESTURE = uAnswerType;
       uAnswerTypeA[11] = uAnswerType;
       uAnswerType = new AnswerType("SLIDE_PROFILE_FEED", 12);
       AnswerType.SLIDE_PROFILE_FEED = uAnswerType;
       uAnswerTypeA[12] = uAnswerType;
       uAnswerType = new AnswerType("SLIDE_LONG_ALAS", 13);
       AnswerType.SLIDE_LONG_ALAS = uAnswerType;
       uAnswerTypeA[13] = uAnswerType;
       uAnswerType = new AnswerType("OPEN_OR_CLOSE_LONG_ALAS", 14);
       AnswerType.OPEN_OR_CLOSE_LONG_ALAS = uAnswerType;
       uAnswerTypeA[14] = uAnswerType;
       AnswerType.$VALUES = uAnswerTypeA;
    }
    public void AnswerType(String p0,int p1){
       super(p0, p1);
    }
    public static AnswerType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AnswerType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AnswerType.class, p0);
    }
    public static AnswerType[] values(){
       Object obj = PatchProxy.apply(null, null, AnswerType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AnswerType.$VALUES.clone();
    }
}
