package com.kwai.framework.network.idc.config.ScheduleConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.network.idc.config.ScheduleConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import hb6.c;
import com.yxcorp.retrofit.region.config.RegionInfo;
import bb6.e;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class ScheduleConfig$TypeAdapter extends TypeAdapter	// class@000c0d
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
       ScheduleConfig$TypeAdapter.i = a.get(ScheduleConfig.class);
    }
    public void ScheduleConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter a = TypeAdapters.A;
       KnownTypeAdapters$ListTypeAdapter listTypeAdap = new KnownTypeAdapters$ListTypeAdapter(a, new KnownTypeAdapters$d());
       this.b = listTypeAdap;
       this.c = new KnownTypeAdapters$MapTypeAdapter(a, listTypeAdap, new KnownTypeAdapters$e());
       TypeAdapter typeAdapter = p0.j(a.get(c.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.f = p0.j(a.get(RegionInfo.class));
       TypeAdapter typeAdapter1 = p0.j(a.get(e.class));
       this.g = typeAdapter1;
       this.h = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ScheduleConfig$TypeAdapter.class, "2");
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
             obj = new ScheduleConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9ccdddb1:
                      if (str.equals("serverIdcOnly")) {
                         i = 0;
                      }
                      break;
                    case 0x9db409a4:
                      if (str.equals("idc_host_ip_map")) {
                         i = 1;
                      }
                      break;
                    case 0xa2aa2f19:
                      if (str.equals("region_info")) {
                         i = 2;
                      }
                      break;
                    case 0xf01781d7:
                      if (str.equals("userFlag")) {
                         i = 3;
                      }
                      break;
                    case 0xf3a7bbd5:
                      if (str.equals("idc_list")) {
                         i = 4;
                      }
                      break;
                    case 0x25272eb:
                      if (str.equals("cdnDomainDispatch")) {
                         i = 5;
                      }
                      break;
                    case 0x1bd215c6:
                      if (str.equals("goodIdcThresholdMs")) {
                         i = 6;
                      }
                      break;
                    case 0x334b3401:
                      if (str.equals("idc_list_https")) {
                         i = 7;
                      }
                      break;
                    case 0x33d1ab92:
                      if (str.equals("testSpeedTimeoutMs")) {
                         i = 8;
                      }
                      break;
                    case 0x44e4e92a:
                      if (str.equals("speedTestTypeAndOrder")) {
                         i = 9;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mServerIdcOnly = KnownTypeAdapters$g.a(p0, obj.mServerIdcOnly);
                      break;
                    case 1:
                      obj.mIdcIpList = this.e.read(p0);
                      break;
                    case 2:
                      obj.mRegionInfo = this.f.read(p0);
                      break;
                    case 3:
                      obj.mUserFlag = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mHosts = this.c.read(p0);
                      break;
                    case 5:
                      obj.mCdnHostGroups = this.h.read(p0);
                      break;
                    case 6:
                      obj.mGoodIdcThresholdMs = KnownTypeAdapters$n.a(p0, obj.mGoodIdcThresholdMs);
                      break;
                    case 7:
                      obj.mHttpsHosts = this.c.read(p0);
                      break;
                    case 8:
                      obj.mTestSpeedTimeoutMs = KnownTypeAdapters$n.a(p0, obj.mTestSpeedTimeoutMs);
                      break;
                    case 9:
                      obj.mSpeedTestTypeAndOrder = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScheduleConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSpeedTestTypeAndOrder != null) {
             p0.r("speedTestTypeAndOrder");
             this.b.write(p0, p1.mSpeedTestTypeAndOrder);
          }
          p0.r("goodIdcThresholdMs");
          p0.K(p1.mGoodIdcThresholdMs);
          p0.r("testSpeedTimeoutMs");
          p0.K(p1.mTestSpeedTimeoutMs);
          p0.r("serverIdcOnly");
          p0.P(p1.mServerIdcOnly);
          if (p1.mHosts != null) {
             p0.r("idc_list");
             this.c.write(p0, p1.mHosts);
          }
          if (p1.mHttpsHosts != null) {
             p0.r("idc_list_https");
             this.c.write(p0, p1.mHttpsHosts);
          }
          if (p1.mIdcIpList != null) {
             p0.r("idc_host_ip_map");
             this.e.write(p0, p1.mIdcIpList);
          }
          if (p1.mRegionInfo != null) {
             p0.r("region_info");
             this.f.write(p0, p1.mRegionInfo);
          }
          if (p1.mUserFlag != null) {
             p0.r("userFlag");
             TypeAdapters.A.write(p0, p1.mUserFlag);
          }
          if (p1.mCdnHostGroups != null) {
             p0.r("cdnDomainDispatch");
             this.h.write(p0, p1.mCdnHostGroups);
          }
          p0.j();
       }
       return;
    }
}
