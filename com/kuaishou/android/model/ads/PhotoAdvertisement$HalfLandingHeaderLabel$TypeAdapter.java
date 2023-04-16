package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel;
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

public final class PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter extends TypeAdapter	// class@000948
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter.b = a.get(PhotoAdvertisement$HalfLandingHeaderLabel.class);
    }
    public void PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$HalfLandingHeaderLabel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$HalfLandingHeaderLabel halfLandingH = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return halfLandingH;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return halfLandingH;
       }else {
          p0.c();
          PhotoAdvertisement$HalfLandingHeaderLabel halfLandingH1 = new PhotoAdvertisement$HalfLandingHeaderLabel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("text")) {
                p0.Q();
             }else {
                halfLandingH1.mText = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return halfLandingH1;
       }
    }
    public void b(b p0,PhotoAdvertisement$HalfLandingHeaderLabel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter.class, "1")) {
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
