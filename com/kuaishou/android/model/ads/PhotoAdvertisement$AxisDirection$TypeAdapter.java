package com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection;
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

public final class PhotoAdvertisement$AxisDirection$TypeAdapter extends TypeAdapter	// class@0008ce
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$AxisDirection$TypeAdapter.b = a.get(PhotoAdvertisement$AxisDirection.class);
    }
    public void PhotoAdvertisement$AxisDirection$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$AxisDirection a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AxisDirection$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AxisDirection uAxisDirecti = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAxisDirecti;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAxisDirecti;
       }else {
          p0.c();
          PhotoAdvertisement$AxisDirection uAxisDirecti1 = new PhotoAdvertisement$AxisDirection();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("direction")) {
                if (!str.equals("rotateDegree")) {
                   p0.Q();
                }else {
                   uAxisDirecti1.mRotateDegree = KnownTypeAdapters$k.a(p0, uAxisDirecti1.mRotateDegree);
                }
             }else {
                uAxisDirecti1.mRotateDirection = KnownTypeAdapters$k.a(p0, uAxisDirecti1.mRotateDirection);
             }
          }
          p0.j();
          return uAxisDirecti1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AxisDirection p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AxisDirection$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("rotateDegree");
          p0.K((long)p1.mRotateDegree);
          p0.r("direction");
          p0.K((long)p1.mRotateDirection);
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
