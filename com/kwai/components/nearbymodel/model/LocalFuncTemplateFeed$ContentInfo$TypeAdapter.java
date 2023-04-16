package com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfoInner;
import java.util.Map;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$RightBottomInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kwai.components.nearbymodel.model.h;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kwai.components.nearbymodel.model.g;

public final class LocalFuncTemplateFeed$ContentInfo$TypeAdapter extends TypeAdapter	// class@000c80
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       LocalFuncTemplateFeed$ContentInfo$TypeAdapter.f = a.get(LocalFuncTemplateFeed$ContentInfo.class);
    }
    public void LocalFuncTemplateFeed$ContentInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter.b);
       this.c = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
       this.d = p0.j(a.get(CDNUrl.class));
       this.e = p0.j(LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter.c);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalFuncTemplateFeed$ContentInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LocalFuncTemplateFeed$ContentInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x836c5bf8:
                      if (str.equals("subTitle")) {
                         i = 0;
                      }
                      break;
                    case 0x8e0e80df:
                      if (str.equals("aboveTitleTag")) {
                         i = 1;
                      }
                      break;
                    case 0x9e720c6c:
                      if (str.equals("liveServerExpTag")) {
                         i = 2;
                      }
                      break;
                    case 0xd832e1c7:
                      if (str.equals("liveStreamId")) {
                         i = 3;
                      }
                      break;
                    case 0xe8ce5353:
                      if (str.equals("contentType")) {
                         i = 4;
                      }
                      break;
                    case 0xefde7898:
                      if (str.equals("leftImageUrls")) {
                         i = 5;
                      }
                      break;
                    case 0xf0bc1c81:
                      if (str.equals("cardStyle")) {
                         i = 6;
                      }
                      break;
                    case 0xf48fe9f8:
                      if (str.equals("feedType")) {
                         i = 7;
                      }
                      break;
                    case 0x4281c8e:
                      if (str.equals("nickName")) {
                         i = 8;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 9;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 10;
                      }
                      break;
                    case 0x47b8214e:
                      if (str.equals("guideButton")) {
                         i = 11;
                      }
                      break;
                    case 0x48b410b5:
                      if (str.equals("rightBottomInfo")) {
                         i = 12;
                      }
                      break;
                    case 0x6e3305ea:
                      if (str.equals("logParams")) {
                         i = 13;
                      }
                      break;
                    case 0x7fadb4ec:
                      if (str.equals("leftTopTag")) {
                         i = 14;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubTitle = this.b.read(p0);
                      break;
                    case 1:
                      obj.mAboveTitleTag = this.b.read(p0);
                      break;
                    case 2:
                      obj.mLiveExpTag = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mLiveStreamId = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mContentType = KnownTypeAdapters$k.a(p0, obj.mContentType);
                      break;
                    case 5:
                      obj.mCDNUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.d, new h(this)).a(p0);
                      break;
                    case 6:
                      obj.mCardStyle = KnownTypeAdapters$k.a(p0, obj.mCardStyle);
                      break;
                    case 7:
                      obj.mFeedType = KnownTypeAdapters$k.a(p0, obj.mFeedType);
                      break;
                    case 8:
                      obj.mNickName = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mTitle = this.b.read(p0);
                      break;
                    case 10:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 11:
                      obj.mGuideButton = this.b.read(p0);
                      break;
                    case 12:
                      obj.mRightBottomInfo = this.e.read(p0);
                      break;
                    case 13:
                      obj.mLogParams = this.c.read(p0);
                      break;
                    case 14:
                      obj.mLeftTopTag = this.b.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalFuncTemplateFeed$ContentInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("contentType");
          p0.K((long)p1.mContentType);
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mLeftTopTag != null) {
             p0.r("leftTopTag");
             this.b.write(p0, p1.mLeftTopTag);
          }
          if (p1.mAboveTitleTag != null) {
             p0.r("aboveTitleTag");
             this.b.write(p0, p1.mAboveTitleTag);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             this.b.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             this.b.write(p0, p1.mSubTitle);
          }
          if (p1.mLogParams != null) {
             p0.r("logParams");
             this.c.write(p0, p1.mLogParams);
          }
          if (p1.mGuideButton != null) {
             p0.r("guideButton");
             this.b.write(p0, p1.mGuideButton);
          }
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          if (p1.mNickName != null) {
             p0.r("nickName");
             TypeAdapters.A.write(p0, p1.mNickName);
          }
          if (p1.mLiveExpTag != null) {
             p0.r("liveServerExpTag");
             TypeAdapters.A.write(p0, p1.mLiveExpTag);
          }
          p0.r("cardStyle");
          p0.K((long)p1.mCardStyle);
          p0.r("feedType");
          p0.K((long)p1.mFeedType);
          if (p1.mCDNUrls != null) {
             p0.r("leftImageUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.d, new g(this)).b(p0, p1.mCDNUrls);
          }
          if (p1.mRightBottomInfo != null) {
             p0.r("rightBottomInfo");
             this.e.write(p0, p1.mRightBottomInfo);
          }
          p0.j();
       }
       return;
    }
}
