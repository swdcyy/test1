package com.kuaishou.live.common.core.basic.liveconfig.LiveConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.liveconfig.LiveConfig;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class LiveConfig$TypeAdapter extends TypeAdapter	// class@000eac
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfig$TypeAdapter.b = a.get(LiveConfig.class);
    }
    public void LiveConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8ee92fec:
                      if (str.equals("enableLiveGameAdaptiveQosCollect")) {
                         i = 0;
                      }
                      break;
                    case 0x92ee6267:
                      if (str.equals("disableLiveKaraokeGrade")) {
                         i = 1;
                      }
                      break;
                    case 0xac22fd0d:
                      if (str.equals("disablePkInterestTag")) {
                         i = 2;
                      }
                      break;
                    case 0xdc9a9876:
                      if (str.equals("disablePkCloseOtherPlayerVoice")) {
                         i = 3;
                      }
                      break;
                    case 0xdd3d4bee:
                      if (str.equals("liveGameAdaptiveQosCollectInterval")) {
                         i = 4;
                      }
                      break;
                    case 0xdd855866:
                      if (str.equals("disableForbidVoiceCommentInPkAndChat")) {
                         i = 5;
                      }
                      break;
                    case 0xeccc1df5:
                      if (str.equals("disableStartPk")) {
                         i = 6;
                      }
                      break;
                    case 0xf99d1ce3:
                      if (str.equals("disableAutoPauseDelayed")) {
                         i = 7;
                      }
                      break;
                    case 0x8c46aa:
                      if (str.equals("enableTuhaoOfflineConfigurable")) {
                         i = 8;
                      }
                      break;
                    case 0x4d62bed:
                      if (str.equals("disableLiveEndGetRecommend")) {
                         i = 9;
                      }
                      break;
                    case 0x1d66396d:
                      if (str.equals("disableFansTop")) {
                         i = 10;
                      }
                      break;
                    case 0x1ea37974:
                      if (str.equals("supportAryaHeadphoneMonitor")) {
                         i = 11;
                      }
                      break;
                    case 0x247048ed:
                      if (str.equals("disableWishList")) {
                         i = 12;
                      }
                      break;
                    case 0x3b8dcb11:
                      if (str.equals("disableAudienceWishList")) {
                         i = 13;
                      }
                      break;
                    case 0x4a28edc3:
                      if (str.equals("disableShowGuessRecord")) {
                         i = 14;
                      }
                      break;
                    case 0x4caf9011:
                      if (str.equals("disablePkHistory")) {
                         i = 15;
                      }
                      break;
                    case 0x537b0408:
                      if (str.equals("disableLiveTreasureBox")) {
                         i = 16;
                      }
                      break;
                    case 0x63b067f2:
                      if (str.equals("enableLiveGameAdaptiveQosPlusCollect")) {
                         i = 17;
                      }
                      break;
                    case 0x66c89976:
                      if (str.equals("disablePkDetest")) {
                         i = 18;
                      }
                      break;
                    case 0x68dc9f99:
                      if (str.equals("disableLiveKtv")) {
                         i = 19;
                      }
                      break;
                    case 0x6bcf42f0:
                      if (str.equals("disablePkSelectNewStyle")) {
                         i = 20;
                      }
                      break;
                    case 0x72e35fab:
                      if (str.equals("enableCameraVerticalFlip")) {
                         i = 21;
                      }
                      break;
                    case 0x73d9ec9e:
                      if (str.equals("disableFloatingWindow")) {
                         i = 22;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnableLiveGameAdaptiveQosCollect = KnownTypeAdapters$g.a(p0, obj.mEnableLiveGameAdaptiveQosCollect);
                      break;
                    case 1:
                      obj.mDisableLiveKaraokeGrade = KnownTypeAdapters$g.a(p0, obj.mDisableLiveKaraokeGrade);
                      break;
                    case 2:
                      obj.mDisablePkInterestTab = KnownTypeAdapters$g.a(p0, obj.mDisablePkInterestTab);
                      break;
                    case 3:
                      obj.mDisablePkCloseOtherPlayerVoice = KnownTypeAdapters$g.a(p0, obj.mDisablePkCloseOtherPlayerVoice);
                      break;
                    case 4:
                      obj.mLiveGameAdaptiveQosCollectInterval = KnownTypeAdapters$n.a(p0, obj.mLiveGameAdaptiveQosCollectInterval);
                      break;
                    case 5:
                      obj.mDisableForbidVoiceCommentInPkAndChat = KnownTypeAdapters$g.a(p0, obj.mDisableForbidVoiceCommentInPkAndChat);
                      break;
                    case 6:
                      obj.mDisableStartPk = KnownTypeAdapters$g.a(p0, obj.mDisableStartPk);
                      break;
                    case 7:
                      obj.mDisableAutoPauseDelayed = KnownTypeAdapters$g.a(p0, obj.mDisableAutoPauseDelayed);
                      break;
                    case 8:
                      obj.mEnableTuhaoOfflineConfigurable = KnownTypeAdapters$g.a(p0, obj.mEnableTuhaoOfflineConfigurable);
                      break;
                    case 9:
                      obj.mDisableLiveEndGetRecommend = KnownTypeAdapters$g.a(p0, obj.mDisableLiveEndGetRecommend);
                      break;
                    case 10:
                      obj.mDisableFansTop = KnownTypeAdapters$g.a(p0, obj.mDisableFansTop);
                      break;
                    case 11:
                      obj.mSupportAryaHeadphoneMonitor = KnownTypeAdapters$g.a(p0, obj.mSupportAryaHeadphoneMonitor);
                      break;
                    case 12:
                      obj.mDisableWishList = KnownTypeAdapters$g.a(p0, obj.mDisableWishList);
                      break;
                    case 13:
                      obj.mDisableAudienceWishList = KnownTypeAdapters$g.a(p0, obj.mDisableAudienceWishList);
                      break;
                    case 14:
                      obj.mDisableShowGuessRecord = KnownTypeAdapters$g.a(p0, obj.mDisableShowGuessRecord);
                      break;
                    case 15:
                      obj.mDisablePkHistory = KnownTypeAdapters$g.a(p0, obj.mDisablePkHistory);
                      break;
                    case 16:
                      obj.mDisableLiveTreasureBox = KnownTypeAdapters$g.a(p0, obj.mDisableLiveTreasureBox);
                      break;
                    case 17:
                      obj.mEnableLiveGameAdaptiveQosPlusCollect = KnownTypeAdapters$g.a(p0, obj.mEnableLiveGameAdaptiveQosPlusCollect);
                      break;
                    case 18:
                      obj.mDisablePkDetest = KnownTypeAdapters$g.a(p0, obj.mDisablePkDetest);
                      break;
                    case 19:
                      obj.mDisableLiveKtv = KnownTypeAdapters$g.a(p0, obj.mDisableLiveKtv);
                      break;
                    case 20:
                      obj.mDisablePkSelectNewStyle = KnownTypeAdapters$g.a(p0, obj.mDisablePkSelectNewStyle);
                      break;
                    case 21:
                      obj.mEnableCameraVerticalFlip = KnownTypeAdapters$g.a(p0, obj.mEnableCameraVerticalFlip);
                      break;
                    case 22:
                      obj.mDisableFloatingWindow = KnownTypeAdapters$g.a(p0, obj.mDisableFloatingWindow);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enableTuhaoOfflineConfigurable");
          p0.P(p1.mEnableTuhaoOfflineConfigurable);
          p0.r("enableCameraVerticalFlip");
          p0.P(p1.mEnableCameraVerticalFlip);
          p0.r("disableShowGuessRecord");
          p0.P(p1.mDisableShowGuessRecord);
          p0.r("disableLiveEndGetRecommend");
          p0.P(p1.mDisableLiveEndGetRecommend);
          p0.r("disableAutoPauseDelayed");
          p0.P(p1.mDisableAutoPauseDelayed);
          p0.r("disableLiveKtv");
          p0.P(p1.mDisableLiveKtv);
          p0.r("supportAryaHeadphoneMonitor");
          p0.P(p1.mSupportAryaHeadphoneMonitor);
          p0.r("disableStartPk");
          p0.P(p1.mDisableStartPk);
          p0.r("disableLiveTreasureBox");
          p0.P(p1.mDisableLiveTreasureBox);
          p0.r("liveGameAdaptiveQosCollectInterval");
          p0.K(p1.mLiveGameAdaptiveQosCollectInterval);
          p0.r("enableLiveGameAdaptiveQosPlusCollect");
          p0.P(p1.mEnableLiveGameAdaptiveQosPlusCollect);
          p0.r("enableLiveGameAdaptiveQosCollect");
          p0.P(p1.mEnableLiveGameAdaptiveQosCollect);
          p0.r("disableLiveKaraokeGrade");
          p0.P(p1.mDisableLiveKaraokeGrade);
          p0.r("disableWishList");
          p0.P(p1.mDisableWishList);
          p0.r("disableAudienceWishList");
          p0.P(p1.mDisableAudienceWishList);
          p0.r("disablePkSelectNewStyle");
          p0.P(p1.mDisablePkSelectNewStyle);
          p0.r("disablePkCloseOtherPlayerVoice");
          p0.P(p1.mDisablePkCloseOtherPlayerVoice);
          p0.r("disableForbidVoiceCommentInPkAndChat");
          p0.P(p1.mDisableForbidVoiceCommentInPkAndChat);
          p0.r("disableFloatingWindow");
          p0.P(p1.mDisableFloatingWindow);
          p0.r("disablePkHistory");
          p0.P(p1.mDisablePkHistory);
          p0.r("disablePkInterestTag");
          p0.P(p1.mDisablePkInterestTab);
          p0.r("disablePkDetest");
          p0.P(p1.mDisablePkDetest);
          p0.r("disableFansTop");
          p0.P(p1.mDisableFansTop);
          p0.j();
       }
       return;
    }
}
