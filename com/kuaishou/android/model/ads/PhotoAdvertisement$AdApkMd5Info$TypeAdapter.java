package com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdApkMd5Info$TypeAdapter extends TypeAdapter	// class@000889
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$AdApkMd5Info$TypeAdapter.c = a.get(PhotoAdvertisement$AdApkMd5Info.class);
    }
    public void PhotoAdvertisement$AdApkMd5Info$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$AdApkMd5Info a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdApkMd5Info$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdApkMd5Info uAdApkMd5Inf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdApkMd5Inf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdApkMd5Inf;
       }else {
          p0.c();
          PhotoAdvertisement$AdApkMd5Info uAdApkMd5Inf1 = new PhotoAdvertisement$AdApkMd5Info();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("apkMd5s")) {
                if (!str.equals("unexpectedMd5Strategy")) {
                   p0.Q();
                }else {
                   uAdApkMd5Inf1.mUnexpectedMd5Strategy = KnownTypeAdapters$k.a(p0, uAdApkMd5Inf1.mUnexpectedMd5Strategy);
                }
             }else {
                uAdApkMd5Inf1.mApkMd5s = this.b.read(p0);
             }
          }
          p0.j();
          return uAdApkMd5Inf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdApkMd5Info p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdApkMd5Info$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("unexpectedMd5Strategy");
          p0.K((long)p1.mUnexpectedMd5Strategy);
          if (p1.mApkMd5s != null) {
             p0.r("apkMd5s");
             this.b.write(p0, p1.mApkMd5s);
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
