package com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo$TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$l;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$k;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$c;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$a;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$j;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$l;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$d;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$e;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$f;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$g;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$h;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter$i;

public final class ImageMeta$Atlas$TypeAdapter extends TypeAdapter	// class@000cca
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ImageMeta$Atlas$TypeAdapter.d = a.get(ImageMeta$Atlas.class);
    }
    public void ImageMeta$Atlas$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ImageMeta$CDNInfo$TypeAdapter.b);
       this.c = p0.j(ImageMeta$AtlasCoverSize$TypeAdapter.b);
    }
    public ImageMeta$Atlas a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ImageMeta$Atlas$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ImageMeta$Atlas uAtlas = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAtlas;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAtlas;
       }else {
          p0.c();
          ImageMeta$Atlas uAtlas1 = new ImageMeta$Atlas();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x95652c86:
                   if (str.equals("musicCdnList")) {
                      i = 0;
                   }
                   break;
                 case 0xcfaae71a:
                   if (str.equals("volume")) {
                      i = 1;
                   }
                   break;
                 case 0x1802d:
                   if (str.equals("cdn")) {
                      i = 2;
                   }
                   break;
                 case 0x32b09e:
                   if (str.equals("list")) {
                      i = 3;
                   }
                   break;
                 case 0x35e001:
                   if (str.equals("size")) {
                      i = 4;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 5;
                   }
                   break;
                 case 0x636ee25:
                   if (str.equals("music")) {
                      i = 6;
                   }
                   break;
                 case 0x25dfc66b:
                   if (str.equals("cdnList")) {
                      i = 7;
                   }
                   break;
                 case 0x4f3efb94:
                   if (str.equals("thumbList")) {
                      i = 8;
                   }
                   break;
                 case 0x73d5cba7:
                   if (str.equals("indices")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAtlas1.mMusicCdnList = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ImageMeta$Atlas$TypeAdapter$l(this)).a(p0);
                   break;
                 case 1:
                   uAtlas1.mVolume = KnownTypeAdapters$j.a(p0, uAtlas1.mVolume);
                   break;
                 case 2:
                   uAtlas1.mCdn = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$Atlas$TypeAdapter$j(this)).a(p0);
                   break;
                 case 3:
                   uAtlas1.mList = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$Atlas$TypeAdapter$a(this)).a(p0);
                   break;
                 case 4:
                   uAtlas1.mSize = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new ImageMeta$Atlas$TypeAdapter$c(this)).a(p0);
                   break;
                 case 5:
                   uAtlas1.mType = KnownTypeAdapters$k.a(p0, uAtlas1.mType);
                   break;
                 case 6:
                   uAtlas1.mMusic = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uAtlas1.mCdnList = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ImageMeta$Atlas$TypeAdapter$k(this)).a(p0);
                   break;
                 case 8:
                   uAtlas1.mThumbList = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$Atlas$TypeAdapter$b(this)).a(p0);
                   break;
                 case 9:
                   uAtlas1.mIndices = KnownTypeAdapters$l.a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAtlas1;
       }
    }
    public void b(b p0,ImageMeta$Atlas p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageMeta$Atlas$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mCdn != null) {
             p0.r("cdn");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$Atlas$TypeAdapter$d(this)).b(p0, p1.mCdn);
          }
          if (p1.mCdnList != null) {
             p0.r("cdnList");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ImageMeta$Atlas$TypeAdapter$e(this)).b(p0, p1.mCdnList);
          }
          if (p1.mMusicCdnList != null) {
             p0.r("musicCdnList");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ImageMeta$Atlas$TypeAdapter$f(this)).b(p0, p1.mMusicCdnList);
          }
          if (p1.mList != null) {
             p0.r("list");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$Atlas$TypeAdapter$g(this)).b(p0, p1.mList);
          }
          if (p1.mThumbList != null) {
             p0.r("thumbList");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$Atlas$TypeAdapter$h(this)).b(p0, p1.mThumbList);
          }
          if (p1.mSize != null) {
             p0.r("size");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new ImageMeta$Atlas$TypeAdapter$i(this)).b(p0, p1.mSize);
          }
          if (p1.mMusic != null) {
             p0.r("music");
             TypeAdapters.A.write(p0, p1.mMusic);
          }
          p0.r("volume");
          p0.J((double)p1.mVolume);
          if (p1.mIndices != null) {
             p0.r("indices");
             KnownTypeAdapters$l.b(p0, p1.mIndices);
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
