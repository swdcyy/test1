package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CoverItem$TypeAdapter extends TypeAdapter	// class@000904
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$CoverItem$TypeAdapter.b = a.get(PhotoAdvertisement$CoverItem.class);
    }
    public void PhotoAdvertisement$CoverItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$CoverItem a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CoverItem$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CoverItem uCoverItem = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverItem;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverItem;
       }else {
          p0.c();
          PhotoAdvertisement$CoverItem uCoverItem1 = new PhotoAdvertisement$CoverItem();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("url")) {
                p0.Q();
             }else {
                uCoverItem1.mUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uCoverItem1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CoverItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CoverItem$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
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
