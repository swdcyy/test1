package com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl;
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

public final class ContentAggregateWeakFeed$IconUrl$TypeAdapter extends TypeAdapter	// class@000ade
{
    public final Gson a;
    public static final a b;

    static {
       ContentAggregateWeakFeed$IconUrl$TypeAdapter.b = a.get(ContentAggregateWeakFeed$IconUrl.class);
    }
    public void ContentAggregateWeakFeed$IconUrl$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public ContentAggregateWeakFeed$IconUrl a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ContentAggregateWeakFeed$IconUrl$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ContentAggregateWeakFeed$IconUrl iconUrl = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return iconUrl;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return iconUrl;
       }else {
          p0.c();
          ContentAggregateWeakFeed$IconUrl iconUrl1 = new ContentAggregateWeakFeed$IconUrl();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("dark")) {
                if (!str.equals("light")) {
                   p0.Q();
                }else {
                   iconUrl1.lightUrl = TypeAdapters.A.read(p0);
                }
             }else {
                iconUrl1.darkUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return iconUrl1;
       }
    }
    public void b(b p0,ContentAggregateWeakFeed$IconUrl p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ContentAggregateWeakFeed$IconUrl$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.darkUrl != null) {
             p0.r("dark");
             TypeAdapters.A.write(p0, p1.darkUrl);
          }
          if (p1.lightUrl != null) {
             p0.r("light");
             TypeAdapters.A.write(p0, p1.lightUrl);
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
