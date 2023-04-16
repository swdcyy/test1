package com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo;
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

public final class PhotoAdvertisement$TryGameInfo$TypeAdapter extends TypeAdapter	// class@000a4d
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$TryGameInfo$TypeAdapter.b = a.get(PhotoAdvertisement$TryGameInfo.class);
    }
    public void PhotoAdvertisement$TryGameInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$TryGameInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TryGameInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TryGameInfo tryGameInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tryGameInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tryGameInfo;
       }else {
          p0.c();
          PhotoAdvertisement$TryGameInfo tryGameInfo1 = new PhotoAdvertisement$TryGameInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("gameInfo")) {
                if (!str.equals("playType")) {
                   p0.Q();
                }else {
                   tryGameInfo1.mPlayType = KnownTypeAdapters$k.a(p0, tryGameInfo1.mPlayType);
                }
             }else {
                tryGameInfo1.mGameInfo = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return tryGameInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TryGameInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TryGameInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mGameInfo != null) {
             p0.r("gameInfo");
             TypeAdapters.A.write(p0, p1.mGameInfo);
          }
          p0.r("playType");
          p0.K((long)p1.mPlayType);
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
