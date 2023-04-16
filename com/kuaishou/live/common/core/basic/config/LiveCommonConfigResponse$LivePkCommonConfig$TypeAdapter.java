package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LivePkCommonConfig;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$m;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter extends TypeAdapter	// class@000e88
{
    public final Gson a;
    public static final a b;

    static {
       LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter.b = a.get(LiveCommonConfigResponse$LivePkCommonConfig.class);
    }
    public void LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter.class, "2");
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
             obj = new LiveCommonConfigResponse$LivePkCommonConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x808418a4:
                      if (str.equals("defaultRatioType")) {
                         i = 0;
                      }
                      break;
                    case 0x8e9bf5f0:
                      if (str.equals("randomMatchDes")) {
                         i = 1;
                      }
                      break;
                    case 0xda648f3e:
                      if (str.equals("popGuidePromptDelayTimeGaps")) {
                         i = 2;
                      }
                      break;
                    case 0xf16e8919:
                      if (str.equals("talentMatchDes")) {
                         i = 3;
                      }
                      break;
                    case 0xd27bfac:
                      if (str.equals("nearbyMatchDes")) {
                         i = 4;
                      }
                      break;
                    case 0x12a510cb:
                      if (str.equals("friendMatchDes")) {
                         i = 5;
                      }
                      break;
                    case 0x35b268f1:
                      if (str.equals("pollPunishMagicFaceTimeoutMs")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPkDefaultRatioType = KnownTypeAdapters$k.a(p0, obj.mPkDefaultRatioType);
                      break;
                    case 1:
                      obj.mRandomMatchDescription = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mPopGuidePromptDelayTimeList = KnownTypeAdapters$m.a(p0);
                      break;
                    case 3:
                      obj.mTalentMatchDescription = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mNearbyMatchDescription = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mFriendMatchDescription = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mPollPunishMagicFaceTimeoutMs = KnownTypeAdapters$n.a(p0, obj.mPollPunishMagicFaceTimeoutMs);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mRandomMatchDescription != null) {
             p0.r("randomMatchDes");
             TypeAdapters.A.write(p0, p1.mRandomMatchDescription);
          }
          if (p1.mNearbyMatchDescription != null) {
             p0.r("nearbyMatchDes");
             TypeAdapters.A.write(p0, p1.mNearbyMatchDescription);
          }
          if (p1.mTalentMatchDescription != null) {
             p0.r("talentMatchDes");
             TypeAdapters.A.write(p0, p1.mTalentMatchDescription);
          }
          if (p1.mFriendMatchDescription != null) {
             p0.r("friendMatchDes");
             TypeAdapters.A.write(p0, p1.mFriendMatchDescription);
          }
          if (p1.mPopGuidePromptDelayTimeList != null) {
             p0.r("popGuidePromptDelayTimeGaps");
             KnownTypeAdapters$m.b(p0, p1.mPopGuidePromptDelayTimeList);
          }
          p0.r("pollPunishMagicFaceTimeoutMs");
          p0.K(p1.mPollPunishMagicFaceTimeoutMs);
          p0.r("defaultRatioType");
          p0.K((long)p1.mPkDefaultRatioType);
          p0.j();
       }
       return;
    }
}
