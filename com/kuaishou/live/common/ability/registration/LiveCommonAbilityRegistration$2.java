package com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$2;
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
import t81.j;

public final class LiveCommonAbilityRegistration$2 extends Lambda implements l	// class@000e58
{
    public static final LiveCommonAbilityRegistration$2 INSTANCE;

    static {
       LiveCommonAbilityRegistration$2.INSTANCE = new LiveCommonAbilityRegistration$2();
    }
    public void LiveCommonAbilityRegistration$2(){
       super(1);
    }
    public final LiveBaseAbility invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonAbilityRegistration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new j(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
