package com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRankType;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.Map;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdRerankInfo$TypeAdapter extends TypeAdapter	// class@0008b0
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$AdRerankInfo$TypeAdapter.d = a.get(PhotoAdvertisement$AdRerankInfo.class);
    }
    public void PhotoAdvertisement$AdRerankInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(PhotoAdvertisement$AdRankType.class));
       this.c = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, KnownTypeAdapters.c, new KnownTypeAdapters$e());
    }
    public PhotoAdvertisement$AdRerankInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdRerankInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdRerankInfo uAdRerankInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdRerankInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdRerankInf;
       }else {
          p0.c();
          PhotoAdvertisement$AdRerankInfo uAdRerankInf1 = new PhotoAdvertisement$AdRerankInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xeb2744f7:
                   if (str.equals("rerankAdSourceType")) {
                      i = 0;
                   }
                   break;
                 case 0x524f00a9:
                   if (str.equals("adRerankAvoidMap")) {
                      i = 1;
                   }
                   break;
                 case 0x56f784b9:
                   if (str.equals("rerankType")) {
                      i = 2;
                   }
                   break;
                 case 0x61feaab4:
                   if (str.equals("adRerankTimeInterval")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAdRerankInf1.mSourceType = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uAdRerankInf1.mAvoidMap = this.c.read(p0);
                   break;
                 case 2:
                   uAdRerankInf1.mRankType = this.b.read(p0);
                   break;
                 case 3:
                   uAdRerankInf1.mTimeInterval = KnownTypeAdapters$n.a(p0, uAdRerankInf1.mTimeInterval);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdRerankInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdRerankInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdRerankInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mRankType != null) {
             p0.r("rerankType");
             this.b.write(p0, p1.mRankType);
          }
          p0.r("adRerankTimeInterval");
          p0.K(p1.mTimeInterval);
          if (p1.mSourceType != null) {
             p0.r("rerankAdSourceType");
             TypeAdapters.A.write(p0, p1.mSourceType);
          }
          if (p1.mAvoidMap != null) {
             p0.r("adRerankAvoidMap");
             this.c.write(p0, p1.mAvoidMap);
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
