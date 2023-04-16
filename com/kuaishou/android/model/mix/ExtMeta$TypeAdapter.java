package com.kuaishou.android.model.mix.ExtMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ExtMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.ExtMeta$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.ExtMeta$TypeAdapter$a;

public final class ExtMeta$TypeAdapter extends TypeAdapter	// class@000c68
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       ExtMeta$TypeAdapter.e = a.get(ExtMeta.class);
    }
    public void ExtMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       this.c = p0.j(ImageMeta$Atlas$TypeAdapter.d);
       this.d = p0.j(ImageMeta$SinglePicture$TypeAdapter.d);
    }
    public ExtMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ExtMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ExtMeta uExtMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uExtMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uExtMeta;
       }else {
          p0.c();
          ExtMeta uExtMeta1 = new ExtMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x87e5bf58:
                   if (str.equals("photoViewCount")) {
                      i = 0;
                   }
                   break;
                 case 0x9fef3d5f:
                   if (str.equals("extraLogoUrls")) {
                      i = 1;
                   }
                   break;
                 case 0xa827fc54:
                   if (str.equals("hintText")) {
                      i = 2;
                   }
                   break;
                 case 0xc3376493:
                   if (str.equals("offset")) {
                      i = 3;
                   }
                   break;
                 case 0xc58dea61:
                   if (str.equals("tubeKoi")) {
                      i = 4;
                   }
                   break;
                 case 0xca1377df:
                   if (str.equals("liveAudienceCount")) {
                      i = 5;
                   }
                   break;
                 case 0xca388448:
                   if (str.equals("single")) {
                      i = 6;
                   }
                   break;
                 case 0xf4b2d7b8:
                   if (str.equals("likeCount")) {
                      i = 7;
                   }
                   break;
                 case 'h':
                   if (str.equals("h")) {
                      i = 8;
                   }
                   break;
                 case 'w':
                   if (str.equals("w")) {
                      i = 9;
                   }
                   break;
                 case 0x58d448b:
                   if (str.equals("atlas")) {
                      i = 10;
                   }
                   break;
                 case 0x5a72f63:
                   if (str.equals("color")) {
                      i = 11;
                   }
                   break;
                 case 0x6369127:
                   if (str.equals("mtype")) {
                      i = 12;
                   }
                   break;
                 case 0x68b1db1:
                   if (str.equals("style")) {
                      i = 13;
                   }
                   break;
                 case 0x6b0147b:
                   if (str.equals("video")) {
                      i = 14;
                   }
                   break;
                 case 0x21ffe4c5:
                   if (str.equals("interval")) {
                      i = 15;
                   }
                   break;
                 case 0x2e29578c:
                   if (str.equals("liveStreamIds")) {
                      i = 16;
                   }
                   break;
                 case 0x3b8bdfe8:
                   if (str.equals("seenTime")) {
                      i = 17;
                   }
                   break;
                 case 0x42600338:
                   if (str.equals("isKaraokeEntry")) {
                      i = 18;
                   }
                   break;
                 case 0x70922ad4:
                   if (str.equals("karaokeTitle")) {
                      i = 19;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uExtMeta1.mVideoViewCount = KnownTypeAdapters$n.a(p0, uExtMeta1.mVideoViewCount);
                   break;
                 case 1:
                   uExtMeta1.mExtraLogoUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ExtMeta$TypeAdapter$b(this)).a(p0);
                   break;
                 case 2:
                   uExtMeta1.mHintText = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uExtMeta1.mTkOffset = KnownTypeAdapters$k.a(p0, uExtMeta1.mTkOffset);
                   break;
                 case 4:
                   uExtMeta1.mTubeKoi = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uExtMeta1.mLiveAudienceCount = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uExtMeta1.mSinglePicture = this.d.read(p0);
                   break;
                 case 7:
                   uExtMeta1.mLiveLikeCount = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uExtMeta1.mHeight = KnownTypeAdapters$k.a(p0, uExtMeta1.mHeight);
                   break;
                 case 9:
                   uExtMeta1.mWidth = KnownTypeAdapters$k.a(p0, uExtMeta1.mWidth);
                   break;
                 case 10:
                   uExtMeta1.mAtlas = this.c.read(p0);
                   break;
                 case 11:
                   uExtMeta1.mColorStr = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   uExtMeta1.mType = KnownTypeAdapters$k.a(p0, uExtMeta1.mType);
                   break;
                 case 13:
                   uExtMeta1.mStyle = KnownTypeAdapters$k.a(p0, uExtMeta1.mStyle);
                   break;
                 case 14:
                   uExtMeta1.mVideoDuration = KnownTypeAdapters$n.a(p0, uExtMeta1.mVideoDuration);
                   break;
                 case 15:
                   uExtMeta1.mDelay = KnownTypeAdapters$k.a(p0, uExtMeta1.mDelay);
                   break;
                 case 16:
                   uExtMeta1.mLiveStreamIds = TypeAdapters.A.read(p0);
                   break;
                 case 17:
                   uExtMeta1.mSeenTime = KnownTypeAdapters$n.a(p0, uExtMeta1.mSeenTime);
                   break;
                 case 18:
                   uExtMeta1.isKaraokeEntry = KnownTypeAdapters$g.a(p0, uExtMeta1.isKaraokeEntry);
                   break;
                 case 19:
                   uExtMeta1.karaokeTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uExtMeta1;
       }
    }
    public void b(b p0,ExtMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("mtype");
          p0.K((long)p1.mType);
          p0.r("w");
          p0.K((long)p1.mWidth);
          p0.r("h");
          p0.K((long)p1.mHeight);
          p0.r("interval");
          p0.K((long)p1.mDelay);
          if (p1.mColorStr != null) {
             p0.r("color");
             TypeAdapters.A.write(p0, p1.mColorStr);
          }
          p0.r("offset");
          p0.K((long)p1.mTkOffset);
          p0.r("video");
          p0.K(p1.mVideoDuration);
          if (p1.mExtraLogoUrls != null) {
             p0.r("extraLogoUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ExtMeta$TypeAdapter$a(this)).b(p0, p1.mExtraLogoUrls);
          }
          if (p1.mHintText != null) {
             p0.r("hintText");
             TypeAdapters.A.write(p0, p1.mHintText);
          }
          if (p1.mLiveLikeCount != null) {
             p0.r("likeCount");
             TypeAdapters.A.write(p0, p1.mLiveLikeCount);
          }
          p0.r("photoViewCount");
          p0.K(p1.mVideoViewCount);
          if (p1.mLiveAudienceCount != null) {
             p0.r("liveAudienceCount");
             TypeAdapters.A.write(p0, p1.mLiveAudienceCount);
          }
          if (p1.mTubeKoi != null) {
             p0.r("tubeKoi");
             TypeAdapters.A.write(p0, p1.mTubeKoi);
          }
          if (p1.mLiveStreamIds != null) {
             p0.r("liveStreamIds");
             TypeAdapters.A.write(p0, p1.mLiveStreamIds);
          }
          if (p1.mAtlas != null) {
             p0.r("atlas");
             this.c.write(p0, p1.mAtlas);
          }
          if (p1.mSinglePicture != null) {
             p0.r("single");
             this.d.write(p0, p1.mSinglePicture);
          }
          p0.r("isKaraokeEntry");
          p0.P(p1.isKaraokeEntry);
          if (p1.karaokeTitle != null) {
             p0.r("karaokeTitle");
             TypeAdapters.A.write(p0, p1.karaokeTitle);
          }
          p0.r("seenTime");
          p0.K(p1.mSeenTime);
          p0.r("style");
          p0.K((long)p1.mStyle);
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
