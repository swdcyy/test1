package com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink;
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

public final class PhotoAdvertisement$AppInfoLink$TypeAdapter extends TypeAdapter	// class@0008c4
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$AppInfoLink$TypeAdapter.b = a.get(PhotoAdvertisement$AppInfoLink.class);
    }
    public void PhotoAdvertisement$AppInfoLink$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$AppInfoLink a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AppInfoLink$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AppInfoLink uAppInfoLink = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAppInfoLink;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAppInfoLink;
       }else {
          p0.c();
          PhotoAdvertisement$AppInfoLink uAppInfoLink1 = new PhotoAdvertisement$AppInfoLink();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("linkUrl")) {
                if (!str.equals("linkText")) {
                   p0.Q();
                }else {
                   uAppInfoLink1.mLinkText = TypeAdapters.A.read(p0);
                }
             }else {
                uAppInfoLink1.mLinkUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uAppInfoLink1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AppInfoLink p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AppInfoLink$TypeAdapter.class, "1")) {
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
