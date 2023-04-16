package com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo;
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

public final class PhotoAdvertisement$CoronaBrandInfo$TypeAdapter extends TypeAdapter	// class@0008f4
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$CoronaBrandInfo$TypeAdapter.b = a.get(PhotoAdvertisement$CoronaBrandInfo.class);
    }
    public void PhotoAdvertisement$CoronaBrandInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$CoronaBrandInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CoronaBrandInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CoronaBrandInfo uCoronaBrand = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoronaBrand;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoronaBrand;
       }else {
          p0.c();
          PhotoAdvertisement$CoronaBrandInfo uCoronaBrand1 = new PhotoAdvertisement$CoronaBrandInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("picUrl")) {
                if (!str.equals("coronaVideoTitle")) {
                   p0.Q();
                }else {
                   uCoronaBrand1.mCoronaVideoTitle = TypeAdapters.A.read(p0);
                }
             }else {
                uCoronaBrand1.mPicUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uCoronaBrand1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CoronaBrandInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CoronaBrandInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCoronaVideoTitle != null) {
             p0.r("coronaVideoTitle");
             TypeAdapters.A.write(p0, p1.mCoronaVideoTitle);
          }
          if (p1.mPicUrl != null) {
             p0.r("picUrl");
             TypeAdapters.A.write(p0, p1.mPicUrl);
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
