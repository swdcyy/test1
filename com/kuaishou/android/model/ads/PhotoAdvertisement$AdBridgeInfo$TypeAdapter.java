package com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.Map;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdBridgeInfo$TypeAdapter extends TypeAdapter	// class@000891
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$AdBridgeInfo$TypeAdapter.c = a.get(PhotoAdvertisement$AdBridgeInfo.class);
    }
    public void PhotoAdvertisement$AdBridgeInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.e, new KnownTypeAdapters$e());
    }
    public PhotoAdvertisement$AdBridgeInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdBridgeInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdBridgeInfo uAdBridgeInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdBridgeInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdBridgeInf;
       }else {
          p0.c();
          PhotoAdvertisement$AdBridgeInfo uAdBridgeInf1 = new PhotoAdvertisement$AdBridgeInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("kwaiAdThirdBlockList")) {
                p0.Q();
             }else {
                uAdBridgeInf1.mAdThirdBridgeBlockList = this.b.read(p0);
             }
          }
          p0.j();
          return uAdBridgeInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdBridgeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdBridgeInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAdThirdBridgeBlockList != null) {
             p0.r("kwaiAdThirdBlockList");
             this.b.write(p0, p1.mAdThirdBridgeBlockList);
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
