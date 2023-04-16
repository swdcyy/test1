package com.kuaishou.android.model.mix.ImageMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.google.gson.stream.b;

public final class ImageMeta$TypeAdapter extends TypeAdapter	// class@000ce2
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ImageMeta$TypeAdapter.d = a.get(ImageMeta.class);
    }
    public void ImageMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ImageMeta$Atlas$TypeAdapter.d);
       this.c = p0.j(ImageMeta$SinglePicture$TypeAdapter.d);
    }
    public ImageMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ImageMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ImageMeta imageMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return imageMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return imageMeta;
       }else {
          p0.c();
          ImageMeta imageMeta1 = new ImageMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("single")) {
                if (!str.equals("atlas")) {
                   p0.Q();
                }else {
                   imageMeta1.mAtlas = this.b.read(p0);
                }
             }else {
                imageMeta1.mSinglePicture = this.c.read(p0);
             }
          }
          p0.j();
          return imageMeta1;
       }
    }
    public void b(b p0,ImageMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAtlas != null) {
             p0.r("atlas");
             this.b.write(p0, p1.mAtlas);
          }
          if (p1.mSinglePicture != null) {
             p0.r("single");
             this.c.write(p0, p1.mSinglePicture);
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
