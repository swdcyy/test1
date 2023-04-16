package com.yxcorp.gifshow.model.survey.ActionSurveyType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionSurveyType extends Enum	// class@001fa0
{
    public String mType;
    public static final ActionSurveyType[] $VALUES;
    public static final ActionSurveyType COMMENT;
    public static final ActionSurveyType FOLLOW;
    public static final ActionSurveyType LIKE;
    public static final ActionSurveyType NTH;
    public static final ActionSurveyType PLAY;
    public static final ActionSurveyType PUSH;
    public static final ActionSurveyType REPORT;
    public static final ActionSurveyType SHARE;

    static {
       ActionSurveyType uActionSurve = new ActionSurveyType("LIKE", 0, "LIKE");
       ActionSurveyType.LIKE = uActionSurve;
       ActionSurveyType uActionSurve1 = new ActionSurveyType("SHARE", 1, "SHARE");
       ActionSurveyType.SHARE = uActionSurve1;
       ActionSurveyType uActionSurve2 = new ActionSurveyType("FOLLOW", 2, "FOLLOW");
       ActionSurveyType.FOLLOW = uActionSurve2;
       ActionSurveyType uActionSurve3 = new ActionSurveyType("REPORT", 3, "REPORT");
       ActionSurveyType.REPORT = uActionSurve3;
       ActionSurveyType uActionSurve4 = new ActionSurveyType("COMMENT", 4, "COMMENT");
       ActionSurveyType.COMMENT = uActionSurve4;
       ActionSurveyType uActionSurve5 = new ActionSurveyType("PLAY", 5, "PLAY");
       ActionSurveyType.PLAY = uActionSurve5;
       ActionSurveyType uActionSurve6 = new ActionSurveyType("PUSH", 6, "PUSH");
       ActionSurveyType.PUSH = uActionSurve6;
       ActionSurveyType uActionSurve7 = new ActionSurveyType("NTH", 7, "NTH");
       ActionSurveyType.NTH = uActionSurve7;
       ActionSurveyType[] uActionSurve8 = new ActionSurveyType[]{uActionSurve,uActionSurve1,uActionSurve2,uActionSurve3,uActionSurve4,uActionSurve5,uActionSurve6,uActionSurve7};
       ActionSurveyType.$VALUES = uActionSurve8;
    }
    public void ActionSurveyType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static ActionSurveyType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ActionSurveyType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ActionSurveyType.class, p0);
    }
    public static ActionSurveyType[] values(){
       Object obj = PatchProxy.apply(null, null, ActionSurveyType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActionSurveyType.$VALUES.clone();
    }
    public String getType(){
       return this.mType;
    }
}
