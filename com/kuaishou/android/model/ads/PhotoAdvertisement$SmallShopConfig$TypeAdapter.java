package com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product$TypeAdapter;
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

public final class PhotoAdvertisement$SmallShopConfig$TypeAdapter extends TypeAdapter	// class@000a1f
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$SmallShopConfig$TypeAdapter.d = a.get(PhotoAdvertisement$SmallShopConfig.class);
    }
    public void PhotoAdvertisement$SmallShopConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$Product$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$SmallShopConfig a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$SmallShopConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$SmallShopConfig smallShopCon = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return smallShopCon;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return smallShopCon;
       }else {
          p0.c();
          PhotoAdvertisement$SmallShopConfig smallShopCon1 = new PhotoAdvertisement$SmallShopConfig();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("products")) {
                p0.Q();
             }else {
                smallShopCon1.products = this.c.read(p0);
             }
          }
          p0.j();
          return smallShopCon1;
       }
    }
    public void b(b p0,PhotoAdvertisement$SmallShopConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$SmallShopConfig$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.products != null) {
             p0.r("products");
             this.c.write(p0, p1.products);
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
