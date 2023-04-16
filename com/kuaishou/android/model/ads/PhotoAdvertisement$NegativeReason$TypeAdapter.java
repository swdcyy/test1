package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$NegativeReason$TypeAdapter extends TypeAdapter	// class@0009b1
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$NegativeReason$TypeAdapter.c = a.get(PhotoAdvertisement$NegativeReason.class);
    }
    public void PhotoAdvertisement$NegativeReason$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$NegativeReason a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$NegativeReason$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$NegativeReason negativeReas = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return negativeReas;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return negativeReas;
       }else {
          p0.c();
          PhotoAdvertisement$NegativeReason negativeReas1 = new PhotoAdvertisement$NegativeReason();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x836c5bf8:
                   if (str.equals("subTitle")) {
                      i = 0;
                   }
                   break;
                 case 0xbfc342da:
                   if (str.equals("menuId")) {
                      i = 1;
                   }
                   break;
                 case 0xe0556a79:
                   if (str.equals("subMenuIds")) {
                      i = 2;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   negativeReas1.subTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   negativeReas1.menuId = KnownTypeAdapters$k.a(p0, negativeReas1.menuId);
                   break;
                 case 2:
                   negativeReas1.subMenuIds = this.b.read(p0);
                   break;
                 case 3:
                   negativeReas1.title = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return negativeReas1;
       }
    }
    public void b(b p0,PhotoAdvertisement$NegativeReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$NegativeReason$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("menuId");
          p0.K((long)p1.menuId);
          if (p1.title != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.title);
          }
          if (p1.subTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.subTitle);
          }
          if (p1.subMenuIds != null) {
             p0.r("subMenuIds");
             this.b.write(p0, p1.subMenuIds);
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
