package com.kuaishou.live.audience.basic.scene.ability.registration.LiveAudienceAbilityRegistration;
import v81.a;
import java.lang.Enum;
import com.kuaishou.live.basic.ability.LiveStreamInfoAbility;
import com.kuaishou.live.audience.basic.scene.ability.registration.LiveAudienceAbilityRegistration$1;
import java.lang.String;
import java.lang.Class;
import msd.l;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceAbilityRegistration extends Enum implements a	// class@000a3a
{
    public final l builder;
    public final Class clazz;
    public static final LiveAudienceAbilityRegistration[] $VALUES;
    public static final LiveAudienceAbilityRegistration LiveStreamInfo;

    static {
       LiveAudienceAbilityRegistration liveAudience1;
       LiveAudienceAbilityRegistration[] liveAudience = new LiveAudienceAbilityRegistration[]{liveAudience1};
       liveAudience1 = new LiveAudienceAbilityRegistration("LiveStreamInfo", 0, LiveStreamInfoAbility.class, LiveAudienceAbilityRegistration$1.INSTANCE);
       LiveAudienceAbilityRegistration.LiveStreamInfo = liveAudience1;
       LiveAudienceAbilityRegistration.$VALUES = liveAudience;
    }
    public void LiveAudienceAbilityRegistration(String p0,int p1,Class p2,l p3){
       super(p0, p1);
       this.clazz = p2;
       this.builder = p3;
    }
    public static LiveAudienceAbilityRegistration valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceAbilityRegistration.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceAbilityRegistration.class, p0);
    }
    public static LiveAudienceAbilityRegistration[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceAbilityRegistration.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceAbilityRegistration.$VALUES.clone();
    }
    public l getBuilder(){
       return this.builder;
    }
    public Class getClazz(){
       return this.clazz;
    }
}
