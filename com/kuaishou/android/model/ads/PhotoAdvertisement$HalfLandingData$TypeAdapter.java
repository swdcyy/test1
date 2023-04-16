package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$HalfLandingData$TypeAdapter extends TypeAdapter	// class@000944
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PhotoAdvertisement$HalfLandingData$TypeAdapter.f = a.get(PhotoAdvertisement$HalfLandingData.class);
    }
    public void PhotoAdvertisement$HalfLandingData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$HeaderData$TypeAdapter.d);
       this.c = p0.j(PhotoAdvertisement$CoverData$TypeAdapter.d);
       this.d = p0.j(PhotoAdvertisement$CollapsedTextData$TypeAdapter.b);
       this.e = p0.j(PhotoAdvertisement$PrivacyData$TypeAdapter.d);
    }
    public PhotoAdvertisement$HalfLandingData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$HalfLandingData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$HalfLandingData halfLandingD = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return halfLandingD;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return halfLandingD;
       }else {
          p0.c();
          PhotoAdvertisement$HalfLandingData halfLandingD1 = new PhotoAdvertisement$HalfLandingData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xe5e1b9ee:
                   if (str.equals("collapsedTextData")) {
                      i = 0;
                   }
                   break;
                 case 0x459b2d54:
                   if (str.equals("disallowExpanded")) {
                      i = 1;
                   }
                   break;
                 case 0x59948352:
                   if (str.equals("privacyData")) {
                      i = 2;
                   }
                   break;
                 case 0x75d737d7:
                   if (str.equals("headerData")) {
                      i = 3;
                   }
                   break;
                 case 0x75f90401:
                   if (str.equals("coverData")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   halfLandingD1.mCollapsedTextData = this.d.read(p0);
                   break;
                 case 1:
                   halfLandingD1.mDisallowExpanded = KnownTypeAdapters$g.a(p0, halfLandingD1.mDisallowExpanded);
                   break;
                 case 2:
                   halfLandingD1.mPrivacyData = this.e.read(p0);
                   break;
                 case 3:
                   halfLandingD1.mHeaderData = this.b.read(p0);
                   break;
                 case 4:
                   halfLandingD1.mCoverData = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return halfLandingD1;
       }
    }
    public void b(b p0,PhotoAdvertisement$HalfLandingData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$HalfLandingData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("disallowExpanded");
          p0.P(p1.mDisallowExpanded);
          if (p1.mHeaderData != null) {
             p0.r("headerData");
             this.b.write(p0, p1.mHeaderData);
          }
          if (p1.mCoverData != null) {
             p0.r("coverData");
             this.c.write(p0, p1.mCoverData);
          }
          if (p1.mCollapsedTextData != null) {
             p0.r("collapsedTextData");
             this.d.write(p0, p1.mCollapsedTextData);
          }
          if (p1.mPrivacyData != null) {
             p0.r("privacyData");
             this.e.write(p0, p1.mPrivacyData);
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
