package com.kuaishou.android.model.mix.ImageLayoutInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ImageLayoutInfo;
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
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Float;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class ImageLayoutInfo$TypeAdapter extends TypeAdapter	// class@000cb8
{
    public final Gson a;
    public static final a b;

    static {
       ImageLayoutInfo$TypeAdapter.b = a.get(ImageLayoutInfo.class);
    }
    public void ImageLayoutInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public ImageLayoutInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ImageLayoutInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ImageLayoutInfo imageLayoutI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return imageLayoutI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return imageLayoutI;
       }else {
          p0.c();
          ImageLayoutInfo imageLayoutI1 = new ImageLayoutInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x993b4190:
                   if (str.equals("thumbWidth")) {
                      i = 0;
                   }
                   break;
                 case 0xb7389127:
                   if (str.equals("height")) {
                      i = 1;
                   }
                   break;
                 case 0x6be2dc6:
                   if (str.equals("width")) {
                      i = 2;
                   }
                   break;
                 case 0x4cb7f6d5:
                   if (str.equals("backgroundColor")) {
                      i = 3;
                   }
                   break;
                 case 0x745df69d:
                   if (str.equals("thumbHeight")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   imageLayoutI1.setThumbWidth(KnownTypeAdapters.e.read(p0));
                   break;
                 case 1:
                   imageLayoutI1.setHeight(KnownTypeAdapters.e.read(p0));
                   break;
                 case 2:
                   imageLayoutI1.setWidth(KnownTypeAdapters.e.read(p0));
                   break;
                 case 3:
                   imageLayoutI1.setBackgroundColor(TypeAdapters.A.read(p0));
                   break;
                 case 4:
                   imageLayoutI1.setThumbHeight(KnownTypeAdapters.e.read(p0));
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return imageLayoutI1;
       }
    }
    public void b(b p0,ImageLayoutInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageLayoutInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.getBackgroundColor() != null) {
             p0.r("backgroundColor");
             TypeAdapters.A.write(p0, p1.getBackgroundColor());
          }
          if (p1.getWidth() != null) {
             p0.r("width");
             KnownTypeAdapters.e.write(p0, p1.getWidth());
          }
          if (p1.getHeight() != null) {
             p0.r("height");
             KnownTypeAdapters.e.write(p0, p1.getHeight());
          }
          if (p1.getThumbWidth() != null) {
             p0.r("thumbWidth");
             KnownTypeAdapters.e.write(p0, p1.getThumbWidth());
          }
          if (p1.getThumbHeight() != null) {
             p0.r("thumbHeight");
             KnownTypeAdapters.e.write(p0, p1.getThumbHeight());
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
