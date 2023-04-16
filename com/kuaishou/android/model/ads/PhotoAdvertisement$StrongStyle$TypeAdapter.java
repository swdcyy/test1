package com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle;
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

public final class PhotoAdvertisement$StrongStyle$TypeAdapter extends TypeAdapter	// class@000a23
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$StrongStyle$TypeAdapter.b = a.get(PhotoAdvertisement$StrongStyle.class);
    }
    public void PhotoAdvertisement$StrongStyle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$StrongStyle a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$StrongStyle$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$StrongStyle strongStyle = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return strongStyle;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return strongStyle;
       }else {
          p0.c();
          PhotoAdvertisement$StrongStyle strongStyle1 = new PhotoAdvertisement$StrongStyle();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("pictureUrl")) {
                p0.Q();
             }else {
                strongStyle1.mPictureUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return strongStyle1;
       }
    }
    public void b(b p0,PhotoAdvertisement$StrongStyle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$StrongStyle$TypeAdapter.class, "1")) {
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
