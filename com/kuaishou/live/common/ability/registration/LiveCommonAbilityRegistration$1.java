package com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$1;
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
import t81.m;

public final class LiveCommonAbilityRegistration$1 extends Lambda implements l	// class@000e57
{
    public static final LiveCommonAbilityRegistration$1 INSTANCE;

    static {
       LiveCommonAbilityRegistration$1.INSTANCE = new LiveCommonAbilityRegistration$1();
    }
    public void LiveCommonAbilityRegistration$1(){
       super(1);
    }
    public final LiveBaseAbility invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonAbilityRegistration$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new m(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
