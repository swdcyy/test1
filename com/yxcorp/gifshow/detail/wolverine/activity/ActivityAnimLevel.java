package com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel;
import java.lang.Enum;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel$DEFAULT;
import java.lang.String;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel$DEMOTION;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel$BASELINE;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class ActivityAnimLevel extends Enum	// class@001a87
{
    public static final ActivityAnimLevel[] $VALUES;
    public static final ActivityAnimLevel BASELINE;
    public static final ActivityAnimLevel DEFAULT;
    public static final ActivityAnimLevel DEMOTION;

    static {
       ActivityAnimLevel$DEFAULT uDEFAULT;
       ActivityAnimLevel$DEMOTION uDEMOTION;
       ActivityAnimLevel$BASELINE uBASELINE;
       ActivityAnimLevel[] uActivityAni = new ActivityAnimLevel[]{uDEFAULT,uDEMOTION,uBASELINE};
       uDEFAULT = new ActivityAnimLevel$DEFAULT("DEFAULT", 0);
       ActivityAnimLevel.DEFAULT = uDEFAULT;
       uDEMOTION = new ActivityAnimLevel$DEMOTION("DEMOTION", 1);
       ActivityAnimLevel.DEMOTION = uDEMOTION;
       uBASELINE = new ActivityAnimLevel$BASELINE("BASELINE", 2);
       ActivityAnimLevel.BASELINE = uBASELINE;
       ActivityAnimLevel.$VALUES = uActivityAni;
    }
    public void ActivityAnimLevel(String p0,int p1){
       super(p0, p1);
    }
    public void ActivityAnimLevel(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static ActivityAnimLevel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ActivityAnimLevel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ActivityAnimLevel.class, p0);
    }
    public static ActivityAnimLevel[] values(){
       Object obj = PatchProxy.apply(null, null, ActivityAnimLevel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActivityAnimLevel.$VALUES.clone();
    }
    public abstract String getKey();
}
