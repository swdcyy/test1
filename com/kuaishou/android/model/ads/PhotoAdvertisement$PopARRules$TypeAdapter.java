package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules;
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

public final class PhotoAdvertisement$PopARRules$TypeAdapter extends TypeAdapter	// class@0009d1
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$PopARRules$TypeAdapter.b = a.get(PhotoAdvertisement$PopARRules.class);
    }
    public void PhotoAdvertisement$PopARRules$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$PopARRules a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PopARRules$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PopARRules popARRules = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return popARRules;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return popARRules;
       }else {
          p0.c();
          PhotoAdvertisement$PopARRules popARRules1 = new PhotoAdvertisement$PopARRules();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("title")) {
                if (!str.equals("content")) {
                   p0.Q();
                }else {
                   popARRules1.mContent = TypeAdapters.A.read(p0);
                }
             }else {
                popARRules1.mTitle = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return popARRules1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PopARRules p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PopARRules$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
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
