package com.kwai.slide.play.detail.disclaimer.content.DisclaimerViewModel$MarginModel$Orientation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DisclaimerViewModel$MarginModel$Orientation extends Enum	// class@0017a8
{
    public static final DisclaimerViewModel$MarginModel$Orientation[] $VALUES;
    public static final DisclaimerViewModel$MarginModel$Orientation BOTTOM;
    public static final DisclaimerViewModel$MarginModel$Orientation TOP;

    static {
       DisclaimerViewModel$MarginModel$Orientation marginModel$1;
       DisclaimerViewModel$MarginModel$Orientation[] marginModel$ = new DisclaimerViewModel$MarginModel$Orientation[]{marginModel$1,marginModel$1};
       marginModel$1 = new DisclaimerViewModel$MarginModel$Orientation("TOP", 0);
       DisclaimerViewModel$MarginModel$Orientation.TOP = marginModel$1;
       marginModel$1 = new DisclaimerViewModel$MarginModel$Orientation("BOTTOM", 1);
       DisclaimerViewModel$MarginModel$Orientation.BOTTOM = marginModel$1;
       DisclaimerViewModel$MarginModel$Orientation.$VALUES = marginModel$;
    }
    public void DisclaimerViewModel$MarginModel$Orientation(String p0,int p1){
       super(p0, p1);
    }
    public static DisclaimerViewModel$MarginModel$Orientation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DisclaimerViewModel$MarginModel$Orientation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DisclaimerViewModel$MarginModel$Orientation.class, p0);
    }
    public static DisclaimerViewModel$MarginModel$Orientation[] values(){
       Object obj = PatchProxy.apply(null, null, DisclaimerViewModel$MarginModel$Orientation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DisclaimerViewModel$MarginModel$Orientation.$VALUES.clone();
    }
}
