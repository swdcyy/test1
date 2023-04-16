package com.yxcorp.gifshow.follow.common.model.RealtimeMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.RecoUser;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$PymkParams;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import zga.u;
import com.vimeo.stag.KnownTypeAdapters$f;
import zga.v;
import com.vimeo.stag.KnownTypeAdapters$k;
import zga.t;
import java.util.List;
import zga.w;
import com.google.gson.stream.b;
import zga.p;
import zga.q;
import zga.r;
import zga.s;

public final class RealtimeMeta$TypeAdapter extends TypeAdapter	// class@001069
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public static final a j;

    static {
       RealtimeMeta$TypeAdapter.j = a.get(RealtimeMeta.class);
    }
    public void RealtimeMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       this.c = p0.j(a.get(User.class));
       TypeAdapter typeAdapter = p0.j(a.get(BaseFeed.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.f = p0.j(RealtimeMeta$LogParams$TypeAdapter.b);
       typeAdapter = p0.j(a.get(RecoUser.class));
       this.g = typeAdapter;
       this.h = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.i = p0.j(a.get(RealtimeMeta$PymkParams.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RealtimeMeta$TypeAdapter.class, "2");
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
             obj = new RealtimeMeta();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8af0ff39:
                      if (str.equals("rightIconUrls")) {
                         i = 0;
                      }
                      break;
                    case 0xaabe1960:
                      if (str.equals("pymkExtParams")) {
                         i = 1;
                      }
                      break;
                    case 0xb3ccff59:
                      if (str.equals("feedId")) {
                         i = 2;
                      }
                      break;
                    case 0xb99d8944:
                      if (str.equals("secondaryTitle")) {
                         i = 3;
                      }
                      break;
                    case 0xc206a2ac:
                      if (str.equals("recommendUsers")) {
                         i = 4;
                      }
                      break;
                    case 0xc50c8881:
                      if (str.equals("photos")) {
                         i = 5;
                      }
                      break;
                    case 0xd404b4fd:
                      if (str.equals("iconUrls")) {
                         i = 6;
                      }
                      break;
                    case 0xe8ce5353:
                      if (str.equals("contentType")) {
                         i = 7;
                      }
                      break;
                    case 0x69375c9:
                      if (str.equals("theme")) {
                         i = 8;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 9;
                      }
                      break;
                    case 0x6a68e08:
                      if (str.equals("users")) {
                         i = 10;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 11;
                      }
                      break;
                    case 0x276759df:
                      if (str.equals("cover_thumbnail_urls")) {
                         i = 12;
                      }
                      break;
                    case 0x38b73479:
                      if (str.equals("content")) {
                         i = 13;
                      }
                      break;
                    case 0x6e3305ea:
                      if (str.equals("logParams")) {
                         i = 14;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mRightIconUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new w(this)).a(p0);
                      break;
                    case 1:
                      obj.mPymkExtParams = this.i.read(p0);
                      break;
                    case 2:
                      obj.mFeedId = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mSubTitle = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mRecommendUsers = this.h.read(p0);
                      break;
                    case 5:
                      obj.mPhotos = this.e.read(p0);
                      break;
                    case 6:
                      obj.mCdnList = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new t(this)).a(p0);
                      break;
                    case 7:
                      obj.mContentType = KnownTypeAdapters$k.a(p0, obj.mContentType);
                      break;
                    case 8:
                      obj.mTheme = KnownTypeAdapters$k.a(p0, obj.mTheme);
                      break;
                    case 9:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mUserAvatars = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new v(this)).a(p0);
                      break;
                    case 11:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 12:
                      obj.mCoverThumbnailUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new u(this)).a(p0);
                      break;
                    case 13:
                      obj.mContent = TypeAdapters.A.read(p0);
                      break;
                    case 14:
                      obj.mLogParams = this.f.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealtimeMeta$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("contentType");
          p0.K((long)p1.mContentType);
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mCdnList != null) {
             p0.r("iconUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new p(this)).b(p0, p1.mCdnList);
          }
          if (p1.mFeedId != null) {
             p0.r("feedId");
             TypeAdapters.A.write(p0, p1.mFeedId);
          }
          if (p1.mCoverThumbnailUrls != null) {
             p0.r("cover_thumbnail_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new q(this)).b(p0, p1.mCoverThumbnailUrls);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mUserAvatars != null) {
             p0.r("users");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new r(this)).b(p0, p1.mUserAvatars);
          }
          if (p1.mSubTitle != null) {
             p0.r("secondaryTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mPhotos != null) {
             p0.r("photos");
             this.e.write(p0, p1.mPhotos);
          }
          if (p1.mLogParams != null) {
             p0.r("logParams");
             this.f.write(p0, p1.mLogParams);
          }
          if (p1.mRightIconUrls != null) {
             p0.r("rightIconUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new s(this)).b(p0, p1.mRightIconUrls);
          }
          p0.r("theme");
          p0.K((long)p1.mTheme);
          if (p1.mRecommendUsers != null) {
             p0.r("recommendUsers");
             this.h.write(p0, p1.mRecommendUsers);
          }
          if (p1.mPymkExtParams != null) {
             p0.r("pymkExtParams");
             this.i.write(p0, p1.mPymkExtParams);
          }
          p0.j();
       }
       return;
    }
}
