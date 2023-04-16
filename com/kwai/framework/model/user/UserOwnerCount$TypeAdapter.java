package com.kwai.framework.model.user.UserOwnerCount$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserOwnerCount;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class UserOwnerCount$TypeAdapter extends TypeAdapter	// class@001762
{
    public final Gson a;
    public static final a b;

    static {
       UserOwnerCount$TypeAdapter.b = a.get(UserOwnerCount.class);
    }
    public void UserOwnerCount$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserOwnerCount$TypeAdapter.class, "2");
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
             obj = new UserOwnerCount();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa1398ecb:
                      if (str.equals("acfun_public")) {
                         i = 0;
                      }
                      break;
                    case 0xb45d3bb1:
                      if (str.equals("follow")) {
                         i = 1;
                      }
                      break;
                    case 0xc04f8200:
                      if (str.equals("moment")) {
                         i = 2;
                      }
                      break;
                    case 0xc1f881d2:
                      if (str.equals("article_public")) {
                         i = 3;
                      }
                      break;
                    case 0xdd66b347:
                      if (str.equals("livePlayBack")) {
                         i = 4;
                      }
                      break;
                    case 0x18b13:
                      if (str.equals("fan")) {
                         i = 5;
                      }
                      break;
                    case 0x2dd52b:
                      if (str.equals("atMe")) {
                         i = 6;
                      }
                      break;
                    case 0x32af97:
                      if (str.equals("like")) {
                         i = 7;
                      }
                      break;
                    case 0x338ad3:
                      if (str.equals("news")) {
                         i = 8;
                      }
                      break;
                    case 0x35f515:
                      if (str.equals("song")) {
                         i = 9;
                      }
                      break;
                    case 0x65b3e32:
                      if (str.equals("photo")) {
                         i = 10;
                      }
                      break;
                    case 0x3897612a:
                      if (str.equals("collect")) {
                         i = 11;
                      }
                      break;
                    case 0x45ebc15f:
                      if (str.equals("total_photo_like")) {
                         i = 12;
                      }
                      break;
                    case 0x674b7516:
                      if (str.equals("photo_public")) {
                         i = 13;
                      }
                      break;
                    case 0x6c816edf:
                      if (str.equals("creation")) {
                         i = 14;
                      }
                      break;
                    case 0x71caeafc:
                      if (str.equals("fansCountText")) {
                         i = 15;
                      }
                      break;
                    case 0x7d6bb876:
                      if (str.equals("photo_private")) {
                         i = 16;
                      }
                      break;
                    case 0x7ed855aa:
                      if (str.equals("magicFace")) {
                         i = 17;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mAcFun = KnownTypeAdapters$k.a(p0, obj.mAcFun);
                      break;
                    case 1:
                      obj.mFollow = KnownTypeAdapters$k.a(p0, obj.mFollow);
                      break;
                    case 2:
                      obj.mMoment = KnownTypeAdapters$k.a(p0, obj.mMoment);
                      break;
                    case 3:
                      obj.mArticlePublic = KnownTypeAdapters$k.a(p0, obj.mArticlePublic);
                      break;
                    case 4:
                      obj.mLivePlayBack = KnownTypeAdapters$k.a(p0, obj.mLivePlayBack);
                      break;
                    case 5:
                      obj.mFan = KnownTypeAdapters$k.a(p0, obj.mFan);
                      break;
                    case 6:
                      obj.mentionedMeWorksCount = KnownTypeAdapters$k.a(p0, obj.mentionedMeWorksCount);
                      break;
                    case 7:
                      obj.mLike = KnownTypeAdapters$k.a(p0, obj.mLike);
                      break;
                    case 8:
                      obj.mNews = KnownTypeAdapters$k.a(p0, obj.mNews);
                      break;
                    case 9:
                      obj.mSong = KnownTypeAdapters$k.a(p0, obj.mSong);
                      break;
                    case 10:
                      obj.mPhoto = KnownTypeAdapters$k.a(p0, obj.mPhoto);
                      break;
                    case 11:
                      obj.mCollection = KnownTypeAdapters$k.a(p0, obj.mCollection);
                      break;
                    case 12:
                      obj.mTotalPhotoLike = KnownTypeAdapters$n.a(p0, obj.mTotalPhotoLike);
                      break;
                    case 13:
                      obj.mPublicPhoto = KnownTypeAdapters$k.a(p0, obj.mPublicPhoto);
                      break;
                    case 14:
                      obj.mCreation = KnownTypeAdapters$k.a(p0, obj.mCreation);
                      break;
                    case 15:
                      obj.mFansCountText = TypeAdapters.A.read(p0);
                      break;
                    case 16:
                      obj.mPrivatePhoto = KnownTypeAdapters$k.a(p0, obj.mPrivatePhoto);
                      break;
                    case 17:
                      obj.mDesignerMagic = KnownTypeAdapters$k.a(p0, obj.mDesignerMagic);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserOwnerCount$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("fan");
          p0.K((long)p1.mFan);
          if (p1.mFansCountText != null) {
             p0.r("fansCountText");
             TypeAdapters.A.write(p0, p1.mFansCountText);
          }
          p0.r("like");
          p0.K((long)p1.mLike);
          p0.r("photo");
          p0.K((long)p1.mPhoto);
          p0.r("moment");
          p0.K((long)p1.mMoment);
          p0.r("news");
          p0.K((long)p1.mNews);
          p0.r("collect");
          p0.K((long)p1.mCollection);
          p0.r("follow");
          p0.K((long)p1.mFollow);
          p0.r("photo_public");
          p0.K((long)p1.mPublicPhoto);
          p0.r("photo_private");
          p0.K((long)p1.mPrivatePhoto);
          p0.r("song");
          p0.K((long)p1.mSong);
          p0.r("article_public");
          p0.K((long)p1.mArticlePublic);
          p0.r("total_photo_like");
          p0.K(p1.mTotalPhotoLike);
          p0.r("livePlayBack");
          p0.K((long)p1.mLivePlayBack);
          p0.r("magicFace");
          p0.K((long)p1.mDesignerMagic);
          p0.r("atMe");
          p0.K((long)p1.mentionedMeWorksCount);
          p0.r("acfun_public");
          p0.K((long)p1.mAcFun);
          p0.r("creation");
          p0.K((long)p1.mCreation);
          p0.j();
       }
       return;
    }
}
