package com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$RotationInfo$TypeAdapter extends TypeAdapter	// class@000a01
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$RotationInfo$TypeAdapter.c = a.get(PhotoAdvertisement$RotationInfo.class);
    }
    public void PhotoAdvertisement$RotationInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$AxisDirection$TypeAdapter.b);
    }
    public PhotoAdvertisement$RotationInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$RotationInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$RotationInfo rotationInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return rotationInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return rotationInfo;
       }else {
          p0.c();
          PhotoAdvertisement$RotationInfo rotationInfo1 = new PhotoAdvertisement$RotationInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x852f4c18:
                   if (str.equals("subtitle")) {
                      i = 0;
                   }
                   break;
                 case 0xd9617b18:
                   if (str.equals("rotateEnableDelayTimeMs")) {
                      i = 1;
                   }
                   break;
                 case 'x':
                   if (str.equals("x")) {
                      i = 2;
                   }
                   break;
                 case 'y':
                   if (str.equals("y")) {
                      i = 3;
                   }
                   break;
                 case 'z':
                   if (str.equals("z")) {
                      i = 4;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   rotationInfo1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   rotationInfo1.mRotateEnableDelayTimeMs = KnownTypeAdapters$k.a(p0, rotationInfo1.mRotateEnableDelayTimeMs);
                   break;
                 case 2:
                   rotationInfo1.mXAxisDirection = this.b.read(p0);
                   break;
                 case 3:
                   rotationInfo1.mYAxisDirection = this.b.read(p0);
                   break;
                 case 4:
                   rotationInfo1.mZAxisDirection = this.b.read(p0);
                   break;
                 case 5:
                   rotationInfo1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return rotationInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$RotationInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$RotationInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subtitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mXAxisDirection != null) {
             p0.r("x");
             this.b.write(p0, p1.mXAxisDirection);
          }
          if (p1.mYAxisDirection != null) {
             p0.r("y");
             this.b.write(p0, p1.mYAxisDirection);
          }
          if (p1.mZAxisDirection != null) {
             p0.r("z");
             this.b.write(p0, p1.mZAxisDirection);
          }
          p0.r("rotateEnableDelayTimeMs");
          p0.K((long)p1.mRotateEnableDelayTimeMs);
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
