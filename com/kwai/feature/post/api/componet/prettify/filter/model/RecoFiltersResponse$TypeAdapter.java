package com.kwai.feature.post.api.componet.prettify.filter.model.RecoFiltersResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.filter.model.RecoFiltersResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$TypeAdapter;
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
import com.google.gson.stream.b;

public final class RecoFiltersResponse$TypeAdapter extends TypeAdapter	// class@0012f2
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       RecoFiltersResponse$TypeAdapter.d = a.get(RecoFiltersResponse.class);
    }
    public void RecoFiltersResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(FilterGroup$TypeAdapter.d);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RecoFiltersResponse$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new RecoFiltersResponse();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("recoFilter")) {
                   p0.Q();
                }else {
                   obj.mRecoGroupFilters = this.c.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecoFiltersResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mRecoGroupFilters != null) {
             p0.r("recoFilter");
             this.c.write(p0, p1.mRecoGroupFilters);
          }
          p0.j();
       }
       return;
    }
}
