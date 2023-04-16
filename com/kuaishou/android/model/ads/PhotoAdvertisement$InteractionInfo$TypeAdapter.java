package com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$InteractionInfo$TypeAdapter extends TypeAdapter	// class@00096c
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$InteractionInfo$TypeAdapter.d = a.get(PhotoAdvertisement$InteractionInfo.class);
    }
    public void PhotoAdvertisement$InteractionInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$ShakeInfo$TypeAdapter.b);
       this.c = p0.j(PhotoAdvertisement$RotationInfo$TypeAdapter.c);
    }
    public PhotoAdvertisement$InteractionInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$InteractionInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$InteractionInfo interactionI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return interactionI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return interactionI;
       }else {
          p0.c();
          PhotoAdvertisement$InteractionInfo interactionI1 = new PhotoAdvertisement$InteractionInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x95bd34d4:
                   if (str.equals("shakeInfo")) {
                      i = 0;
                   }
                   break;
                 case 0xfb4990a9:
                   if (str.equals("rotateInfo")) {
                      i = 1;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   interactionI1.mShakeInfo = this.b.read(p0);
                   break;
                 case 1:
                   interactionI1.mRotationInfo = this.c.read(p0);
                   break;
                 case 2:
                   interactionI1.mTemplateId = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return interactionI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$InteractionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$InteractionInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTemplateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.mTemplateId);
          }
          if (p1.mShakeInfo != null) {
             p0.r("shakeInfo");
             this.b.write(p0, p1.mShakeInfo);
          }
          if (p1.mRotationInfo != null) {
             p0.r("rotateInfo");
             this.c.write(p0, p1.mRotationInfo);
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
