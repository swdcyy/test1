package com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo;
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
import com.google.gson.stream.b;

public final class PhotoAdvertisement$TVCActionBarInfo$TypeAdapter extends TypeAdapter	// class@000a2b
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$TVCActionBarInfo$TypeAdapter.b = a.get(PhotoAdvertisement$TVCActionBarInfo.class);
    }
    public void PhotoAdvertisement$TVCActionBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$TVCActionBarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TVCActionBarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TVCActionBarInfo tVCActionBar = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tVCActionBar;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tVCActionBar;
       }else {
          p0.c();
          PhotoAdvertisement$TVCActionBarInfo tVCActionBar1 = new PhotoAdvertisement$TVCActionBarInfo();
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
                 case 0x8f21c161:
                   if (str.equals("backgroundUrl")) {
                      i = 1;
                   }
                   break;
                 case 0x9af7a366:
                   if (str.equals("actionBarColor")) {
                      i = 2;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 3;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 4;
                   }
                   break;
                 case 0x6629c090:
                   if (str.equals("displayInfo")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tVCActionBar1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   tVCActionBar1.mBackgroundUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   tVCActionBar1.mActionBarColor = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   tVCActionBar1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   tVCActionBar1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   tVCActionBar1.mDisplayInfo = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tVCActionBar1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TVCActionBarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TVCActionBarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mBackgroundUrl != null) {
             p0.r("backgroundUrl");
             TypeAdapters.A.write(p0, p1.mBackgroundUrl);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mDisplayInfo != null) {
             p0.r("displayInfo");
             TypeAdapters.A.write(p0, p1.mDisplayInfo);
          }
          if (p1.mActionBarColor != null) {
             p0.r("actionBarColor");
             TypeAdapters.A.write(p0, p1.mActionBarColor);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
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
