package com.yxcorp.gifshow.pendant.response.EntranceParams$PendantConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.pendant.response.EntranceParams$PendantConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.yxcorp.gifshow.pendant.response.UIParams$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.BubbleConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$i;
import com.yxcorp.gifshow.pendant.response.UIParams;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam;
import com.google.gson.stream.b;

public final class EntranceParams$PendantConfig$TypeAdapter extends TypeAdapter	// class@001271
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public static final a h;

    static {
       EntranceParams$PendantConfig$TypeAdapter.h = a.get(EntranceParams$PendantConfig.class);
    }
    public void EntranceParams$PendantConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(UIParams$TypeAdapter.b);
       this.e = p0.j(PendantLocationParam$TypeAdapter.b);
       TypeAdapter typeAdapter1 = p0.j(BubbleConfig$TypeAdapter.b);
       this.f = typeAdapter1;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, EntranceParams$PendantConfig$TypeAdapter.class, "2");
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
             obj = new EntranceParams$PendantConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xaedfdda9:
                      if (str.equals("widgetInitialPosition")) {
                         i = 0;
                      }
                      break;
                    case 0xb477352d:
                      if (str.equals("animationFramePMs")) {
                         i = 1;
                      }
                      break;
                    case 0xba67b53a:
                      if (str.equals("uiParams")) {
                         i = 2;
                      }
                      break;
                    case 0xbe5ac32b:
                      if (str.equals("remindAfterSecond")) {
                         i = 3;
                      }
                      break;
                    case 0xc487afe2:
                      if (str.equals("suspensionSeconds")) {
                         i = 4;
                      }
                      break;
                    case 0xd963ec47:
                      if (str.equals("suspensionNextColdLaunch")) {
                         i = 5;
                      }
                      break;
                    case 0xee29a9d6:
                      if (str.equals("animationIntervalSeconds")) {
                         i = 6;
                      }
                      break;
                    case 0xffbe0ff8:
                      if (str.equals("iconCdnUrls")) {
                         i = 7;
                      }
                      break;
                    case 0xffd2ce4f:
                      if (str.equals("clickXMarkPolicy")) {
                         i = 8;
                      }
                      break;
                    case 0x7f08ceb:
                      if (str.equals("hasXMark")) {
                         i = 9;
                      }
                      break;
                    case 0x2da96be5:
                      if (str.equals("bubbleQueue")) {
                         i = 10;
                      }
                      break;
                    case 0x557e545d:
                      if (str.equals("animationResourceURL")) {
                         i = 11;
                      }
                      break;
                    case 0x5f57c866:
                      if (str.equals("animationCirculateTimes")) {
                         i = 12;
                      }
                      break;
                    case 0x61ad9236:
                      if (str.equals("iconUrl")) {
                         i = 13;
                      }
                      break;
                    case 0x7adbeddb:
                      if (str.equals("bubbleMessage")) {
                         i = 14;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mWidgetInitialPosition = this.e.read(p0);
                      break;
                    case 1:
                      obj.mAnimationFramePMs = KnownTypeAdapters$k.a(p0, obj.mAnimationFramePMs);
                      break;
                    case 2:
                      obj.mUIParams = this.d.read(p0);
                      break;
                    case 3:
                      obj.mRemindAfterSecond = KnownTypeAdapters$k.a(p0, obj.mRemindAfterSecond);
                      break;
                    case 4:
                      obj.mSuspensionSeconds = KnownTypeAdapters$k.a(p0, obj.mSuspensionSeconds);
                      break;
                    case 5:
                      obj.mSuspensionNextColdLaunch = KnownTypeAdapters$g.a(p0, obj.mSuspensionNextColdLaunch);
                      break;
                    case 6:
                      obj.mAnimationIntervalSeconds = KnownTypeAdapters$i.a(p0, obj.mAnimationIntervalSeconds);
                      break;
                    case 7:
                      obj.mIconCdnUrls = this.c.read(p0);
                      break;
                    case 8:
                      obj.mClickXMarkPolicy = KnownTypeAdapters$k.a(p0, obj.mClickXMarkPolicy);
                      break;
                    case 9:
                      obj.mHasXMark = KnownTypeAdapters$g.a(p0, obj.mHasXMark);
                      break;
                    case 10:
                      obj.mBubbleConfigList = this.g.read(p0);
                      break;
                    case 11:
                      obj.mAnimationResourceUrl = TypeAdapters.A.read(p0);
                      break;
                    case 12:
                      obj.mAnimationCirculateTimes = KnownTypeAdapters$k.a(p0, obj.mAnimationCirculateTimes);
                      break;
                    case 13:
                      obj.mIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 14:
                      obj.mBubbleMsg = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EntranceParams$PendantConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("hasXMark");
          p0.P(p1.mHasXMark);
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mIconCdnUrls != null) {
             p0.r("iconCdnUrls");
             this.c.write(p0, p1.mIconCdnUrls);
          }
          if (p1.mUIParams != null) {
             p0.r("uiParams");
             this.d.write(p0, p1.mUIParams);
          }
          p0.r("clickXMarkPolicy");
          p0.K((long)p1.mClickXMarkPolicy);
          p0.r("suspensionSeconds");
          p0.K((long)p1.mSuspensionSeconds);
          p0.r("remindAfterSecond");
          p0.K((long)p1.mRemindAfterSecond);
          p0.r("suspensionNextColdLaunch");
          p0.P(p1.mSuspensionNextColdLaunch);
          if (p1.mAnimationResourceUrl != null) {
             p0.r("animationResourceURL");
             TypeAdapters.A.write(p0, p1.mAnimationResourceUrl);
          }
          p0.r("animationFramePMs");
          p0.K((long)p1.mAnimationFramePMs);
          p0.r("animationIntervalSeconds");
          p0.J(p1.mAnimationIntervalSeconds);
          p0.r("animationCirculateTimes");
          p0.K((long)p1.mAnimationCirculateTimes);
          if (p1.mBubbleMsg != null) {
             p0.r("bubbleMessage");
             TypeAdapters.A.write(p0, p1.mBubbleMsg);
          }
          if (p1.mWidgetInitialPosition != null) {
             p0.r("widgetInitialPosition");
             this.e.write(p0, p1.mWidgetInitialPosition);
          }
          if (p1.mBubbleConfigList != null) {
             p0.r("bubbleQueue");
             this.g.write(p0, p1.mBubbleConfigList);
          }
          p0.j();
       }
       return;
    }
}
