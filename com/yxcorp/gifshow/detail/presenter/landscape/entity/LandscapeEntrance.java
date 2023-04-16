package com.yxcorp.gifshow.detail.presenter.landscape.entity.LandscapeEntrance;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LandscapeEntrance extends Enum	// class@0016ed
{
    public static final LandscapeEntrance[] $VALUES;
    public static final LandscapeEntrance GRAVITY;
    public static final LandscapeEntrance SCREEN;

    static {
       LandscapeEntrance landscapeEnt = new LandscapeEntrance("SCREEN", 0);
       LandscapeEntrance.SCREEN = landscapeEnt;
       LandscapeEntrance landscapeEnt1 = new LandscapeEntrance("GRAVITY", 1);
       LandscapeEntrance.GRAVITY = landscapeEnt1;
       LandscapeEntrance[] landscapeEnt2 = new LandscapeEntrance[]{landscapeEnt,landscapeEnt1};
       LandscapeEntrance.$VALUES = landscapeEnt2;
    }
    public void LandscapeEntrance(String p0,int p1){
       super(p0, p1);
    }
    public static LandscapeEntrance valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LandscapeEntrance.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LandscapeEntrance.class, p0);
    }
    public static LandscapeEntrance[] values(){
       Object obj = PatchProxy.apply(null, null, LandscapeEntrance.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LandscapeEntrance.$VALUES.clone();
    }
}
