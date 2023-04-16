package com.yxcorp.gifshow.like.resource.LikeResourceStartupCommonPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.like.resource.LikeResourceStartupCommonPojo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.like.resource.LikeActivityResourceConfig;
import com.yxcorp.gifshow.like.resource.SearchLikeResourceConfig;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.Map;
import com.google.gson.stream.b;

public final class LikeResourceStartupCommonPojo$TypeAdapter extends TypeAdapter	// class@001a58
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       LikeResourceStartupCommonPojo$TypeAdapter.e = a.get(LikeResourceStartupCommonPojo.class);
    }
    public void LikeResourceStartupCommonPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(LikeActivityResourceConfig.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, typeAdapter, new KnownTypeAdapters$e());
       this.d = p0.j(a.get(SearchLikeResourceConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LikeResourceStartupCommonPojo$TypeAdapter.class, "2");
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
             obj = new LikeResourceStartupCommonPojo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8d410e12:
                      if (str.equals("atmosphereResourceCache")) {
                         i = 0;
                      }
                      break;
                    case 0xc3f9774a:
                      if (str.equals("feedLikeActivityResourceMap")) {
                         i = 1;
                      }
                      break;
                    case 0xf70caa56:
                      if (str.equals("likeActivityResourceConfig")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mAtmosphereResourceCache = this.d.read(p0);
                      break;
                    case 1:
                      obj.mFeedLikeActivityResourceMap = this.c.read(p0);
                      break;
                    case 2:
                      obj.mLikeActivityResourceConfig = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LikeResourceStartupCommonPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLikeActivityResourceConfig != null) {
             p0.r("likeActivityResourceConfig");
             this.b.write(p0, p1.mLikeActivityResourceConfig);
          }
          if (p1.mFeedLikeActivityResourceMap != null) {
             p0.r("feedLikeActivityResourceMap");
             this.c.write(p0, p1.mFeedLikeActivityResourceMap);
          }
          if (p1.mAtmosphereResourceCache != null) {
             p0.r("atmosphereResourceCache");
             this.d.write(p0, p1.mAtmosphereResourceCache);
          }
          p0.j();
       }
       return;
    }
}
