package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Number;
import hu2.k;
import hu2.i;
import ry1.b;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LiveVoicePartyConfig;

public final class VoicePartyAudienceViewController$createMicSeatPendantDependency$3 extends Lambda implements a	// class@00183c
{
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$createMicSeatPendantDependency$3(VoicePartyAudienceViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       VoicePartyAudienceViewController$createMicSeatPendantDependency$3 obj = PatchProxy.apply(objArray, this, VoicePartyAudienceViewController$createMicSeatPendantDependency$3.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, VoicePartyAudienceViewController.class, str);
       boolean b = true;
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          b uob = obj.H.e().b();
          if (uob != null) {
             LiveTimeConsumingUserStatusResponse liveTimeCons = uob.d0();
             if (liveTimeCons != null) {
                liveTimeCons = liveTimeCons.mLiveVoicePartyConfig;
                if (liveTimeCons != null) {
                   i = liveTimeCons.mRoomType;
                }
             }
          }
          i = 1;
       }
       if (i != b) {
          b = false;
       }
       return b;
    }
}
