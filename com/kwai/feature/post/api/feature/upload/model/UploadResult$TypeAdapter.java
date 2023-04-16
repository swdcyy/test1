package com.kwai.feature.post.api.feature.upload.model.UploadResult$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.feature.upload.model.ForwardResult;
import com.kuaishou.android.model.mix.TagItem;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import com.yxcorp.gifshow.model.EditInfo;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.google.gson.stream.b;

public final class UploadResult$TypeAdapter extends TypeAdapter	// class@0013e7
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
       UploadResult$TypeAdapter.j = a.get(UploadResult.class);
    }
    public void UploadResult$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(ForwardResult.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(TagItem.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.f = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
       this.g = p0.j(a.get(FlashPhotoTemplate.class));
       this.h = p0.j(a.get(EditInfo.class));
       this.i = p0.j(a.get(PhotoMeta.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UploadResult$TypeAdapter.class, "2");
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
             obj = new UploadResult();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x89444d94:
                      if (str.equals("duration")) {
                         i = 0;
                      }
                      break;
                    case 0x8e0396c8:
                      if (str.equals("forward_details")) {
                         i = 1;
                      }
                      break;
                    case 0x9568e10e:
                      if (str.equals("share_info")) {
                         i = 2;
                      }
                      break;
                    case 0x9f688166:
                      if (str.equals("tag_hash_type")) {
                         i = 3;
                      }
                      break;
                    case 0xb40c2e48:
                      if (str.equals("photo_id")) {
                         i = 4;
                      }
                      break;
                    case 0xbf33d812:
                      if (str.equals("captionTitle")) {
                         i = 5;
                      }
                      break;
                    case 0xc56c2330:
                      if (str.equals("poi_id")) {
                         i = 6;
                      }
                      break;
                    case 0xca22cb1f:
                      if (str.equals("main_mv_url")) {
                         i = 7;
                      }
                      break;
                    case 0xd432b15f:
                      if (str.equals("snapShowDeadline")) {
                         i = 8;
                      }
                      break;
                    case 0xda08c2bc:
                      if (str.equals("flashPhotoTemplate")) {
                         i = 9;
                      }
                      break;
                    case 0xda26ad8c:
                      if (str.equals("moodTemplateId")) {
                         i = 10;
                      }
                      break;
                    case 0xe4b63634:
                      if (str.equals("aiCutPhotoStyleId")) {
                         i = 11;
                      }
                      break;
                    case 0xea770b3b:
                      if (str.equals("momentId")) {
                         i = 12;
                      }
                      break;
                    case 0xed412388:
                      if (str.equals("privacy")) {
                         i = 13;
                      }
                      break;
                    case 0xf73aee0f:
                      if (str.equals("user_id")) {
                         i = 14;
                      }
                      break;
                    case 0x363419:
                      if (str.equals("tags")) {
                         i = 15;
                      }
                      break;
                    case 0x3492916:
                      if (str.equals("timestamp")) {
                         i = 16;
                      }
                      break;
                    case 0x71f0b5f:
                      if (str.equals("longVideo")) {
                         i = 17;
                      }
                      break;
                    case 0x1aed7e40:
                      if (str.equals("poi_city")) {
                         i = 18;
                      }
                      break;
                    case 0x20ef99e6:
                      if (str.equals("caption")) {
                         i = 19;
                      }
                      break;
                    case 0x298b7ca4:
                      if (str.equals("hasVote")) {
                         i = 20;
                      }
                      break;
                    case 0x43b1d823:
                      if (str.equals("poi_title")) {
                         i = 21;
                      }
                      break;
                    case 0x5f7831d8:
                      if (str.equals("editInfo")) {
                         i = 22;
                      }
                      break;
                    case 0x6c5b929f:
                      if (str.equals("photo_status")) {
                         i = 23;
                      }
                      break;
                    case 0x6cd0ef9c:
                      if (str.equals("thumbnail_url")) {
                         i = 24;
                      }
                      break;
                    case 0x740bd060:
                      if (str.equals("forward_stats_params")) {
                         i = 25;
                      }
                      break;
                    case 0x775d890e:
                      if (str.equals("mockCollectInfo")) {
                         i = 26;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDuration = KnownTypeAdapters$n.a(p0, obj.mDuration);
                      break;
                    case 1:
                      obj.mForwardResults = this.c.read(p0);
                      break;
                    case 2:
                      obj.mShareInfo = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mTagHashType = KnownTypeAdapters$k.a(p0, obj.mTagHashType);
                      break;
                    case 4:
                      obj.mPhotoId = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mCaptionTitle = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mLocationId = KnownTypeAdapters$n.a(p0, obj.mLocationId);
                      break;
                    case 7:
                      obj.mVideoUrl = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mSnapShowDeadline = KnownTypeAdapters$n.a(p0, obj.mSnapShowDeadline);
                      break;
                    case 9:
                      obj.mFlashPhotoTemplate = this.g.read(p0);
                      break;
                    case 10:
                      obj.mMoodTemplateId = KnownTypeAdapters$n.a(p0, obj.mMoodTemplateId);
                      break;
                    case 11:
                      obj.mAiCutPhotoStyleId = KnownTypeAdapters$n.a(p0, obj.mAiCutPhotoStyleId);
                      break;
                    case 12:
                      obj.mStoryId = TypeAdapters.A.read(p0);
                      break;
                    case 13:
                      obj.mIsPrivacy = KnownTypeAdapters$g.a(p0, obj.mIsPrivacy);
                      break;
                    case 14:
                      obj.mUserId = TypeAdapters.A.read(p0);
                      break;
                    case 15:
                      obj.mTagItems = this.e.read(p0);
                      break;
                    case 16:
                      obj.mCreated = KnownTypeAdapters$n.a(p0, obj.mCreated);
                      break;
                    case 17:
                      obj.mIsLongVideo = KnownTypeAdapters$g.a(p0, obj.mIsLongVideo);
                      break;
                    case 18:
                      obj.mLocationCity = TypeAdapters.A.read(p0);
                      break;
                    case 19:
                      obj.mCaption = TypeAdapters.A.read(p0);
                      break;
                    case 20:
                      obj.mHasVote = KnownTypeAdapters$g.a(p0, obj.mHasVote);
                      break;
                    case 21:
                      obj.mLocationTitle = TypeAdapters.A.read(p0);
                      break;
                    case 22:
                      obj.mEditInfo = this.h.read(p0);
                      break;
                    case 23:
                      obj.mPhotoStatus = KnownTypeAdapters$k.a(p0, obj.mPhotoStatus);
                      break;
                    case 24:
                      obj.mThumbUrl = TypeAdapters.A.read(p0);
                      break;
                    case 25:
                      obj.mForwardStatsParams = this.f.read(p0);
                      break;
                    case 26:
                      obj.mMockCollectInfo = this.i.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UploadResult$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPhotoId != null) {
             p0.r("photo_id");
             TypeAdapters.A.write(p0, p1.mPhotoId);
          }
          if (p1.mUserId != null) {
             p0.r("user_id");
             TypeAdapters.A.write(p0, p1.mUserId);
          }
          if (p1.mThumbUrl != null) {
             p0.r("thumbnail_url");
             TypeAdapters.A.write(p0, p1.mThumbUrl);
          }
          if (p1.mVideoUrl != null) {
             p0.r("main_mv_url");
             TypeAdapters.A.write(p0, p1.mVideoUrl);
          }
          p0.r("snapShowDeadline");
          p0.K(p1.mSnapShowDeadline);
          if (p1.mForwardResults != null) {
             p0.r("forward_details");
             this.c.write(p0, p1.mForwardResults);
          }
          if (p1.mTagItems != null) {
             p0.r("tags");
             this.e.write(p0, p1.mTagItems);
          }
          if (p1.mCaption != null) {
             p0.r("caption");
             TypeAdapters.A.write(p0, p1.mCaption);
          }
          p0.r("poi_id");
          p0.K(p1.mLocationId);
          p0.r("tag_hash_type");
          p0.K((long)p1.mTagHashType);
          if (p1.mForwardStatsParams != null) {
             p0.r("forward_stats_params");
             this.f.write(p0, p1.mForwardStatsParams);
          }
          if (p1.mLocationTitle != null) {
             p0.r("poi_title");
             TypeAdapters.A.write(p0, p1.mLocationTitle);
          }
          if (p1.mLocationCity != null) {
             p0.r("poi_city");
             TypeAdapters.A.write(p0, p1.mLocationCity);
          }
          p0.r("photo_status");
          p0.K((long)p1.mPhotoStatus);
          if (p1.mShareInfo != null) {
             p0.r("share_info");
             TypeAdapters.A.write(p0, p1.mShareInfo);
          }
          p0.r("hasVote");
          p0.P(p1.mHasVote);
          p0.r("timestamp");
          p0.K(p1.mCreated);
          if (p1.mStoryId != null) {
             p0.r("momentId");
             TypeAdapters.A.write(p0, p1.mStoryId);
          }
          p0.r("longVideo");
          p0.P(p1.mIsLongVideo);
          p0.r("duration");
          p0.K(p1.mDuration);
          if (p1.mFlashPhotoTemplate != null) {
             p0.r("flashPhotoTemplate");
             this.g.write(p0, p1.mFlashPhotoTemplate);
          }
          if (p1.mEditInfo != null) {
             p0.r("editInfo");
             this.h.write(p0, p1.mEditInfo);
          }
          p0.r("privacy");
          p0.P(p1.mIsPrivacy);
          p0.r("aiCutPhotoStyleId");
          p0.K(p1.mAiCutPhotoStyleId);
          p0.r("moodTemplateId");
          p0.K(p1.mMoodTemplateId);
          if (p1.mCaptionTitle != null) {
             p0.r("captionTitle");
             TypeAdapters.A.write(p0, p1.mCaptionTitle);
          }
          if (p1.mMockCollectInfo != null) {
             p0.r("mockCollectInfo");
             this.i.write(p0, p1.mMockCollectInfo);
          }
          p0.j();
       }
       return;
    }
}
