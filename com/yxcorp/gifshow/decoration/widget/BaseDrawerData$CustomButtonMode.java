package com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseDrawerData$CustomButtonMode extends Enum	// class@0012af
{
    public static final BaseDrawerData$CustomButtonMode[] $VALUES;
    public static final BaseDrawerData$CustomButtonMode EDIT_TEXT;
    public static final BaseDrawerData$CustomButtonMode NONE;
    public static final BaseDrawerData$CustomButtonMode SUBTITLE_PANEL;
    public static final BaseDrawerData$CustomButtonMode TIME_PANEL;

    static {
       BaseDrawerData$CustomButtonMode uCustomButto1;
       BaseDrawerData$CustomButtonMode[] uCustomButto = new BaseDrawerData$CustomButtonMode[]{uCustomButto1,uCustomButto1,uCustomButto1,uCustomButto1};
       uCustomButto1 = new BaseDrawerData$CustomButtonMode("NONE", 0);
       BaseDrawerData$CustomButtonMode.NONE = uCustomButto1;
       uCustomButto1 = new BaseDrawerData$CustomButtonMode("TIME_PANEL", 1);
       BaseDrawerData$CustomButtonMode.TIME_PANEL = uCustomButto1;
       uCustomButto1 = new BaseDrawerData$CustomButtonMode("SUBTITLE_PANEL", 2);
       BaseDrawerData$CustomButtonMode.SUBTITLE_PANEL = uCustomButto1;
       uCustomButto1 = new BaseDrawerData$CustomButtonMode("EDIT_TEXT", 3);
       BaseDrawerData$CustomButtonMode.EDIT_TEXT = uCustomButto1;
       BaseDrawerData$CustomButtonMode.$VALUES = uCustomButto;
    }
    public void BaseDrawerData$CustomButtonMode(String p0,int p1){
       super(p0, p1);
    }
    public static BaseDrawerData$CustomButtonMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BaseDrawerData$CustomButtonMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BaseDrawerData$CustomButtonMode.class, p0);
    }
    public static BaseDrawerData$CustomButtonMode[] values(){
       Object obj = PatchProxy.apply(null, null, BaseDrawerData$CustomButtonMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BaseDrawerData$CustomButtonMode.$VALUES.clone();
    }
}
