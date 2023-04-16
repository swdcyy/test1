package com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdWebCardInfo$TypeAdapter extends TypeAdapter	// class@0008bc
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$AdWebCardInfo$TypeAdapter.b = a.get(PhotoAdvertisement$AdWebCardInfo.class);
    }
    public void PhotoAdvertisement$AdWebCardInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$AdWebCardInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdWebCardInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdWebCardInfo uAdWebCardIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdWebCardIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdWebCardIn;
       }else {
          p0.c();
          PhotoAdvertisement$AdWebCardInfo uAdWebCardIn1 = new PhotoAdvertisement$AdWebCardInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xaa25e4a8:
                   if (str.equals("hideCloseButton")) {
                      i = 0;
                   }
                   break;
                 case 0xf60e221a:
                   if (str.equals("cardDelayReplay")) {
                      i = 1;
                   }
                   break;
                 case 0xff7ad6da:
                   if (str.equals("cardData")) {
                      i = 2;
                   }
                   break;
                 case 0xff82766a:
                   if (str.equals("cardType")) {
                      i = 3;
                   }
                   break;
                 case 0x772aa9a:
                   if (str.equals("cardShowTime")) {
                      i = 4;
                   }
                   break;
                 case 0x2104383f:
                   if (str.equals("cardUrl")) {
                      i = 5;
                   }
                   break;
                 case 0x3cff1dc0:
                   if (str.equals("cardDelayTime")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAdWebCardIn1.mHideCloseButton = KnownTypeAdapters$g.a(p0, uAdWebCardIn1.mHideCloseButton);
                   break;
                 case 1:
                   uAdWebCardIn1.mCardDelayReplay = KnownTypeAdapters$g.a(p0, uAdWebCardIn1.mCardDelayReplay);
                   break;
                 case 2:
                   uAdWebCardIn1.mCardData = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uAdWebCardIn1.mCardType = KnownTypeAdapters$k.a(p0, uAdWebCardIn1.mCardType);
                   break;
                 case 4:
                   uAdWebCardIn1.mCardShowTime = KnownTypeAdapters$n.a(p0, uAdWebCardIn1.mCardShowTime);
                   break;
                 case 5:
                   uAdWebCardIn1.mCardUrl = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uAdWebCardIn1.mCardDelayTime = KnownTypeAdapters$n.a(p0, uAdWebCardIn1.mCardDelayTime);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdWebCardIn1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdWebCardInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdWebCardInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCardUrl != null) {
             p0.r("cardUrl");
             TypeAdapters.A.write(p0, p1.mCardUrl);
          }
          if (p1.mCardData != null) {
             p0.r("cardData");
             TypeAdapters.A.write(p0, p1.mCardData);
          }
          p0.r("cardDelayTime");
          p0.K(p1.mCardDelayTime);
          p0.r("cardShowTime");
          p0.K(p1.mCardShowTime);
          p0.r("cardType");
          p0.K((long)p1.mCardType);
          p0.r("cardDelayReplay");
          p0.P(p1.mCardDelayReplay);
          p0.r("hideCloseButton");
          p0.P(p1.mHideCloseButton);
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
