package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter extends TypeAdapter	// class@000c73
{
    public final Gson a;
    public static final a b;

    static {
       LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter.b = a.get(LocalCoverAggregateFeed$CoverAggregateDarkLightModel.class);
    }
    public void LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter.class, "2");
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
             obj = new LocalCoverAggregateFeed$CoverAggregateDarkLightModel();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("dark")) {
                   if (!str1.equals("light")) {
                      p0.Q();
                   }else {
                      obj.mLight = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mDark = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLight != null) {
             p0.r("light");
             TypeAdapters.A.write(p0, p1.mLight);
          }
          if (p1.mDark != null) {
             p0.r("dark");
             TypeAdapters.A.write(p0, p1.mDark);
          }
          p0.j();
       }
       return;
    }
}
