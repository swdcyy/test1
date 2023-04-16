package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$PrivacyOption$TypeAdapter extends TypeAdapter	// class@0009eb
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       PhotoAdvertisement$PrivacyOption$TypeAdapter.e = a.get(PhotoAdvertisement$PrivacyOption.class);
    }
    public void PhotoAdvertisement$PrivacyOption$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$PrivacyAppInfo$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$AppInfoLink$TypeAdapter.b);
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$PrivacyOption a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PrivacyOption$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PrivacyOption privacyOptio = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return privacyOptio;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return privacyOptio;
       }else {
          p0.c();
          PhotoAdvertisement$PrivacyOption privacyOptio1 = new PhotoAdvertisement$PrivacyOption();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9adcea99:
                   if (str.equals("riskTipText")) {
                      i = 0;
                   }
                   break;
                 case 0xd0a85a6f:
                   if (str.equals("appInfo")) {
                      i = 1;
                   }
                   break;
                 case 0xe556340b:
                   if (str.equals("displayPosition")) {
                      i = 2;
                   }
                   break;
                 case 0xf3dd4655:
                   if (str.equals("photoRiskTipUrl")) {
                      i = 3;
                   }
                   break;
                 case 0x6234fb9:
                   if (str.equals("links")) {
                      i = 4;
                   }
                   break;
                 case 0x68b1db1:
                   if (str.equals("style")) {
                      i = 5;
                   }
                   break;
                 case 0x15ace02e:
                   if (str.equals("appDisplayText")) {
                      i = 6;
                   }
                   break;
                 case 0x42a40342:
                   if (str.equals("showH5RiskTip")) {
                      i = 7;
                   }
                   break;
                 case 0x5917b057:
                   if (str.equals("showPhotoRiskTip")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   privacyOptio1.mRiskTipText = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   privacyOptio1.mPrivacyAppInfo = this.b.read(p0);
                   break;
                 case 2:
                   privacyOptio1.mDisplayPosition = KnownTypeAdapters$k.a(p0, privacyOptio1.mDisplayPosition);
                   break;
                 case 3:
                   privacyOptio1.mPhotoRiskTipUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   privacyOptio1.mAppInfoLinkList = this.d.read(p0);
                   break;
                 case 5:
                   privacyOptio1.mStyle = KnownTypeAdapters$k.a(p0, privacyOptio1.mStyle);
                   break;
                 case 6:
                   privacyOptio1.mAppDisplayText = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   privacyOptio1.mShowH5RiskTip = KnownTypeAdapters$g.a(p0, privacyOptio1.mShowH5RiskTip);
                   break;
                 case 8:
                   privacyOptio1.mShowPhotoRiskTip = KnownTypeAdapters$g.a(p0, privacyOptio1.mShowPhotoRiskTip);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return privacyOptio1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PrivacyOption p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PrivacyOption$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("showPhotoRiskTip");
          p0.P(p1.mShowPhotoRiskTip);
          if (p1.mPhotoRiskTipUrl != null) {
             p0.r("photoRiskTipUrl");
             TypeAdapters.A.write(p0, p1.mPhotoRiskTipUrl);
          }
          p0.r("showH5RiskTip");
          p0.P(p1.mShowH5RiskTip);
          if (p1.mRiskTipText != null) {
             p0.r("riskTipText");
             TypeAdapters.A.write(p0, p1.mRiskTipText);
          }
          p0.r("displayPosition");
          p0.K((long)p1.mDisplayPosition);
          if (p1.mPrivacyAppInfo != null) {
             p0.r("appInfo");
             this.b.write(p0, p1.mPrivacyAppInfo);
          }
          if (p1.mAppDisplayText != null) {
             p0.r("appDisplayText");
             TypeAdapters.A.write(p0, p1.mAppDisplayText);
          }
          if (p1.mAppInfoLinkList != null) {
             p0.r("links");
             this.d.write(p0, p1.mAppInfoLinkList);
          }
          p0.r("style");
          p0.K((long)p1.mStyle);
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
