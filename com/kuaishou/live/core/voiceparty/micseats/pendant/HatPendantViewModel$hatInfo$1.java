package com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewModel$hatInfo$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import com.kwai.framework.model.user.UserInfo;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.hat.VoicePartyHatInfo;

public final class HatPendantViewModel$hatInfo$1 extends Lambda implements p	// class@00160b
{
    public static final HatPendantViewModel$hatInfo$1 INSTANCE;

    static {
       HatPendantViewModel$hatInfo$1.INSTANCE = new HatPendantViewModel$hatInfo$1();
    }
    public void HatPendantViewModel$hatInfo$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Pair invoke(Map p0,UserInfo p1){
       Pair obj = PatchProxy.applyTwoRefs(p0, p1, this, HatPendantViewModel$hatInfo$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "usersHatInfo");
       obj = null;
       UserInfo mId = (p1 != null)? p1.mId: obj;
       VoicePartyHatInfo voicePartyHa = p0.get(mId);
       if (voicePartyHa != null) {
          obj = new Pair(voicePartyHa, p1);
       }
       return obj;
    }
}
