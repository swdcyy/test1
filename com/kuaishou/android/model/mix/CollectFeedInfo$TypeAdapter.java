package com.kuaishou.android.model.mix.CollectFeedInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CollectFeedInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class CollectFeedInfo$TypeAdapter extends TypeAdapter	// class@000be9
{
    public final Gson a;
    public static final a b;

    static {
       CollectFeedInfo$TypeAdapter.b = a.get(CollectFeedInfo.class);
    }
    public void CollectFeedInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CollectFeedInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CollectFeedInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CollectFeedInfo uCollectFeed = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCollectFeed;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCollectFeed;
       }else {
          p0.c();
          CollectFeedInfo uCollectFeed1 = new CollectFeedInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc7ec2d50:
                   if (str.equals("showTimeInSeconds")) {
                      i = 0;
                   }
                   break;
                 case 0xeeb7ea24:
                   if (str.equals("showForWeak")) {
                      i = 1;
                   }
                   break;
                 case 0x35dafd:
                   if (str.equals("show")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCollectFeed1.mShowTimeInSeconds = KnownTypeAdapters$k.a(p0, uCollectFeed1.mShowTimeInSeconds);
                   break;
                 case 1:
                   uCollectFeed1.mShowForWeak = KnownTypeAdapters$g.a(p0, uCollectFeed1.mShowForWeak);
                   break;
                 case 2:
                   uCollectFeed1.mShowForStrong = KnownTypeAdapters$g.a(p0, uCollectFeed1.mShowForStrong);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCollectFeed1;
       }
    }
    public void b(b p0,CollectFeedInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectFeedInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("show");
          p0.P(p1.mShowForStrong);
          p0.r("showTimeInSeconds");
          p0.K((long)p1.mShowTimeInSeconds);
          p0.r("showForWeak");
          p0.P(p1.mShowForWeak);
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
