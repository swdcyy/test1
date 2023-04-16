package com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction;
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

public final class PhotoAdvertisement$TrackStringAction$TypeAdapter extends TypeAdapter	// class@000a45
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$TrackStringAction$TypeAdapter.b = a.get(PhotoAdvertisement$TrackStringAction.class);
    }
    public void PhotoAdvertisement$TrackStringAction$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$TrackStringAction a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TrackStringAction$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TrackStringAction trackStringA = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return trackStringA;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return trackStringA;
       }else {
          p0.c();
          PhotoAdvertisement$TrackStringAction trackStringA1 = new PhotoAdvertisement$TrackStringAction();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("url")) {
                if (!str.equals("type")) {
                   p0.Q();
                }else {
                   trackStringA1.mType = TypeAdapters.A.read(p0);
                }
             }else {
                trackStringA1.mUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return trackStringA1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TrackStringAction p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TrackStringAction$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mType != null) {
             p0.r("type");
             TypeAdapters.A.write(p0, p1.mType);
          }
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
