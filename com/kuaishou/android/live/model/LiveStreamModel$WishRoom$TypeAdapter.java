package com.kuaishou.android.live.model.LiveStreamModel$WishRoom$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$WishRoom;
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

public final class LiveStreamModel$WishRoom$TypeAdapter extends TypeAdapter	// class@000821
{
    public final Gson a;
    public static final a b;

    static {
       LiveStreamModel$WishRoom$TypeAdapter.b = a.get(LiveStreamModel$WishRoom.class);
    }
    public void LiveStreamModel$WishRoom$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public LiveStreamModel$WishRoom a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamModel$WishRoom$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamModel$WishRoom wishRoom = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return wishRoom;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return wishRoom;
       }else {
          p0.c();
          LiveStreamModel$WishRoom wishRoom1 = new LiveStreamModel$WishRoom();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa4b79d4a:
                   if (str.equals("wishListUrl")) {
                      i = 0;
                   }
                   break;
                 case 0xc3c0c184:
                   if (str.equals("wishroomRouterUrl")) {
                      i = 1;
                   }
                   break;
                 case 0xe8e26a70:
                   if (str.equals("wishTaskFinishUrl")) {
                      i = 2;
                   }
                   break;
                 case 0x639efbaf:
                   if (str.equals("wishWindowRouterUrl")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   wishRoom1.mWishListRouterUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   wishRoom1.mWishHallRouterUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   wishRoom1.mWishTaskFinishUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   wishRoom1.mWishInfoRouterUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return wishRoom1;
       }
    }
    public void b(b p0,LiveStreamModel$WishRoom p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamModel$WishRoom$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mWishInfoRouterUrl != null) {
             p0.r("wishWindowRouterUrl");
             TypeAdapters.A.write(p0, p1.mWishInfoRouterUrl);
          }
          if (p1.mWishHallRouterUrl != null) {
             p0.r("wishroomRouterUrl");
             TypeAdapters.A.write(p0, p1.mWishHallRouterUrl);
          }
          if (p1.mWishListRouterUrl != null) {
             p0.r("wishListUrl");
             TypeAdapters.A.write(p0, p1.mWishListRouterUrl);
          }
          if (p1.mWishTaskFinishUrl != null) {
             p0.r("wishTaskFinishUrl");
             TypeAdapters.A.write(p0, p1.mWishTaskFinishUrl);
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
