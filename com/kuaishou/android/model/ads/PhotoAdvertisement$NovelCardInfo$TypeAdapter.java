package com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo;
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

public final class PhotoAdvertisement$NovelCardInfo$TypeAdapter extends TypeAdapter	// class@0009b9
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$NovelCardInfo$TypeAdapter.b = a.get(PhotoAdvertisement$NovelCardInfo.class);
    }
    public void PhotoAdvertisement$NovelCardInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$NovelCardInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$NovelCardInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$NovelCardInfo novelCardInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return novelCardInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return novelCardInf;
       }else {
          p0.c();
          PhotoAdvertisement$NovelCardInfo novelCardInf1 = new PhotoAdvertisement$NovelCardInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("templateId")) {
                p0.Q();
             }else {
                novelCardInf1.mTemplateId = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return novelCardInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$NovelCardInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$NovelCardInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTemplateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.mTemplateId);
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
