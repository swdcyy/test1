package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CommentActionBarInfo$TypeAdapter extends TypeAdapter	// class@0008e4
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$CommentActionBarInfo$TypeAdapter.b = a.get(PhotoAdvertisement$CommentActionBarInfo.class);
    }
    public void PhotoAdvertisement$CommentActionBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$CommentActionBarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CommentActionBarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CommentActionBarInfo uCommentActi = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCommentActi;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCommentActi;
       }else {
          p0.c();
          PhotoAdvertisement$CommentActionBarInfo uCommentActi1 = new PhotoAdvertisement$CommentActionBarInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x80155b69:
                   if (str.equals("liveActionBarTag")) {
                      i = 0;
                   }
                   break;
                 case 0x9af7a366:
                   if (str.equals("actionBarColor")) {
                      i = 1;
                   }
                   break;
                 case 0x9bdb91b4:
                   if (str.equals("actionBarStyle")) {
                      i = 2;
                   }
                   break;
                 case 0xa714ac1a:
                   if (str.equals("productName")) {
                      i = 3;
                   }
                   break;
                 case 0xb7cf3dde:
                   if (str.equals("downloadNum")) {
                      i = 4;
                   }
                   break;
                 case 0xc5fd326d:
                   if (str.equals("liveActionBarBgColor")) {
                      i = 5;
                   }
                   break;
                 case 0xd7e8530a:
                   if (str.equals("convertedDescription")) {
                      i = 6;
                   }
                   break;
                 case 0x2f96ea3f:
                   if (str.equals("appCategory")) {
                      i = 7;
                   }
                   break;
                 case 0x3a226f1b:
                   if (str.equals("categoryWordColor")) {
                      i = 8;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 9;
                   }
                   break;
                 case 0x4ebc08d2:
                   if (str.equals("actionBarLocation")) {
                      i = 10;
                   }
                   break;
                 case 0x6629c090:
                   if (str.equals("displayInfo")) {
                      i = 11;
                   }
                   break;
                 case 0x69453e9a:
                   if (str.equals("commentActionBarTitle")) {
                      i = 12;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCommentActi1.mLiveActionBarTag = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCommentActi1.mActionBarColor = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uCommentActi1.mActionbarStyle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uCommentActi1.mUserName = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uCommentActi1.mDownloadNum = KnownTypeAdapters$n.a(p0, uCommentActi1.mDownloadNum);
                   break;
                 case 5:
                   uCommentActi1.mLiveActionBarBgColor = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCommentActi1.mConvertedDescription = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCommentActi1.mAppCategory = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCommentActi1.mCategoryWordColor = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCommentActi1.mTemplateId = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   uCommentActi1.mCommentActionLocation = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   uCommentActi1.mDisplayInfo = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   uCommentActi1.mCommentActionbarTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCommentActi1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CommentActionBarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CommentActionBarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCommentActionLocation != null) {
             p0.r("actionBarLocation");
             TypeAdapters.A.write(p0, p1.mCommentActionLocation);
          }
          if (p1.mActionbarStyle != null) {
             p0.r("actionBarStyle");
             TypeAdapters.A.write(p0, p1.mActionbarStyle);
          }
          if (p1.mActionBarColor != null) {
             p0.r("actionBarColor");
             TypeAdapters.A.write(p0, p1.mActionBarColor);
          }
          if (p1.mDisplayInfo != null) {
             p0.r("displayInfo");
             TypeAdapters.A.write(p0, p1.mDisplayInfo);
          }
          if (p1.mCommentActionbarTitle != null) {
             p0.r("commentActionBarTitle");
             TypeAdapters.A.write(p0, p1.mCommentActionbarTitle);
          }
          if (p1.mConvertedDescription != null) {
             p0.r("convertedDescription");
             TypeAdapters.A.write(p0, p1.mConvertedDescription);
          }
          p0.r("downloadNum");
          p0.K(p1.mDownloadNum);
          if (p1.mAppCategory != null) {
             p0.r("appCategory");
             TypeAdapters.A.write(p0, p1.mAppCategory);
          }
          if (p1.mCategoryWordColor != null) {
             p0.r("categoryWordColor");
             TypeAdapters.A.write(p0, p1.mCategoryWordColor);
          }
          if (p1.mUserName != null) {
             p0.r("productName");
             TypeAdapters.A.write(p0, p1.mUserName);
          }
          if (p1.mLiveActionBarBgColor != null) {
             p0.r("liveActionBarBgColor");
             TypeAdapters.A.write(p0, p1.mLiveActionBarBgColor);
          }
          if (p1.mLiveActionBarTag != null) {
             p0.r("liveActionBarTag");
             TypeAdapters.A.write(p0, p1.mLiveActionBarTag);
          }
          if (p1.mTemplateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.mTemplateId);
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
