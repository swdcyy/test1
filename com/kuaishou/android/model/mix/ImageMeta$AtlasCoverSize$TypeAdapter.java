package com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.stream.b;

public final class ImageMeta$AtlasCoverSize$TypeAdapter extends TypeAdapter	// class@000cce
{
    public final Gson a;
    public static final a b;

    static {
       ImageMeta$AtlasCoverSize$TypeAdapter.b = a.get(ImageMeta$AtlasCoverSize.class);
    }
    public void ImageMeta$AtlasCoverSize$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public ImageMeta$AtlasCoverSize a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ImageMeta$AtlasCoverSize$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ImageMeta$AtlasCoverSize uAtlasCoverS = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAtlasCoverS;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAtlasCoverS;
       }else {
          p0.c();
          ImageMeta$AtlasCoverSize uAtlasCoverS1 = new ImageMeta$AtlasCoverSize();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("h")) {
                if (!str.equals("w")) {
                   p0.Q();
                }else {
                   uAtlasCoverS1.mWidth = KnownTypeAdapters$j.a(p0, uAtlasCoverS1.mWidth);
                }
             }else {
                uAtlasCoverS1.mHeight = KnownTypeAdapters$j.a(p0, uAtlasCoverS1.mHeight);
             }
          }
          p0.j();
          return uAtlasCoverS1;
       }
    }
    public void b(b p0,ImageMeta$AtlasCoverSize p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageMeta$AtlasCoverSize$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("w");
          p0.J((double)p1.mWidth);
          p0.r("h");
          p0.J((double)p1.mHeight);
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
