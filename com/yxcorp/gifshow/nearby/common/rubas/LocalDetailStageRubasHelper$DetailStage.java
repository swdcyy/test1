package com.yxcorp.gifshow.nearby.common.rubas.LocalDetailStageRubasHelper$DetailStage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LocalDetailStageRubasHelper$DetailStage extends Enum	// class@002131
{
    public static final LocalDetailStageRubasHelper$DetailStage[] $VALUES;
    public static final LocalDetailStageRubasHelper$DetailStage CLICK;
    public static final LocalDetailStageRubasHelper$DetailStage CONTAINER_CREATE;
    public static final LocalDetailStageRubasHelper$DetailStage ENTER;
    public static final LocalDetailStageRubasHelper$DetailStage FEED_PLAY;
    public static final LocalDetailStageRubasHelper$DetailStage LAUNCH;

    static {
       LocalDetailStageRubasHelper$DetailStage uDetailStage = new LocalDetailStageRubasHelper$DetailStage("LAUNCH", 0);
       LocalDetailStageRubasHelper$DetailStage.LAUNCH = uDetailStage;
       LocalDetailStageRubasHelper$DetailStage uDetailStage1 = new LocalDetailStageRubasHelper$DetailStage("CLICK", 1);
       LocalDetailStageRubasHelper$DetailStage.CLICK = uDetailStage1;
       LocalDetailStageRubasHelper$DetailStage uDetailStage2 = new LocalDetailStageRubasHelper$DetailStage("ENTER", 2);
       LocalDetailStageRubasHelper$DetailStage.ENTER = uDetailStage2;
       LocalDetailStageRubasHelper$DetailStage uDetailStage3 = new LocalDetailStageRubasHelper$DetailStage("CONTAINER_CREATE", 3);
       LocalDetailStageRubasHelper$DetailStage.CONTAINER_CREATE = uDetailStage3;
       LocalDetailStageRubasHelper$DetailStage uDetailStage4 = new LocalDetailStageRubasHelper$DetailStage("FEED_PLAY", 4);
       LocalDetailStageRubasHelper$DetailStage.FEED_PLAY = uDetailStage4;
       LocalDetailStageRubasHelper$DetailStage[] uDetailStage5 = new LocalDetailStageRubasHelper$DetailStage[]{uDetailStage,uDetailStage1,uDetailStage2,uDetailStage3,uDetailStage4};
       LocalDetailStageRubasHelper$DetailStage.$VALUES = uDetailStage5;
    }
    public void LocalDetailStageRubasHelper$DetailStage(String p0,int p1){
       super(p0, p1);
    }
    public static LocalDetailStageRubasHelper$DetailStage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalDetailStageRubasHelper$DetailStage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LocalDetailStageRubasHelper$DetailStage.class, p0);
    }
    public static LocalDetailStageRubasHelper$DetailStage[] values(){
       Object obj = PatchProxy.apply(null, null, LocalDetailStageRubasHelper$DetailStage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalDetailStageRubasHelper$DetailStage.$VALUES.clone();
    }
}
