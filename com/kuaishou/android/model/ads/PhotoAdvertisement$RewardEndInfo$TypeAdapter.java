package com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$RewardEndInfo$TypeAdapter extends TypeAdapter	// class@0009fd
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$RewardEndInfo$TypeAdapter.b = a.get(PhotoAdvertisement$RewardEndInfo.class);
    }
    public void PhotoAdvertisement$RewardEndInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$RewardEndInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$RewardEndInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$RewardEndInfo rewardEndInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return rewardEndInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return rewardEndInf;
       }else {
          p0.c();
          PhotoAdvertisement$RewardEndInfo rewardEndInf1 = new PhotoAdvertisement$RewardEndInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x836c5bf8:
                   if (str.equals("subTitle")) {
                      i = 0;
                   }
                   break;
                 case 0xb6ef9307:
                   if (str.equals("extParams")) {
                      i = 1;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 2;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 3;
                   }
                   break;
                 case 0xa28a7d3:
                   if (str.equals("taskTitle")) {
                      i = 4;
                   }
                   break;
                 case 0x1d623f94:
                   if (str.equals("hightLightTitle")) {
                      i = 5;
                   }
                   break;
                 case 0x2405a09d:
                   if (str.equals("taskSubTitle")) {
                      i = 6;
                   }
                   break;
                 case 0x51b9dae5:
                   if (str.equals("enableShowAgainView")) {
                      i = 7;
                   }
                   break;
                 case 0x5dc625c2:
                   if (str.equals("actionTitle")) {
                      i = 8;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   rewardEndInf1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   rewardEndInf1.mExtParams = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   rewardEndInf1.mType = KnownTypeAdapters$k.a(p0, rewardEndInf1.mType);
                   break;
                 case 3:
                   rewardEndInf1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   rewardEndInf1.mTaskTitle = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   rewardEndInf1.mHightLightTitle = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   rewardEndInf1.mTaskSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   rewardEndInf1.mEnableShowAgainView = KnownTypeAdapters$g.a(p0, rewardEndInf1.mEnableShowAgainView);
                   break;
                 case 8:
                   rewardEndInf1.mActionTitle = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   rewardEndInf1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return rewardEndInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$RewardEndInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$RewardEndInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          p0.r("enableShowAgainView");
          p0.P(p1.mEnableShowAgainView);
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mTaskTitle != null) {
             p0.r("taskTitle");
             TypeAdapters.A.write(p0, p1.mTaskTitle);
          }
          if (p1.mTaskSubTitle != null) {
             p0.r("taskSubTitle");
             TypeAdapters.A.write(p0, p1.mTaskSubTitle);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mHightLightTitle != null) {
             p0.r("hightLightTitle");
             TypeAdapters.A.write(p0, p1.mHightLightTitle);
          }
          if (p1.mActionTitle != null) {
             p0.r("actionTitle");
             TypeAdapters.A.write(p0, p1.mActionTitle);
          }
          if (p1.mExtParams != null) {
             p0.r("extParams");
             TypeAdapters.A.write(p0, p1.mExtParams);
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
