package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMaintenanceConfig;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter extends TypeAdapter	// class@001053
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveMaintenanceConfig.class);
    }
    public void LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveMaintenanceConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8be1b2bd:
                      if (str.equals("serviceInMaintenancePrompt")) {
                         i = 0;
                      }
                      break;
                    case 0xaf0f032d:
                      if (str.equals("disableVoiceCommentDisplay")) {
                         i = 1;
                      }
                      break;
                    case 0xef51eb46:
                      if (str.equals("disableVoicePartyDisplay")) {
                         i = 2;
                      }
                      break;
                    case 0x4d075f88:
                      if (str.equals("disableAudioLiveDisplay")) {
                         i = 3;
                      }
                      break;
                    case 0x7914c43f:
                      if (str.equals("disablePkDisplay")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mAnchorServiceInMaintenancePrompt = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mDisableAnchorVoiceCommentDisplay = KnownTypeAdapters$g.a(p0, obj.mDisableAnchorVoiceCommentDisplay);
                      break;
                    case 2:
                      obj.mDisableAnchorVoicePartyDisplay = KnownTypeAdapters$g.a(p0, obj.mDisableAnchorVoicePartyDisplay);
                      break;
                    case 3:
                      obj.mDisableAnchorAudioLiveDisplay = KnownTypeAdapters$g.a(p0, obj.mDisableAnchorAudioLiveDisplay);
                      break;
                    case 4:
                      obj.mDisableAnchorPkDisplay = KnownTypeAdapters$g.a(p0, obj.mDisableAnchorPkDisplay);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableVoiceCommentDisplay");
          p0.P(p1.mDisableAnchorVoiceCommentDisplay);
          p0.r("disableVoicePartyDisplay");
          p0.P(p1.mDisableAnchorVoicePartyDisplay);
          p0.r("disableAudioLiveDisplay");
          p0.P(p1.mDisableAnchorAudioLiveDisplay);
          p0.r("disablePkDisplay");
          p0.P(p1.mDisableAnchorPkDisplay);
          if (p1.mAnchorServiceInMaintenancePrompt != null) {
             p0.r("serviceInMaintenancePrompt");
             TypeAdapters.A.write(p0, p1.mAnchorServiceInMaintenancePrompt);
          }
          p0.j();
       }
       return;
    }
}
