package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl;
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

public final class PhotoAdvertisement$CoverUrl$TypeAdapter extends TypeAdapter	// class@000918
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$CoverUrl$TypeAdapter.b = a.get(PhotoAdvertisement$CoverUrl.class);
    }
    public void PhotoAdvertisement$CoverUrl$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$CoverUrl a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CoverUrl$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CoverUrl uCoverUrl = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverUrl;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverUrl;
       }else {
          p0.c();
          PhotoAdvertisement$CoverUrl uCoverUrl1 = new PhotoAdvertisement$CoverUrl();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("url")) {
                p0.Q();
             }else {
                uCoverUrl1.mUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uCoverUrl1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CoverUrl p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CoverUrl$TypeAdapter.class, "1")) {
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
