package com.kuaishou.android.model.mix.SortFeature$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.SortFeature;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SortFeature$TypeAdapter extends TypeAdapter	// class@000dfe
{
    public final Gson a;
    public static final a b;

    static {
       SortFeature$TypeAdapter.b = a.get(SortFeature.class);
    }
    public void SortFeature$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SortFeature a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SortFeature$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SortFeature sortFeature = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return sortFeature;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return sortFeature;
       }else {
          p0.c();
          SortFeature sortFeature1 = new SortFeature();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("name")) {
                if (!str.equals("value")) {
                   p0.Q();
                }else {
                   sortFeature1.mValue = KnownTypeAdapters$j.a(p0, sortFeature1.mValue);
                }
             }else {
                sortFeature1.mName = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return sortFeature1;
       }
    }
    public void b(b p0,SortFeature p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SortFeature$TypeAdapter.class, "1")) {
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
          p0.r("value");
          p0.J((double)p1.mValue);
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
