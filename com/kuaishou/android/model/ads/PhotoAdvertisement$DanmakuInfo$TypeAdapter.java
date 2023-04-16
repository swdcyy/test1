package com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$DanmakuInfo$TypeAdapter extends TypeAdapter	// class@00091c
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$DanmakuInfo$TypeAdapter.b = a.get(PhotoAdvertisement$DanmakuInfo.class);
    }
    public void PhotoAdvertisement$DanmakuInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$DanmakuInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$DanmakuInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$DanmakuInfo uDanmakuInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uDanmakuInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uDanmakuInfo;
       }else {
          p0.c();
          PhotoAdvertisement$DanmakuInfo uDanmakuInfo1 = new PhotoAdvertisement$DanmakuInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("enableDanmaku")) {
                if (!str.equals("adInfo")) {
                   p0.Q();
                }else {
                   uDanmakuInfo1.mAdInfo = TypeAdapters.A.read(p0);
                }
             }else {
                uDanmakuInfo1.mEnableDanmaku = KnownTypeAdapters$g.a(p0, uDanmakuInfo1.mEnableDanmaku);
             }
          }
          p0.j();
          return uDanmakuInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$DanmakuInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$DanmakuInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAdInfo != null) {
             p0.r("adInfo");
             TypeAdapters.A.write(p0, p1.mAdInfo);
          }
          p0.r("enableDanmaku");
          p0.P(p1.mEnableDanmaku);
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
