package com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig$TypeAdapter;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class FilterGroup$TypeAdapter extends TypeAdapter	// class@0012ec
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       FilterGroup$TypeAdapter.d = a.get(FilterGroup.class);
    }
    public void FilterGroup$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(FilterConfig$TypeAdapter.h);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FilterGroup$TypeAdapter.class, "2");
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
             obj = new FilterGroup();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xcd10a3fb:
                      if (str.equals("filters")) {
                         i = 0;
                      }
                      break;
                    case 0x117d5bfa:
                      if (str.equals("groupId")) {
                         i = 1;
                      }
                      break;
                    case 0x662bd66d:
                      if (str.equals("displayName")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mFilters = this.c.read(p0);
                      break;
                    case 1:
                      obj.mGroupId = KnownTypeAdapters$k.a(p0, obj.mGroupId);
                      break;
                    case 2:
                      obj.mDisplayName = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FilterGroup$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("groupId");
          p0.K((long)p1.mGroupId);
          if (p1.mDisplayName != null) {
             p0.r("displayName");
             TypeAdapters.A.write(p0, p1.mDisplayName);
          }
          if (p1.mFilters != null) {
             p0.r("filters");
             this.c.write(p0, p1.mFilters);
          }
          p0.j();
       }
       return;
    }
}
