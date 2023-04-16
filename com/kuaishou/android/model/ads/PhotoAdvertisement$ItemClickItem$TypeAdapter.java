package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ItemClickItem$TypeAdapter extends TypeAdapter	// class@000978
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$ItemClickItem$TypeAdapter.d = a.get(PhotoAdvertisement$ItemClickItem.class);
    }
    public void PhotoAdvertisement$ItemClickItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
       this.c = p0.j(PhotoAdvertisement$ItemClickUrl$TypeAdapter.d);
    }
    public PhotoAdvertisement$ItemClickItem a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ItemClickItem$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ItemClickItem itemClickIte = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return itemClickIte;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return itemClickIte;
       }else {
          p0.c();
          PhotoAdvertisement$ItemClickItem itemClickIte1 = new PhotoAdvertisement$ItemClickItem();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("itemClickUrl")) {
                if (!str.equals("itemClickTypes")) {
                   p0.Q();
                }else {
                   itemClickIte1.mItemClickTypeList = this.b.read(p0);
                }
             }else {
                itemClickIte1.mItemClickUrl = this.c.read(p0);
             }
          }
          p0.j();
          return itemClickIte1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ItemClickItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ItemClickItem$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mItemClickTypeList != null) {
             p0.r("itemClickTypes");
             this.b.write(p0, p1.mItemClickTypeList);
          }
          if (p1.mItemClickUrl != null) {
             p0.r("itemClickUrl");
             this.c.write(p0, p1.mItemClickUrl);
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
