package com.kuaishou.live.core.show.share.LiveCommonShareConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.share.LiveCommonShareConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.share.LiveThirdPartySharePlatform;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import pj2.z;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;
import pj2.y;

public final class LiveCommonShareConfig$TypeAdapter extends TypeAdapter	// class@00100a
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveCommonShareConfig$TypeAdapter.c = a.get(LiveCommonShareConfig.class);
    }
    public void LiveCommonShareConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(LiveThirdPartySharePlatform.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonShareConfig$TypeAdapter.class, "2");
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
             obj = new LiveCommonShareConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xd56cf66d:
                      if (str.equals("showShareGuideTimeAfterStart")) {
                         i = 0;
                      }
                      break;
                    case 0xd8c69b51:
                      if (str.equals("selectedPlatformKey")) {
                         i = 1;
                      }
                      break;
                    case 0xf0ab512a:
                      if (str.equals("shareGuideText")) {
                         i = 2;
                      }
                      break;
                    case 0x5822b13b:
                      if (str.equals("showShareRemindDuration")) {
                         i = 3;
                      }
                      break;
                    case 0x63b314f5:
                      if (str.equals("totalCountCanRemindShare")) {
                         i = 4;
                      }
                      break;
                    case 0x75f07b67:
                      if (str.equals("liveThirdPartySharePlatform")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mShowShareGuideTimeAfterStartMs = KnownTypeAdapters$n.a(p0, obj.mShowShareGuideTimeAfterStartMs);
                      break;
                    case 1:
                      obj.mSelectedPlatformKey = KnownTypeAdapters$k.a(p0, obj.mSelectedPlatformKey);
                      break;
                    case 2:
                      obj.mShareGuideText = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mShowShareRemindDurationMs = KnownTypeAdapters$n.a(p0, obj.mShowShareRemindDurationMs);
                      break;
                    case 4:
                      obj.mSingleLiveCanShowRemindShareMaxCount = KnownTypeAdapters$k.a(p0, obj.mSingleLiveCanShowRemindShareMaxCount);
                      break;
                    case 5:
                      obj.mLiveThirdPartySharePlatforms = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new z(this)).a(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonShareConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mShareGuideText != null) {
             p0.r("shareGuideText");
             TypeAdapters.A.write(p0, p1.mShareGuideText);
          }
          p0.r("showShareGuideTimeAfterStart");
          p0.K(p1.mShowShareGuideTimeAfterStartMs);
          p0.r("totalCountCanRemindShare");
          p0.K((long)p1.mSingleLiveCanShowRemindShareMaxCount);
          p0.r("selectedPlatformKey");
          p0.K((long)p1.mSelectedPlatformKey);
          p0.r("showShareRemindDuration");
          p0.K(p1.mShowShareRemindDurationMs);
          if (p1.mLiveThirdPartySharePlatforms != null) {
             p0.r("liveThirdPartySharePlatform");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new y(this)).b(p0, p1.mLiveThirdPartySharePlatforms);
          }
          p0.j();
       }
       return;
    }
}
