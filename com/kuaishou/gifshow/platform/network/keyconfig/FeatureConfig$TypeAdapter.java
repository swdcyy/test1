package com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.platform.network.keyconfig.ResourcePreloadingConfig;
import java.lang.Object;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import na0.g;
import com.kuaishou.gifshow.platform.network.keyconfig.HodorResourceConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.PassportConfig$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.PlayerConfig$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ZtGameKeyConfig$TypeAdapter;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.RecoDegradeConfig$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.UploadConfig$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.PushConfig$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.KLinkConfig$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig$TypeAdapter;
import com.yxcorp.gifshow.pendant.kmessage.Message$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.EntranceParams$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.gifshow.platform.network.keyconfig.RecoDegradeConfig;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonObject;
import com.kuaishou.gifshow.platform.network.keyconfig.PassportConfig;
import com.yxcorp.gifshow.pendant.response.EntranceParams;
import com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.KLinkConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.PushConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.ZtGameKeyConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.PlayerConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.UploadConfig;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import com.google.gson.stream.b;

public final class FeatureConfig$TypeAdapter extends TypeAdapter	// class@000861
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public final TypeAdapter j;
    public final TypeAdapter k;
    public final TypeAdapter l;
    public final TypeAdapter m;
    public final TypeAdapter n;
    public final TypeAdapter o;
    public final TypeAdapter p;
    public final TypeAdapter q;
    public final TypeAdapter r;
    public final TypeAdapter s;
    public final TypeAdapter t;
    public final TypeAdapter u;
    public final TypeAdapter v;
    public final TypeAdapter w;
    public final TypeAdapter x;
    public static final a y;

    static {
       FeatureConfig$TypeAdapter.y = a.get(FeatureConfig.class);
    }
    public void FeatureConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PassportConfig$TypeAdapter.b);
       this.c = p0.j(PlayerConfig$TypeAdapter.b);
       this.d = p0.j(GameCenterKeyConfig$TypeAdapter.c);
       this.e = p0.j(ZtGameKeyConfig$TypeAdapter.c);
       this.f = p0.j(a.get(ResourcePreloadingConfig.class));
       this.g = p0.j(DegradeConfig$TypeAdapter.c);
       this.h = p0.j(a.get(Object.class));
       this.i = p0.j(RecoDegradeConfig$TypeAdapter.c);
       this.j = p0.j(UploadConfig$TypeAdapter.c);
       this.k = p0.j(PushConfig$TypeAdapter.b);
       this.l = p0.j(KLinkConfig$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(a.get(DynamicTabConfig.class));
       this.m = typeAdapter;
       this.n = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(GlobalPopupConfig$TypeAdapter.c);
       this.o = typeAdapter;
       this.p = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(Message$TypeAdapter.d);
       this.q = typeAdapter;
       this.r = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.s = p0.j(EntranceParams$TypeAdapter.j);
       typeAdapter = p0.j(ActivityPopupConfig$TypeAdapter.e);
       this.t = typeAdapter;
       this.u = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(g.class));
       this.v = typeAdapter;
       this.w = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.x = p0.j(a.get(HodorResourceConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FeatureConfig$TypeAdapter.class, "2");
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
             obj = new FeatureConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa1dfb1f9:
                      if (str.equals("fallbackable2CdnConfig")) {
                         i = 0;
                      }
                      break;
                    case 0xbac04211:
                      if (str.equals("business_logic_1")) {
                         i = 1;
                      }
                      break;
                    case 0xc3133bf0:
                      if (str.equals("hodorResourceConfig")) {
                         i = 2;
                      }
                      break;
                    case 0xc77e6c0a:
                      if (str.equals("cnyDegradeConfig")) {
                         i = 3;
                      }
                      break;
                    case 0xcd024ac9:
                      if (str.equals("globalPopup")) {
                         i = 4;
                      }
                      break;
                    case 0xce040e01:
                      if (str.equals("upload")) {
                         i = 5;
                      }
                      break;
                    case 0xd426d04e:
                      if (str.equals("resolveConfig")) {
                         i = 6;
                      }
                      break;
                    case 0xd5619d83:
                      if (str.equals("playerConfig")) {
                         i = 7;
                      }
                      break;
                    case 0xd6b3a24c:
                      if (str.equals("ztGame")) {
                         i = 8;
                      }
                      break;
                    case 0xee5c53e7:
                      if (str.equals("updateTabs")) {
                         i = 9;
                      }
                      break;
                    case 0xfaeac6e2:
                      if (str.equals("switches")) {
                         i = 10;
                      }
                      break;
                    case 0x34af1a:
                      if (str.equals("push")) {
                         i = 11;
                      }
                      break;
                    case 0x61682e5:
                      if (str.equals("klink")) {
                         i = 12;
                      }
                      break;
                    case 0x947c6e7:
                      if (str.equals("gameCenter")) {
                         i = 13;
                      }
                      break;
                    case 0x27db1a69:
                      if (str.equals("kemActivityPopups")) {
                         i = 14;
                      }
                      break;
                    case 0x3372cf66:
                      if (str.equals("kemActivityWidget")) {
                         i = 15;
                      }
                      break;
                    case 0x48868c12:
                      if (str.equals("passport")) {
                         i = 16;
                      }
                      break;
                    case 0x48a7961b:
                      if (str.equals("logControlConfig")) {
                         i = 17;
                      }
                      break;
                    case 0x4b778e09:
                      if (str.equals("resourcePreloadingConfig")) {
                         i = 18;
                      }
                      break;
                    case 0x59d7b5ee:
                      if (str.equals("kemActivityMessages")) {
                         i = 19;
                      }
                      break;
                    case 0x7483c398:
                      if (str.equals("logSwitch")) {
                         i = 20;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDegradeConfig = this.g.read(p0);
                      break;
                    case 1:
                      obj.mBusinessLogic_1 = KnownTypeAdapters$g.a(p0, obj.mBusinessLogic_1);
                      break;
                    case 2:
                      obj.mHodorResourceConfig = this.x.read(p0);
                      break;
                    case 3:
                      obj.mSceneDegradeConfig = this.w.read(p0);
                      break;
                    case 4:
                      obj.mGlobalPopup = this.p.read(p0);
                      break;
                    case 5:
                      obj.mUploadConfig = this.j.read(p0);
                      break;
                    case 6:
                      obj.mResolveConfig = KnownTypeAdapters.p.read(p0);
                      break;
                    case 7:
                      obj.mPlayerConfig = this.c.read(p0);
                      break;
                    case 8:
                      obj.mZtGameConfig = this.e.read(p0);
                      break;
                    case 9:
                      obj.mDynamicTabs = this.n.read(p0);
                      break;
                    case 10:
                      obj.mSwitches = this.h.read(p0);
                      break;
                    case 11:
                      obj.mPushConfig = this.k.read(p0);
                      break;
                    case 12:
                      obj.mKLinkConfig = this.l.read(p0);
                      break;
                    case 13:
                      obj.mGameCenterConfig = this.d.read(p0);
                      break;
                    case 14:
                      obj.mKemActivityPopups = this.u.read(p0);
                      break;
                    case 15:
                      obj.mKemActivityWidget = this.s.read(p0);
                      break;
                    case 16:
                      obj.mPassportConfig = this.b.read(p0);
                      break;
                    case 17:
                      obj.mLogControlConfig = KnownTypeAdapters.p.read(p0);
                      break;
                    case 18:
                      obj.mResourcePreloadingConfig = this.f.read(p0);
                      break;
                    case 19:
                      obj.mKemActivityMessages = this.r.read(p0);
                      break;
                    case 20:
                      obj.mRecoDegradeConfig = this.i.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeatureConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("business_logic_1");
          p0.P(p1.mBusinessLogic_1);
          if (p1.mPassportConfig != null) {
             p0.r("passport");
             this.b.write(p0, p1.mPassportConfig);
          }
          if (p1.mPlayerConfig != null) {
             p0.r("playerConfig");
             this.c.write(p0, p1.mPlayerConfig);
          }
          if (p1.mGameCenterConfig != null) {
             p0.r("gameCenter");
             this.d.write(p0, p1.mGameCenterConfig);
          }
          if (p1.mZtGameConfig != null) {
             p0.r("ztGame");
             this.e.write(p0, p1.mZtGameConfig);
          }
          if (p1.mResourcePreloadingConfig != null) {
             p0.r("resourcePreloadingConfig");
             this.f.write(p0, p1.mResourcePreloadingConfig);
          }
          if (p1.mDegradeConfig != null) {
             p0.r("fallbackable2CdnConfig");
             this.g.write(p0, p1.mDegradeConfig);
          }
          if (p1.mSwitches != null) {
             p0.r("switches");
             this.h.write(p0, p1.mSwitches);
          }
          if (p1.mRecoDegradeConfig != null) {
             p0.r("logSwitch");
             this.i.write(p0, p1.mRecoDegradeConfig);
          }
          if (p1.mLogControlConfig != null) {
             p0.r("logControlConfig");
             KnownTypeAdapters.p.write(p0, p1.mLogControlConfig);
          }
          if (p1.mUploadConfig != null) {
             p0.r("upload");
             this.j.write(p0, p1.mUploadConfig);
          }
          if (p1.mPushConfig != null) {
             p0.r("push");
             this.k.write(p0, p1.mPushConfig);
          }
          if (p1.mKLinkConfig != null) {
             p0.r("klink");
             this.l.write(p0, p1.mKLinkConfig);
          }
          if (p1.mResolveConfig != null) {
             p0.r("resolveConfig");
             KnownTypeAdapters.p.write(p0, p1.mResolveConfig);
          }
          if (p1.mDynamicTabs != null) {
             p0.r("updateTabs");
             this.n.write(p0, p1.mDynamicTabs);
          }
          if (p1.mGlobalPopup != null) {
             p0.r("globalPopup");
             this.p.write(p0, p1.mGlobalPopup);
          }
          if (p1.mKemActivityMessages != null) {
             p0.r("kemActivityMessages");
             this.r.write(p0, p1.mKemActivityMessages);
          }
          if (p1.mKemActivityWidget != null) {
             p0.r("kemActivityWidget");
             this.s.write(p0, p1.mKemActivityWidget);
          }
          if (p1.mKemActivityPopups != null) {
             p0.r("kemActivityPopups");
             this.u.write(p0, p1.mKemActivityPopups);
          }
          if (p1.mSceneDegradeConfig != null) {
             p0.r("cnyDegradeConfig");
             this.w.write(p0, p1.mSceneDegradeConfig);
          }
          if (p1.mHodorResourceConfig != null) {
             p0.r("hodorResourceConfig");
             this.x.write(p0, p1.mHodorResourceConfig);
          }
          p0.j();
       }
       return;
    }
}
