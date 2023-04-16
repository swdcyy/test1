package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFriendFeedConfig;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter extends TypeAdapter	// class@001042
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveFriendFeedConfig.class);
    }
    public void LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveFriendFeedConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xf1b69b5f:
                      if (str.equals("enableFilterFollowAuthorFeedWhenFollowed")) {
                         i = 0;
                      }
                      break;
                    case 0x8d6ee5d:
                      if (str.equals("enableEnterRoomRequestFriend")) {
                         i = 1;
                      }
                      break;
                    case 0x68fee863:
                      if (str.equals("enterRoomFriendExpireTimeMillis")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnableFilterFollowAuthorFeedWhenFollowed = KnownTypeAdapters$g.a(p0, obj.mEnableFilterFollowAuthorFeedWhenFollowed);
                      break;
                    case 1:
                      obj.mEnableEnterRoomRequestFriend = KnownTypeAdapters$g.a(p0, obj.mEnableEnterRoomRequestFriend);
                      break;
                    case 2:
                      obj.mEnterRoomFriendExpireTimeMillis = KnownTypeAdapters$n.a(p0, obj.mEnterRoomFriendExpireTimeMillis);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enableEnterRoomRequestFriend");
          p0.P(p1.mEnableEnterRoomRequestFriend);
          p0.r("enterRoomFriendExpireTimeMillis");
          p0.K(p1.mEnterRoomFriendExpireTimeMillis);
          p0.r("enableFilterFollowAuthorFeedWhenFollowed");
          p0.P(p1.mEnableFilterFollowAuthorFeedWhenFollowed);
          p0.j();
       }
       return;
    }
}
