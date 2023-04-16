package com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$DeformMode$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$a;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class BeautyFilterItem$DeformMode$TypeAdapter extends TypeAdapter	// class@0012d6
{
    public final Gson a;
    public static final a b;

    static {
       BeautyFilterItem$DeformMode$TypeAdapter.b = a.get(BeautyFilterItem$a.class);
    }
    public void BeautyFilterItem$DeformMode$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BeautyFilterItem$DeformMode$TypeAdapter.class, "2");
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
             obj = new BeautyFilterItem$a();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("mode")) {
                   if (!str1.equals("type")) {
                      p0.Q();
                   }else {
                      obj.mType = KnownTypeAdapters$k.a(p0, obj.mType);
                   }
                }else {
                   obj.mMode = KnownTypeAdapters$k.a(p0, obj.mMode);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautyFilterItem$DeformMode$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          p0.r("mode");
          p0.K((long)p1.mMode);
          p0.j();
       }
       return;
    }
}
