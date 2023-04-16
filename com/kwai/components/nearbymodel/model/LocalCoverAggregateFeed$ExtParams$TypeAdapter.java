package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ExtParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ExtParams;
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

public final class LocalCoverAggregateFeed$ExtParams$TypeAdapter extends TypeAdapter	// class@000c79
{
    public final Gson a;
    public static final a b;

    static {
       LocalCoverAggregateFeed$ExtParams$TypeAdapter.b = a.get(LocalCoverAggregateFeed$ExtParams.class);
    }
    public void LocalCoverAggregateFeed$ExtParams$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed$ExtParams$TypeAdapter.class, "2");
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
             obj = new LocalCoverAggregateFeed$ExtParams();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("h")) {
                   if (!str1.equals("w")) {
                      p0.Q();
                   }else {
                      obj.w = KnownTypeAdapters$k.a(p0, obj.w);
                   }
                }else {
                   obj.h = KnownTypeAdapters$k.a(p0, obj.h);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalCoverAggregateFeed$ExtParams$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("w");
          p0.K((long)p1.w);
          p0.r("h");
          p0.K((long)p1.h);
          p0.j();
       }
       return;
    }
}
