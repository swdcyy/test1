package com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo;
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

public final class PhotoAdvertisement$SecondNeoInfo$TypeAdapter extends TypeAdapter	// class@000a15
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$SecondNeoInfo$TypeAdapter.b = a.get(PhotoAdvertisement$SecondNeoInfo.class);
    }
    public void PhotoAdvertisement$SecondNeoInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$SecondNeoInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$SecondNeoInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$SecondNeoInfo secondNeoInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return secondNeoInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return secondNeoInf;
       }else {
          p0.c();
          PhotoAdvertisement$SecondNeoInfo secondNeoInf1 = new PhotoAdvertisement$SecondNeoInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9160d37e:
                   if (str.equals("bottomRightText")) {
                      i = 0;
                   }
                   break;
                 case 0xb83de595:
                   if (str.equals("dialogActionBar")) {
                      i = 1;
                   }
                   break;
                 case 0xca41f0:
                   if (str.equals("dialogTitle")) {
                      i = 2;
                   }
                   break;
                 case 0x2c787f79:
                   if (str.equals("orderToast")) {
                      i = 3;
                   }
                   break;
                 case 0x3593564f:
                   if (str.equals("webWidgetToast")) {
                      i = 4;
                   }
                   break;
                 case 0x6aff1ee9:
                   if (str.equals("extraNeoValue")) {
                      i = 5;
                   }
                   break;
                 case 0x6e617690:
                   if (str.equals("actionType")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   secondNeoInf1.mBottomRightText = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   secondNeoInf1.mDialogActionBar = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   secondNeoInf1.mDialogTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   secondNeoInf1.mOrderToast = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   secondNeoInf1.mWebWidgetToast = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   secondNeoInf1.mExtraNeoValue = KnownTypeAdapters$k.a(p0, secondNeoInf1.mExtraNeoValue);
                   break;
                 case 6:
                   secondNeoInf1.mActionType = KnownTypeAdapters$k.a(p0, secondNeoInf1.mActionType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return secondNeoInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$SecondNeoInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$SecondNeoInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mDialogTitle != null) {
             p0.r("dialogTitle");
             TypeAdapters.A.write(p0, p1.mDialogTitle);
          }
          if (p1.mDialogActionBar != null) {
             p0.r("dialogActionBar");
             TypeAdapters.A.write(p0, p1.mDialogActionBar);
          }
          p0.r("extraNeoValue");
          p0.K((long)p1.mExtraNeoValue);
          if (p1.mBottomRightText != null) {
             p0.r("bottomRightText");
             TypeAdapters.A.write(p0, p1.mBottomRightText);
          }
          if (p1.mWebWidgetToast != null) {
             p0.r("webWidgetToast");
             TypeAdapters.A.write(p0, p1.mWebWidgetToast);
          }
          if (p1.mOrderToast != null) {
             p0.r("orderToast");
             TypeAdapters.A.write(p0, p1.mOrderToast);
          }
          p0.r("actionType");
          p0.K((long)p1.mActionType);
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
