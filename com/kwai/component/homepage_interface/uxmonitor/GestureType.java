package com.kwai.component.homepage_interface.uxmonitor.GestureType;
import java.lang.Enum;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GestureType extends Enum	// class@000977
{
    public final List answerTypes;
    public static final GestureType[] $VALUES;
    public static final GestureType CLICK;
    public static final GestureType DOUBLE_CLICK;
    public static final GestureType DOWN_SLIDE;
    public static final GestureType LEFT_SLIDE;
    public static final GestureType LONG_PRESS;
    public static final GestureType RIGHT_SLIDE;
    public static final GestureType UNKNOWN;
    public static final GestureType UP_SLIDE;

    static {
       GestureType gestureType;
       AnswerType sLIDING_PANE;
       AnswerType dEFAULT;
       AnswerType aCTIVITY_PAU;
       AnswerType sTART_ACTIVI;
       AnswerType sCALE_GESTUR;
       AnswerType oPEN_OR_CLOS;
       AnswerType aTLAS;
       AnswerType sLIDE_LONG_A;
       AnswerType sLIDE_VIEW_P;
       GestureType[] gestureTypeA = new GestureType[]{gestureType,gestureType,gestureType,gestureType,gestureType,gestureType,gestureType,gestureType};
       gestureType = new GestureType("UNKNOWN", 0, CollectionsKt__CollectionsKt.E());
       GestureType.UNKNOWN = gestureType;
       AnswerType[] uAnswerTypeA = new AnswerType[]{sLIDING_PANE,dEFAULT,aCTIVITY_PAU,sTART_ACTIVI,sCALE_GESTUR,oPEN_OR_CLOS};
       sLIDING_PANE = AnswerType.SLIDING_PANEL;
       dEFAULT = AnswerType.DEFAULT;
       aCTIVITY_PAU = AnswerType.ACTIVITY_PAUSE;
       sTART_ACTIVI = AnswerType.START_ACTIVITY;
       sCALE_GESTUR = AnswerType.SCALE_GESTURE;
       oPEN_OR_CLOS = AnswerType.OPEN_OR_CLOSE_LONG_ALAS;
       gestureType = new GestureType("CLICK", 1, CollectionsKt__CollectionsKt.r(uAnswerTypeA));
       GestureType.CLICK = gestureType;
       AnswerType[] uAnswerTypeA1 = new AnswerType[]{dEFAULT,aCTIVITY_PAU,sTART_ACTIVI,sCALE_GESTUR};
       gestureType = new GestureType("DOUBLE_CLICK", 2, CollectionsKt__CollectionsKt.r(uAnswerTypeA1));
       GestureType.DOUBLE_CLICK = gestureType;
       uAnswerTypeA1 = new AnswerType[]{dEFAULT,aCTIVITY_PAU,sTART_ACTIVI,sCALE_GESTUR};
       gestureType = new GestureType("LONG_PRESS", 3, CollectionsKt__CollectionsKt.r(uAnswerTypeA1));
       GestureType.LONG_PRESS = gestureType;
       uAnswerTypeA = new AnswerType[]{dEFAULT,aCTIVITY_PAU,aTLAS,sLIDING_PANE,sCALE_GESTUR,sTART_ACTIVI,sLIDE_LONG_A};
       dEFAULT = AnswerType.SEEK_BAR;
       aCTIVITY_PAU = AnswerType.SIDE_PROFILE;
       aTLAS = AnswerType.ATLAS;
       sLIDE_LONG_A = AnswerType.SLIDE_LONG_ALAS;
       gestureType = new GestureType("LEFT_SLIDE", 4, CollectionsKt__CollectionsKt.r(uAnswerTypeA));
       GestureType.LEFT_SLIDE = gestureType;
       uAnswerTypeA1 = new AnswerType[9];
       uAnswerTypeA1[0] = AnswerType.SWITCH_TAB;
       uAnswerTypeA1[1] = dEFAULT;
       uAnswerTypeA1[2] = aCTIVITY_PAU;
       uAnswerTypeA1[3] = aTLAS;
       uAnswerTypeA1[4] = sLIDING_PANE;
       uAnswerTypeA1[5] = sCALE_GESTUR;
       uAnswerTypeA1[6] = sTART_ACTIVI;
       uAnswerTypeA1[7] = sLIDE_LONG_A;
       uAnswerTypeA1[8] = oPEN_OR_CLOS;
       gestureType = new GestureType("RIGHT_SLIDE", 5, CollectionsKt__CollectionsKt.r(uAnswerTypeA1));
       GestureType.RIGHT_SLIDE = gestureType;
       uAnswerTypeA1 = new AnswerType[]{sLIDE_VIEW_P,AnswerType.SLIDE_MORE,sCALE_GESTUR,sTART_ACTIVI,sLIDING_PANE,sLIDE_LONG_A};
       sLIDE_VIEW_P = AnswerType.SLIDE_VIEW_PAGE;
       sLIDING_PANE = AnswerType.SLIDE_PROFILE_FEED;
       gestureType = new GestureType("UP_SLIDE", 6, CollectionsKt__CollectionsKt.r(uAnswerTypeA1));
       GestureType.UP_SLIDE = gestureType;
       uAnswerTypeA1 = new AnswerType[]{sLIDE_VIEW_P,AnswerType.SLIDE_REFRESH,sCALE_GESTUR,sTART_ACTIVI,sLIDING_PANE,sLIDE_LONG_A};
       gestureType = new GestureType("DOWN_SLIDE", 7, CollectionsKt__CollectionsKt.r(uAnswerTypeA1));
       GestureType.DOWN_SLIDE = gestureType;
       GestureType.$VALUES = gestureTypeA;
    }
    public void GestureType(String p0,int p1,List p2){
       super(p0, p1);
       this.answerTypes = p2;
    }
    public static GestureType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GestureType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GestureType.class, p0);
    }
    public static GestureType[] values(){
       Object obj = PatchProxy.apply(null, null, GestureType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GestureType.$VALUES.clone();
    }
    public final List getAnswerTypes(){
       return this.answerTypes;
    }
}
