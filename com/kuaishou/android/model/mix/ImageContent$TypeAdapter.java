package com.kuaishou.android.model.mix.ImageContent$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ImageContent;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.UrlInfo$TypeAdapter;
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
import com.google.gson.stream.b;

public final class ImageContent$TypeAdapter extends TypeAdapter	// class@000cb6
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ImageContent$TypeAdapter.d = a.get(ImageContent.class);
    }
    public void ImageContent$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(UrlInfo$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public ImageContent a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ImageContent$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ImageContent imageContent = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return imageContent;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return imageContent;
       }else {
          p0.c();
          ImageContent imageContent1 = new ImageContent();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("bigUrl")) {
                if (!str.equals("smallUrl")) {
                   p0.Q();
                }else {
                   imageContent1.setSmallUrl(this.c.read(p0));
                }
             }else {
                imageContent1.setBigUrl(this.c.read(p0));
             }
          }
          p0.j();
          return imageContent1;
       }
    }
    public void b(b p0,ImageContent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageContent$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.getBigUrl() != null) {
             p0.r("bigUrl");
             this.c.write(p0, p1.getBigUrl());
          }
          if (p1.getSmallUrl() != null) {
             p0.r("smallUrl");
             this.c.write(p0, p1.getSmallUrl());
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
