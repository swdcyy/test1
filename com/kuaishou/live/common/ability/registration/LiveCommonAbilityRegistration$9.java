package com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$9;
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
import t81.l;

public final class LiveCommonAbilityRegistration$9 extends Lambda implements l	// class@000e5f
{
    public static final LiveCommonAbilityRegistration$9 INSTANCE;

    static {
       LiveCommonAbilityRegistration$9.INSTANCE = new LiveCommonAbilityRegistration$9();
    }
    public void LiveCommonAbilityRegistration$9(){
       super(1);
    }
    public final LiveBaseAbility invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonAbilityRegistration$9.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new l(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
