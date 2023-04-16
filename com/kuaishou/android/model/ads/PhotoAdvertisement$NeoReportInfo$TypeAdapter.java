package com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
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
import com.google.gson.stream.b;

public final class PhotoAdvertisement$NeoReportInfo$TypeAdapter extends TypeAdapter	// class@0009b5
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$NeoReportInfo$TypeAdapter.b = a.get(PhotoAdvertisement$NeoReportInfo.class);
    }
    public void PhotoAdvertisement$NeoReportInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$NeoReportInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$NeoReportInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$NeoReportInfo neoReportInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return neoReportInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return neoReportInf;
       }else {
          p0.c();
          PhotoAdvertisement$NeoReportInfo neoReportInf1 = new PhotoAdvertisement$NeoReportInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("type")) {
                p0.Q();
             }else {
                neoReportInf1.mType = KnownTypeAdapters$k.a(p0, neoReportInf1.mType);
             }
          }
          p0.j();
          return neoReportInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$NeoReportInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$NeoReportInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
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
