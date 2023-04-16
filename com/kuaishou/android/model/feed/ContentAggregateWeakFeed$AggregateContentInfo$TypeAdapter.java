package com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl;
import com.google.gson.stream.b;

public final class ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter extends TypeAdapter	// class@000adc
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter.c = a.get(ContentAggregateWeakFeed$AggregateContentInfo.class);
    }
    public void ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ContentAggregateWeakFeed$IconUrl$TypeAdapter.b);
    }
    public ContentAggregateWeakFeed$AggregateContentInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ContentAggregateWeakFeed$AggregateContentInfo uAggregateCo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAggregateCo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAggregateCo;
       }else {
          p0.c();
          ContentAggregateWeakFeed$AggregateContentInfo uAggregateCo1 = new ContentAggregateWeakFeed$AggregateContentInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xd404b4fd:
                   if (str.equals("iconUrls")) {
                      i = 0;
                   }
                   break;
                 case 0xe1e9333f:
                   if (str.equals("isDistance")) {
                      i = 1;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAggregateCo1.mIconUrls = this.b.read(p0);
                   break;
                 case 1:
                   uAggregateCo1.mIsDistance = KnownTypeAdapters$g.a(p0, uAggregateCo1.mIsDistance);
                   break;
                 case 2:
                   uAggregateCo1.mText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAggregateCo1;
       }
    }
    public void b(b p0,ContentAggregateWeakFeed$AggregateContentInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconUrls != null) {
             p0.r("iconUrls");
             this.b.write(p0, p1.mIconUrls);
          }
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          p0.r("isDistance");
          p0.P(p1.mIsDistance);
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
