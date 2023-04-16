package com.kuaishou.live.audience.basic.scene.ability.registration.LiveAudienceAbilityRegistration$1;
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
import vw0.b;

public final class LiveAudienceAbilityRegistration$1 extends Lambda implements l	// class@000a39
{
    public static final LiveAudienceAbilityRegistration$1 INSTANCE;

    static {
       LiveAudienceAbilityRegistration$1.INSTANCE = new LiveAudienceAbilityRegistration$1();
    }
    public void LiveAudienceAbilityRegistration$1(){
       super(1);
    }
    public final LiveBaseAbility invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceAbilityRegistration$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new b(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
