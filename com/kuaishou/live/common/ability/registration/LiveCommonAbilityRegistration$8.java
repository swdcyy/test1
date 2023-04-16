package com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$8;
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
import t81.c;

public final class LiveCommonAbilityRegistration$8 extends Lambda implements l	// class@000e5e
{
    public static final LiveCommonAbilityRegistration$8 INSTANCE;

    static {
       LiveCommonAbilityRegistration$8.INSTANCE = new LiveCommonAbilityRegistration$8();
    }
    public void LiveCommonAbilityRegistration$8(){
       super(1);
    }
    public final LiveBaseAbility invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonAbilityRegistration$8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new c(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
