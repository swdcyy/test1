package com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo;
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
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdSurveyInfo$TypeAdapter extends TypeAdapter	// class@0008b4
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$AdSurveyInfo$TypeAdapter.b = a.get(PhotoAdvertisement$AdSurveyInfo.class);
    }
    public void PhotoAdvertisement$AdSurveyInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$AdSurveyInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdSurveyInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdSurveyInfo uAdSurveyInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdSurveyInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdSurveyInf;
       }else {
          p0.c();
          PhotoAdvertisement$AdSurveyInfo uAdSurveyInf1 = new PhotoAdvertisement$AdSurveyInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("frequencyType")) {
                if (!str.equals("templateId")) {
                   p0.Q();
                }else {
                   uAdSurveyInf1.mTemplateId = TypeAdapters.A.read(p0);
                }
             }else {
                uAdSurveyInf1.mFrequencyType = KnownTypeAdapters$k.a(p0, uAdSurveyInf1.mFrequencyType);
             }
          }
          p0.j();
          return uAdSurveyInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdSurveyInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdSurveyInfo$TypeAdapter.class, "1")) {
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
          p0.r("frequencyType");
          p0.K((long)p1.mFrequencyType);
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
