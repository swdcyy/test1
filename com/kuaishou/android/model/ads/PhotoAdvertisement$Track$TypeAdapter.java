package com.kuaishou.android.model.ads.PhotoAdvertisement$Track$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$Track$TypeAdapter extends TypeAdapter	// class@000a41
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$Track$TypeAdapter.b = a.get(PhotoAdvertisement$Track.class);
    }
    public void PhotoAdvertisement$Track$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$Track a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$Track$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$Track track = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return track;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return track;
       }else {
          p0.c();
          PhotoAdvertisement$Track track1 = new PhotoAdvertisement$Track();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9a0bc412:
                   if (str.equals("urlOperationType")) {
                      i = 0;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 1;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 2;
                   }
                   break;
                 case 0x448d1669:
                   if (str.equals("requestType")) {
                      i = 3;
                   }
                   break;
                 case 0x5a14e32e:
                   if (str.equals("enableDefaultMacro")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   track1.mUrlOperationType = KnownTypeAdapters$k.a(p0, track1.mUrlOperationType);
                   break;
                 case 1:
                   track1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   track1.mType = KnownTypeAdapters$k.a(p0, track1.mType);
                   break;
                 case 3:
                   track1.mRequestType = KnownTypeAdapters$k.a(p0, track1.mRequestType);
                   break;
                 case 4:
                   track1.mEnableDefaultMacro = KnownTypeAdapters$g.a(p0, track1.mEnableDefaultMacro);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return track1;
       }
    }
    public void b(b p0,PhotoAdvertisement$Track p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$Track$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          p0.r("requestType");
          p0.K((long)p1.mRequestType);
          p0.r("urlOperationType");
          p0.K((long)p1.mUrlOperationType);
          p0.r("enableDefaultMacro");
          p0.P(p1.mEnableDefaultMacro);
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
