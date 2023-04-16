package com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping;
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

public final class PhotoAdvertisement$HintMapping$TypeAdapter extends TypeAdapter	// class@00095c
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$HintMapping$TypeAdapter.b = a.get(PhotoAdvertisement$HintMapping.class);
    }
    public void PhotoAdvertisement$HintMapping$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$HintMapping a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$HintMapping$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$HintMapping hintMapping = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return hintMapping;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return hintMapping;
       }else {
          p0.c();
          PhotoAdvertisement$HintMapping hintMapping1 = new PhotoAdvertisement$HintMapping();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("click")) {
                if (!str.equals("placeholder")) {
                   p0.Q();
                }else {
                   hintMapping1.mPlaceholder = TypeAdapters.A.read(p0);
                }
             }else {
                hintMapping1.mClick = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return hintMapping1;
       }
    }
    public void b(b p0,PhotoAdvertisement$HintMapping p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$HintMapping$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mPlaceholder != null) {
             p0.r("placeholder");
             TypeAdapters.A.write(p0, p1.mPlaceholder);
          }
          if (p1.mClick != null) {
             p0.r("click");
             TypeAdapters.A.write(p0, p1.mClick);
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
