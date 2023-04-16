package com.kuaishou.android.model.mix.TagItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.TagItem;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.LyricItemEntity$MusicCommonTagEntity;
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.mix.LyricItemEntity$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.kuaishou.android.model.mix.LyricItemEntity;
import com.google.gson.stream.b;

public final class TagItem$TypeAdapter extends TypeAdapter	// class@000e17
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
       TagItem$TypeAdapter.j = a.get(TagItem.class);
    }
    public void TagItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(TagItem$InitiatorPhoto$TypeAdapter.c);
       this.c = p0.j(a.get(Music.class));
       this.d = p0.j(a.get(MagicEmoji$MagicFace.class));
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.e = typeAdapter;
       this.f = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(LyricItemEntity$MusicCommonTagEntity.class));
       this.g = typeAdapter;
       this.h = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.i = p0.j(LyricItemEntity$TypeAdapter.d);
    }
    public TagItem a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TagItem$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       TagItem tagItem = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tagItem;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tagItem;
       }else {
          p0.c();
          TagItem tagItem1 = new TagItem();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8c31dfc9:
                   if (str.equals("commonLabel")) {
                      i = 0;
                   }
                   break;
                 case 0xa3a95145:
                   if (str.equals("tagName")) {
                      i = 1;
                   }
                   break;
                 case 0xa5a65d5a:
                   if (str.equals("isKaraoke")) {
                      i = 2;
                   }
                   break;
                 case 0xb6810d3f:
                   if (str.equals("isCollected")) {
                      i = 3;
                   }
                   break;
                 case 0xbe071a81:
                   if (str.equals("ksOrderId")) {
                      i = 4;
                   }
                   break;
                 case 0xc554cdd5:
                   if (str.equals("lyricLabel")) {
                      i = 5;
                   }
                   break;
                 case 0xd404b4fd:
                   if (str.equals("iconUrls")) {
                      i = 6;
                   }
                   break;
                 case 0xe03231fd:
                   if (str.equals("photoCount")) {
                      i = 7;
                   }
                   break;
                 case 0xe8cc9143:
                   if (str.equals("initiatorPhoto")) {
                      i = 8;
                   }
                   break;
                 case 0xf01afcf6:
                   if (str.equals("userName")) {
                      i = 9;
                   }
                   break;
                 case 0xf61a2f29:
                   if (str.equals("hideArtist")) {
                      i = 10;
                   }
                   break;
                 case 0xfba52ffe:
                   if (str.equals("durationPlayTrail")) {
                      i = 11;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 12;
                   }
                   break;
                 case 0x1bf9a:
                   if (str.equals("tag")) {
                      i = 13;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 14;
                   }
                   break;
                 case 0x3568dc:
                   if (str.equals("rich")) {
                      i = 15;
                   }
                   break;
                 case 0x636ee25:
                   if (str.equals("music")) {
                      i = 16;
                   }
                   break;
                 case 0x6904a55:
                   if (str.equals("tagId")) {
                      i = 17;
                   }
                   break;
                 case 0x36b003c1:
                   if (str.equals("tagPlayCount")) {
                      i = 18;
                   }
                   break;
                 case 0x73e43487:
                   if (str.equals("isFollowing")) {
                      i = 19;
                   }
                   break;
                 case 0x7ed855aa:
                   if (str.equals("magicFace")) {
                      i = 20;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tagItem1.mCommonLabel = this.h.read(p0);
                   break;
                 case 1:
                 case 14:
                   tagItem1.mName = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   tagItem1.mIsKaraoke = KnownTypeAdapters$g.a(p0, tagItem1.mIsKaraoke);
                   break;
                 case 3:
                   tagItem1.mIsCollected = KnownTypeAdapters$g.a(p0, tagItem1.mIsCollected);
                   break;
                 case 4:
                   tagItem1.mKsOrderId = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   tagItem1.mLyricLabel = this.i.read(p0);
                   break;
                 case 6:
                   tagItem1.mTagIconUrls = this.f.read(p0);
                   break;
                 case 7:
                   tagItem1.mCount = KnownTypeAdapters$k.a(p0, tagItem1.mCount);
                   break;
                 case 8:
                   tagItem1.mInitiatorPhoto = this.b.read(p0);
                   break;
                 case 9:
                   tagItem1.mUserName = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   tagItem1.mHideArtist = KnownTypeAdapters$g.a(p0, tagItem1.mHideArtist);
                   break;
                 case 11:
                   tagItem1.mDurationPlayTrail = KnownTypeAdapters$n.a(p0, tagItem1.mDurationPlayTrail);
                   break;
                 case 12:
                   tagItem1.mId = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                 case 17:
                   tagItem1.mTag = TypeAdapters.A.read(p0);
                   break;
                 case 15:
                   tagItem1.mRich = KnownTypeAdapters$g.a(p0, tagItem1.mRich);
                   break;
                 case 16:
                   tagItem1.mMusic = this.c.read(p0);
                   break;
                 case 18:
                   tagItem1.playCount = KnownTypeAdapters$n.a(p0, tagItem1.playCount);
                   break;
                 case 19:
                   tagItem1.mIsCollecting = KnownTypeAdapters$g.a(p0, tagItem1.mIsCollecting);
                   break;
                 case 20:
                   tagItem1.mMagicFace = this.d.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tagItem1;
       }
    }
    public void b(b p0,TagItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TagItem$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mTag != null) {
             p0.r("tag");
             TypeAdapters.A.write(p0, p1.mTag);
          }
          p0.r("photoCount");
          p0.K((long)p1.mCount);
          p0.r("tagPlayCount");
          p0.K(p1.playCount);
          p0.r("rich");
          p0.P(p1.mRich);
          if (p1.mInitiatorPhoto != null) {
             p0.r("initiatorPhoto");
             this.b.write(p0, p1.mInitiatorPhoto);
          }
          if (p1.mMusic != null) {
             p0.r("music");
             this.c.write(p0, p1.mMusic);
          }
          if (p1.mMagicFace != null) {
             p0.r("magicFace");
             this.d.write(p0, p1.mMagicFace);
          }
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mUserName != null) {
             p0.r("userName");
             TypeAdapters.A.write(p0, p1.mUserName);
          }
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
          }
          if (p1.mTagIconUrls != null) {
             p0.r("iconUrls");
             this.f.write(p0, p1.mTagIconUrls);
          }
          p0.r("isFollowing");
          p0.P(p1.mIsCollecting);
          p0.r("isKaraoke");
          p0.P(p1.mIsKaraoke);
          p0.r("durationPlayTrail");
          p0.K(p1.mDurationPlayTrail);
          p0.r("isCollected");
          p0.P(p1.mIsCollected);
          if (p1.mCommonLabel != null) {
             p0.r("commonLabel");
             this.h.write(p0, p1.mCommonLabel);
          }
          if (p1.mLyricLabel != null) {
             p0.r("lyricLabel");
             this.i.write(p0, p1.mLyricLabel);
          }
          p0.r("hideArtist");
          p0.P(p1.mHideArtist);
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
