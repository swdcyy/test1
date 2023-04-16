package com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration;
import v81.a;
import java.lang.Enum;
import com.kuaishou.live.basic.ability.LiveToastAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$1;
import java.lang.String;
import java.lang.Class;
import msd.l;
import com.kuaishou.live.basic.ability.LiveServerTimeAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$2;
import com.kuaishou.live.basic.ability.LiveRouterAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$3;
import com.kuaishou.live.basic.ability.LiveResourceAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$4;
import com.kuaishou.live.basic.ability.LiveAppAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$5;
import com.kuaishou.live.basic.ability.LiveStorageAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$6;
import com.kuaishou.live.basic.ability.LiveHttpAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$7;
import com.kuaishou.live.basic.ability.LiveEffectAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$8;
import com.kuaishou.live.basic.ability.LiveSwitchConfigAbility;
import com.kuaishou.live.common.ability.registration.LiveCommonAbilityRegistration$9;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCommonAbilityRegistration extends Enum implements a	// class@000e60
{
    public final l builder;
    public final Class clazz;
    public static final LiveCommonAbilityRegistration[] $VALUES;
    public static final LiveCommonAbilityRegistration LiveApp;
    public static final LiveCommonAbilityRegistration LiveEffect;
    public static final LiveCommonAbilityRegistration LiveHttp;
    public static final LiveCommonAbilityRegistration LiveResource;
    public static final LiveCommonAbilityRegistration LiveRouter;
    public static final LiveCommonAbilityRegistration LiveServerTime;
    public static final LiveCommonAbilityRegistration LiveStorage;
    public static final LiveCommonAbilityRegistration LiveSwitchConfig;
    public static final LiveCommonAbilityRegistration LiveToast;

    static {
       LiveCommonAbilityRegistration[] liveCommonAb = new LiveCommonAbilityRegistration[9];
       LiveCommonAbilityRegistration liveCommonAb1 = new LiveCommonAbilityRegistration("LiveToast", 0, LiveToastAbility.class, LiveCommonAbilityRegistration$1.INSTANCE);
       LiveCommonAbilityRegistration.LiveToast = liveCommonAb1;
       liveCommonAb[0] = liveCommonAb1;
       liveCommonAb1 = new LiveCommonAbilityRegistration("LiveServerTime", 1, LiveServerTimeAbility.class, LiveCommonAbilityRegistration$2.INSTANCE);
       LiveCommonAbilityRegistration.LiveServerTime = liveCommonAb1;
       liveCommonAb[1] = liveCommonAb1;
       liveCommonAb1 = new LiveCommonAbilityRegistration("LiveRouter", 2, LiveRouterAbility.class, LiveCommonAbilityRegistration$3.INSTANCE);
       LiveCommonAbilityRegistration.LiveRouter = liveCommonAb1;
       liveCommonAb[2] = liveCommonAb1;
       liveCommonAb1 = new LiveCommonAbilityRegistration("LiveResource", 3, LiveResourceAbility.class, LiveCommonAbilityRegistration$4.INSTANCE);
       LiveCommonAbilityRegistration.LiveResource = liveCommonAb1;
       liveCommonAb[3] = liveCommonAb1;
       liveCommonAb1 = new LiveCommonAbilityRegistration("LiveApp", 4, LiveAppAbility.class, LiveCommonAbilityRegistration$5.INSTANCE);
       LiveCommonAbilityRegistration.LiveApp = liveCommonAb1;
       liveCommonAb[4] = liveCommonAb1;
       liveCommonAb1 = new LiveCommonAbilityRegistration("LiveStorage", 5, LiveStorageAbility.class, LiveCommonAbilityRegistration$6.INSTANCE);
       LiveCommonAbilityRegistration.LiveStorage = liveCommonAb1;
       liveCommonAb[5] = liveCommonAb1;
       liveCommonAb1 = new LiveCommonAbilityRegistration("LiveHttp", 6, LiveHttpAbility.class, LiveCommonAbilityRegistration$7.INSTANCE);
       LiveCommonAbilityRegistration.LiveHttp = liveCommonAb1;
       liveCommonAb[6] = liveCommonAb1;
       liveCommonAb1 = new LiveCommonAbilityRegistration("LiveEffect", 7, LiveEffectAbility.class, LiveCommonAbilityRegistration$8.INSTANCE);
       LiveCommonAbilityRegistration.LiveEffect = liveCommonAb1;
       liveCommonAb[7] = liveCommonAb1;
       liveCommonAb1 = new LiveCommonAbilityRegistration("LiveSwitchConfig", 8, LiveSwitchConfigAbility.class, LiveCommonAbilityRegistration$9.INSTANCE);
       LiveCommonAbilityRegistration.LiveSwitchConfig = liveCommonAb1;
       liveCommonAb[8] = liveCommonAb1;
       LiveCommonAbilityRegistration.$VALUES = liveCommonAb;
    }
    public void LiveCommonAbilityRegistration(String p0,int p1,Class p2,l p3){
       super(p0, p1);
       this.clazz = p2;
       this.builder = p3;
    }
    public static LiveCommonAbilityRegistration valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommonAbilityRegistration.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommonAbilityRegistration.class, p0);
    }
    public static LiveCommonAbilityRegistration[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommonAbilityRegistration.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommonAbilityRegistration.$VALUES.clone();
    }
    public l getBuilder(){
       return this.builder;
    }
    public Class getClazz(){
       return this.clazz;
    }
}
