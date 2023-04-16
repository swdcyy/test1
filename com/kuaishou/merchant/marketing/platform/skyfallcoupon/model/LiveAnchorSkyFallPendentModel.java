package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveAnchorSkyFallPendentModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.o5;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityPendant;
import java.util.concurrent.TimeUnit;

public class LiveAnchorSkyFallPendentModel implements Serializable	// class@001b48
{
    public String mActivityIds;
    public int mActivityType;
    public int mDisappearTime;
    public int mPendantActivityStatus;
    public String mPendantActivityStatusName;
    public String mRnPage;

    public void LiveAnchorSkyFallPendentModel(){
       super();
    }
    public static int a(Map p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveAnchorSkyFallPendentModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p1)) {
          return 0;
       }
       return o5.b(p0.get(p1), 0);
    }
    public static LiveAnchorSkyFallPendentModel create(LiveRoomSignalMessage$SCKwaishopLiveActivityPendant p0){
       LiveAnchorSkyFallPendentModel obj = PatchProxy.applyOneRefs(p0, null, LiveAnchorSkyFallPendentModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.extraMap == null) {
          return null;
       }
       obj = new LiveAnchorSkyFallPendentModel();
       obj.update(p0);
       return obj;
    }
    public void update(LiveRoomSignalMessage$SCKwaishopLiveActivityPendant p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSkyFallPendentModel.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.extraMap;
          if (p0 != null) {
             this.updateFromMap(p0);
          }
       }
       return;
    }
    public void updateFromMap(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSkyFallPendentModel.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mPendantActivityStatus = LiveAnchorSkyFallPendentModel.a(p0, "activityState");
       this.mDisappearTime = (int)TimeUnit.SECONDS.toMillis((long)LiveAnchorSkyFallPendentModel.a(p0, "disappearTime"));
       this.mPendantActivityStatusName = p0.get("activityStateName");
       this.mRnPage = p0.get("rnPage");
       this.mActivityIds = p0.get("activityIds");
       this.mActivityType = LiveAnchorSkyFallPendentModel.a(p0, "activityType");
       return;
    }
}
