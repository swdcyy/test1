package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter extends TypeAdapter	// class@000899
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter.b = a.get(PhotoAdvertisement$AdCardTemplateInfo.class);
    }
    public void PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$AdCardTemplateInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdCardTemplateInfo uAdCardTempl = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdCardTempl;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdCardTempl;
       }else {
          p0.c();
          PhotoAdvertisement$AdCardTemplateInfo uAdCardTempl1 = new PhotoAdvertisement$AdCardTemplateInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa915a48d:
                   if (str.equals("animationStyle")) {
                      i = 0;
                   }
                   break;
                 case 0xd89e1c97:
                   if (str.equals("defaultTitle")) {
                      i = 1;
                   }
                   break;
                 case 0xd921f8b5:
                   if (str.equals("defaultIconUrl")) {
                      i = 2;
                   }
                   break;
                 case 0xfd987f21:
                   if (str.equals("useTemplate")) {
                      i = 3;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 4;
                   }
                   break;
                 case 0x6a833ff4:
                   if (str.equals("defaultActionbarTxt")) {
                      i = 5;
                   }
                   break;
                 case 0x6b3e7c9d:
                   if (str.equals("defaultBgColor")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAdCardTempl1.mAnimationStyle = KnownTypeAdapters$k.a(p0, uAdCardTempl1.mAnimationStyle);
                   break;
                 case 1:
                   uAdCardTempl1.mDefaultTitle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uAdCardTempl1.mDefaultIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uAdCardTempl1.mUseTemplate = KnownTypeAdapters$g.a(p0, uAdCardTempl1.mUseTemplate);
                   break;
                 case 4:
                   uAdCardTempl1.mTemplateId = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uAdCardTempl1.mDefaultActionbarTxt = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uAdCardTempl1.mDefaultBgColor = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdCardTempl1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdCardTemplateInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("useTemplate");
          p0.P(p1.mUseTemplate);
          if (p1.mTemplateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.mTemplateId);
          }
          p0.r("animationStyle");
          p0.K((long)p1.mAnimationStyle);
          if (p1.mDefaultIconUrl != null) {
             p0.r("defaultIconUrl");
             TypeAdapters.A.write(p0, p1.mDefaultIconUrl);
          }
          if (p1.mDefaultBgColor != null) {
             p0.r("defaultBgColor");
             TypeAdapters.A.write(p0, p1.mDefaultBgColor);
          }
          if (p1.mDefaultTitle != null) {
             p0.r("defaultTitle");
             TypeAdapters.A.write(p0, p1.mDefaultTitle);
          }
          if (p1.mDefaultActionbarTxt != null) {
             p0.r("defaultActionbarTxt");
             TypeAdapters.A.write(p0, p1.mDefaultActionbarTxt);
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
