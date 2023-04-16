package com.yxcorp.gifshow.tube.TubeEpisodeInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.tube.TubeContentTag;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import ilc.n;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$n;
import ilc.o;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;
import ilc.l;
import ilc.m;

public final class TubeEpisodeInfo$TypeAdapter extends TypeAdapter	// class@001e13
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       TubeEpisodeInfo$TypeAdapter.d = a.get(TubeEpisodeInfo.class);
    }
    public void TubeEpisodeInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       this.c = p0.j(a.get(TubeContentTag.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TubeEpisodeInfo$TypeAdapter.class, "2");
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
             obj = new TubeEpisodeInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8e69dd24:
                      if (str.equals("episodeNumber")) {
                         i = 0;
                      }
                      break;
                    case 0xcacdcff2:
                      if (str.equals("status")) {
                         i = 1;
                      }
                      break;
                    case 0xd13086cf:
                      if (str.equals("overrideCoverUrls")) {
                         i = 2;
                      }
                      break;
                    case 0xd4ffe09e:
                      if (str.equals("lastSeenTime")) {
                         i = 3;
                      }
                      break;
                    case 0xdc8482ed:
                      if (str.equals("photoId")) {
                         i = 4;
                      }
                      break;
                    case 0xe527e980:
                      if (str.equals("episodeCoverUrls")) {
                         i = 5;
                      }
                      break;
                    case 0x19f85:
                      if (str.equals("koi")) {
                         i = 6;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 7;
                      }
                      break;
                    case 0x60cc839f:
                      if (str.equals("episodeTag")) {
                         i = 8;
                      }
                      break;
                    case 0x7af8879e:
                      if (str.equals("episodeActionUrl")) {
                         i = 9;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEpisodeNumber = KnownTypeAdapters$n.a(p0, obj.mEpisodeNumber);
                      break;
                    case 1:
                      obj.status = KnownTypeAdapters$k.a(p0, obj.status);
                      break;
                    case 2:
                      obj.mOverrideCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new o(this)).a(p0);
                      break;
                    case 3:
                      obj.lastSeenTime = KnownTypeAdapters$n.a(p0, obj.lastSeenTime);
                      break;
                    case 4:
                      obj.mPhotoId = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new n(this)).a(p0);
                      break;
                    case 6:
                      obj.mKoi = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mEpisodeName = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mEpisodeTag = this.c.read(p0);
                      break;
                    case 9:
                      obj.mEpisodeActionUrl = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TubeEpisodeInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mEpisodeName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mEpisodeName);
          }
          p0.r("episodeNumber");
          p0.K(p1.mEpisodeNumber);
          if (p1.mPhotoId != null) {
             p0.r("photoId");
             TypeAdapters.A.write(p0, p1.mPhotoId);
          }
          if (p1.mCoverUrls != null) {
             p0.r("episodeCoverUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new l(this)).b(p0, p1.mCoverUrls);
          }
          if (p1.mOverrideCoverUrls != null) {
             p0.r("overrideCoverUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new m(this)).b(p0, p1.mOverrideCoverUrls);
          }
          p0.r("lastSeenTime");
          p0.K(p1.lastSeenTime);
          if (p1.mKoi != null) {
             p0.r("koi");
             TypeAdapters.A.write(p0, p1.mKoi);
          }
          p0.r("status");
          p0.K((long)p1.status);
          if (p1.mEpisodeActionUrl != null) {
             p0.r("episodeActionUrl");
             TypeAdapters.A.write(p0, p1.mEpisodeActionUrl);
          }
          if (p1.mEpisodeTag != null) {
             p0.r("episodeTag");
             this.c.write(p0, p1.mEpisodeTag);
          }
          p0.j();
       }
       return;
    }
}
