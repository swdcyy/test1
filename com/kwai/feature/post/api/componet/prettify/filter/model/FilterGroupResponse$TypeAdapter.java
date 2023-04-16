package com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroupResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroupResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class FilterGroupResponse$TypeAdapter extends TypeAdapter	// class@0012ef
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public static final a g;

    static {
       FilterGroupResponse$TypeAdapter.g = a.get(FilterGroupResponse.class);
    }
    public void FilterGroupResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(FilterConfig$TypeAdapter.h);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(FilterGroup$TypeAdapter.d);
       this.d = typeAdapter1;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
       this.f = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FilterGroupResponse$TypeAdapter.class, "2");
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
             obj = new FilterGroupResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa677533c:
                      if (str.equals("defaultId")) {
                         i = 0;
                      }
                      break;
                    case 0xac215013:
                      if (str.equals("versionId")) {
                         i = 1;
                      }
                      break;
                    case 0xccc41771:
                      if (str.equals("collectFilters")) {
                         i = 2;
                      }
                      break;
                    case 0x5e0f67f:
                      if (str.equals("group")) {
                         i = 3;
                      }
                      break;
                    case 0x3724e415:
                      if (str.equals("photoMovies")) {
                         i = 4;
                      }
                      break;
                    case 0x6dc69376:
                      if (str.equals("enhanced")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mLiveDefaultId = KnownTypeAdapters$k.a(p0, obj.mLiveDefaultId);
                      break;
                    case 1:
                      obj.mLiveVersionId = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mCollectFilters = this.f.read(p0);
                      break;
                    case 3:
                      obj.mGroups = this.e.read(p0);
                      break;
                    case 4:
                      obj.mPhotoMovies = this.c.read(p0);
                      break;
                    case 5:
                      obj.mEnhanced = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FilterGroupResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mEnhanced != null) {
             p0.r("enhanced");
             this.b.write(p0, p1.mEnhanced);
          }
          if (p1.mPhotoMovies != null) {
             p0.r("photoMovies");
             this.c.write(p0, p1.mPhotoMovies);
          }
          if (p1.mGroups != null) {
             p0.r("group");
             this.e.write(p0, p1.mGroups);
          }
          if (p1.mCollectFilters != null) {
             p0.r("collectFilters");
             this.f.write(p0, p1.mCollectFilters);
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
