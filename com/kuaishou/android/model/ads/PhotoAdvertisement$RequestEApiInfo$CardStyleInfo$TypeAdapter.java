package com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$CardStyleInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter extends TypeAdapter	// class@0009f7
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter.b = a.get(PhotoAdvertisement$RequestEApiInfo$CardStyleInfo.class);
    }
    public void PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$RequestEApiInfo$CardStyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$RequestEApiInfo$CardStyleInfo requestEApiI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return requestEApiI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return requestEApiI;
       }else {
          p0.c();
          PhotoAdvertisement$RequestEApiInfo$CardStyleInfo requestEApiI1 = new PhotoAdvertisement$RequestEApiInfo$CardStyleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("animationStyle")) {
                if (!str.equals("templateDelayTime")) {
                   p0.Q();
                }else {
                   requestEApiI1.mTemplateDelayTime = KnownTypeAdapters$n.a(p0, requestEApiI1.mTemplateDelayTime);
                }
             }else {
                requestEApiI1.mAnimationStyle = KnownTypeAdapters$k.a(p0, requestEApiI1.mAnimationStyle);
             }
          }
          p0.j();
          return requestEApiI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$RequestEApiInfo$CardStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("templateDelayTime");
          p0.K(p1.mTemplateDelayTime);
          p0.r("animationStyle");
          p0.K((long)p1.mAnimationStyle);
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
