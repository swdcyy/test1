package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$SearchBrandInfo$TypeAdapter extends TypeAdapter	// class@000a09
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$SearchBrandInfo$TypeAdapter.d = a.get(PhotoAdvertisement$SearchBrandInfo.class);
    }
    public void PhotoAdvertisement$SearchBrandInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$SmallShopConfig$TypeAdapter.d);
       this.c = p0.j(PhotoAdvertisement$ChildLinkConfig$TypeAdapter.d);
    }
    public PhotoAdvertisement$SearchBrandInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$SearchBrandInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$SearchBrandInfo searchBrandI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return searchBrandI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return searchBrandI;
       }else {
          p0.c();
          PhotoAdvertisement$SearchBrandInfo searchBrandI1 = new PhotoAdvertisement$SearchBrandInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x870e2bc0:
                   if (str.equals("alreadyBooked")) {
                      i = 0;
                   }
                   break;
                 case 0xbab243f5:
                   if (str.equals("adTitle")) {
                      i = 1;
                   }
                   break;
                 case 0xc20f42c3:
                   if (str.equals("liveStartTime")) {
                      i = 2;
                   }
                   break;
                 case 0xd82d371b:
                   if (str.equals("bookUserCount")) {
                      i = 3;
                   }
                   break;
                 case 0xe6773473:
                   if (str.equals("isLiving")) {
                      i = 4;
                   }
                   break;
                 case 0xe77f29f7:
                   if (str.equals("searchAdFlag")) {
                      i = 5;
                   }
                   break;
                 case 0xeea51a70:
                   if (str.equals("shopProductModuleLinkUrl")) {
                      i = 6;
                   }
                   break;
                 case 0xf4afb977:
                   if (str.equals("picJumpUrl")) {
                      i = 7;
                   }
                   break;
                 case 0xfcb149bc:
                   if (str.equals("middleBarSlogan")) {
                      i = 8;
                   }
                   break;
                 case 0x2186101:
                   if (str.equals("liveReservationSchema")) {
                      i = 9;
                   }
                   break;
                 case 0xd79f616:
                   if (str.equals("picJumpSchemaUrl")) {
                      i = 10;
                   }
                   break;
                 case 0xde1d40b:
                   if (str.equals("sloganFinalColor")) {
                      i = 11;
                   }
                   break;
                 case 0xfafce3f:
                   if (str.equals("smallShopConfig")) {
                      i = 12;
                   }
                   break;
                 case 0x2a48ae81:
                   if (str.equals("userModuleTitle")) {
                      i = 13;
                   }
                   break;
                 case 0x3618863c:
                   if (str.equals("subLinkConfig")) {
                      i = 14;
                   }
                   break;
                 case 0x46377473:
                   if (str.equals("shopProductModuleTitle")) {
                      i = 15;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   searchBrandI1.mAlreadyBooked = KnownTypeAdapters$g.a(p0, searchBrandI1.mAlreadyBooked);
                   break;
                 case 1:
                   searchBrandI1.mAdTitle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   searchBrandI1.mLiveStartTime = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   searchBrandI1.mBookUserCount = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   searchBrandI1.mIsLiving = KnownTypeAdapters$g.a(p0, searchBrandI1.mIsLiving);
                   break;
                 case 5:
                   searchBrandI1.mSearchAdFlag = KnownTypeAdapters$k.a(p0, searchBrandI1.mSearchAdFlag);
                   break;
                 case 6:
                   searchBrandI1.mShopProductModuleLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   searchBrandI1.mPicJumpUrl = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   searchBrandI1.mMiddleBarSlogan = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   searchBrandI1.mLiveReservationSchema = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   searchBrandI1.mPicJumpSchemaUrl = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   searchBrandI1.mSloganFinalColor = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   searchBrandI1.mSmallShopConfig = this.b.read(p0);
                   break;
                 case 13:
                   searchBrandI1.mUserModuleTitle = TypeAdapters.A.read(p0);
                   break;
                 case 14:
                   searchBrandI1.mChildLinkConfig = this.c.read(p0);
                   break;
                 case 15:
                   searchBrandI1.mShopProductModuleTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return searchBrandI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$SearchBrandInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$SearchBrandInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("searchAdFlag");
          p0.K((long)p1.mSearchAdFlag);
          if (p1.mMiddleBarSlogan != null) {
             p0.r("middleBarSlogan");
             TypeAdapters.A.write(p0, p1.mMiddleBarSlogan);
          }
          if (p1.mSloganFinalColor != null) {
             p0.r("sloganFinalColor");
             TypeAdapters.A.write(p0, p1.mSloganFinalColor);
          }
          if (p1.mAdTitle != null) {
             p0.r("adTitle");
             TypeAdapters.A.write(p0, p1.mAdTitle);
          }
          if (p1.mLiveReservationSchema != null) {
             p0.r("liveReservationSchema");
             TypeAdapters.A.write(p0, p1.mLiveReservationSchema);
          }
          if (p1.mLiveStartTime != null) {
             p0.r("liveStartTime");
             TypeAdapters.A.write(p0, p1.mLiveStartTime);
          }
          if (p1.mBookUserCount != null) {
             p0.r("bookUserCount");
             TypeAdapters.A.write(p0, p1.mBookUserCount);
          }
          p0.r("isLiving");
          p0.P(p1.mIsLiving);
          p0.r("alreadyBooked");
          p0.P(p1.mAlreadyBooked);
          if (p1.mPicJumpSchemaUrl != null) {
             p0.r("picJumpSchemaUrl");
             TypeAdapters.A.write(p0, p1.mPicJumpSchemaUrl);
          }
          if (p1.mPicJumpUrl != null) {
             p0.r("picJumpUrl");
             TypeAdapters.A.write(p0, p1.mPicJumpUrl);
          }
          if (p1.mSmallShopConfig != null) {
             p0.r("smallShopConfig");
             this.b.write(p0, p1.mSmallShopConfig);
          }
          if (p1.mUserModuleTitle != null) {
             p0.r("userModuleTitle");
             TypeAdapters.A.write(p0, p1.mUserModuleTitle);
          }
          if (p1.mShopProductModuleTitle != null) {
             p0.r("shopProductModuleTitle");
             TypeAdapters.A.write(p0, p1.mShopProductModuleTitle);
          }
          if (p1.mShopProductModuleLinkUrl != null) {
             p0.r("shopProductModuleLinkUrl");
             TypeAdapters.A.write(p0, p1.mShopProductModuleLinkUrl);
          }
          if (p1.mChildLinkConfig != null) {
             p0.r("subLinkConfig");
             this.c.write(p0, p1.mChildLinkConfig);
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
