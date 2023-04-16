package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig;
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
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter extends TypeAdapter	// class@001085
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig.class);
    }
    public void LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xbc9b3b30:
                      if (str.equals("settingsPageH5Url")) {
                         i = 0;
                      }
                      break;
                    case 0xdccbb935:
                      if (str.equals("voicePartyPkGuestEndTimeoutMillis")) {
                         i = 1;
                      }
                      break;
                    case 0xe0c1a521:
                      if (str.equals("playIntroductionUrl")) {
                         i = 2;
                      }
                      break;
                    case 0x22165553:
                      if (str.equals("pollPkInfoIntervalMs")) {
                         i = 3;
                      }
                      break;
                    case 0x55628dfb:
                      if (str.equals("voicePartyPkEndTimeoutMillis")) {
                         i = 4;
                      }
                      break;
                    case 0x70c58c70:
                      if (str.equals("inviteTimeDurationMs")) {
                         i = 5;
                      }
                      break;
                    case 0x7cd1ba7e:
                      if (str.equals("connectedTimeoutMillis")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSettingsPageH5Url = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mPkGuestEndTimeoutMillis = KnownTypeAdapters$n.a(p0, obj.mPkGuestEndTimeoutMillis);
                      break;
                    case 2:
                      obj.mPlayIntroductionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mPollPkInfoIntervalMs = KnownTypeAdapters$n.a(p0, obj.mPollPkInfoIntervalMs);
                      break;
                    case 4:
                      obj.mPkEndTimeoutMillis = KnownTypeAdapters$n.a(p0, obj.mPkEndTimeoutMillis);
                      break;
                    case 5:
                      obj.mInviteTimeDurationMs = KnownTypeAdapters$n.a(p0, obj.mInviteTimeDurationMs);
                      break;
                    case 6:
                      obj.mConnectedTimeoutMillis = KnownTypeAdapters$n.a(p0, obj.mConnectedTimeoutMillis);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSettingsPageH5Url != null) {
             p0.r("settingsPageH5Url");
             TypeAdapters.A.write(p0, p1.mSettingsPageH5Url);
          }
          if (p1.mPlayIntroductionUrl != null) {
             p0.r("playIntroductionUrl");
             TypeAdapters.A.write(p0, p1.mPlayIntroductionUrl);
          }
          p0.r("inviteTimeDurationMs");
          p0.K(p1.mInviteTimeDurationMs);
          p0.r("pollPkInfoIntervalMs");
          p0.K(p1.mPollPkInfoIntervalMs);
          p0.r("connectedTimeoutMillis");
          p0.K(p1.mConnectedTimeoutMillis);
          p0.r("voicePartyPkEndTimeoutMillis");
          p0.K(p1.mPkEndTimeoutMillis);
          p0.r("voicePartyPkGuestEndTimeoutMillis");
          p0.K(p1.mPkGuestEndTimeoutMillis);
          p0.j();
       }
       return;
    }
}
