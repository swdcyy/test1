package com.kuaishou.android.model.mix.CoverMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.CoverSize$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCoverStyle$TypeAdapter;
import com.kuaishou.android.model.mix.CoverImageType$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$c;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.CoverSize;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$f;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$d;
import com.kuaishou.android.model.mix.PhotoCoverStyle;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$e;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$a;
import com.kuaishou.android.model.mix.CoverImageType;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$b;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$g;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$p;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$h;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$i;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$j;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$k;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$l;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$m;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$n;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter$o;

public final class CoverMeta$TypeAdapter extends TypeAdapter	// class@000c4d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       CoverMeta$TypeAdapter.f = a.get(CoverMeta.class);
    }
    public void CoverMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       this.c = p0.j(CoverSize$TypeAdapter.b);
       this.d = p0.j(PhotoCoverStyle$TypeAdapter.b);
       this.e = p0.j(CoverImageType$TypeAdapter.b);
    }
    public CoverMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverMeta uCoverMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverMeta;
       }else {
          p0.c();
          CoverMeta uCoverMeta1 = new CoverMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9049e088:
                   if (str.equals("animated_cover_urls")) {
                      i = 0;
                   }
                   break;
                 case 0x958328ab:
                   if (str.equals("profileAnimatedCover")) {
                      i = 1;
                   }
                   break;
                 case 0xfd35dffe:
                   if (str.equals("ff_cover_thumbnail_urls")) {
                      i = 2;
                   }
                   break;
                 case 'h':
                   if (str.equals("h")) {
                      i = 3;
                   }
                   break;
                 case 'w':
                   if (str.equals("w")) {
                      i = 4;
                   }
                   break;
                 case 0x1980913e:
                   if (str.equals("coverImageType")) {
                      i = 5;
                   }
                   break;
                 case 0x276759df:
                   if (str.equals("cover_thumbnail_urls")) {
                      i = 6;
                   }
                   break;
                 case 0x2de0ff72:
                   if (str.equals("sfStarCover")) {
                      i = 7;
                   }
                   break;
                 case 0x39214b32:
                   if (str.equals("coverId")) {
                      i = 8;
                   }
                   break;
                 case 0x4966180c:
                   if (str.equals("photoCoverStyle")) {
                      i = 9;
                   }
                   break;
                 case 0x4aad086c:
                   if (str.equals("cover_urls")) {
                      i = 10;
                   }
                   break;
                 case 0x4d0b70cd:
                   if (str.equals("backgroundImage")) {
                      i = 11;
                   }
                   break;
                 case 0x759421dc:
                   if (str.equals("override_cover_size")) {
                      i = 12;
                   }
                   break;
                 case 0x763296c8:
                   if (str.equals("override_cover_thumbnail_type")) {
                      i = 13;
                   }
                   break;
                 case 0x7632f072:
                   if (str.equals("override_cover_thumbnail_urls")) {
                      i = 14;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverMeta1.mWebpGifUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$p(this)).a(p0);
                   break;
                 case 1:
                   uCoverMeta1.mProfileAnimatedCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$g(this)).a(p0);
                   break;
                 case 2:
                   uCoverMeta1.mFFCoverThumbnailUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$b(this)).a(p0);
                   break;
                 case 3:
                   uCoverMeta1.mHeight = KnownTypeAdapters$k.a(p0, uCoverMeta1.mHeight);
                   break;
                 case 4:
                   uCoverMeta1.mWidth = KnownTypeAdapters$k.a(p0, uCoverMeta1.mWidth);
                   break;
                 case 5:
                   uCoverMeta1.mCoverImageType = this.e.read(p0);
                   break;
                 case 6:
                   uCoverMeta1.mCoverThumbnailUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$a(this)).a(p0);
                   break;
                 case 7:
                   uCoverMeta1.mSfStarCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$e(this)).a(p0);
                   break;
                 case 8:
                   uCoverMeta1.mCoverId = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCoverMeta1.mCoverStyle = this.d.read(p0);
                   break;
                 case 10:
                   uCoverMeta1.mCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$d(this)).a(p0);
                   break;
                 case 11:
                   uCoverMeta1.mBackgroundImageUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$f(this)).a(p0);
                   break;
                 case 12:
                   uCoverMeta1.mOverrideCoverSize = this.c.read(p0);
                   break;
                 case 13:
                   uCoverMeta1.mOverrideCoverThumbnailType = KnownTypeAdapters$k.a(p0, uCoverMeta1.mOverrideCoverThumbnailType);
                   break;
                 case 14:
                   uCoverMeta1.mOverrideCoverThumbnailUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$c(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverMeta1;
       }
    }
    public void b(b p0,CoverMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mWebpGifUrls != null) {
             p0.r("animated_cover_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$h(this)).b(p0, p1.mWebpGifUrls);
          }
          if (p1.mCoverThumbnailUrls != null) {
             p0.r("cover_thumbnail_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$i(this)).b(p0, p1.mCoverThumbnailUrls);
          }
          if (p1.mFFCoverThumbnailUrls != null) {
             p0.r("ff_cover_thumbnail_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$j(this)).b(p0, p1.mFFCoverThumbnailUrls);
          }
          if (p1.mOverrideCoverThumbnailUrls != null) {
             p0.r("override_cover_thumbnail_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$k(this)).b(p0, p1.mOverrideCoverThumbnailUrls);
          }
          p0.r("override_cover_thumbnail_type");
          p0.K((long)p1.mOverrideCoverThumbnailType);
          if (p1.mOverrideCoverSize != null) {
             p0.r("override_cover_size");
             this.c.write(p0, p1.mOverrideCoverSize);
          }
          if (p1.mCoverStyle != null) {
             p0.r("photoCoverStyle");
             this.d.write(p0, p1.mCoverStyle);
          }
          if (p1.mCoverImageType != null) {
             p0.r("coverImageType");
             this.e.write(p0, p1.mCoverImageType);
          }
          if (p1.mCoverUrls != null) {
             p0.r("cover_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$l(this)).b(p0, p1.mCoverUrls);
          }
          p0.r("w");
          p0.K((long)p1.mWidth);
          p0.r("h");
          p0.K((long)p1.mHeight);
          if (p1.mCoverId != null) {
             p0.r("coverId");
             TypeAdapters.A.write(p0, p1.mCoverId);
          }
          if (p1.mSfStarCoverUrls != null) {
             p0.r("sfStarCover");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$m(this)).b(p0, p1.mSfStarCoverUrls);
          }
          if (p1.mBackgroundImageUrls != null) {
             p0.r("backgroundImage");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$n(this)).b(p0, p1.mBackgroundImageUrls);
          }
          if (p1.mProfileAnimatedCoverUrls != null) {
             p0.r("profileAnimatedCover");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverMeta$TypeAdapter$o(this)).b(p0, p1.mProfileAnimatedCoverUrls);
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
