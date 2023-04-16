package com.kwai.component.kcube.model.model.TabModel$EffectImmediately;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TabModel$EffectImmediately extends Enum	// class@000996
{
    public static final TabModel$EffectImmediately[] $VALUES;
    public static final TabModel$EffectImmediately ANYWAY;
    public static final TabModel$EffectImmediately ONLY_IF_USING_LOCAL;

    static {
       TabModel$EffectImmediately uEffectImmed = new TabModel$EffectImmediately("ONLY_IF_USING_LOCAL", 0);
       TabModel$EffectImmediately.ONLY_IF_USING_LOCAL = uEffectImmed;
       TabModel$EffectImmediately uEffectImmed1 = new TabModel$EffectImmediately("ANYWAY", 1);
       TabModel$EffectImmediately.ANYWAY = uEffectImmed1;
       TabModel$EffectImmediately[] uEffectImmed2 = new TabModel$EffectImmediately[]{uEffectImmed,uEffectImmed1};
       TabModel$EffectImmediately.$VALUES = uEffectImmed2;
    }
    public void TabModel$EffectImmediately(String p0,int p1){
       super(p0, p1);
    }
    public static TabModel$EffectImmediately valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TabModel$EffectImmediately.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TabModel$EffectImmediately.class, p0);
    }
    public static TabModel$EffectImmediately[] values(){
       Object obj = PatchProxy.apply(null, null, TabModel$EffectImmediately.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TabModel$EffectImmediately.$VALUES.clone();
    }
}
