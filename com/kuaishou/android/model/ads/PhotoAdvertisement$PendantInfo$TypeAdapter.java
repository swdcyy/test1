package com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$PendantInfo$TypeAdapter extends TypeAdapter	// class@0009bd
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$PendantInfo$TypeAdapter.c = a.get(PhotoAdvertisement$PendantInfo.class);
    }
    public void PhotoAdvertisement$PendantInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$Layout$TypeAdapter.b);
    }
    public PhotoAdvertisement$PendantInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PendantInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PendantInfo pendantInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return pendantInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return pendantInfo;
       }else {
          p0.c();
          PhotoAdvertisement$PendantInfo pendantInfo1 = new PhotoAdvertisement$PendantInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbddafb2a:
                   if (str.equals("layout")) {
                      i = 0;
                   }
                   break;
                 case 0xeae8c1eb:
                   if (str.equals("isUsePendantInfoInActionBar")) {
                      i = 1;
                   }
                   break;
                 case 0xeb084a38:
                   if (str.equals("coverUrl")) {
                      i = 2;
                   }
                   break;
                 case 0x754d249:
                   if (str.equals("landingPageUrl")) {
                      i = 3;
                   }
                   break;
                 case 0x2572cb06:
                   if (str.equals("deepLink")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   pendantInfo1.mLayout = this.b.read(p0);
                   break;
                 case 1:
                   pendantInfo1.mIsUsePendantInfoInActionBar = KnownTypeAdapters$g.a(p0, pendantInfo1.mIsUsePendantInfoInActionBar);
                   break;
                 case 2:
                   pendantInfo1.mCoverUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   pendantInfo1.mLandingPageUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   pendantInfo1.mDeepLink = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return pendantInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PendantInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PendantInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCoverUrl != null) {
             p0.r("coverUrl");
             TypeAdapters.A.write(p0, p1.mCoverUrl);
          }
          if (p1.mDeepLink != null) {
             p0.r("deepLink");
             TypeAdapters.A.write(p0, p1.mDeepLink);
          }
          if (p1.mLandingPageUrl != null) {
             p0.r("landingPageUrl");
             TypeAdapters.A.write(p0, p1.mLandingPageUrl);
          }
          if (p1.mLayout != null) {
             p0.r("layout");
             this.b.write(p0, p1.mLayout);
          }
          p0.r("isUsePendantInfoInActionBar");
          p0.P(p1.mIsUsePendantInfoInActionBar);
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
