package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink;
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

public final class PhotoAdvertisement$HalfPrivacyLink$TypeAdapter extends TypeAdapter	// class@000954
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$HalfPrivacyLink$TypeAdapter.b = a.get(PhotoAdvertisement$HalfPrivacyLink.class);
    }
    public void PhotoAdvertisement$HalfPrivacyLink$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$HalfPrivacyLink a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$HalfPrivacyLink$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$HalfPrivacyLink halfPrivacyL = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return halfPrivacyL;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return halfPrivacyL;
       }else {
          p0.c();
          PhotoAdvertisement$HalfPrivacyLink halfPrivacyL1 = new PhotoAdvertisement$HalfPrivacyLink();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("linkUrl")) {
                if (!str.equals("linkText")) {
                   p0.Q();
                }else {
                   halfPrivacyL1.mLinkText = TypeAdapters.A.read(p0);
                }
             }else {
                halfPrivacyL1.mLinkUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return halfPrivacyL1;
       }
    }
    public void b(b p0,PhotoAdvertisement$HalfPrivacyLink p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$HalfPrivacyLink$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLinkText != null) {
             p0.r("linkText");
             TypeAdapters.A.write(p0, p1.mLinkText);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
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
