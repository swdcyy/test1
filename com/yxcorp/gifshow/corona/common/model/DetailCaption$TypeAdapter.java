package com.yxcorp.gifshow.corona.common.model.DetailCaption$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.DetailCaption;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class DetailCaption$TypeAdapter extends TypeAdapter	// class@001232
{
    public final Gson a;
    public static final a b;

    static {
       DetailCaption$TypeAdapter.b = a.get(DetailCaption.class);
    }
    public void DetailCaption$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, DetailCaption$TypeAdapter.class, "2");
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
             obj = new DetailCaption();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("caption")) {
                   if (!str1.equals("tagClickable")) {
                      p0.Q();
                   }else {
                      obj.mTagClickable = KnownTypeAdapters$g.a(p0, obj.mTagClickable);
                   }
                }else {
                   obj.mCaption = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DetailCaption$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mCaption != null) {
             p0.r("caption");
             TypeAdapters.A.write(p0, p1.mCaption);
          }
          p0.r("tagClickable");
          p0.P(p1.mTagClickable);
          p0.j();
       }
       return;
    }
}
