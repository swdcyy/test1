package com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$4;
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
import t81.h;

public final class LiveCommonAbilityRegistration$4 extends Lambda implements l	// class@000e5a
{
    public static final LiveCommonAbilityRegistration$4 INSTANCE;

    static {
       LiveCommonAbilityRegistration$4.INSTANCE = new LiveCommonAbilityRegistration$4();
    }
    public void LiveCommonAbilityRegistration$4(){
       super(1);
    }
    public final LiveBaseAbility invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonAbilityRegistration$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new h(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
