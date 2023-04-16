package com.yxcorp.gifshow.prettify.makeup.MakeupResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.prettify.makeup.MakeupResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class MakeupResponse$TypeAdapter extends TypeAdapter	// class@00115e
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
       MakeupResponse$TypeAdapter.h = a.get(MakeupResponse.class);
    }
    public void MakeupResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(MakeupSuite.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(MakeupPart.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(a.get(MakeupGroup.class));
       this.f = typeAdapter1;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, MakeupResponse$TypeAdapter.class, "2");
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
             obj = new MakeupResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x93959341:
                      if (str.equals("suitGroups")) {
                         i = 0;
                      }
                      break;
                    case 0xa677533c:
                      if (str.equals("defaultId")) {
                         i = 1;
                      }
                      break;
                    case 0xac215013:
                      if (str.equals("versionId")) {
                         i = 2;
                      }
                      break;
                    case 0xcadf887b:
                      if (str.equals("suites")) {
                         i = 3;
                      }
                      break;
                    case 0x6581ae0:
                      if (str.equals("parts")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mMakeupGroups = this.g.read(p0);
                      break;
                    case 1:
                      obj.mLiveDefaultId = KnownTypeAdapters$k.a(p0, obj.mLiveDefaultId);
                      break;
                    case 2:
                      obj.mLiveVersionId = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mMakeupSuites = this.c.read(p0);
                      break;
                    case 4:
                      obj.mMakeupParts = this.e.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MakeupResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mMakeupSuites != null) {
             p0.r("suites");
             this.c.write(p0, p1.mMakeupSuites);
          }
          if (p1.mMakeupParts != null) {
             p0.r("parts");
             this.e.write(p0, p1.mMakeupParts);
          }
          if (p1.mMakeupGroups != null) {
             p0.r("suitGroups");
             this.g.write(p0, p1.mMakeupGroups);
          }
          p0.r("defaultId");
          p0.K((long)p1.mLiveDefaultId);
          if (p1.mLiveVersionId != null) {
             p0.r("versionId");
             TypeAdapters.A.write(p0, p1.mLiveVersionId);
          }
          p0.j();
       }
       return;
    }
}
