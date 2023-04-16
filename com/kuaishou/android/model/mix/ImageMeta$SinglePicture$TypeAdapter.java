package com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
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
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$g;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$j;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$a;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$i;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$h;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$b;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$c;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$d;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$e;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter$f;

public final class ImageMeta$SinglePicture$TypeAdapter extends TypeAdapter	// class@000ce0
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ImageMeta$SinglePicture$TypeAdapter.d = a.get(ImageMeta$SinglePicture.class);
    }
    public void ImageMeta$SinglePicture$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ImageMeta$CDNInfo$TypeAdapter.b);
       this.c = p0.j(ImageMeta$AtlasCoverSize$TypeAdapter.b);
    }
    public ImageMeta$SinglePicture a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ImageMeta$SinglePicture$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ImageMeta$SinglePicture singlePictur = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return singlePictur;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return singlePictur;
       }else {
          p0.c();
          ImageMeta$SinglePicture singlePictur1 = new ImageMeta$SinglePicture();
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
                 case 0x32b09e:
                   if (str.equals("list")) {
                      i = 2;
                   }
                   break;
                 case 0x35e001:
                   if (str.equals("size")) {
                      i = 3;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 4;
                   }
                   break;
                 case 0x636ee25:
                   if (str.equals("music")) {
                      i = 5;
                   }
                   break;
                 case 0x231e9ea1:
                   if (str.equals("_localUrlList")) {
                      i = 6;
                   }
                   break;
                 case 0x25dfc66b:
                   if (str.equals("cdnList")) {
                      i = 7;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   singlePictur1.mMusicCdnList = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ImageMeta$SinglePicture$TypeAdapter$h(this)).a(p0);
                   break;
                 case 1:
                   singlePictur1.mVolume = KnownTypeAdapters$j.a(p0, singlePictur1.mVolume);
                   break;
                 case 2:
                   singlePictur1.mList = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$SinglePicture$TypeAdapter$i(this)).a(p0);
                   break;
                 case 3:
                   singlePictur1.mSize = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new ImageMeta$SinglePicture$TypeAdapter$a(this)).a(p0);
                   break;
                 case 4:
                   singlePictur1.mType = KnownTypeAdapters$k.a(p0, singlePictur1.mType);
                   break;
                 case 5:
                   singlePictur1.mMusic = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   singlePictur1.mLocalUrlList = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$SinglePicture$TypeAdapter$j(this)).a(p0);
                   break;
                 case 7:
                   singlePictur1.mCdnList = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ImageMeta$SinglePicture$TypeAdapter$g(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return singlePictur1;
       }
    }
    public void b(b p0,ImageMeta$SinglePicture p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageMeta$SinglePicture$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mCdnList != null) {
             p0.r("cdnList");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ImageMeta$SinglePicture$TypeAdapter$b(this)).b(p0, p1.mCdnList);
          }
          if (p1.mMusicCdnList != null) {
             p0.r("musicCdnList");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new ImageMeta$SinglePicture$TypeAdapter$c(this)).b(p0, p1.mMusicCdnList);
          }
          if (p1.mList != null) {
             p0.r("list");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$SinglePicture$TypeAdapter$d(this)).b(p0, p1.mList);
          }
          if (p1.mLocalUrlList != null) {
             p0.r("_localUrlList");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new ImageMeta$SinglePicture$TypeAdapter$e(this)).b(p0, p1.mLocalUrlList);
          }
          if (p1.mMusic != null) {
             p0.r("music");
             TypeAdapters.A.write(p0, p1.mMusic);
          }
          p0.r("volume");
          p0.J((double)p1.mVolume);
          if (p1.mSize != null) {
             p0.r("size");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new ImageMeta$SinglePicture$TypeAdapter$f(this)).b(p0, p1.mSize);
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
