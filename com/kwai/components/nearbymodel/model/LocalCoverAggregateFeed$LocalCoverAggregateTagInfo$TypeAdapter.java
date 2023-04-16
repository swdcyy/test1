package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$LocalCoverAggregateTagInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel;
import com.google.gson.stream.b;

public final class LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter extends TypeAdapter	// class@000c7d
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter.c = a.get(LocalCoverAggregateFeed$LocalCoverAggregateTagInfo.class);
    }
    public void LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter.class, "2");
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
             obj = new LocalCoverAggregateFeed$LocalCoverAggregateTagInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("bgColor")) {
                   if (!str1.equals("text")) {
                      p0.Q();
                   }else {
                      obj.mTagTitle = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mTagBgColor = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTagBgColor != null) {
             p0.r("bgColor");
             this.b.write(p0, p1.mTagBgColor);
          }
          if (p1.mTagTitle != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mTagTitle);
          }
          p0.j();
       }
       return;
    }
}
