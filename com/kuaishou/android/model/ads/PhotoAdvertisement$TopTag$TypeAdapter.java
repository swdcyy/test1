package com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag;
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

public final class PhotoAdvertisement$TopTag$TypeAdapter extends TypeAdapter	// class@000a39
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$TopTag$TypeAdapter.b = a.get(PhotoAdvertisement$TopTag.class);
    }
    public void PhotoAdvertisement$TopTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$TopTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TopTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TopTag topTag = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return topTag;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return topTag;
       }else {
          p0.c();
          PhotoAdvertisement$TopTag topTag1 = new PhotoAdvertisement$TopTag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("text")) {
                p0.Q();
             }else {
                topTag1.mText = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return topTag1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TopTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TopTag$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
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
