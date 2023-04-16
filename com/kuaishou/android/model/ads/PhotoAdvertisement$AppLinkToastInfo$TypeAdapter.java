package com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AppLinkToastInfo$TypeAdapter extends TypeAdapter	// class@0008c8
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$AppLinkToastInfo$TypeAdapter.b = a.get(PhotoAdvertisement$AppLinkToastInfo.class);
    }
    public void PhotoAdvertisement$AppLinkToastInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$AppLinkToastInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AppLinkToastInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AppLinkToastInfo uAppLinkToas = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAppLinkToas;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAppLinkToas;
       }else {
          p0.c();
          PhotoAdvertisement$AppLinkToastInfo uAppLinkToas1 = new PhotoAdvertisement$AppLinkToastInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x89444d94:
                   if (str.equals("duration")) {
                      i = 0;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 1;
                   }
                   break;
                 case 0x95b9ee7:
                   if (str.equals("enableShowToast")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAppLinkToas1.mDuration = KnownTypeAdapters$k.a(p0, uAppLinkToas1.mDuration);
                   break;
                 case 1:
                   uAppLinkToas1.mText = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uAppLinkToas1.mEnableShowToast = KnownTypeAdapters$g.a(p0, uAppLinkToas1.mEnableShowToast);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAppLinkToas1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AppLinkToastInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AppLinkToastInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("enableShowToast");
          p0.P(p1.mEnableShowToast);
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          p0.r("duration");
          p0.K((long)p1.mDuration);
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
