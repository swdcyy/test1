package com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class FollowLiveSubscribeInfo$TypeAdapter extends TypeAdapter	// class@001168
{
    public final Gson a;
    public static final a b;

    static {
       FollowLiveSubscribeInfo$TypeAdapter.b = a.get(FollowLiveSubscribeInfo.class);
    }
    public void FollowLiveSubscribeInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FollowLiveSubscribeInfo$TypeAdapter.class, "2");
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
             obj = new FollowLiveSubscribeInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xbf55f9dc:
                      if (str.equals("subscribeStatus")) {
                         i = 0;
                      }
                      break;
                    case 0x322dbc05:
                      if (str.equals("subscribeId")) {
                         i = 1;
                      }
                      break;
                    case 0x48904b70:
                      if (str.equals("subscribeAuthorId")) {
                         i = 2;
                      }
                      break;
                    case 0x5db42ba4:
                      if (str.equals("subscribeType")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubscribeStatus = KnownTypeAdapters$k.a(p0, obj.mSubscribeStatus);
                      break;
                    case 1:
                      obj.mSubscribeId = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mSubscribeAuthorId = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mSubscribeType = KnownTypeAdapters$k.a(p0, obj.mSubscribeType);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowLiveSubscribeInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSubscribeId != null) {
             p0.r("subscribeId");
             TypeAdapters.A.write(p0, p1.mSubscribeId);
          }
          p0.r("subscribeStatus");
          p0.K((long)p1.mSubscribeStatus);
          p0.r("subscribeType");
          p0.K((long)p1.mSubscribeType);
          if (p1.mSubscribeAuthorId != null) {
             p0.r("subscribeAuthorId");
             TypeAdapters.A.write(p0, p1.mSubscribeAuthorId);
          }
          p0.j();
       }
       return;
    }
}
