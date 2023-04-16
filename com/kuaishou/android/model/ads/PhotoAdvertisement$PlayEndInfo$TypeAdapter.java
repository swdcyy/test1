package com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$PlayEndInfo$TypeAdapter extends TypeAdapter	// class@0009c1
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$PlayEndInfo$TypeAdapter.b = a.get(PhotoAdvertisement$PlayEndInfo.class);
    }
    public void PhotoAdvertisement$PlayEndInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$PlayEndInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PlayEndInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PlayEndInfo playEndInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return playEndInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return playEndInfo;
       }else {
          p0.c();
          PhotoAdvertisement$PlayEndInfo playEndInfo1 = new PhotoAdvertisement$PlayEndInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8ba74965:
                   if (str.equals("scoreBrightStarColor")) {
                      i = 0;
                   }
                   break;
                 case 0x9af7a366:
                   if (str.equals("actionBarColor")) {
                      i = 1;
                   }
                   break;
                 case 0xa714ac1a:
                   if (str.equals("productName")) {
                      i = 2;
                   }
                   break;
                 case 0xd0ec2fe9:
                   if (str.equals("tagColor")) {
                      i = 3;
                   }
                   break;
                 case 0x138bcb65:
                   if (str.equals("mixLottieData")) {
                      i = 4;
                   }
                   break;
                 case 0x2761121f:
                   if (str.equals("playEndSubTitle")) {
                      i = 5;
                   }
                   break;
                 case 0x32a5feb3:
                   if (str.equals("showEndOption")) {
                      i = 6;
                   }
                   break;
                 case 0x3c6b70ea:
                   if (str.equals("playEndStyle")) {
                      i = 7;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 8;
                   }
                   break;
                 case 0x59b3c247:
                   if (str.equals("productIconUrl")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   playEndInfo1.mScoreBrightStarColor = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   playEndInfo1.mActionBarColor = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   playEndInfo1.mUserName = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   playEndInfo1.mTagColor = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   playEndInfo1.mMixLottieData = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   playEndInfo1.mPlayEndSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   playEndInfo1.mShowEndOption = KnownTypeAdapters$g.a(p0, playEndInfo1.mShowEndOption);
                   break;
                 case 7:
                   playEndInfo1.mPlayEndStyle = KnownTypeAdapters$k.a(p0, playEndInfo1.mPlayEndStyle);
                   break;
                 case 8:
                   playEndInfo1.mTemplateId = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   playEndInfo1.mUserIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return playEndInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PlayEndInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PlayEndInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("showEndOption");
          p0.P(p1.mShowEndOption);
          if (p1.mActionBarColor != null) {
             p0.r("actionBarColor");
             TypeAdapters.A.write(p0, p1.mActionBarColor);
          }
          p0.r("playEndStyle");
          p0.K((long)p1.mPlayEndStyle);
          if (p1.mScoreBrightStarColor != null) {
             p0.r("scoreBrightStarColor");
             TypeAdapters.A.write(p0, p1.mScoreBrightStarColor);
          }
          if (p1.mTagColor != null) {
             p0.r("tagColor");
             TypeAdapters.A.write(p0, p1.mTagColor);
          }
          if (p1.mTemplateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.mTemplateId);
          }
          if (p1.mMixLottieData != null) {
             p0.r("mixLottieData");
             TypeAdapters.A.write(p0, p1.mMixLottieData);
          }
          if (p1.mUserName != null) {
             p0.r("productName");
             TypeAdapters.A.write(p0, p1.mUserName);
          }
          if (p1.mUserIconUrl != null) {
             p0.r("productIconUrl");
             TypeAdapters.A.write(p0, p1.mUserIconUrl);
          }
          if (p1.mPlayEndSubTitle != null) {
             p0.r("playEndSubTitle");
             TypeAdapters.A.write(p0, p1.mPlayEndSubTitle);
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
