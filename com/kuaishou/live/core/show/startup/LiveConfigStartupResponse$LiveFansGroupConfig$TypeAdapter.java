package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupSharePanelInfo;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter extends TypeAdapter	// class@001039
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter.d = a.get(LiveConfigStartupResponse$LiveFansGroupConfig.class);
    }
    public void LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig.class));
       this.c = p0.j(a.get(LiveConfigStartupResponse$LiveFansGroupSharePanelInfo.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveFansGroupConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x93d2f380:
                      if (str.equals("shareBonus")) {
                         i = 0;
                      }
                      break;
                    case 0x94798901:
                      if (str.equals("pullStatusRetryIntervalInMs")) {
                         i = 1;
                      }
                      break;
                    case 0x9491dd65:
                      if (str.equals("sharePanel")) {
                         i = 2;
                      }
                      break;
                    case 0xbb99c93a:
                      if (str.equals("flashJoin")) {
                         i = 3;
                      }
                      break;
                    case 0xbe526024:
                      if (str.equals("enableDecreaseUnActiveDaysLimit")) {
                         i = 4;
                      }
                      break;
                    case 0xc0b52566:
                      if (str.equals("pullStatusMaxDelayIntervalInMs")) {
                         i = 5;
                      }
                      break;
                    case 0xe10000f8:
                      if (str.equals("joinCoins")) {
                         i = 6;
                      }
                      break;
                    case 0x3007aa6e:
                      if (str.equals("helpUrl")) {
                         i = 7;
                      }
                      break;
                    case 0x65368c59:
                      if (str.equals("displayJoinText")) {
                         i = 8;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mShareBonus = KnownTypeAdapters$k.a(p0, obj.mShareBonus);
                      break;
                    case 1:
                      obj.mPullStatusRetryIntervalInMs = KnownTypeAdapters$n.a(p0, obj.mPullStatusRetryIntervalInMs);
                      break;
                    case 2:
                      obj.mLiveFansGroupSharePanelInfo = this.c.read(p0);
                      break;
                    case 3:
                      obj.mLiveFansGroupFlashJoinConfig = this.b.read(p0);
                      break;
                    case 4:
                      obj.mEnableDecreaseUnActiveDaysLimit = KnownTypeAdapters$g.a(p0, obj.mEnableDecreaseUnActiveDaysLimit);
                      break;
                    case 5:
                      obj.mPullStatusMaxDelayIntervalInMs = KnownTypeAdapters$n.a(p0, obj.mPullStatusMaxDelayIntervalInMs);
                      break;
                    case 6:
                      obj.mJoinCoinCount = KnownTypeAdapters$k.a(p0, obj.mJoinCoinCount);
                      break;
                    case 7:
                      obj.mFansGroupIntroductionPageH5Url = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mJoinButtonText = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mFansGroupIntroductionPageH5Url != null) {
             p0.r("helpUrl");
             TypeAdapters.A.write(p0, p1.mFansGroupIntroductionPageH5Url);
          }
          if (p1.mJoinButtonText != null) {
             p0.r("displayJoinText");
             TypeAdapters.A.write(p0, p1.mJoinButtonText);
          }
          p0.r("joinCoins");
          p0.K((long)p1.mJoinCoinCount);
          p0.r("pullStatusRetryIntervalInMs");
          p0.K(p1.mPullStatusRetryIntervalInMs);
          p0.r("pullStatusMaxDelayIntervalInMs");
          p0.K(p1.mPullStatusMaxDelayIntervalInMs);
          if (p1.mLiveFansGroupFlashJoinConfig != null) {
             p0.r("flashJoin");
             this.b.write(p0, p1.mLiveFansGroupFlashJoinConfig);
          }
          if (p1.mLiveFansGroupSharePanelInfo != null) {
             p0.r("sharePanel");
             this.c.write(p0, p1.mLiveFansGroupSharePanelInfo);
          }
          p0.r("shareBonus");
          p0.K((long)p1.mShareBonus);
          p0.r("enableDecreaseUnActiveDaysLimit");
          p0.P(p1.mEnableDecreaseUnActiveDaysLimit);
          p0.j();
       }
       return;
    }
}
