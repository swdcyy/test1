package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter extends TypeAdapter	// class@00094c
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter.b = a.get(PhotoAdvertisement$HalfLandingPageInfo.class);
    }
    public void PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$HalfLandingPageInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$HalfLandingPageInfo halfLandingP = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return halfLandingP;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return halfLandingP;
       }else {
          p0.c();
          PhotoAdvertisement$HalfLandingPageInfo halfLandingP1 = new PhotoAdvertisement$HalfLandingPageInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xe66baa0e:
                   if (str.equals("downloadActionBarColor")) {
                      i = 0;
                   }
                   break;
                 case 0xecf5e229:
                   if (str.equals("preLoad")) {
                      i = 1;
                   }
                   break;
                 case 0x71b4bb5:
                   if (str.equals("halfLandingPageSiteId")) {
                      i = 2;
                   }
                   break;
                 case 0x1f1bea56:
                   if (str.equals("showHalfLandingPage")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   halfLandingP1.mActionbarColor = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   halfLandingP1.preLoad = KnownTypeAdapters$g.a(p0, halfLandingP1.preLoad);
                   break;
                 case 2:
                   halfLandingP1.mSiteId = KnownTypeAdapters$n.a(p0, halfLandingP1.mSiteId);
                   break;
                 case 3:
                   halfLandingP1.mShowHalfLandingPage = KnownTypeAdapters$g.a(p0, halfLandingP1.mShowHalfLandingPage);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return halfLandingP1;
       }
    }
    public void b(b p0,PhotoAdvertisement$HalfLandingPageInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("showHalfLandingPage");
          p0.P(p1.mShowHalfLandingPage);
          p0.r("halfLandingPageSiteId");
          p0.K(p1.mSiteId);
          if (p1.mActionbarColor != null) {
             p0.r("downloadActionBarColor");
             TypeAdapters.A.write(p0, p1.mActionbarColor);
          }
          p0.r("preLoad");
          p0.P(p1.preLoad);
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
