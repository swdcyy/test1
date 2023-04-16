package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$NegativeMenuInfo$TypeAdapter extends TypeAdapter	// class@0009ad
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PhotoAdvertisement$NegativeMenuInfo$TypeAdapter.f = a.get(PhotoAdvertisement$NegativeMenuInfo.class);
    }
    public void PhotoAdvertisement$NegativeMenuInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$NegativeMenu$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(PhotoAdvertisement$NegativeReason$TypeAdapter.c);
       this.d = typeAdapter1;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$NegativeMenuInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$NegativeMenuInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$NegativeMenuInfo negativeMenu = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return negativeMenu;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return negativeMenu;
       }else {
          p0.c();
          PhotoAdvertisement$NegativeMenuInfo negativeMenu1 = new PhotoAdvertisement$NegativeMenuInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbcba2ff2:
                   if (str.equals("feedNegativeMenu")) {
                      i = 0;
                   }
                   break;
                 case 0xda7df3bf:
                   if (str.equals("negativeMenus")) {
                      i = 1;
                   }
                   break;
                 case 0xdad97a7c:
                   if (str.equals("negativeStyle")) {
                      i = 2;
                   }
                   break;
                 case 0xdae7557e:
                   if (str.equals("feedNegativeStyle")) {
                      i = 3;
                   }
                   break;
                 case 0x3a90ba4a:
                   if (str.equals("thanosDetailNegativeMenu")) {
                      i = 4;
                   }
                   break;
                 case 0x42d6ee25:
                   if (str.equals("detailNegativeMenu")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   negativeMenu1.feedNegativeMenu = this.e.read(p0);
                   break;
                 case 1:
                   negativeMenu1.negativeMenus = this.c.read(p0);
                   break;
                 case 2:
                   negativeMenu1.negativeStyle = KnownTypeAdapters$k.a(p0, negativeMenu1.negativeStyle);
                   break;
                 case 3:
                   negativeMenu1.feedNegativeStyle = KnownTypeAdapters$k.a(p0, negativeMenu1.feedNegativeStyle);
                   break;
                 case 4:
                   negativeMenu1.thanosDetailNegativeMenu = this.e.read(p0);
                   break;
                 case 5:
                   negativeMenu1.detailNegativeMenu = this.e.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return negativeMenu1;
       }
    }
    public void b(b p0,PhotoAdvertisement$NegativeMenuInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$NegativeMenuInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.negativeMenus != null) {
             p0.r("negativeMenus");
             this.c.write(p0, p1.negativeMenus);
          }
          if (p1.feedNegativeMenu != null) {
             p0.r("feedNegativeMenu");
             this.e.write(p0, p1.feedNegativeMenu);
          }
          if (p1.detailNegativeMenu != null) {
             p0.r("detailNegativeMenu");
             this.e.write(p0, p1.detailNegativeMenu);
          }
          if (p1.thanosDetailNegativeMenu != null) {
             p0.r("thanosDetailNegativeMenu");
             this.e.write(p0, p1.thanosDetailNegativeMenu);
          }
          p0.r("negativeStyle");
          p0.K((long)p1.negativeStyle);
          p0.r("feedNegativeStyle");
          p0.K((long)p1.feedNegativeStyle);
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
