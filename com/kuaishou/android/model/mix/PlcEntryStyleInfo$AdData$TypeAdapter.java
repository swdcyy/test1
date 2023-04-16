package com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$AdData$TypeAdapter extends TypeAdapter	// class@000d73
{
    public final Gson a;
    public static final a b;

    static {
       PlcEntryStyleInfo$AdData$TypeAdapter.b = a.get(PlcEntryStyleInfo$AdData.class);
    }
    public void PlcEntryStyleInfo$AdData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PlcEntryStyleInfo$AdData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$AdData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$AdData uAdData = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdData;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdData;
       }else {
          p0.c();
          PlcEntryStyleInfo$AdData uAdData1 = new PlcEntryStyleInfo$AdData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9a9f7cf8:
                   if (str.equals("midPageUrl")) {
                      i = 0;
                   }
                   break;
                 case 0xb90d3cea:
                   if (str.equals("enableOpenAppFirstJump")) {
                      i = 1;
                   }
                   break;
                 case 0xc8577f90:
                   if (str.equals("marketUri")) {
                      i = 2;
                   }
                   break;
                 case 0x30ef3fa1:
                   if (str.equals("specializedMidPageUrl")) {
                      i = 3;
                   }
                   break;
                 case 0x3ae384ab:
                   if (str.equals("h5DelayAppLinkMs")) {
                      i = 4;
                   }
                   break;
                 case 0x5084bc6d:
                   if (str.equals("halfLandPage")) {
                      i = 5;
                   }
                   break;
                 case 0x54f1df69:
                   if (str.equals("preDownloadAppStrategy")) {
                      i = 6;
                   }
                   break;
                 case 0x5a320960:
                   if (str.equals("serverExpTag")) {
                      i = 7;
                   }
                   break;
                 case 0x76def025:
                   if (str.equals("h5DelayAppLink")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAdData1.mMidPageUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uAdData1.mEnableOpenAppFirstJump = KnownTypeAdapters$g.a(p0, uAdData1.mEnableOpenAppFirstJump);
                   break;
                 case 2:
                   uAdData1.mMarketUri = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uAdData1.mSpecializedMidPageUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uAdData1.mH5DelayAppLinkMs = KnownTypeAdapters$n.a(p0, uAdData1.mH5DelayAppLinkMs);
                   break;
                 case 5:
                   uAdData1.mHalfLandPage = KnownTypeAdapters$g.a(p0, uAdData1.mHalfLandPage);
                   break;
                 case 6:
                   uAdData1.mPreDownloadAppStrategy = KnownTypeAdapters$k.a(p0, uAdData1.mPreDownloadAppStrategy);
                   break;
                 case 7:
                   uAdData1.mServerExpTag = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uAdData1.mH5DelayAppLink = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdData1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$AdData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$AdData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mMarketUri != null) {
             p0.r("marketUri");
             TypeAdapters.A.write(p0, p1.mMarketUri);
          }
          p0.r("preDownloadAppStrategy");
          p0.K((long)p1.mPreDownloadAppStrategy);
          if (p1.mMidPageUrl != null) {
             p0.r("midPageUrl");
             TypeAdapters.A.write(p0, p1.mMidPageUrl);
          }
          if (p1.mSpecializedMidPageUrl != null) {
             p0.r("specializedMidPageUrl");
             TypeAdapters.A.write(p0, p1.mSpecializedMidPageUrl);
          }
          if (p1.mServerExpTag != null) {
             p0.r("serverExpTag");
             TypeAdapters.A.write(p0, p1.mServerExpTag);
          }
          p0.r("halfLandPage");
          p0.P(p1.mHalfLandPage);
          if (p1.mH5DelayAppLink != null) {
             p0.r("h5DelayAppLink");
             TypeAdapters.A.write(p0, p1.mH5DelayAppLink);
          }
          p0.r("h5DelayAppLinkMs");
          p0.K(p1.mH5DelayAppLinkMs);
          p0.r("enableOpenAppFirstJump");
          p0.P(p1.mEnableOpenAppFirstJump);
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
