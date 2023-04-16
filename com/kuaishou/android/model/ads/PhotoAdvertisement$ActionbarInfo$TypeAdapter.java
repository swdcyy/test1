package com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$i;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ActionbarInfo$TypeAdapter extends TypeAdapter	// class@000885
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$ActionbarInfo$TypeAdapter.b = a.get(PhotoAdvertisement$ActionbarInfo.class);
    }
    public void PhotoAdvertisement$ActionbarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$ActionbarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ActionbarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ActionbarInfo uActionbarIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uActionbarIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uActionbarIn;
       }else {
          p0.c();
          PhotoAdvertisement$ActionbarInfo uActionbarIn1 = new PhotoAdvertisement$ActionbarInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9af7a366:
                   if (str.equals("actionBarColor")) {
                      i = 0;
                   }
                   break;
                 case 0x9bdb91b4:
                   if (str.equals("actionBarStyle")) {
                      i = 1;
                   }
                   break;
                 case 0x9dfdbfcc:
                   if (str.equals("animationDelayTime")) {
                      i = 2;
                   }
                   break;
                 case 0xa915a48d:
                   if (str.equals("animationStyle")) {
                      i = 3;
                   }
                   break;
                 case 0xb51dee16:
                   if (str.equals("withoutFloatingToComment")) {
                      i = 4;
                   }
                   break;
                 case 0xd476b618:
                   if (str.equals("enableHideActionBar")) {
                      i = 5;
                   }
                   break;
                 case 0xd7e8530a:
                   if (str.equals("convertedDescription")) {
                      i = 6;
                   }
                   break;
                 case 0xf1815189:
                   if (str.equals("downloadedActionBarLoadTime")) {
                      i = 7;
                   }
                   break;
                 case 0x2d553f75:
                   if (str.equals("realShowDelayTime")) {
                      i = 8;
                   }
                   break;
                 case 0x2ef4f2d9:
                   if (str.equals("actionBarHideProportion")) {
                      i = 9;
                   }
                   break;
                 case 0x3bd5585d:
                   if (str.equals("actionBarTag")) {
                      i = 10;
                   }
                   break;
                 case 0x4b6e11f0:
                   if (str.equals("actionBarLoadTime")) {
                      i = 11;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 12;
                   }
                   break;
                 case 0x4ebc08d2:
                   if (str.equals("actionBarLocation")) {
                      i = 13;
                   }
                   break;
                 case 0x6629c090:
                   if (str.equals("displayInfo")) {
                      i = 14;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uActionbarIn1.mActionBarColor = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uActionbarIn1.mActionbarStyle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uActionbarIn1.mAnimationDelayTime = KnownTypeAdapters$n.a(p0, uActionbarIn1.mAnimationDelayTime);
                   break;
                 case 3:
                   uActionbarIn1.mAnimationStyle = KnownTypeAdapters$k.a(p0, uActionbarIn1.mAnimationStyle);
                   break;
                 case 4:
                   uActionbarIn1.mWithoutFloatingToComment = KnownTypeAdapters$g.a(p0, uActionbarIn1.mWithoutFloatingToComment);
                   break;
                 case 5:
                   uActionbarIn1.mEnableHideActionBar = KnownTypeAdapters$g.a(p0, uActionbarIn1.mEnableHideActionBar);
                   break;
                 case 6:
                   uActionbarIn1.mConvertedDescription = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uActionbarIn1.mDownloadedBarLoadTime = KnownTypeAdapters$k.a(p0, uActionbarIn1.mDownloadedBarLoadTime);
                   break;
                 case 8:
                   uActionbarIn1.mColorDelayTime = KnownTypeAdapters$n.a(p0, uActionbarIn1.mColorDelayTime);
                   break;
                 case 9:
                   uActionbarIn1.mActionBarHideProportion = KnownTypeAdapters$i.a(p0, uActionbarIn1.mActionBarHideProportion);
                   break;
                 case 10:
                   uActionbarIn1.mActionbarTag = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   uActionbarIn1.mActionBarLoadTime = KnownTypeAdapters$k.a(p0, uActionbarIn1.mActionBarLoadTime);
                   break;
                 case 12:
                   uActionbarIn1.mTemplateId = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   uActionbarIn1.mActionBarLocation = KnownTypeAdapters$k.a(p0, uActionbarIn1.mActionBarLocation);
                   break;
                 case 14:
                   uActionbarIn1.mDisplayInfo = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uActionbarIn1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ActionbarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ActionbarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("actionBarLoadTime");
          p0.K((long)p1.mActionBarLoadTime);
          p0.r("realShowDelayTime");
          p0.K(p1.mColorDelayTime);
          p0.r("downloadedActionBarLoadTime");
          p0.K((long)p1.mDownloadedBarLoadTime);
          if (p1.mActionbarStyle != null) {
             p0.r("actionBarStyle");
             TypeAdapters.A.write(p0, p1.mActionbarStyle);
          }
          p0.r("enableHideActionBar");
          p0.P(p1.mEnableHideActionBar);
          if (p1.mActionBarColor != null) {
             p0.r("actionBarColor");
             TypeAdapters.A.write(p0, p1.mActionBarColor);
          }
          if (p1.mConvertedDescription != null) {
             p0.r("convertedDescription");
             TypeAdapters.A.write(p0, p1.mConvertedDescription);
          }
          if (p1.mDisplayInfo != null) {
             p0.r("displayInfo");
             TypeAdapters.A.write(p0, p1.mDisplayInfo);
          }
          p0.r("animationDelayTime");
          p0.K(p1.mAnimationDelayTime);
          if (p1.mActionbarTag != null) {
             p0.r("actionBarTag");
             TypeAdapters.A.write(p0, p1.mActionbarTag);
          }
          p0.r("withoutFloatingToComment");
          p0.P(p1.mWithoutFloatingToComment);
          p0.r("actionBarHideProportion");
          p0.J(p1.mActionBarHideProportion);
          if (p1.mTemplateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.mTemplateId);
          }
          p0.r("actionBarLocation");
          p0.K((long)p1.mActionBarLocation);
          p0.r("animationStyle");
          p0.K((long)p1.mAnimationStyle);
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
