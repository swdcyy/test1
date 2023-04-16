package com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle;
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

public final class PhotoAdvertisement$WeakStyle$TypeAdapter extends TypeAdapter	// class@000a5e
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$WeakStyle$TypeAdapter.b = a.get(PhotoAdvertisement$WeakStyle.class);
    }
    public void PhotoAdvertisement$WeakStyle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$WeakStyle a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$WeakStyle$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$WeakStyle weakStyle = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return weakStyle;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return weakStyle;
       }else {
          p0.c();
          PhotoAdvertisement$WeakStyle weakStyle1 = new PhotoAdvertisement$WeakStyle();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("pictureUrl")) {
                p0.Q();
             }else {
                weakStyle1.mPictureUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return weakStyle1;
       }
    }
    public void b(b p0,PhotoAdvertisement$WeakStyle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$WeakStyle$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mPictureUrl != null) {
             p0.r("pictureUrl");
             TypeAdapters.A.write(p0, p1.mPictureUrl);
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
