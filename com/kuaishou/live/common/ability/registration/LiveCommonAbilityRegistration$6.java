package com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$6;
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
import com.kuaishou.live.common.ability.LiveStorageAbilityImpl;

public final class LiveCommonAbilityRegistration$6 extends Lambda implements l	// class@000e5c
{
    public static final LiveCommonAbilityRegistration$6 INSTANCE;

    static {
       LiveCommonAbilityRegistration$6.INSTANCE = new LiveCommonAbilityRegistration$6();
    }
    public void LiveCommonAbilityRegistration$6(){
       super(1);
    }
    public final LiveBaseAbility invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommonAbilityRegistration$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new LiveStorageAbilityImpl(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
