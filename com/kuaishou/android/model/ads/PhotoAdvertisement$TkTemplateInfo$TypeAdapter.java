package com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
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

public final class PhotoAdvertisement$TkTemplateInfo$TypeAdapter extends TypeAdapter	// class@000a31
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$TkTemplateInfo$TypeAdapter.b = a.get(PhotoAdvertisement$TkTemplateInfo.class);
    }
    public void PhotoAdvertisement$TkTemplateInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$TkTemplateInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TkTemplateInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TkTemplateInfo tkTemplateIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tkTemplateIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tkTemplateIn;
       }else {
          p0.c();
          PhotoAdvertisement$TkTemplateInfo tkTemplateIn1 = new PhotoAdvertisement$TkTemplateInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc2c4cafe:
                   if (str.equals("templateVersion")) {
                      i = 0;
                   }
                   break;
                 case 0xed6b3e0b:
                   if (str.equals("templateVersionCode")) {
                      i = 1;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 2;
                   }
                   break;
                 case 0x697a56a4:
                   if (str.equals("templateMd5")) {
                      i = 3;
                   }
                   break;
                 case 0x697a7695:
                   if (str.equals("templateUrl")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tkTemplateIn1.templateVersion = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   tkTemplateIn1.templateVersionCode = KnownTypeAdapters$k.a(p0, tkTemplateIn1.templateVersionCode);
                   break;
                 case 2:
                   tkTemplateIn1.templateId = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   tkTemplateIn1.templateMd5 = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   tkTemplateIn1.templateUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tkTemplateIn1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TkTemplateInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TkTemplateInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.templateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.templateId);
          }
          if (p1.templateUrl != null) {
             p0.r("templateUrl");
             TypeAdapters.A.write(p0, p1.templateUrl);
          }
          if (p1.templateVersion != null) {
             p0.r("templateVersion");
             TypeAdapters.A.write(p0, p1.templateVersion);
          }
          p0.r("templateVersionCode");
          p0.K((long)p1.templateVersionCode);
          if (p1.templateMd5 != null) {
             p0.r("templateMd5");
             TypeAdapters.A.write(p0, p1.templateMd5);
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
