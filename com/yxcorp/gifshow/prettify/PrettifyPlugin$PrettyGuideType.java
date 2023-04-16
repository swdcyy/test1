package com.yxcorp.gifshow.prettify.PrettifyPlugin$PrettyGuideType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PrettifyPlugin$PrettyGuideType extends Enum	// class@0010e0
{
    public final int mValue;
    public static final PrettifyPlugin$PrettyGuideType[] $VALUES;
    public static final PrettifyPlugin$PrettyGuideType EDIT;
    public static final PrettifyPlugin$PrettyGuideType LIVE_PUSH;
    public static final PrettifyPlugin$PrettyGuideType VIDEO;

    static {
       PrettifyPlugin$PrettyGuideType prettyGuideT = new PrettifyPlugin$PrettyGuideType("VIDEO", 0, 1);
       PrettifyPlugin$PrettyGuideType.VIDEO = prettyGuideT;
       PrettifyPlugin$PrettyGuideType prettyGuideT1 = new PrettifyPlugin$PrettyGuideType("EDIT", 1, 2);
       PrettifyPlugin$PrettyGuideType.EDIT = prettyGuideT1;
       PrettifyPlugin$PrettyGuideType prettyGuideT2 = new PrettifyPlugin$PrettyGuideType("LIVE_PUSH", 2, 3);
       PrettifyPlugin$PrettyGuideType.LIVE_PUSH = prettyGuideT2;
       PrettifyPlugin$PrettyGuideType[] prettyGuideT3 = new PrettifyPlugin$PrettyGuideType[]{prettyGuideT,prettyGuideT1,prettyGuideT2};
       PrettifyPlugin$PrettyGuideType.$VALUES = prettyGuideT3;
    }
    public void PrettifyPlugin$PrettyGuideType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static PrettifyPlugin$PrettyGuideType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyPlugin$PrettyGuideType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PrettifyPlugin$PrettyGuideType.class, p0);
    }
    public static PrettifyPlugin$PrettyGuideType[] values(){
       Object obj = PatchProxy.apply(null, null, PrettifyPlugin$PrettyGuideType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyPlugin$PrettyGuideType.$VALUES.clone();
    }
}
