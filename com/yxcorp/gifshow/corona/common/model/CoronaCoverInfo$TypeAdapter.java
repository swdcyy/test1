package com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import jq9.l;
import com.vimeo.stag.KnownTypeAdapters$f;
import jq9.m;
import com.google.gson.stream.b;
import jq9.j;
import jq9.k;

public final class CoronaCoverInfo$TypeAdapter extends TypeAdapter	// class@00120f
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CoronaCoverInfo$TypeAdapter.c = a.get(CoronaCoverInfo.class);
    }
    public void CoronaCoverInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoronaCoverInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new CoronaCoverInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("photoPlayingCover")) {
                   if (!str1.equals("photoStaticCover")) {
                      p0.Q();
                   }else {
                      obj.mPhotoStaticCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new l(this)).a(p0);
                   }
                }else {
                   obj.mPhotoPlayingCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new m(this)).a(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaCoverInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPhotoStaticCoverUrls != null) {
             p0.r("photoStaticCover");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new j(this)).b(p0, p1.mPhotoStaticCoverUrls);
          }
          if (p1.mPhotoPlayingCoverUrls != null) {
             p0.r("photoPlayingCover");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new k(this)).b(p0, p1.mPhotoPlayingCoverUrls);
          }
          p0.j();
       }
       return;
    }
}
