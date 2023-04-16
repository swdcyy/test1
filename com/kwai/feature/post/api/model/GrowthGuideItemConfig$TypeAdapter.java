package com.kwai.feature.post.api.model.GrowthGuideItemConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.model.AnchorPosition;
import com.kwai.feature.post.api.model.BridgeConfig;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.io.IOException;
import com.google.gson.stream.b;

public final class GrowthGuideItemConfig$TypeAdapter extends TypeAdapter	// class@00140c
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public static final a g;

    static {
       GrowthGuideItemConfig$TypeAdapter.g = a.get(GrowthGuideItemConfig.class);
    }
    public void GrowthGuideItemConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.p, new KnownTypeAdapters$d());
       this.c = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(AnchorPosition.class));
       TypeAdapter typeAdapter = p0.j(a.get(BridgeConfig.class));
       this.e = typeAdapter;
       this.f = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, GrowthGuideItemConfig$TypeAdapter.class, "2");
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
             obj = new GrowthGuideItemConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81b798e6:
                      if (str.equals("nativeActions")) {
                         i = 0;
                      }
                      break;
                    case 0x8ded9249:
                      if (str.equals("showTimes")) {
                         i = 1;
                      }
                      break;
                    case 0xc88436b8:
                      if (str.equals("conditions")) {
                         i = 2;
                      }
                      break;
                    case 0xcd96a7ee:
                      if (str.equals("uiType")) {
                         i = 3;
                      }
                      break;
                    case 0xcde7df44:
                      if (str.equals("unlock")) {
                         i = 4;
                      }
                      break;
                    case 0xdd6bc3fd:
                      if (str.equals("configId")) {
                         i = 5;
                      }
                      break;
                    case 0xe4b09f51:
                      if (str.equals("supportPlatforms")) {
                         i = 6;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 7;
                      }
                      break;
                    case 0x2c929929:
                      if (str.equals("position")) {
                         i = 8;
                      }
                      break;
                    case 0x599761bb:
                      if (str.equals("triggers")) {
                         i = 9;
                      }
                      break;
                    case 0x6cc4902c:
                      if (str.equals("executeTimeout")) {
                         i = 10;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.setBridgeConfigs(this.f.read(p0));
                      break;
                    case 1:
                      obj.setShowTimes(KnownTypeAdapters$k.a(p0, obj.getShowTimes()));
                      break;
                    case 2:
                      obj.setConditions(this.b.read(p0));
                      break;
                    case 3:
                      obj.setUiType(TypeAdapters.A.read(p0));
                      break;
                    case 4:
                      obj.setConfigUnlock(KnownTypeAdapters$g.a(p0, obj.getConfigUnlock()));
                      break;
                    case 5:
                      obj.setConfigId(TypeAdapters.A.read(p0));
                      break;
                    case 6:
                      obj.setSupportPlatforms(this.c.read(p0));
                      break;
                    case 7:
                      obj.setType(TypeAdapters.A.read(p0));
                      break;
                    case 8:
                      obj.setPosition(this.d.read(p0));
                      break;
                    case 9:
                      obj.setTriggers(this.b.read(p0));
                      break;
                    case 10:
                      obj.setExecuteTimeout(KnownTypeAdapters$k.a(p0, obj.getExecuteTimeout()));
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
             if (obj.getType() != null) {
                if (obj.getUiType() != null) {
                   if (obj.getConfigId() != null) {
                      if (obj.getPosition() == null) {
                         throw new IOException("getPosition\(\) cannot be null");
                      }
                   }else {
                      throw new IOException("getConfigId\(\) cannot be null");
                   }
                }else {
                   throw new IOException("getUiType\(\) cannot be null");
                }
             }else {
                throw new IOException("getType\(\) cannot be null");
             }
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthGuideItemConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.getType() != null) {
             p0.r("type");
             TypeAdapters.A.write(p0, p1.getType());
          }else if(p1.getType() != null){
             throw new IOException("getType\(\) cannot be null");
          }
          if (p1.getUiType() != null) {
             p0.r("uiType");
             TypeAdapters.A.write(p0, p1.getUiType());
          }else if(p1.getUiType() != null){
             throw new IOException("getUiType\(\) cannot be null");
          }
          if (p1.getConfigId() != null) {
             p0.r("configId");
             TypeAdapters.A.write(p0, p1.getConfigId());
          }else if(p1.getConfigId() != null){
             throw new IOException("getConfigId\(\) cannot be null");
          }
          if (p1.getTriggers() != null) {
             p0.r("triggers");
             this.b.write(p0, p1.getTriggers());
          }
          if (p1.getConditions() != null) {
             p0.r("conditions");
             this.b.write(p0, p1.getConditions());
          }
          if (p1.getSupportPlatforms() != null) {
             p0.r("supportPlatforms");
             this.c.write(p0, p1.getSupportPlatforms());
          }
          p0.r("showTimes");
          p0.K((long)p1.getShowTimes());
          p0.r("executeTimeout");
          p0.K((long)p1.getExecuteTimeout());
          if (p1.getPosition() != null) {
             p0.r("position");
             this.d.write(p0, p1.getPosition());
          }else if(p1.getPosition() != null){
             throw new IOException("getPosition\(\) cannot be null");
          }
          if (p1.getBridgeConfigs() != null) {
             p0.r("nativeActions");
             this.f.write(p0, p1.getBridgeConfigs());
          }
          p0.r("unlock");
          p0.P(p1.getConfigUnlock());
          p0.j();
       }
       return;
    }
}
