package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter extends TypeAdapter	// class@00105a
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig.class);
    }
    public void LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xab3b44ad:
                      if (str.equals("earnCoinSleepStatusText")) {
                         i = 0;
                      }
                      break;
                    case 0xb2a14c3b:
                      if (str.equals("delayRequestTaskInfoAfterSendGiftMillis")) {
                         i = 1;
                      }
                      break;
                    case 0xbdc9e061:
                      if (str.equals("earnCoinFirstTimeText")) {
                         i = 2;
                      }
                      break;
                    case 0x1c93371a:
                      if (str.equals("taskHelpPageUrl")) {
                         i = 3;
                      }
                      break;
                    case 0x21fb3ca4:
                      if (str.equals("taskListMainPageUrl")) {
                         i = 4;
                      }
                      break;
                    case 0x2e04f991:
                      if (str.equals("disableEarnCoin")) {
                         i = 5;
                      }
                      break;
                    case 0x64090c4c:
                      if (str.equals("sendGiftTaskGuideText")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEarnCoinSleepStatusText = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mDelayRequestTaskInfoAfterSendGiftMillis = KnownTypeAdapters$n.a(p0, obj.mDelayRequestTaskInfoAfterSendGiftMillis);
                      break;
                    case 2:
                      obj.mEarnCoinFirstTimeText = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mTaskHelpPageUrl = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mTaskListMainPageUrl = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mDisableEarnCoin = KnownTypeAdapters$g.a(p0, obj.mDisableEarnCoin);
                      break;
                    case 6:
                      obj.mSendGiftTaskGuideText = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSendGiftTaskGuideText != null) {
             p0.r("sendGiftTaskGuideText");
             TypeAdapters.A.write(p0, p1.mSendGiftTaskGuideText);
          }
          p0.r("delayRequestTaskInfoAfterSendGiftMillis");
          p0.K(p1.mDelayRequestTaskInfoAfterSendGiftMillis);
          if (p1.mTaskListMainPageUrl != null) {
             p0.r("taskListMainPageUrl");
             TypeAdapters.A.write(p0, p1.mTaskListMainPageUrl);
          }
          if (p1.mEarnCoinFirstTimeText != null) {
             p0.r("earnCoinFirstTimeText");
             TypeAdapters.A.write(p0, p1.mEarnCoinFirstTimeText);
          }
          if (p1.mEarnCoinSleepStatusText != null) {
             p0.r("earnCoinSleepStatusText");
             TypeAdapters.A.write(p0, p1.mEarnCoinSleepStatusText);
          }
          p0.r("disableEarnCoin");
          p0.P(p1.mDisableEarnCoin);
          if (p1.mTaskHelpPageUrl != null) {
             p0.r("taskHelpPageUrl");
             TypeAdapters.A.write(p0, p1.mTaskHelpPageUrl);
          }
          p0.j();
       }
       return;
    }
}
