package com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import java.lang.Object;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import com.google.gson.stream.b;

public final class DegradeConfig$UrlDegradeConfig$TypeAdapter extends TypeAdapter	// class@00131b
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public static final a g;

    static {
       DegradeConfig$UrlDegradeConfig$TypeAdapter.g = a.get(DegradeConfig$UrlDegradeConfig.class);
    }
    public void DegradeConfig$UrlDegradeConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter a = TypeAdapters.A;
       this.b = new KnownTypeAdapters$ListTypeAdapter(a, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter = p0.j(DegradeConfig$UrlDegrade$TypeAdapter.b);
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$MapTypeAdapter(a, typeAdapter, new KnownTypeAdapters$e());
       TypeAdapter typeAdapter1 = p0.j(a.get(Object.class));
       this.e = typeAdapter1;
       this.f = new KnownTypeAdapters$MapTypeAdapter(a, typeAdapter1, new KnownTypeAdapters$e());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, DegradeConfig$UrlDegradeConfig$TypeAdapter.class, "2");
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
             obj = new DegradeConfig$UrlDegradeConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x14f51cd8:
                      if (str.equals("version")) {
                         i = 0;
                      }
                      break;
                    case 0x25dfc66b:
                      if (str.equals("cdnList")) {
                         i = 1;
                      }
                      break;
                    case 0x309f73ce:
                      if (str.equals("uriConfig")) {
                         i = 2;
                      }
                      break;
                    case 0x3e4ded18:
                      if (str.equals("actionConfig")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mVersion = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mCdnUrls = this.b.read(p0);
                      break;
                    case 2:
                      obj.mUriConfig = this.d.read(p0);
                      break;
                    case 3:
                      obj.mActionConfig = this.f.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DegradeConfig$UrlDegradeConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mCdnUrls != null) {
             p0.r("cdnList");
             this.b.write(p0, p1.mCdnUrls);
          }
          if (p1.mUriConfig != null) {
             p0.r("uriConfig");
             this.d.write(p0, p1.mUriConfig);
          }
          if (p1.mActionConfig != null) {
             p0.r("actionConfig");
             this.f.write(p0, p1.mActionConfig);
          }
          if (p1.mVersion != null) {
             p0.r("version");
             TypeAdapters.A.write(p0, p1.mVersion);
          }
          p0.j();
       }
       return;
    }
}
