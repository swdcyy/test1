package com.kwai.feature.api.feed.detail.router.biz.normal.ToProfilePlan;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ToProfilePlan extends Enum	// class@000eb6
{
    public static final ToProfilePlan[] $VALUES;
    public static final ToProfilePlan NON_SMOOTH;
    public static final ToProfilePlan NON_SMOOTH_OPT;
    public static final ToProfilePlan SMOOTH;

    static {
       ToProfilePlan toProfilePla = new ToProfilePlan("NON_SMOOTH", 0);
       ToProfilePlan.NON_SMOOTH = toProfilePla;
       ToProfilePlan toProfilePla1 = new ToProfilePlan("NON_SMOOTH_OPT", 1);
       ToProfilePlan.NON_SMOOTH_OPT = toProfilePla1;
       ToProfilePlan toProfilePla2 = new ToProfilePlan("SMOOTH", 2);
       ToProfilePlan.SMOOTH = toProfilePla2;
       ToProfilePlan[] toProfilePla3 = new ToProfilePlan[]{toProfilePla,toProfilePla1,toProfilePla2};
       ToProfilePlan.$VALUES = toProfilePla3;
    }
    public void ToProfilePlan(String p0,int p1){
       super(p0, p1);
    }
    public static ToProfilePlan valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ToProfilePlan.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ToProfilePlan.class, p0);
    }
    public static ToProfilePlan[] values(){
       Object obj = PatchProxy.apply(null, null, ToProfilePlan.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ToProfilePlan.$VALUES.clone();
    }
    public boolean isSmooth(){
       boolean b = (this == ToProfilePlan.SMOOTH)? true: false;
       return b;
    }
}
