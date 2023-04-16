package com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$H5ControlInfo$TypeAdapter extends TypeAdapter	// class@000940
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$H5ControlInfo$TypeAdapter.b = a.get(PhotoAdvertisement$H5ControlInfo.class);
    }
    public void PhotoAdvertisement$H5ControlInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$H5ControlInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$H5ControlInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$H5ControlInfo h5ControlInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return h5ControlInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return h5ControlInf;
       }else {
          p0.c();
          PhotoAdvertisement$H5ControlInfo h5ControlInf1 = new PhotoAdvertisement$H5ControlInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x938cf92f:
                   if (str.equals("shouldSuspendDeepLink")) {
                      i = 0;
                   }
                   break;
                 case 0xba2fcdd6:
                   if (str.equals("h5PreloadType")) {
                      i = 1;
                   }
                   break;
                 case 0xeeadc543:
                   if (str.equals("h5AutoJumpLimitedTimeMs")) {
                      i = 2;
                   }
                   break;
                 case 0xfa6f1b99:
                   if (str.equals("hideH5ReportEntrance")) {
                      i = 3;
                   }
                   break;
                 case 0x12bfe2fc:
                   if (str.equals("disallowShowSslErrorDialog")) {
                      i = 4;
                   }
                   break;
                 case 0x3e4b491b:
                   if (str.equals("enableProfileRealTimeOpenDetailPage")) {
                      i = 5;
                   }
                   break;
                 case 0x408a0f28:
                   if (str.equals("disallowShowDownloadDialog")) {
                      i = 6;
                   }
                   break;
                 case 0x469a740f:
                   if (str.equals("h5DisplayType")) {
                      i = 7;
                   }
                   break;
                 case 0x545b89d4:
                   if (str.equals("h5PreloadDelayTime")) {
                      i = 8;
                   }
                   break;
                 case 0x67284a17:
                   if (str.equals("isDownloadLandingPageMould")) {
                      i = 9;
                   }
                   break;
                 case 0x68c74f51:
                   if (str.equals("deepLinkControlType")) {
                      i = 10;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   h5ControlInf1.mShouldSuspendDeepLink = KnownTypeAdapters$g.a(p0, h5ControlInf1.mShouldSuspendDeepLink);
                   break;
                 case 1:
                   h5ControlInf1.mH5PreloadType = KnownTypeAdapters$k.a(p0, h5ControlInf1.mH5PreloadType);
                   break;
                 case 2:
                   h5ControlInf1.mH5AutoJumpLimitedTimeMs = KnownTypeAdapters$n.a(p0, h5ControlInf1.mH5AutoJumpLimitedTimeMs);
                   break;
                 case 3:
                   h5ControlInf1.mHideH5ReportEntrance = KnownTypeAdapters$g.a(p0, h5ControlInf1.mHideH5ReportEntrance);
                   break;
                 case 4:
                   h5ControlInf1.mDisallowShowSslErrorDialog = KnownTypeAdapters$g.a(p0, h5ControlInf1.mDisallowShowSslErrorDialog);
                   break;
                 case 5:
                   h5ControlInf1.mEnableProfileRealTimeOpenDetailPage = KnownTypeAdapters$g.a(p0, h5ControlInf1.mEnableProfileRealTimeOpenDetailPage);
                   break;
                 case 6:
                   h5ControlInf1.mDisallowShowDownloadDialog = KnownTypeAdapters$g.a(p0, h5ControlInf1.mDisallowShowDownloadDialog);
                   break;
                 case 7:
                   h5ControlInf1.mH5DisplayType = KnownTypeAdapters$k.a(p0, h5ControlInf1.mH5DisplayType);
                   break;
                 case 8:
                   h5ControlInf1.mPreloadDelayTime = KnownTypeAdapters$n.a(p0, h5ControlInf1.mPreloadDelayTime);
                   break;
                 case 9:
                   h5ControlInf1.mIsDownloadLandingPageMould = KnownTypeAdapters$g.a(p0, h5ControlInf1.mIsDownloadLandingPageMould);
                   break;
                 case 10:
                   h5ControlInf1.mDeepLinkControlType = KnownTypeAdapters$k.a(p0, h5ControlInf1.mDeepLinkControlType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return h5ControlInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$H5ControlInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$H5ControlInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideH5ReportEntrance");
          p0.P(p1.mHideH5ReportEntrance);
          p0.r("isDownloadLandingPageMould");
          p0.P(p1.mIsDownloadLandingPageMould);
          p0.r("enableProfileRealTimeOpenDetailPage");
          p0.P(p1.mEnableProfileRealTimeOpenDetailPage);
          p0.r("h5PreloadType");
          p0.K((long)p1.mH5PreloadType);
          p0.r("h5PreloadDelayTime");
          p0.K(p1.mPreloadDelayTime);
          p0.r("disallowShowDownloadDialog");
          p0.P(p1.mDisallowShowDownloadDialog);
          p0.r("disallowShowSslErrorDialog");
          p0.P(p1.mDisallowShowSslErrorDialog);
          p0.r("h5DisplayType");
          p0.K((long)p1.mH5DisplayType);
          p0.r("shouldSuspendDeepLink");
          p0.P(p1.mShouldSuspendDeepLink);
          p0.r("deepLinkControlType");
          p0.K((long)p1.mDeepLinkControlType);
          p0.r("h5AutoJumpLimitedTimeMs");
          p0.K(p1.mH5AutoJumpLimitedTimeMs);
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
