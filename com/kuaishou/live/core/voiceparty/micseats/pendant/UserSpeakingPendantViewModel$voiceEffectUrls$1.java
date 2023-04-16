package com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewModel$voiceEffectUrls$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewModel;
import java.lang.Object;
import ts2.d;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ts2.j;
import ts2.j$a;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import trd.t;
import java.util.Collection;

public final class UserSpeakingPendantViewModel$voiceEffectUrls$1 extends Lambda implements q	// class@00175b
{
    public final UserSpeakingPendantViewModel this$0;

    public void UserSpeakingPendantViewModel$voiceEffectUrls$1(UserSpeakingPendantViewModel p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return this.invoke(p0, p1, p2);
    }
    public final List invoke(d p0,Set p1,Map p2){
       UserInfo userInfo;
       UserInfo mId;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, UserSpeakingPendantViewModel$voiceEffectUrls$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "speakingUsers");
       a.p(p2, "voiceWaveInfo");
       obj = null;
       if (p0 != null) {
          j state = p0.getState();
          if (state instanceof j$a) {
             userInfo = state.a();
          label_0030 :
             if (userInfo != null) {
                b.P(LiveVoicePartyLogTag.MIC_SEAT.appendTag("UserSpeaking"), "play speaking effect mId "+userInfo.mId+" speaker = "+p1);
             }
             if (userInfo != null && p1.contains(userInfo.mId)) {
                mId = userInfo.mId;
                a.o(mId, "userInfo.mId");
                Collection uCollection = p2.get(mId);
                if (uCollection == null) {
                   uCollection = t.k(this.this$0.x0(userInfo.isFemale()));
                }
                if (uCollection.isEmpty()) {
                   uCollection = t.k(this.this$0.x0(userInfo.isFemale()));
                }
                obj = uCollection;
             }
             return obj;
          }
       }
       userInfo = obj;
       goto label_0030 ;
    }
}
