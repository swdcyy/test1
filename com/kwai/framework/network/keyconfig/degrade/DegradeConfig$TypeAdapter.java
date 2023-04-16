package com.kwai.framework.network.keyconfig.degrade.DegradeConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import pb6.d;
import com.kwai.framework.network.keyconfig.TimeRange$TypeAdapter;
import com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicyWrapper$TypeAdapter;
import com.kwai.framework.network.keyconfig.degrade.ApiCdnFallbackPolicy$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.framework.network.keyconfig.degrade.ApiProtoType$TypeAdapter;
import com.kwai.framework.network.keyconfig.degrade.ApiRequestIntervalPolicy$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicyWrapper;
import com.kwai.framework.network.keyconfig.TimeRange;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class DegradeConfig$TypeAdapter extends TypeAdapter	// class@000c3b
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
    public static final a l;

    static {
       DegradeConfig$TypeAdapter.l = a.get(DegradeConfig.class);
    }
    public void DegradeConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(TimeRange$TypeAdapter.b);
       this.c = p0.j(ApiDegradePolicyWrapper$TypeAdapter.d);
       TypeAdapter typeAdapter = p0.j(ApiCdnFallbackPolicy$TypeAdapter.d);
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(ApiProtoType$TypeAdapter.c);
       this.f = typeAdapter;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(ApiRequestIntervalPolicy$TypeAdapter.e);
       this.h = typeAdapter;
       this.i = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(a.get(d.class));
       this.j = typeAdapter1;
       this.k = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, DegradeConfig$TypeAdapter.class, "2");
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
             obj = new DegradeConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x942ffc48:
                      if (str.equals("apiProtoType")) {
                         i = 0;
                      }
                      break;
                    case 0x993e96d1:
                      if (str.equals("disableSpeedTesting")) {
                         i = 1;
                      }
                      break;
                    case 0x9c1f5944:
                      if (str.equals("blockingWaitDurationMs")) {
                         i = 2;
                      }
                      break;
                    case 0xa5e2dcef:
                      if (str.equals("disableResourcePreloading")) {
                         i = 3;
                      }
                      break;
                    case 0xa958f169:
                      if (str.equals("apiDegradeTime")) {
                         i = 4;
                      }
                      break;
                    case 0xb0630cce:
                      if (str.equals("apiDegradePolicy")) {
                         i = 5;
                      }
                      break;
                    case 0xf99942c7:
                      if (str.equals("disableHomeFeedAutoRefresh")) {
                         i = 6;
                      }
                      break;
                    case 0x1ac3437c:
                      if (str.equals("apiMinRequestInterval")) {
                         i = 7;
                      }
                      break;
                    case 0x1e773bbb:
                      if (str.equals("apiDelayAndRandRequestTimePolicy")) {
                         i = 8;
                      }
                      break;
                    case 0x26e1e354:
                      if (str.equals("disableClientLogAbConfig")) {
                         i = 9;
                      }
                      break;
                    case 0x5026fe52:
                      if (str.equals("disableAzerothSyncConfig")) {
                         i = 10;
                      }
                      break;
                    case 0x58df9b9e:
                      if (str.equals("disableFlexSyncConfig")) {
                         i = 11;
                      }
                      break;
                    case 0x5ed3ceeb:
                      if (str.equals("disableIMSDKSyncConfig")) {
                         i = 12;
                      }
                      break;
                    case 0x61043d2a:
                      if (str.equals("disableNebulaCheckUpdate")) {
                         i = 13;
                      }
                      break;
                    case 0x776507d5:
                      if (str.equals("apiCdnDegradePolicy")) {
                         i = 14;
                      }
                      break;
                    case 0x7fa0f138:
                      if (str.equals("disableYodaSyncConfig")) {
                         i = 15;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mApiProtoType = this.g.read(p0);
                      break;
                    case 1:
                      obj.disableSpeedTesting = KnownTypeAdapters$g.a(p0, obj.disableSpeedTesting);
                      break;
                    case 2:
                      obj.blockingWaitDurationMs = KnownTypeAdapters$k.a(p0, obj.blockingWaitDurationMs);
                      break;
                    case 3:
                      obj.disableResourcePreloading = KnownTypeAdapters$g.a(p0, obj.disableResourcePreloading);
                      break;
                    case 4:
                      obj.apiDegradeTime = this.b.read(p0);
                      break;
                    case 5:
                      obj.mApiDegradePolicy = this.c.read(p0);
                      break;
                    case 6:
                      obj.disableHomeFeedAutoRefresh = KnownTypeAdapters$g.a(p0, obj.disableHomeFeedAutoRefresh);
                      break;
                    case 7:
                      obj.mApiMinRequestInterval = this.i.read(p0);
                      break;
                    case 8:
                      obj.apiDelayAndRandRequestTimePolicy = this.k.read(p0);
                      break;
                    case 9:
                      obj.mDisableClientLogAbConfig = KnownTypeAdapters$g.a(p0, obj.mDisableClientLogAbConfig);
                      break;
                    case 10:
                      obj.disableAzerothSyncConfig = KnownTypeAdapters$g.a(p0, obj.disableAzerothSyncConfig);
                      break;
                    case 11:
                      obj.mDisableFlexSyncConfig = KnownTypeAdapters$g.a(p0, obj.mDisableFlexSyncConfig);
                      break;
                    case 12:
                      obj.disableIMSDKSyncConfig = KnownTypeAdapters$g.a(p0, obj.disableIMSDKSyncConfig);
                      break;
                    case 13:
                      obj.mDisableNebulaCheckUpdate = KnownTypeAdapters$g.a(p0, obj.mDisableNebulaCheckUpdate);
                      break;
                    case 14:
                      obj.mApiCdnDegradePolicy = this.e.read(p0);
                      break;
                    case 15:
                      obj.disableYodaSyncConfig = KnownTypeAdapters$g.a(p0, obj.disableYodaSyncConfig);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DegradeConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableHomeFeedAutoRefresh");
          p0.P(p1.disableHomeFeedAutoRefresh);
          p0.r("disableSpeedTesting");
          p0.P(p1.disableSpeedTesting);
          if (p1.apiDegradeTime != null) {
             p0.r("apiDegradeTime");
             this.b.write(p0, p1.apiDegradeTime);
          }
          p0.r("blockingWaitDurationMs");
          p0.K((long)p1.blockingWaitDurationMs);
          if (p1.mApiDegradePolicy != null) {
             p0.r("apiDegradePolicy");
             this.c.write(p0, p1.mApiDegradePolicy);
          }
          if (p1.mApiCdnDegradePolicy != null) {
             p0.r("apiCdnDegradePolicy");
             this.e.write(p0, p1.mApiCdnDegradePolicy);
          }
          if (p1.mApiProtoType != null) {
             p0.r("apiProtoType");
             this.g.write(p0, p1.mApiProtoType);
          }
          if (p1.mApiMinRequestInterval != null) {
             p0.r("apiMinRequestInterval");
             this.i.write(p0, p1.mApiMinRequestInterval);
          }
          if (p1.apiDelayAndRandRequestTimePolicy != null) {
             p0.r("apiDelayAndRandRequestTimePolicy");
             this.k.write(p0, p1.apiDelayAndRandRequestTimePolicy);
          }
          p0.r("disableYodaSyncConfig");
          p0.P(p1.disableYodaSyncConfig);
          p0.r("disableAzerothSyncConfig");
          p0.P(p1.disableAzerothSyncConfig);
          p0.r("disableIMSDKSyncConfig");
          p0.P(p1.disableIMSDKSyncConfig);
          p0.r("disableClientLogAbConfig");
          p0.P(p1.mDisableClientLogAbConfig);
          p0.r("disableResourcePreloading");
          p0.P(p1.disableResourcePreloading);
          p0.r("disableNebulaCheckUpdate");
          p0.P(p1.mDisableNebulaCheckUpdate);
          p0.r("disableFlexSyncConfig");
          p0.P(p1.mDisableFlexSyncConfig);
          p0.j();
       }
       return;
    }
}
