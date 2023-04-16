package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$NegativeMenu$TypeAdapter extends TypeAdapter	// class@0009a9
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$NegativeMenu$TypeAdapter.b = a.get(PhotoAdvertisement$NegativeMenu.class);
    }
    public void PhotoAdvertisement$NegativeMenu$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$NegativeMenu a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$NegativeMenu$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$NegativeMenu negativeMenu = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return negativeMenu;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return negativeMenu;
       }else {
          p0.c();
          PhotoAdvertisement$NegativeMenu negativeMenu1 = new PhotoAdvertisement$NegativeMenu();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 3355:
                   if (str.equals("id")) {
                      i = 0;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 1;
                   }
                   break;
                 case 0x2efe91:
                   if (str.equals("desc")) {
                      i = 2;
                   }
                   break;
                 case 0x313c79:
                   if (str.equals("icon")) {
                      i = 3;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 4;
                   }
                   break;
                 case 0x1793ed0f:
                   if (str.equals("negativeType")) {
                      i = 5;
                   }
                   break;
                 case 0x3061e9de:
                   if (str.equals("clickAction")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   negativeMenu1.id = KnownTypeAdapters$k.a(p0, negativeMenu1.id);
                   break;
                 case 1:
                   negativeMenu1.url = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   negativeMenu1.desc = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   negativeMenu1.icon = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   negativeMenu1.name = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   negativeMenu1.negativeType = KnownTypeAdapters$k.a(p0, negativeMenu1.negativeType);
                   break;
                 case 6:
                   negativeMenu1.clickAction = KnownTypeAdapters$k.a(p0, negativeMenu1.clickAction);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return negativeMenu1;
       }
    }
    public void b(b p0,PhotoAdvertisement$NegativeMenu p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$NegativeMenu$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("id");
          p0.K((long)p1.id);
          p0.r("negativeType");
          p0.K((long)p1.negativeType);
          if (p1.name != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.name);
          }
          if (p1.desc != null) {
             p0.r("desc");
             TypeAdapters.A.write(p0, p1.desc);
          }
          p0.r("clickAction");
          p0.K((long)p1.clickAction);
          if (p1.url != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.url);
          }
          if (p1.icon != null) {
             p0.r("icon");
             TypeAdapters.A.write(p0, p1.icon);
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
