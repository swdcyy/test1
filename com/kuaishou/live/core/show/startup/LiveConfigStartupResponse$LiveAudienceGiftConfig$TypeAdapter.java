package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter extends TypeAdapter	// class@00102a
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter.d = a.get(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
    }
    public void LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveAudienceGiftConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x883e8f5c:
                      if (str.equals("disablePrivilegeGiftTab")) {
                         i = 0;
                      }
                      break;
                    case 0x9a808a30:
                      if (str.equals("enableScroll")) {
                         i = 1;
                      }
                      break;
                    case 0xa9612f8e:
                      if (str.equals("giftFeedEffectLoadAvatarMaxWaitTimeMillis")) {
                         i = 2;
                      }
                      break;
                    case 0xad23e7e9:
                      if (str.equals("disableGiftEffect")) {
                         i = 3;
                      }
                      break;
                    case 0xf3d357ae:
                      if (str.equals("disableFansGroupGiftTab")) {
                         i = 4;
                      }
                      break;
                    case 0xfd26ebc4:
                      if (str.equals("batchSendConfig")) {
                         i = 5;
                      }
                      break;
                    case 0x70d815c1:
                      if (str.equals("enableSort")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDisablePrivilegeGiftTab = KnownTypeAdapters$g.a(p0, obj.mDisablePrivilegeGiftTab);
                      break;
                    case 1:
                      obj.mEnableGiftListVerticalScrollMode = KnownTypeAdapters$g.a(p0, obj.mEnableGiftListVerticalScrollMode);
                      break;
                    case 2:
                      obj.mAvatarEffectGiftMaxWaitTimeMs = KnownTypeAdapters$n.a(p0, obj.mAvatarEffectGiftMaxWaitTimeMs);
                      break;
                    case 3:
                      obj.mDisableGiftEffect = KnownTypeAdapters$g.a(p0, obj.mDisableGiftEffect);
                      break;
                    case 4:
                      obj.mDisableFansGroupGiftTab = KnownTypeAdapters$g.a(p0, obj.mDisableFansGroupGiftTab);
                      break;
                    case 5:
                      obj.mGiftBatchConfigs = this.c.read(p0);
                      break;
                    case 6:
                      obj.mEnableGiftListSort = KnownTypeAdapters$g.a(p0, obj.mEnableGiftListSort);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disablePrivilegeGiftTab");
          p0.P(p1.mDisablePrivilegeGiftTab);
          p0.r("disableFansGroupGiftTab");
          p0.P(p1.mDisableFansGroupGiftTab);
          if (p1.mGiftBatchConfigs != null) {
             p0.r("batchSendConfig");
             this.c.write(p0, p1.mGiftBatchConfigs);
          }
          p0.r("giftFeedEffectLoadAvatarMaxWaitTimeMillis");
          p0.K(p1.mAvatarEffectGiftMaxWaitTimeMs);
          p0.r("disableGiftEffect");
          p0.P(p1.mDisableGiftEffect);
          p0.r("enableScroll");
          p0.P(p1.mEnableGiftListVerticalScrollMode);
          p0.r("enableSort");
          p0.P(p1.mEnableGiftListSort);
          p0.j();
       }
       return;
    }
}
