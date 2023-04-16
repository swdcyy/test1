package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkFirstBloodConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LivePkConfig$TypeAdapter extends TypeAdapter	// class@00105d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       LiveConfigStartupResponse$LivePkConfig$TypeAdapter.d = a.get(LiveConfigStartupResponse$LivePkConfig.class);
    }
    public void LiveConfigStartupResponse$LivePkConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(LiveConfigStartupResponse$LivePkFirstBloodConfig.class));
       this.c = p0.j(a.get(LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LivePkConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LivePkConfig();
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
                    case 0xcf9c1c8d:
                      if (str.equals("startClippingPosition")) {
                         i = 1;
                      }
                      break;
                    case 0xf4ce312a:
                      if (str.equals("firstBlood")) {
                         i = 2;
                      }
                      break;
                    case 0x3497dd98:
                      if (str.equals("coolScoreAnimationMinIncrement")) {
                         i = 3;
                      }
                      break;
                    case 0x35c6082b:
                      if (str.equals("disableFormatOpeningAnimation")) {
                         i = 4;
                      }
                      break;
                    case 0x43222cd6:
                      if (str.equals("enablePkZoomIn")) {
                         i = 5;
                      }
                      break;
                    case 0x5e05d7e6:
                      if (str.equals("animationConfig")) {
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
                      obj.mStartClippingPosition = KnownTypeAdapters$j.a(p0, obj.mStartClippingPosition);
                      break;
                    case 2:
                      obj.mPkFirstBlood = this.b.read(p0);
                      break;
                    case 3:
                      obj.mCoolScoreAnimationMinIncrement = KnownTypeAdapters$k.a(p0, obj.mCoolScoreAnimationMinIncrement);
                      break;
                    case 4:
                      obj.mDisableFormatOpeningAnimation = KnownTypeAdapters$g.a(p0, obj.mDisableFormatOpeningAnimation);
                      break;
                    case 5:
                      obj.mEnablePkSmallWindow = KnownTypeAdapters$g.a(p0, obj.mEnablePkSmallWindow);
                      break;
                    case 6:
                      obj.mLivePkProgressAnimationConfig = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LivePkConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableFormatOpeningAnimation");
          p0.P(p1.mDisableFormatOpeningAnimation);
          p0.r("coolScoreAnimationMinIncrement");
          p0.K((long)p1.mCoolScoreAnimationMinIncrement);
          if (p1.mPkFirstBlood != null) {
             p0.r("firstBlood");
             this.b.write(p0, p1.mPkFirstBlood);
          }
          if (p1.mLivePkProgressAnimationConfig != null) {
             p0.r("animationConfig");
             this.c.write(p0, p1.mLivePkProgressAnimationConfig);
          }
          if (p1.mSettingsPageH5Url != null) {
             p0.r("settingsPageH5Url");
             TypeAdapters.A.write(p0, p1.mSettingsPageH5Url);
          }
          p0.r("enablePkZoomIn");
          p0.P(p1.mEnablePkSmallWindow);
          p0.r("startClippingPosition");
          p0.J((double)p1.mStartClippingPosition);
          p0.j();
       }
       return;
    }
}
