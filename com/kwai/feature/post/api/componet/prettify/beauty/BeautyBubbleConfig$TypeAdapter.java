package com.kwai.feature.post.api.componet.prettify.beauty.BeautyBubbleConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyBubbleConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class BeautyBubbleConfig$TypeAdapter extends TypeAdapter	// class@0012d4
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       BeautyBubbleConfig$TypeAdapter.d = a.get(BeautyBubbleConfig.class);
    }
    public void BeautyBubbleConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BeautyBubbleConfig$TypeAdapter.class, "2");
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
             obj = new BeautyBubbleConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x836c5bf8:
                      if (str.equals("subTitle")) {
                         i = 0;
                      }
                      break;
                    case 0xf069d81f:
                      if (str.equals("mainTitle")) {
                         i = 1;
                      }
                      break;
                    case 0x594f13e:
                      if (str.equals("bgImg")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubTitle = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mMainTitle = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mBubbleImageUrls = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautyBubbleConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mMainTitle != null) {
             p0.r("mainTitle");
             TypeAdapters.A.write(p0, p1.mMainTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mBubbleImageUrls != null) {
             p0.r("bgImg");
             this.c.write(p0, p1.mBubbleImageUrls);
          }
          p0.j();
       }
       return;
    }
}
