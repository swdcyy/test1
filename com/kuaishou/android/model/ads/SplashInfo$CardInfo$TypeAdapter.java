package com.kuaishou.android.model.ads.SplashInfo$CardInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$CardInfo;
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
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$CardInfo$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.ads.SplashInfo$CardInfo$TypeAdapter$a;

public final class SplashInfo$CardInfo$TypeAdapter extends TypeAdapter	// class@000a89
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$CardInfo$TypeAdapter.b = a.get(SplashInfo$CardInfo.class);
    }
    public void SplashInfo$CardInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$CardInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$CardInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$CardInfo uCardInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCardInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCardInfo;
       }else {
          p0.c();
          SplashInfo$CardInfo uCardInfo1 = new SplashInfo$CardInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x83d250eb:
                   if (str.equals("convertBgColor")) {
                      i = 0;
                   }
                   break;
                 case 0x8578ae15:
                   if (str.equals("bgColors")) {
                      i = 1;
                   }
                   break;
                 case 0x993583fc:
                   if (str.equals("description")) {
                      i = 2;
                   }
                   break;
                 case 0xf204c7ed:
                   if (str.equals("lightColor")) {
                      i = 3;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 4;
                   }
                   break;
                 case 0x1cadd8c7:
                   if (str.equals("descriptionColor")) {
                      i = 5;
                   }
                   break;
                 case 0x2d16ac65:
                   if (str.equals("convertTitle")) {
                      i = 6;
                   }
                   break;
                 case 0x2f67336f:
                   if (str.equals("headUrl")) {
                      i = 7;
                   }
                   break;
                 case 0x47fea398:
                   if (str.equals("nameColor")) {
                      i = 8;
                   }
                   break;
                 case 0x6f7fe9c3:
                   if (str.equals("convertTextColor")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCardInfo1.mConvertBgColor = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCardInfo1.mCardBgColors = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new SplashInfo$CardInfo$TypeAdapter$b(this)).a(p0);
                   break;
                 case 2:
                   uCardInfo1.mDescription = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uCardInfo1.mLightColor = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uCardInfo1.mName = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uCardInfo1.mDescriptionColor = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCardInfo1.mConvertTitle = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCardInfo1.mAvatarUrl = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCardInfo1.mNameColor = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCardInfo1.mConvertTextColor = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCardInfo1;
       }
    }
    public void b(b p0,SplashInfo$CardInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$CardInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAvatarUrl != null) {
             p0.r("headUrl");
             TypeAdapters.A.write(p0, p1.mAvatarUrl);
          }
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mDescription != null) {
             p0.r("description");
             TypeAdapters.A.write(p0, p1.mDescription);
          }
          if (p1.mConvertTitle != null) {
             p0.r("convertTitle");
             TypeAdapters.A.write(p0, p1.mConvertTitle);
          }
          if (p1.mCardBgColors != null) {
             p0.r("bgColors");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new SplashInfo$CardInfo$TypeAdapter$a(this)).b(p0, p1.mCardBgColors);
          }
          if (p1.mLightColor != null) {
             p0.r("lightColor");
             TypeAdapters.A.write(p0, p1.mLightColor);
          }
          if (p1.mNameColor != null) {
             p0.r("nameColor");
             TypeAdapters.A.write(p0, p1.mNameColor);
          }
          if (p1.mDescriptionColor != null) {
             p0.r("descriptionColor");
             TypeAdapters.A.write(p0, p1.mDescriptionColor);
          }
          if (p1.mConvertTextColor != null) {
             p0.r("convertTextColor");
             TypeAdapters.A.write(p0, p1.mConvertTextColor);
          }
          if (p1.mConvertBgColor != null) {
             p0.r("convertBgColor");
             TypeAdapters.A.write(p0, p1.mConvertBgColor);
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
