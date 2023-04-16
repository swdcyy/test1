package com.kuaishou.android.model.mix.HyperTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.HyperTag;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.UserExtraInfo;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.kuaishou.android.model.mix.HyperTag$Icon$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.HyperTag$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.mix.HyperTag$Icon;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.HyperTag$TypeAdapter$a;

public final class HyperTag$TypeAdapter extends TypeAdapter	// class@000cb1
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public static final a g;

    static {
       HyperTag$TypeAdapter.g = a.get(HyperTag.class);
    }
    public void HyperTag$TypeAdapter(Gson p0){
       TypeAdapter a;
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       a = TypeAdapters.A;
       this.c = new KnownTypeAdapters$MapTypeAdapter(a, a, new KnownTypeAdapters$e());
       this.d = p0.j(a.get(UserExtraInfo.class));
       this.e = p0.j(HyperTag$Icon$TypeAdapter.b);
       this.f = new KnownTypeAdapters$ListTypeAdapter(a, new KnownTypeAdapters$d());
    }
    public HyperTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HyperTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       HyperTag hyperTag = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return hyperTag;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return hyperTag;
       }else {
          p0.c();
          HyperTag hyperTag1 = new HyperTag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8ce5ff0c:
                   if (str.equals("showArrow")) {
                      i = 0;
                   }
                   break;
                 case 0xa6e3dbda:
                   if (str.equals("commentId")) {
                      i = 1;
                   }
                   break;
                 case 0xb522a200:
                   if (str.equals("normalIcon")) {
                      i = 2;
                   }
                   break;
                 case 0xc71afa6c:
                   if (str.equals("mustUseHyperTag")) {
                      i = 3;
                   }
                   break;
                 case 0xd404b4fd:
                   if (str.equals("iconUrls")) {
                      i = 4;
                   }
                   break;
                 case 0xf0e6c55d:
                   if (str.equals("extraText")) {
                      i = 5;
                   }
                   break;
                 case 0xfed0e84f:
                   if (str.equals("showCommentArea")) {
                      i = 6;
                   }
                   break;
                 case 0x5c79410:
                   if (str.equals("extra")) {
                      i = 7;
                   }
                   break;
                 case 0xbd19b59:
                   if (str.equals("actionUrl")) {
                      i = 8;
                   }
                   break;
                 case 0x288fede8:
                   if (str.equals("hyperTagType")) {
                      i = 9;
                   }
                   break;
                 case 0x357ce353:
                   if (str.equals("truncableText")) {
                      i = 10;
                   }
                   break;
                 case 0x35979fd9:
                   if (str.equals("commentIds")) {
                      i = 11;
                   }
                   break;
                 case 0x410f3468:
                   if (str.equals("showSeparator")) {
                      i = 12;
                   }
                   break;
                 case 0x4b428dd2:
                   if (str.equals("pymlFollowingIntensifyType")) {
                      i = 13;
                   }
                   break;
                 case 0x4bb9b411:
                   if (str.equals("trackMap")) {
                      i = 14;
                   }
                   break;
                 case 0x5411155a:
                   if (str.equals("untruncableText")) {
                      i = 15;
                   }
                   break;
                 case 0x60d235a1:
                   if (str.equals("useRecoTextInfo")) {
                      i = 16;
                   }
                   break;
                 case 0x63fcc08e:
                   if (str.equals("disableTailSpace")) {
                      i = 17;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   hyperTag1.mShowArrow = KnownTypeAdapters$g.a(p0, hyperTag1.mShowArrow);
                   break;
                 case 1:
                   hyperTag1.mCommentId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   hyperTag1.mNormalIcon = this.e.read(p0);
                   break;
                 case 3:
                   hyperTag1.mMustUseHyperTag = KnownTypeAdapters$g.a(p0, hyperTag1.mMustUseHyperTag);
                   break;
                 case 4:
                   hyperTag1.mIcons = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new HyperTag$TypeAdapter$b(this)).a(p0);
                   break;
                 case 5:
                   hyperTag1.mExtraTagText = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   hyperTag1.mEnableShowCommentPanel = KnownTypeAdapters$g.a(p0, hyperTag1.mEnableShowCommentPanel);
                   break;
                 case 7:
                   hyperTag1.mExtraData = this.d.read(p0);
                   break;
                 case 8:
                   hyperTag1.mActionUrl = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   hyperTag1.mHyperTagType = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   hyperTag1.mTruncableText = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   hyperTag1.mCommentIds = this.f.read(p0);
                   break;
                 case 12:
                   hyperTag1.mShowSeparator = KnownTypeAdapters$g.a(p0, hyperTag1.mShowSeparator);
                   break;
                 case 13:
                   hyperTag1.mPymlFollowingIntensifyType = KnownTypeAdapters$k.a(p0, hyperTag1.mPymlFollowingIntensifyType);
                   break;
                 case 14:
                   hyperTag1.mTrackMap = this.c.read(p0);
                   break;
                 case 15:
                   hyperTag1.mUntruncableText = TypeAdapters.A.read(p0);
                   break;
                 case 16:
                   hyperTag1.mUseRecoTextInfo = KnownTypeAdapters$g.a(p0, hyperTag1.mUseRecoTextInfo);
                   break;
                 case 17:
                   hyperTag1.mDisableTailSpace = KnownTypeAdapters$g.a(p0, hyperTag1.mDisableTailSpace);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return hyperTag1;
       }
    }
    public void b(b p0,HyperTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HyperTag$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIcons != null) {
             p0.r("iconUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new HyperTag$TypeAdapter$a(this)).b(p0, p1.mIcons);
          }
          p0.r("showArrow");
          p0.P(p1.mShowArrow);
          if (p1.mUntruncableText != null) {
             p0.r("untruncableText");
             TypeAdapters.A.write(p0, p1.mUntruncableText);
          }
          if (p1.mTruncableText != null) {
             p0.r("truncableText");
             TypeAdapters.A.write(p0, p1.mTruncableText);
          }
          if (p1.mExtraTagText != null) {
             p0.r("extraText");
             TypeAdapters.A.write(p0, p1.mExtraTagText);
          }
          p0.r("disableTailSpace");
          p0.P(p1.mDisableTailSpace);
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mHyperTagType != null) {
             p0.r("hyperTagType");
             TypeAdapters.A.write(p0, p1.mHyperTagType);
          }
          p0.r("useRecoTextInfo");
          p0.P(p1.mUseRecoTextInfo);
          p0.r("mustUseHyperTag");
          p0.P(p1.mMustUseHyperTag);
          if (p1.mTrackMap != null) {
             p0.r("trackMap");
             this.c.write(p0, p1.mTrackMap);
          }
          if (p1.mExtraData != null) {
             p0.r("extra");
             this.d.write(p0, p1.mExtraData);
          }
          p0.r("showSeparator");
          p0.P(p1.mShowSeparator);
          p0.r("pymlFollowingIntensifyType");
          p0.K((long)p1.mPymlFollowingIntensifyType);
          if (p1.mNormalIcon != null) {
             p0.r("normalIcon");
             this.e.write(p0, p1.mNormalIcon);
          }
          p0.r("showCommentArea");
          p0.P(p1.mEnableShowCommentPanel);
          if (p1.mCommentIds != null) {
             p0.r("commentIds");
             this.f.write(p0, p1.mCommentIds);
          }
          if (p1.mCommentId != null) {
             p0.r("commentId");
             TypeAdapters.A.write(p0, p1.mCommentId);
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
