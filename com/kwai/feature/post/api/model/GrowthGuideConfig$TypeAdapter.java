package com.kwai.feature.post.api.model.GrowthGuideConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.model.GrowthGuideConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonArray;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import java.io.IOException;
import com.google.gson.stream.b;

public final class GrowthGuideConfig$TypeAdapter extends TypeAdapter	// class@00140a
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       GrowthGuideConfig$TypeAdapter.c = a.get(GrowthGuideConfig.class);
    }
    public void GrowthGuideConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, GrowthGuideConfig$TypeAdapter.class, "2");
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
             obj = new GrowthGuideConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa8ee1007:
                      if (str.equals("editConfigs")) {
                         i = 0;
                      }
                      break;
                    case 0xb505adae:
                      if (str.equals("cacheExpireTime")) {
                         i = 1;
                      }
                      break;
                    case 0xba8879a4:
                      if (str.equals("priority")) {
                         i = 2;
                      }
                      break;
                    case 0xc9dff967:
                      if (str.equals("scenes")) {
                         i = 3;
                      }
                      break;
                    case 0xcde7df44:
                      if (str.equals("unlock")) {
                         i = 4;
                      }
                      break;
                    case 0xce3f1c8c:
                      if (str.equals("expireTime")) {
                         i = 5;
                      }
                      break;
                    case 0xd52be852:
                      if (str.equals("shootConfigs")) {
                         i = 6;
                      }
                      break;
                    case 0xe78dee5f:
                      if (str.equals("taskType")) {
                         i = 7;
                      }
                      break;
                    case 0x14f51cd8:
                      if (str.equals("version")) {
                         i = 8;
                      }
                      break;
                    case 0x31a7e162:
                      if (str.equals("publishConfigs")) {
                         i = 9;
                      }
                      break;
                    case 0x79badc30:
                      if (str.equals("uploadConfigs")) {
                         i = 10;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.setEditConfigs(KnownTypeAdapters.q.read(p0));
                      break;
                    case 1:
                      obj.setCacheExpireTime(KnownTypeAdapters$n.a(p0, obj.getCacheExpireTime()));
                      break;
                    case 2:
                      obj.setPriority(KnownTypeAdapters$n.a(p0, obj.getPriority()));
                      break;
                    case 3:
                      obj.setSupportScenes(this.b.read(p0));
                      break;
                    case 4:
                      obj.setUnlockable(KnownTypeAdapters$g.a(p0, obj.getUnlockable()));
                      break;
                    case 5:
                      obj.setExpireTime(KnownTypeAdapters$n.a(p0, obj.getExpireTime()));
                      break;
                    case 6:
                      obj.setShootConfigs(KnownTypeAdapters.q.read(p0));
                      break;
                    case 7:
                      obj.setTaskType(KnownTypeAdapters$k.a(p0, obj.getTaskType()));
                      break;
                    case 8:
                      obj.setTaskVersion(KnownTypeAdapters$n.a(p0, obj.getTaskVersion()));
                      break;
                    case 9:
                      obj.setPublishConfigs(KnownTypeAdapters.q.read(p0));
                      break;
                    case 10:
                      obj.setUploadConfigs(KnownTypeAdapters.q.read(p0));
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
             if (obj.getSupportScenes() == null) {
                throw new IOException("getSupportScenes\(\) cannot be null");
             }
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthGuideConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("expireTime");
          p0.K(p1.getExpireTime());
          p0.r("cacheExpireTime");
          p0.K(p1.getCacheExpireTime());
          p0.r("version");
          p0.K(p1.getTaskVersion());
          p0.r("priority");
          p0.K(p1.getPriority());
          p0.r("taskType");
          p0.K((long)p1.getTaskType());
          p0.r("unlock");
          p0.P(p1.getUnlockable());
          if (p1.getSupportScenes() != null) {
             p0.r("scenes");
             this.b.write(p0, p1.getSupportScenes());
          }else if(p1.getSupportScenes() != null){
             throw new IOException("getSupportScenes\(\) cannot be null");
          }
          if (p1.getShootConfigs() != null) {
             p0.r("shootConfigs");
             KnownTypeAdapters.q.write(p0, p1.getShootConfigs());
          }
          if (p1.getEditConfigs() != null) {
             p0.r("editConfigs");
             KnownTypeAdapters.q.write(p0, p1.getEditConfigs());
          }
          if (p1.getPublishConfigs() != null) {
             p0.r("publishConfigs");
             KnownTypeAdapters.q.write(p0, p1.getPublishConfigs());
          }
          if (p1.getUploadConfigs() != null) {
             p0.r("uploadConfigs");
             KnownTypeAdapters.q.write(p0, p1.getUploadConfigs());
          }
          p0.j();
       }
       return;
    }
}
