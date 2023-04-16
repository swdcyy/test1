package com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo;
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
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ConvertInfo$TypeAdapter extends TypeAdapter	// class@0008f0
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$ConvertInfo$TypeAdapter.b = a.get(PhotoAdvertisement$ConvertInfo.class);
    }
    public void PhotoAdvertisement$ConvertInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$ConvertInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ConvertInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ConvertInfo uConvertInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uConvertInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uConvertInfo;
       }else {
          p0.c();
          PhotoAdvertisement$ConvertInfo uConvertInfo1 = new PhotoAdvertisement$ConvertInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("convertType")) {
                if (!str.equals("convertId")) {
                   p0.Q();
                }else {
                   uConvertInfo1.mConvertId = KnownTypeAdapters$k.a(p0, uConvertInfo1.mConvertId);
                }
             }else {
                uConvertInfo1.mConvertType = KnownTypeAdapters$k.a(p0, uConvertInfo1.mConvertType);
             }
          }
          p0.j();
          return uConvertInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ConvertInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ConvertInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("convertType");
          p0.K((long)p1.mConvertType);
          p0.r("convertId");
          p0.K((long)p1.mConvertId);
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
