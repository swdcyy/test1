package com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$VideoClipInfo$TypeAdapter extends TypeAdapter	// class@000a5a
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$VideoClipInfo$TypeAdapter.b = a.get(PhotoAdvertisement$VideoClipInfo.class);
    }
    public void PhotoAdvertisement$VideoClipInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$VideoClipInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$VideoClipInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$VideoClipInfo videoClipInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return videoClipInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return videoClipInf;
       }else {
          p0.c();
          PhotoAdvertisement$VideoClipInfo videoClipInf1 = new PhotoAdvertisement$VideoClipInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("normalPlayerUseAdClipRule")) {
                if (!str.equals("clipType")) {
                   p0.Q();
                }else {
                   videoClipInf1.mClipType = KnownTypeAdapters$k.a(p0, videoClipInf1.mClipType);
                }
             }else {
                videoClipInf1.mNormalPlayerUseAdClipRule = KnownTypeAdapters$g.a(p0, videoClipInf1.mNormalPlayerUseAdClipRule);
             }
          }
          p0.j();
          return videoClipInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$VideoClipInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$VideoClipInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("clipType");
          p0.K((long)p1.mClipType);
          p0.r("normalPlayerUseAdClipRule");
          p0.P(p1.mNormalPlayerUseAdClipRule);
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
