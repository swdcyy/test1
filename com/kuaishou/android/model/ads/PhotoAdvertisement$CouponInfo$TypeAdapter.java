package com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo;
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

public final class PhotoAdvertisement$CouponInfo$TypeAdapter extends TypeAdapter	// class@0008f8
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$CouponInfo$TypeAdapter.b = a.get(PhotoAdvertisement$CouponInfo.class);
    }
    public void PhotoAdvertisement$CouponInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$CouponInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CouponInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CouponInfo uCouponInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCouponInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCouponInfo;
       }else {
          p0.c();
          PhotoAdvertisement$CouponInfo uCouponInfo1 = new PhotoAdvertisement$CouponInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("receiveMode")) {
                p0.Q();
             }else {
                uCouponInfo1.mReceiveMode = KnownTypeAdapters$k.a(p0, uCouponInfo1.mReceiveMode);
             }
          }
          p0.j();
          return uCouponInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CouponInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CouponInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("receiveMode");
          p0.K((long)p1.mReceiveMode);
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