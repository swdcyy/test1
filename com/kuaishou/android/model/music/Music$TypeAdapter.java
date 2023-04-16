package com.kuaishou.android.model.music.Music$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.music.MusicRankModel;
import com.kuaishou.android.model.music.MusicRankModelV2;
import com.kuaishou.android.model.music.MusicPartners;
import com.kuaishou.android.model.music.UploadedMusicAuditStatus;
import com.kuaishou.android.model.music.Music$MusicAnalysisResult;
import com.kuaishou.android.model.music.Music$MusicDuringInfo;
import com.kuaishou.android.model.music.Music$MusicLabel;
import com.kuaishou.android.model.music.Music$MusicBackgroundColorInfo;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.framework.model.user.UserInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.music.Music$TypeAdapter$l;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kuaishou.android.model.music.Music$TypeAdapter$o;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.music.Music$TypeAdapter$g;
import com.kuaishou.android.model.music.Music$TypeAdapter$f;
import com.kuaishou.android.model.music.Music$TypeAdapter$e;
import java.util.List;
import com.kuaishou.android.model.music.Music$TypeAdapter$r;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.android.model.music.Music$TypeAdapter$n;
import com.kuaishou.android.model.music.Music$TypeAdapter$m;
import com.kuaishou.android.model.music.Music$TypeAdapter$j;
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Long;
import com.kuaishou.android.model.music.Music$TypeAdapter$h;
import com.kuaishou.android.model.music.Music$TypeAdapter$i;
import com.vimeo.stag.KnownTypeAdapters$i;
import com.kuaishou.android.model.music.Music$TypeAdapter$q;
import com.kuaishou.android.model.music.Music$TypeAdapter$p;
import com.google.gson.stream.b;
import com.kuaishou.android.model.music.Music$TypeAdapter$k;
import com.kuaishou.android.model.music.Music$TypeAdapter$s;
import com.kuaishou.android.model.music.Music$TypeAdapter$t;
import com.kuaishou.android.model.music.Music$TypeAdapter$u;
import com.kuaishou.android.model.music.Music$TypeAdapter$v;
import com.kuaishou.android.model.music.Music$TypeAdapter$w;
import com.kuaishou.android.model.music.Music$TypeAdapter$x;
import com.kuaishou.android.model.music.Music$TypeAdapter$y;
import com.kuaishou.android.model.music.Music$TypeAdapter$z;
import com.kuaishou.android.model.music.Music$TypeAdapter$a;
import com.kuaishou.android.model.music.Music$TypeAdapter$b;
import com.kuaishou.android.model.music.Music$TypeAdapter$c;
import com.kuaishou.android.model.music.Music$TypeAdapter$d;

