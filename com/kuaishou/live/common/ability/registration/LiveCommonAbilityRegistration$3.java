package com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import lp3.e;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import t81.i;

public final class LiveCommonAbilityRegistration$3 extends Lambda implements l	// class@000e59
{
    public static final LiveCommonAbilityRegistration$3 INSTANCE;

    static {
       LiveCommonAbilityRegistration$3.INSTANCE = new LiveCommonAbilityRegistration$3();
    }
    public void LiveCommonAbilityRegistration$3(){
       super(1);
    }
    public final LiveBaseAbility invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonAbilityRegistration$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new i(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
