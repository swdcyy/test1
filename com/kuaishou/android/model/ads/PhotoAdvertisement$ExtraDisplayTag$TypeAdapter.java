package com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ExtraDisplayTag$TypeAdapter extends TypeAdapter	// class@00092c
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$ExtraDisplayTag$TypeAdapter.b = a.get(PhotoAdvertisement$ExtraDisplayTag.class);
    }
    public void PhotoAdvertisement$ExtraDisplayTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$ExtraDisplayTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ExtraDisplayTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ExtraDisplayTag uExtraDispla = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uExtraDispla;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uExtraDispla;
       }else {
          p0.c();
          PhotoAdvertisement$ExtraDisplayTag uExtraDispla1 = new PhotoAdvertisement$ExtraDisplayTag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xf6e8b798:
                   if (str.equals("canClick")) {
                      i = 0;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 1;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uExtraDispla1.mCanClick = KnownTypeAdapters$g.a(p0, uExtraDispla1.mCanClick);
                   break;
                 case 1:
                   uExtraDispla1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uExtraDispla1.mText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uExtraDispla1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ExtraDisplayTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ExtraDisplayTag$TypeAdapter.class, "1")) {
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
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          p0.r("canClick");
          p0.P(p1.mCanClick);
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
