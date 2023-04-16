package com.yxcorp.gifshow.model.NotifyCount$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.NotifyCount;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.NotifySubCount$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class NotifyCount$TypeAdapter extends TypeAdapter	// class@001e63
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       NotifyCount$TypeAdapter.d = a.get(NotifyCount.class);
    }
    public void NotifyCount$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(NotifySubCount$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, NotifyCount$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new NotifyCount();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x82a648ce:
                      if (str.equals("new_followfeed")) {
                         i = 0;
                      }
                      break;
                    case 0xd4b3ce2c:
                      if (str.equals("new_followfeed_id")) {
                         i = 1;
                      }
                      break;
                    case 0x23bc8cda:
                      if (str.equals("notify_sub_count")) {
                         i = 2;
                      }
                      break;
                    case 0x5aeae42d:
                      if (str.equals("new_following_moment")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mNewFollowFeed = KnownTypeAdapters$k.a(p0, obj.mNewFollowFeed);
                      break;
                    case 1:
                      obj.mNewFollowFeedId = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mNotifySubCount = this.c.read(p0);
                      break;
                    case 3:
                      obj.mMomentFollowing = KnownTypeAdapters$k.a(p0, obj.mMomentFollowing);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NotifyCount$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("new_followfeed");
          p0.K((long)p1.mNewFollowFeed);
          if (p1.mNewFollowFeedId != null) {
             p0.r("new_followfeed_id");
             TypeAdapters.A.write(p0, p1.mNewFollowFeedId);
          }
          p0.r("new_following_moment");
          p0.K((long)p1.mMomentFollowing);
          if (p1.mNotifySubCount != null) {
             p0.r("notify_sub_count");
             this.c.write(p0, p1.mNotifySubCount);
          }
          p0.j();
       }
       return;
    }
}
