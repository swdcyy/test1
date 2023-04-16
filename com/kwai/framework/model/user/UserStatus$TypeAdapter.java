package com.kwai.framework.model.user.UserStatus$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserStatus;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.UserStatus$CoverColor;
import com.kwai.framework.model.user.Status$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.framework.model.user.User$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.framework.model.user.Status;
import com.google.gson.stream.b;

public final class UserStatus$TypeAdapter extends TypeAdapter	// class@001775
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public static final a h;

    static {
       UserStatus$TypeAdapter.h = a.get(UserStatus.class);
    }
    public void UserStatus$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(Status$TypeAdapter.f);
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.e = p0.j(a.get(UserStatus$CoverColor.class));
       TypeAdapter typeAdapter1 = p0.j(User$TypeAdapter.G);
       this.f = typeAdapter1;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserStatus$TypeAdapter.class, "2");
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
             obj = new UserStatus();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x864d0ef1:
                      if (str.equals("moodPostTimeText")) {
                         i = 0;
                      }
                      break;
                    case 0x87e5f31f:
                      if (str.equals("moodTypeInfo")) {
                         i = 1;
                      }
                      break;
                    case 0x9057aa84:
                      if (str.equals("visitCount")) {
                         i = 2;
                      }
                      break;
                    case 0x95b5a1c9:
                      if (str.equals("moodStatus")) {
                         i = 3;
                      }
                      break;
                    case 0xa7ae35a5:
                      if (str.equals("moodCountText")) {
                         i = 4;
                      }
                      break;
                    case 0xc0506272:
                      if (str.equals("moodId")) {
                         i = 5;
                      }
                      break;
                    case 0xeb084a38:
                      if (str.equals("coverUrl")) {
                         i = 6;
                      }
                      break;
                    case 0xedc6a0c4:
                      if (str.equals("moodText")) {
                         i = 7;
                      }
                      break;
                    case 0xf4b2d7b8:
                      if (str.equals("likeCount")) {
                         i = 8;
                      }
                      break;
                    case 0xfa625653:
                      if (str.equals("ztPhotoId")) {
                         i = 9;
                      }
                      break;
                    case 0x12da8e11:
                      if (str.equals("postedStatus")) {
                         i = 10;
                      }
                      break;
                    case 0x216fa85c:
                      if (str.equals("dynamicImage")) {
                         i = 11;
                      }
                      break;
                    case 0x338fbf8d:
                      if (str.equals("staticImage")) {
                         i = 12;
                      }
                      break;
                    case 0x491fa5ec:
                      if (str.equals("coverColor")) {
                         i = 13;
                      }
                      break;
                    case 0x519c89e9:
                      if (str.equals("createTime")) {
                         i = 14;
                      }
                      break;
                    case 0x535aff4a:
                      if (str.equals("sameMoodText")) {
                         i = 15;
                      }
                      break;
                    case 0x58766a60:
                      if (str.equals("moodAggregateUsers")) {
                         i = 16;
                      }
                      break;
                    case 0x7b0bf0a3:
                      if (str.equals("isLiked")) {
                         i = 17;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mMoodPostTimeText = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mMoodTypeInfo = this.b.read(p0);
                      break;
                    case 2:
                      obj.mVisitorCount = KnownTypeAdapters$n.a(p0, obj.mVisitorCount);
                      break;
                    case 3:
                      obj.mMoodStatus = KnownTypeAdapters$k.a(p0, obj.mMoodStatus);
                      break;
                    case 4:
                      obj.mMoodCountText = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mId = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mCoverUrl = this.d.read(p0);
                      break;
                    case 7:
                      obj.mMoodText = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mLikeCount = KnownTypeAdapters$n.a(p0, obj.mLikeCount);
                      break;
                    case 9:
                      obj.mZtPhotoId = KnownTypeAdapters$n.a(p0, obj.mZtPhotoId);
                      break;
                    case 10:
                      obj.mPostedStatus = KnownTypeAdapters$k.a(p0, obj.mPostedStatus);
                      break;
                    case 11:
                      obj.mDynamicImageUrls = this.d.read(p0);
                      break;
                    case 12:
                      obj.mStaticImageUrls = this.d.read(p0);
                      break;
                    case 13:
                      obj.mCoverColor = this.e.read(p0);
                      break;
                    case 14:
                      obj.mCreateTime = KnownTypeAdapters$n.a(p0, obj.mCreateTime);
                      break;
                    case 15:
                      obj.mSameMoodText = TypeAdapters.A.read(p0);
                      break;
                    case 16:
                      obj.mMoodAggregateUsers = this.g.read(p0);
                      break;
                    case 17:
                      obj.mIsLiked = KnownTypeAdapters$g.a(p0, obj.mIsLiked);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserStatus$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mMoodPostTimeText != null) {
             p0.r("moodPostTimeText");
             TypeAdapters.A.write(p0, p1.mMoodPostTimeText);
          }
          if (p1.mMoodTypeInfo != null) {
             p0.r("moodTypeInfo");
             this.b.write(p0, p1.mMoodTypeInfo);
          }
          if (p1.mSameMoodText != null) {
             p0.r("sameMoodText");
             TypeAdapters.A.write(p0, p1.mSameMoodText);
          }
          p0.r("likeCount");
          p0.K(p1.mLikeCount);
          p0.r("visitCount");
          p0.K(p1.mVisitorCount);
          p0.r("isLiked");
          p0.P(p1.mIsLiked);
          if (p1.mId != null) {
             p0.r("moodId");
             TypeAdapters.A.write(p0, p1.mId);
          }
          p0.r("ztPhotoId");
          p0.K(p1.mZtPhotoId);
          p0.r("moodStatus");
          p0.K((long)p1.mMoodStatus);
          p0.r("createTime");
          p0.K(p1.mCreateTime);
          if (p1.mDynamicImageUrls != null) {
             p0.r("dynamicImage");
             this.d.write(p0, p1.mDynamicImageUrls);
          }
          if (p1.mStaticImageUrls != null) {
             p0.r("staticImage");
             this.d.write(p0, p1.mStaticImageUrls);
          }
          if (p1.mCoverColor != null) {
             p0.r("coverColor");
             this.e.write(p0, p1.mCoverColor);
          }
          if (p1.mMoodText != null) {
             p0.r("moodText");
             TypeAdapters.A.write(p0, p1.mMoodText);
          }
          if (p1.mMoodCountText != null) {
             p0.r("moodCountText");
             TypeAdapters.A.write(p0, p1.mMoodCountText);
          }
          if (p1.mMoodAggregateUsers != null) {
             p0.r("moodAggregateUsers");
             this.g.write(p0, p1.mMoodAggregateUsers);
          }
          if (p1.mCoverUrl != null) {
             p0.r("coverUrl");
             this.d.write(p0, p1.mCoverUrl);
          }
          p0.r("postedStatus");
          p0.K((long)p1.mPostedStatus);
          p0.j();
       }
       return;
    }
}
