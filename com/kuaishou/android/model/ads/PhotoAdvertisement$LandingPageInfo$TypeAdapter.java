package com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageType;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$LandingPageInfo$TypeAdapter extends TypeAdapter	// class@00098c
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$LandingPageInfo$TypeAdapter.d = a.get(PhotoAdvertisement$LandingPageInfo.class);
    }
    public void PhotoAdvertisement$LandingPageInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(PhotoAdvertisement$LandingPageType.class));
       this.c = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$LandingPageInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$LandingPageInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$LandingPageInfo landingPageI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return landingPageI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return landingPageI;
       }else {
          p0.c();
          PhotoAdvertisement$LandingPageInfo landingPageI1 = new PhotoAdvertisement$LandingPageInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x854e5c0b:
                   if (str.equals("landingPageStyle")) {
                      i = 0;
                   }
                   break;
                 case 0x855760b2:
                   if (str.equals("landingPageTitle")) {
                      i = 1;
                   }
                   break;
                 case 0x875878e0:
                   if (str.equals("allowedDeeplinkPrefix")) {
                      i = 2;
                   }
                   break;
                 case 0xb105e653:
                   if (str.equals("actionBarDisplayInfo")) {
                      i = 3;
                   }
                   break;
                 case 0xc93a4487:
                   if (str.equals("actionBarShowTime")) {
                      i = 4;
                   }
                   break;
                 case 0xcc0cd785:
                   if (str.equals("popLandingPageHeightPct")) {
                      i = 5;
                   }
                   break;
                 case 0xee1d8737:
                   if (str.equals("commentTagVisible")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   landingPageI1.mLandingPageStyle = this.b.read(p0);
                   break;
                 case 1:
                   landingPageI1.mLandingPageTitle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   landingPageI1.mAllowedDeeplinkPrefixList = this.c.read(p0);
                   break;
                 case 3:
                   landingPageI1.mActionBarDisplayName = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   landingPageI1.mActionBarShowTime = KnownTypeAdapters$n.a(p0, landingPageI1.mActionBarShowTime);
                   break;
                 case 5:
                   landingPageI1.mPopLandingPageHeightPct = KnownTypeAdapters$k.a(p0, landingPageI1.mPopLandingPageHeightPct);
                   break;
                 case 6:
                   landingPageI1.mCommentTagVisible = KnownTypeAdapters$g.a(p0, landingPageI1.mCommentTagVisible);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return landingPageI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$LandingPageInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$LandingPageInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLandingPageStyle != null) {
             p0.r("landingPageStyle");
             this.b.write(p0, p1.mLandingPageStyle);
          }
          if (p1.mActionBarDisplayName != null) {
             p0.r("actionBarDisplayInfo");
             TypeAdapters.A.write(p0, p1.mActionBarDisplayName);
          }
          p0.r("actionBarShowTime");
          p0.K(p1.mActionBarShowTime);
          p0.r("popLandingPageHeightPct");
          p0.K((long)p1.mPopLandingPageHeightPct);
          p0.r("commentTagVisible");
          p0.P(p1.mCommentTagVisible);
          if (p1.mLandingPageTitle != null) {
             p0.r("landingPageTitle");
             TypeAdapters.A.write(p0, p1.mLandingPageTitle);
          }
          if (p1.mAllowedDeeplinkPrefixList != null) {
             p0.r("allowedDeeplinkPrefix");
             this.c.write(p0, p1.mAllowedDeeplinkPrefixList);
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
