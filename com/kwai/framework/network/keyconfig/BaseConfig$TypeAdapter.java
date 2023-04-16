package com.kwai.framework.network.keyconfig.BaseConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.retrofit.model.LocationConfigModel;
import com.kwai.framework.network.keyconfig.ApiRetryPolicy$TypeAdapter;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig$TypeAdapter;
import com.kwai.framework.network.idc.config.ScheduleConfig$TypeAdapter;
import com.kwai.framework.network.keyconfig.KeyConfigCdnDegrade$TypeAdapter;
import com.kwai.framework.network.keyconfig.KeyConfigErrorToastPolicy$TypeAdapter;
import com.kwai.framework.network.keyconfig.WebLocationConfigModel$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import com.kwai.framework.network.keyconfig.KeyConfigErrorToastPolicy;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.framework.network.keyconfig.ApiRetryPolicy;
import com.kwai.framework.network.keyconfig.KeyConfigCdnDegrade;
import com.kwai.framework.network.idc.config.ScheduleConfig;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonObject;
import com.kwai.framework.network.keyconfig.WebLocationConfigModel;
import com.google.gson.stream.b;

public final class BaseConfig$TypeAdapter extends TypeAdapter	// class@000c14
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public static final a i;

    static {
       BaseConfig$TypeAdapter.i = a.get(BaseConfig.class);
    }
    public void BaseConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ApiRetryPolicy$TypeAdapter.b);
       this.c = p0.j(DegradeConfig$TypeAdapter.l);
       this.d = p0.j(ScheduleConfig$TypeAdapter.i);
       this.e = p0.j(KeyConfigCdnDegrade$TypeAdapter.c);
       this.f = p0.j(KeyConfigErrorToastPolicy$TypeAdapter.c);
       this.g = p0.j(WebLocationConfigModel$TypeAdapter.b);
       this.h = p0.j(a.get(LocationConfigModel.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BaseConfig$TypeAdapter.class, "2");
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
             obj = new BaseConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xab466d44:
                      if (str.equals("locationH5Config")) {
                         i = 0;
                      }
                      break;
                    case 0xd19a5ec7:
                      if (str.equals("aio_risk")) {
                         i = 1;
                      }
                      break;
                    case 0xd6669297:
                      if (str.equals("schedule")) {
                         i = 2;
                      }
                      break;
                    case 0x1901032:
                      if (str.equals("locationWhiteList")) {
                         i = 3;
                      }
                      break;
                    case 0x4d8506a:
                      if (str.equals("keyConfigCdnDegrade")) {
                         i = 4;
                      }
                      break;
                    case 0x2103dc2b:
                      if (str.equals("azPrefix")) {
                         i = 5;
                      }
                      break;
                    case 0x2960cf80:
                      if (str.equals("apiRetryPolicy")) {
                         i = 6;
                      }
                      break;
                    case 0x332adbbe:
                      if (str.equals("dnsTimeoutMs")) {
                         i = 7;
                      }
                      break;
                    case 0x3df69513:
                      if (str.equals("serverTimestamp")) {
                         i = 8;
                      }
                      break;
                    case 0x59ff1bb2:
                      if (str.equals("keyConfigErrorToastPolicy")) {
                         i = 9;
                      }
                      break;
                    case 0x5c295bf6:
                      if (str.equals("degrade")) {
                         i = 10;
                      }
                      break;
                    case 0x7bdf9382:
                      if (str.equals("serviceUnavailableHint")) {
                         i = 11;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mLocationH5Config = this.g.read(p0);
                      break;
                    case 1:
                      obj.mAioConfig = KnownTypeAdapters.p.read(p0);
                      break;
                    case 2:
                      obj.mSchedule = this.d.read(p0);
                      break;
                    case 3:
                      obj.mLocationConfigModel = this.h.read(p0);
                      break;
                    case 4:
                      obj.mKeyConfigCdnDegrade = this.e.read(p0);
                      break;
                    case 5:
                      obj.mAzPrefix = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mApiRetryPolicy = this.b.read(p0);
                      break;
                    case 7:
                      obj.mDnsTimeoutMs = KnownTypeAdapters$k.a(p0, obj.mDnsTimeoutMs);
                      break;
                    case 8:
                      obj.mServerTimestamp = KnownTypeAdapters$n.a(p0, obj.mServerTimestamp);
                      break;
                    case 9:
                      obj.mKeyConfigErrorToastPolicy = this.f.read(p0);
                      break;
                    case 10:
                      obj.mDegrade = this.c.read(p0);
                      break;
                    case 11:
                      obj.mServiceUnavailableHint = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("dnsTimeoutMs");
          p0.K((long)p1.mDnsTimeoutMs);
          if (p1.mApiRetryPolicy != null) {
             p0.r("apiRetryPolicy");
             this.b.write(p0, p1.mApiRetryPolicy);
          }
          if (p1.mDegrade != null) {
             p0.r("degrade");
             this.c.write(p0, p1.mDegrade);
          }
          p0.r("serverTimestamp");
          p0.K(p1.mServerTimestamp);
          if (p1.mServiceUnavailableHint != null) {
             p0.r("serviceUnavailableHint");
             TypeAdapters.A.write(p0, p1.mServiceUnavailableHint);
          }
          if (p1.mSchedule != null) {
             p0.r("schedule");
             this.d.write(p0, p1.mSchedule);
          }
          if (p1.mAzPrefix != null) {
             p0.r("azPrefix");
             TypeAdapters.A.write(p0, p1.mAzPrefix);
          }
          if (p1.mKeyConfigCdnDegrade != null) {
             p0.r("keyConfigCdnDegrade");
             this.e.write(p0, p1.mKeyConfigCdnDegrade);
          }
          if (p1.mKeyConfigErrorToastPolicy != null) {
             p0.r("keyConfigErrorToastPolicy");
             this.f.write(p0, p1.mKeyConfigErrorToastPolicy);
          }
          if (p1.mAioConfig != null) {
             p0.r("aio_risk");
             KnownTypeAdapters.p.write(p0, p1.mAioConfig);
          }
          if (p1.mLocationH5Config != null) {
             p0.r("locationH5Config");
             this.g.write(p0, p1.mLocationH5Config);
          }
          if (p1.mLocationConfigModel != null) {
             p0.r("locationWhiteList");
             this.h.write(p0, p1.mLocationConfigModel);
          }
          p0.j();
       }
       return;
    }
}