public final class Music$TypeAdapter extends TypeAdapter	// class@000e74
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
    public final TypeAdapter j;
    public final TypeAdapter k;
    public final TypeAdapter l;
    public final TypeAdapter m;
    public static final a n;

    static {
       Music$TypeAdapter.n = a.get(Music.class);
    }
    public void Music$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(MusicType.class));
       this.c = p0.j(a.get(CDNUrl.class));
       this.d = p0.j(a.get(MusicRankModel.class));
       this.e = p0.j(a.get(MusicRankModelV2.class));
       this.f = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.g = p0.j(a.get(MusicPartners.class));
       this.h = p0.j(UserInfo$TypeAdapter.i);
       this.i = p0.j(a.get(UploadedMusicAuditStatus.class));
       this.j = p0.j(a.get(Music$MusicAnalysisResult.class));
       this.k = p0.j(a.get(Music$MusicDuringInfo.class));
       this.l = p0.j(a.get(Music$MusicLabel.class));
       this.m = p0.j(a.get(Music$MusicBackgroundColorInfo.class));
    }
    public Music a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, Music$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       Music music = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return music;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return music;
       }else {
          p0.c();
          Music music1 = new Music();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x89444d94:
                   if (str.equals("duration")) {
                      i = 0;
                   }
                   break;
                 case 0x8bb5b4b5:
                   if (str.equals("licensedPlayScene")) {
                      i = 1;
                   }
                   break;
                 case 0x8c9e3c62:
                   if (str.equals("durationInfo")) {
                      i = 2;
                   }
                   break;
                 case 0x8cdbfd11:
                   if (str.equals("mCoverHeight")) {
                      i = 3;
                   }
                   break;
                 case 0x902e58a9:
                   if (str.equals("loudness")) {
                      i = 4;
                   }
                   break;
                 case 0x90658c3f:
                   if (str.equals("musicRankInfo")) {
                      i = 5;
                   }
                   break;
                 case 0x9814bf77:
                   if (str.equals("c_source")) {
                      i = 6;
                   }
                   break;
                 case 0xac02df47:
                   if (str.equals("artist")) {
                      i = 7;
                   }
                   break;
                 case 0xaedd81a6:
                   if (str.equals("chorus")) {
                      i = 8;
                   }
                   break;
                 case 0xb1e77d6a:
                   if (str.equals("cooperatorMarker")) {
                      i = 9;
                   }
                   break;
                 case 0xb328ac3d:
                   if (str.equals("expTag")) {
                      i = 10;
                   }
                   break;
                 case 0xb6c832c2:
                   if (str.equals("artistId")) {
                      i = 11;
                   }
                   break;
                 case 0xbbae18d1:
                   if (str.equals("auditionUrls")) {
                      i = 12;
                   }
                   break;
                 case 0xbf29e7f4:
                   if (str.equals("lyrics")) {
                      i = 13;
                   }
                   break;
                 case 0xc0369888:
                   if (str.equals("mmuLrc")) {
                      i = 14;
                   }
                   break;
                 case 0xc3aab653:
                   if (str.equals("online")) {
                      i = 15;
                   }
                   break;
                 case 0xcba8e0df:
                   if (str.equals("imageUrls")) {
                      i = 16;
                   }
                   break;
                 case 0xce105219:
                   if (str.equals("analysisResult")) {
                      i = 17;
                   }
                   break;
                 case 0xd5a611f4:
                   if (str.equals("searchRank")) {
                      i = 18;
                   }
                   break;
                 case 0xdbd4ac3e:
                   if (str.equals("isFavorited")) {
                      i = 19;
                   }
                   break;
                 case 0xdc8482ed:
                   if (str.equals("photoId")) {
                      i = 20;
                   }
                   break;
                 case 0xdd7c35d1:
                   if (str.equals("snippetDuration")) {
                      i = 21;
                   }
                   break;
                 case 0xe03231fd:
                   if (str.equals("photoCount")) {
                      i = 22;
                   }
                   break;
                 case 0xe6736156:
                   if (str.equals("avatarUrl")) {
                      i = 23;
                   }
                   break;
                 case 0xe7f8c9dd:
                   if (str.equals("avatarUrls")) {
                      i = 24;
                   }
                   break;
                 case 0xf0735e1b:
                   if (str.equals("isRecord")) {
                      i = 25;
                   }
                   break;
                 case 0xf182ec6e:
                   if (str.equals("uploadTime")) {
                      i = 26;
                   }
                   break;
                 case 0xf2e8d35a:
                   if (str.equals("vocalStartTime")) {
                      i = 27;
                   }
                   break;
                 case 0xf47e77a1:
                   if (str.equals("snippetUrls")) {
                      i = 28;
                   }
                   break;
                 case 0xf68dabf4:
                   if (str.equals("melodyUrls")) {
                      i = 29;
                   }
                   break;
                 case 0xfbafb6a5:
                   if (str.equals("usedStart")) {
                      i = 30;
                   }
                   break;
                 case 0xfe3a685c:
                   if (str.equals("topMusicListInfo")) {
                      i = 31;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 32;
                   }
                   break;
                 case 0x188db:
                   if (str.equals("end")) {
                      i = 33;
                   }
                   break;
                 case 0x1a39d:
                   if (str.equals("lrc")) {
                      i = 34;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 35;
                   }
                   break;
                 case 0x2efe91:
                   if (str.equals("desc")) {
                      i = 36;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 37;
                   }
                   break;
                 case 0x346425:
                   if (str.equals("path")) {
                      i = 38;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 39;
                   }
                   break;
                 case 0x36ebcb:
                   if (str.equals("user")) {
                      i = 40;
                   }
                   break;
                 case 0x59478a9:
                   if (str.equals("begin")) {
                      i = 41;
                   }
                   break;
                 case 0x5b52073:
                   if (str.equals("docId")) {
                      i = 42;
                   }
                   break;
                 case 0x5faa95b:
                   if (str.equals("image")) {
                      i = 43;
                   }
                   break;
                 case 0x5fb28d2:
                   if (str.equals("index")) {
                      i = 44;
                   }
                   break;
                 case 0x61f7ef4:
                   if (str.equals("label")) {
                      i = 45;
                   }
                   break;
                 case 0x624bf4e:
                   if (str.equals("llsid")) {
                      i = 46;
                   }
                   break;
                 case 0x6a6c170:
                   if (str.equals("ussid")) {
                      i = 47;
                   }
                   break;
                 case 0x76d5dd4:
                   if (str.equals("mappingTextTags")) {
                      i = 48;
                   }
                   break;
                 case 0xb381dda:
                   if (str.equals("audioUrls")) {
                      i = 49;
                   }
                   break;
                 case 0xf202f1a:
                   if (str.equals("geminiPageBgColor")) {
                      i = 50;
                   }
                   break;
                 case 0x11cb4729:
                   if (str.equals("mmuLyrics")) {
                      i = 51;
                   }
                   break;
                 case 0x1944ea21:
                   if (str.equals("lrcUrls")) {
                      i = 52;
                   }
                   break;
                 case 0x1acf718c:
                   if (str.equals("mmuLrcUrls")) {
                      i = 53;
                   }
                   break;
                 case 0x22d4c7ad:
                   if (str.equals("auditStatus")) {
                      i = 54;
                   }
                   break;
                 case 0x22ea311b:
                   if (str.equals("isOriginal")) {
                      i = 55;
                   }
                   break;
                 case 0x2588d272:
                   if (str.equals("artistName")) {
                      i = 56;
                   }
                   break;
                 case 0x26404494:
                   if (str.equals("disableEnhancedEntry")) {
                      i = 57;
                   }
                   break;
                 case 0x26689c9c:
                   if (str.equals("mCoverWidth")) {
                      i = 58;
                   }
                   break;
                 case 0x2fa245dc:
                   if (str.equals("singingCount")) {
                      i = 59;
                   }
                   break;
                 case 0x343e88d8:
                   if (str.equals("tagSourcePhotoId")) {
                      i = 60;
                   }
                   break;
                 case 0x36569da9:
                   if (str.equals("nameChanged")) {
                      i = 61;
                   }
                   break;
                 case 0x3d641252:
                   if (str.equals("instrumental")) {
                      i = 62;
                   }
                   break;
                 case 0x3fc09071:
                   if (str.equals("usedDuration")) {
                      i = 63;
                   }
                   break;
                 case 0x481e63e2:
                   if (str.equals("auditionUrl")) {
                      i = 64;
                   }
                   break;
                 case 0x4e5268a9:
                   if (str.equals("mmuMelodyUrls")) {
                      i = 65;
                   }
                   break;
                 case 0x4e53bce7:
                   if (str.equals("copyrightTimeLimit")) {
                      i = 66;
                   }
                   break;
                 case 0x5720515e:
                   if (str.equals("channelID")) {
                      i = 67;
                   }
                   break;
                 case 0x5c528476:
                   if (str.equals("isNotSafe")) {
                      i = 68;
                   }
                   break;
                 case 0x5ccc9e37:
                   if (str.equals("soundTrackPromoteStrategy")) {
                      i = 69;
                   }
                   break;
                 case 0x67f961a3:
                   if (str.equals("pureName")) {
                      i = 70;
                   }
                   break;
                 case 0x6dfbdcfa:
                   if (str.equals("newType")) {
                      i = 71;
                   }
                   break;
                 case 0x6eca0c7f:
                   if (str.equals("musicianUid")) {
                      i = 72;
                   }
                   break;
                 case 0x7489fe6d:
                   if (str.equals("accompanimentUrls")) {
                      i = 73;
                   }
                   break;
                 case 0x75292a58:
                   if (str.equals("aiRapStyle")) {
                      i = 74;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   music1.mDuration = KnownTypeAdapters$k.a(p0, music1.mDuration);
                   break;
                 case 1:
                   music1.mLicensedPlaySceneList = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new Music$TypeAdapter$p(this)).a(p0);
                   break;
                 case 2:
                   music1.mMusicDuringInfoList = new KnownTypeAdapters$ArrayTypeAdapter(this.k, new Music$TypeAdapter$q(this)).a(p0);
                   break;
                 case 3:
                   music1.mCoverHeight = KnownTypeAdapters$k.a(p0, music1.mCoverHeight);
                   break;
                 case 4:
                   music1.mLoudness = KnownTypeAdapters$i.a(p0, music1.mLoudness);
                   break;
                 case 5:
                   music1.mMusicRankModelV2 = this.e.read(p0);
                   break;
                 case 6:
                   music1.mCSource = KnownTypeAdapters$k.a(p0, music1.mCSource);
                   break;
                 case 7:
                   music1.mArtist = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   music1.mChorus = KnownTypeAdapters$k.a(p0, music1.mChorus);
                   break;
                 case 9:
                   music1.mMusicPartners = this.g.read(p0);
                   break;
                 case 10:
                   music1.mExpTag = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   music1.mArtistId = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   music1.mAuditionUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$i(this)).a(p0);
                   break;
                 case 13:
                   music1.mLyrics = TypeAdapters.A.read(p0);
                   break;
                 case 14:
                   music1.mMmuLrcUrl = TypeAdapters.A.read(p0);
                   break;
                 case 15:
                   music1.mOnLine = KnownTypeAdapters$g.a(p0, music1.mOnLine);
                   break;
                 case 16:
                   music1.mImageUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$h(this)).a(p0);
                   break;
                 case 17:
                   music1.mAnalysisResult = this.j.read(p0);
                   break;
                 case 18:
                   music1.mMusicSearchRank = KnownTypeAdapters$k.a(p0, music1.mMusicSearchRank);
                   break;
                 case 19:
                   music1.mIsFavorited = KnownTypeAdapters$k.a(p0, music1.mIsFavorited);
                   break;
                 case 20:
                   music1.mPhotoId = TypeAdapters.A.read(p0);
                   break;
                 case 21:
                   music1.mSnippetDuration = KnownTypeAdapters$k.a(p0, music1.mSnippetDuration);
                   break;
                 case 22:
                   music1.mPhotoCount = KnownTypeAdapters.d.read(p0);
                   break;
                 case 23:
                   music1.mAvatarUrl = TypeAdapters.A.read(p0);
                   break;
                 case 24:
                   music1.mAvatarUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$j(this)).a(p0);
                   break;
                 case 25:
                   music1.mIsRecordMusic = KnownTypeAdapters$g.a(p0, music1.mIsRecordMusic);
                   break;
                 case 26:
                   music1.mUploadTime = TypeAdapters.A.read(p0);
                   break;
                 case 27:
                   music1.mVocalStartTime = KnownTypeAdapters$n.a(p0, music1.mVocalStartTime);
                   break;
                 case 28:
                   music1.mSnippetUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$m(this)).a(p0);
                   break;
                 case 29:
                   music1.mMelodyUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$n(this)).a(p0);
                   break;
                 case 30:
                   music1.mUsedStart = KnownTypeAdapters$n.a(p0, music1.mUsedStart);
                   break;
                 case 31:
                   music1.mMusicRankModel = this.d.read(p0);
                   break;
                 case 32:
                   music1.mId = TypeAdapters.A.read(p0);
                   break;
                 case '!':
                   music1.mKtvEndTime = KnownTypeAdapters$k.a(p0, music1.mKtvEndTime);
                   break;
                 case '"':
                   music1.mLrcUrl = TypeAdapters.A.read(p0);
                   break;
                 case '#':
                   music1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case '$':
                   music1.mDescription = TypeAdapters.A.read(p0);
                   break;
                 case '%':
                   music1.mName = TypeAdapters.A.read(p0);
                   break;
                 case '&':
                   music1.mPath = TypeAdapters.A.read(p0);
                   break;
                 case 39:
                   music1.mType = this.b.read(p0);
                   break;
                 case '(':
                   music1.mUserProfile = this.h.read(p0);
                   break;
                 case ')':
                   music1.mKtvBeginTime = KnownTypeAdapters$k.a(p0, music1.mKtvBeginTime);
                   break;
                 case '*':
                   music1.mMusicDocId = TypeAdapters.A.read(p0);
                   break;
                 case '+':
                   music1.mImageUrl = TypeAdapters.A.read(p0);
                   break;
                 case ',':
                   music1.index = KnownTypeAdapters$k.a(p0, music1.index);
                   break;
                 case '-':
                   music1.mMusicLabelList = new KnownTypeAdapters$ArrayTypeAdapter(this.l, new Music$TypeAdapter$r(this)).a(p0);
                   break;
                 case '.':
                   music1.mLlsid = TypeAdapters.A.read(p0);
                   break;
                 case '/':
                   music1.mUssid = TypeAdapters.A.read(p0);
                   break;
                 case '0':
                   music1.mMappingTextTags = this.f.read(p0);
                   break;
                 case '1':
                   music1.mUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$e(this)).a(p0);
                   break;
                 case '2':
                   music1.mMusicBackgroundColorInfo = this.m.read(p0);
                   break;
                 case '3':
                   music1.mMmuLyrics = TypeAdapters.A.read(p0);
                   break;
                 case '4':
                   music1.mLrcUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$f(this)).a(p0);
                   break;
                 case '5':
                   music1.mMmuLrcUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$g(this)).a(p0);
                   break;
                 case '6':
                   music1.mAuditStatus = this.i.read(p0);
                   break;
                 case '7':
                   music1.isOriginal = KnownTypeAdapters$g.a(p0, music1.isOriginal);
                   break;
                 case '8':
                   music1.mArtistName = TypeAdapters.A.read(p0);
                   break;
                 case '9':
                   music1.mDisableEnhancedEntry = KnownTypeAdapters$g.a(p0, music1.mDisableEnhancedEntry);
                   break;
                 case ':':
                   music1.mCoverWidth = KnownTypeAdapters$k.a(p0, music1.mCoverWidth);
                   break;
                 case ';':
                   music1.mSingingCount = KnownTypeAdapters$n.a(p0, music1.mSingingCount);
                   break;
                 case '<':
                   music1.mTagSourcePhotoId = TypeAdapters.A.read(p0);
                   break;
                 case '=':
                   music1.mNameChanged = KnownTypeAdapters$g.a(p0, music1.mNameChanged);
                   break;
                 case '>':
                   music1.mInstrumental = KnownTypeAdapters$g.a(p0, music1.mInstrumental);
                   break;
                 case '?':
                   music1.mUsedDuration = KnownTypeAdapters$n.a(p0, music1.mUsedDuration);
                   break;
                 case '@':
                   music1.mAuditionUrl = TypeAdapters.A.read(p0);
                   break;
                 case 'A':
                   music1.mMmuMelodyUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$o(this)).a(p0);
                   break;
                 case 'B':
                   music1.mCopyrightTimeLimitInSecond = KnownTypeAdapters$k.a(p0, music1.mCopyrightTimeLimitInSecond);
                   break;
                 case 'C':
                   music1.mCategoryId = KnownTypeAdapters$n.a(p0, music1.mCategoryId);
                   break;
                 case 'D':
                   music1.mIsNotSafe = KnownTypeAdapters$k.a(p0, music1.mIsNotSafe);
                   break;
                 case 'E':
                   music1.mSoundTrackPromoteStrategy = KnownTypeAdapters$k.a(p0, music1.mSoundTrackPromoteStrategy);
                   break;
                 case 'F':
                   music1.mPureName = TypeAdapters.A.read(p0);
                   break;
                 case 'G':
                   music1.mNewType = this.b.read(p0);
                   break;
                 case 'H':
                   music1.mMusicianUid = TypeAdapters.A.read(p0);
                   break;
                 case 'I':
                   music1.mAccompanimentUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$l(this)).a(p0);
                   break;
                 case 'J':
                   music1.mAiRapStyle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return music1;
       }
    }
    public void b(b p0,Music p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Music$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mType != null) {
             p0.r("type");
             this.b.write(p0, p1.mType);
          }
          if (p1.mNewType != null) {
             p0.r("newType");
             this.b.write(p0, p1.mNewType);
          }
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mPureName != null) {
             p0.r("pureName");
             TypeAdapters.A.write(p0, p1.mPureName);
          }
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          if (p1.mUrls != null) {
             p0.r("audioUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$k(this)).b(p0, p1.mUrls);
          }
          p0.r("loudness");
          p0.J(p1.mLoudness);
          if (p1.mLrcUrls != null) {
             p0.r("lrcUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$s(this)).b(p0, p1.mLrcUrls);
          }
          if (p1.mMmuLrcUrls != null) {
             p0.r("mmuLrcUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$t(this)).b(p0, p1.mMmuLrcUrls);
          }
          if (p1.mLrcUrl != null) {
             p0.r("lrc");
             TypeAdapters.A.write(p0, p1.mLrcUrl);
          }
          if (p1.mArtist != null) {
             p0.r("artist");
             TypeAdapters.A.write(p0, p1.mArtist);
          }
          if (p1.mArtistId != null) {
             p0.r("artistId");
             TypeAdapters.A.write(p0, p1.mArtistId);
          }
          if (p1.mLyrics != null) {
             p0.r("lyrics");
             TypeAdapters.A.write(p0, p1.mLyrics);
          }
          if (p1.mMmuLyrics != null) {
             p0.r("mmuLyrics");
             TypeAdapters.A.write(p0, p1.mMmuLyrics);
          }
          if (p1.mMmuLrcUrl != null) {
             p0.r("mmuLrc");
             TypeAdapters.A.write(p0, p1.mMmuLrcUrl);
          }
          if (p1.mImageUrl != null) {
             p0.r("image");
             TypeAdapters.A.write(p0, p1.mImageUrl);
          }
          if (p1.mImageUrls != null) {
             p0.r("imageUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$u(this)).b(p0, p1.mImageUrls);
          }
          if (p1.mAuditionUrls != null) {
             p0.r("auditionUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$v(this)).b(p0, p1.mAuditionUrls);
          }
          if (p1.mAuditionUrl != null) {
             p0.r("auditionUrl");
             TypeAdapters.A.write(p0, p1.mAuditionUrl);
          }
          if (p1.mAvatarUrl != null) {
             p0.r("avatarUrl");
             TypeAdapters.A.write(p0, p1.mAvatarUrl);
          }
          if (p1.mAvatarUrls != null) {
             p0.r("avatarUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$w(this)).b(p0, p1.mAvatarUrls);
          }
          p0.r("duration");
          p0.K((long)p1.mDuration);
          if (p1.mDescription != null) {
             p0.r("desc");
             TypeAdapters.A.write(p0, p1.mDescription);
          }
          p0.r("chorus");
          p0.K((long)p1.mChorus);
          p0.r("begin");
          p0.K((long)p1.mKtvBeginTime);
          p0.r("end");
          p0.K((long)p1.mKtvEndTime);
          if (p1.mExpTag != null) {
             p0.r("expTag");
             TypeAdapters.A.write(p0, p1.mExpTag);
          }
          p0.r("instrumental");
          p0.P(p1.mInstrumental);
          p0.r("online");
          p0.P(p1.mOnLine);
          if (p1.mAccompanimentUrls != null) {
             p0.r("accompanimentUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$x(this)).b(p0, p1.mAccompanimentUrls);
          }
          p0.r("isFavorited");
          p0.K((long)p1.mIsFavorited);
          p0.r("isNotSafe");
          p0.K((long)p1.mIsNotSafe);
          if (p1.mSnippetUrls != null) {
             p0.r("snippetUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$y(this)).b(p0, p1.mSnippetUrls);
          }
          p0.r("snippetDuration");
          p0.K((long)p1.mSnippetDuration);
          if (p1.mMelodyUrls != null) {
             p0.r("melodyUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$z(this)).b(p0, p1.mMelodyUrls);
          }
          if (p1.mMmuMelodyUrls != null) {
             p0.r("mmuMelodyUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new Music$TypeAdapter$a(this)).b(p0, p1.mMmuMelodyUrls);
          }
          if (p1.mMusicianUid != null) {
             p0.r("musicianUid");
             TypeAdapters.A.write(p0, p1.mMusicianUid);
          }
          if (p1.mPhotoCount != null) {
             p0.r("photoCount");
             KnownTypeAdapters.d.write(p0, p1.mPhotoCount);
          }
          p0.r("soundTrackPromoteStrategy");
          p0.K((long)p1.mSoundTrackPromoteStrategy);
          p0.r("disableEnhancedEntry");
          p0.P(p1.mDisableEnhancedEntry);
          if (p1.mPhotoId != null) {
             p0.r("photoId");
             TypeAdapters.A.write(p0, p1.mPhotoId);
          }
          p0.r("nameChanged");
          p0.P(p1.mNameChanged);
          if (p1.mMusicRankModel != null) {
             p0.r("topMusicListInfo");
             this.d.write(p0, p1.mMusicRankModel);
          }
          if (p1.mMusicRankModelV2 != null) {
             p0.r("musicRankInfo");
             this.e.write(p0, p1.mMusicRankModelV2);
          }
          if (p1.mMappingTextTags != null) {
             p0.r("mappingTextTags");
             this.f.write(p0, p1.mMappingTextTags);
          }
          p0.r("isOriginal");
          p0.P(p1.isOriginal);
          p0.r("usedStart");
          p0.K(p1.mUsedStart);
          p0.r("usedDuration");
          p0.K(p1.mUsedDuration);
          p0.r("isRecord");
          p0.P(p1.mIsRecordMusic);
          p0.r("c_source");
          p0.K((long)p1.mCSource);
          if (p1.mMusicPartners != null) {
             p0.r("cooperatorMarker");
             this.g.write(p0, p1.mMusicPartners);
          }
          if (p1.mTagSourcePhotoId != null) {
             p0.r("tagSourcePhotoId");
             TypeAdapters.A.write(p0, p1.mTagSourcePhotoId);
          }
          if (p1.mUserProfile != null) {
             p0.r("user");
             this.h.write(p0, p1.mUserProfile);
          }
          if (p1.mAuditStatus != null) {
             p0.r("auditStatus");
             this.i.write(p0, p1.mAuditStatus);
          }
          if (p1.mArtistName != null) {
             p0.r("artistName");
             TypeAdapters.A.write(p0, p1.mArtistName);
          }
          if (p1.mUploadTime != null) {
             p0.r("uploadTime");
             TypeAdapters.A.write(p0, p1.mUploadTime);
          }
          p0.r("singingCount");
          p0.K(p1.mSingingCount);
          p0.r("copyrightTimeLimit");
          p0.K((long)p1.mCopyrightTimeLimitInSecond);
          p0.r("vocalStartTime");
          p0.K(p1.mVocalStartTime);
          if (p1.mLicensedPlaySceneList != null) {
             p0.r("licensedPlayScene");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new Music$TypeAdapter$b(this)).b(p0, p1.mLicensedPlaySceneList);
          }
          if (p1.mMusicDocId != null) {
             p0.r("docId");
             TypeAdapters.A.write(p0, p1.mMusicDocId);
          }
          p0.r("searchRank");
          p0.K((long)p1.mMusicSearchRank);
          if (p1.mPath != null) {
             p0.r("path");
             TypeAdapters.A.write(p0, p1.mPath);
          }
          p0.r("mCoverWidth");
          p0.K((long)p1.mCoverWidth);
          p0.r("mCoverHeight");
          p0.K((long)p1.mCoverHeight);
          if (p1.mLlsid != null) {
             p0.r("llsid");
             TypeAdapters.A.write(p0, p1.mLlsid);
          }
          if (p1.mUssid != null) {
             p0.r("ussid");
             TypeAdapters.A.write(p0, p1.mUssid);
          }
          p0.r("channelID");
          p0.K(p1.mCategoryId);
          p0.r("index");
          p0.K((long)p1.index);
          if (p1.mAiRapStyle != null) {
             p0.r("aiRapStyle");
             TypeAdapters.A.write(p0, p1.mAiRapStyle);
          }
          if (p1.mAnalysisResult != null) {
             p0.r("analysisResult");
             this.j.write(p0, p1.mAnalysisResult);
          }
          if (p1.mMusicDuringInfoList != null) {
             p0.r("durationInfo");
             new KnownTypeAdapters$ArrayTypeAdapter(this.k, new Music$TypeAdapter$c(this)).b(p0, p1.mMusicDuringInfoList);
          }
          if (p1.mMusicLabelList != null) {
             p0.r("label");
             new KnownTypeAdapters$ArrayTypeAdapter(this.l, new Music$TypeAdapter$d(this)).b(p0, p1.mMusicLabelList);
          }
          if (p1.mMusicBackgroundColorInfo != null) {
             p0.r("geminiPageBgColor");
             this.m.write(p0, p1.mMusicBackgroundColorInfo);
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
