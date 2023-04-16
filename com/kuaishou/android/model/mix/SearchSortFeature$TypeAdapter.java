package com.kuaishou.android.model.mix.SearchSortFeature$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.SearchSortFeature;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
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
import com.google.gson.stream.b;

public final class SearchSortFeature$TypeAdapter extends TypeAdapter	// class@000df6
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       SearchSortFeature$TypeAdapter.c = a.get(SearchSortFeature.class);
    }
    public void SearchSortFeature$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.e, new KnownTypeAdapters$d());
    }
    public SearchSortFeature a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SearchSortFeature$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SearchSortFeature searchSortFe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return searchSortFe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return searchSortFe;
       }else {
          p0.c();
          SearchSortFeature searchSortFe1 = new SearchSortFeature();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("name")) {
                if (!str.equals("value")) {
                   p0.Q();
                }else {
                   searchSortFe1.mValue = this.b.read(p0);
                }
             }else {
                searchSortFe1.mName = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return searchSortFe1;
       }
    }
    public void b(b p0,SearchSortFeature p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchSortFeature$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mValue != null) {
             p0.r("value");
             this.b.write(p0, p1.mValue);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
