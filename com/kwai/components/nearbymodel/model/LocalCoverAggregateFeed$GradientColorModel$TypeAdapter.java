package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$GradientColorModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$GradientColorModel;
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
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.components.nearbymodel.model.c;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kwai.components.nearbymodel.model.d;
import com.google.gson.stream.b;
import com.kwai.components.nearbymodel.model.a;
import com.kwai.components.nearbymodel.model.b;

public final class LocalCoverAggregateFeed$GradientColorModel$TypeAdapter extends TypeAdapter	// class@000c7b
{
    public final Gson a;
    public static final a b;

    static {
       LocalCoverAggregateFeed$GradientColorModel$TypeAdapter.b = a.get(LocalCoverAggregateFeed$GradientColorModel.class);
    }
    public void LocalCoverAggregateFeed$GradientColorModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed$GradientColorModel$TypeAdapter.class, "2");
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
             obj = new LocalCoverAggregateFeed$GradientColorModel();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("dark")) {
                   if (!str1.equals("light")) {
                      p0.Q();
                   }else {
                      obj.mLight = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new c(this)).a(p0);
                   }
                }else {
                   obj.mDark = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new d(this)).a(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalCoverAggregateFeed$GradientColorModel$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLight != null) {
             p0.r("light");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new a(this)).b(p0, p1.mLight);
          }
          if (p1.mDark != null) {
             p0.r("dark");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new b(this)).b(p0, p1.mDark);
          }
          p0.j();
       }
       return;
    }
}
