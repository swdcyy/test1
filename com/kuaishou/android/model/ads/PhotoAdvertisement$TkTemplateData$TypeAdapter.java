package com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$TkTemplateData$TypeAdapter extends TypeAdapter	// class@000a2f
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$TkTemplateData$TypeAdapter.b = a.get(PhotoAdvertisement$TkTemplateData.class);
    }
    public void PhotoAdvertisement$TkTemplateData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$TkTemplateData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TkTemplateData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TkTemplateData tkTemplateDa = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tkTemplateDa;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tkTemplateDa;
       }else {
          p0.c();
          PhotoAdvertisement$TkTemplateData tkTemplateDa1 = new PhotoAdvertisement$TkTemplateData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xe9171068:
                   if (str.equals("resourceType")) {
                      i = 0;
                   }
                   break;
                 case 0xf60e221a:
                   if (str.equals("cardDelayReplay")) {
                      i = 1;
                   }
                   break;
                 case 0xf7f3f204:
                   if (str.equals("templateShowTime")) {
                      i = 2;
                   }
                   break;
                 case 0xff82766a:
                   if (str.equals("cardType")) {
                      i = 3;
                   }
                   break;
                 case 0x2eefaa:
                   if (str.equals("data")) {
                      i = 4;
                   }
                   break;
                 case 0x1b3b6efa:
                   if (str.equals("showControlType")) {
                      i = 5;
                   }
                   break;
                 case 0x2a133a97:
                   if (str.equals("displayLocation")) {
                      i = 6;
                   }
                   break;
                 case 0x3ed60ed7:
                   if (str.equals("actionBarType")) {
                      i = 7;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 8;
                   }
                   break;
                 case 0x5ca6c396:
                   if (str.equals("templateDelayTime")) {
                      i = 9;
                   }
                   break;
                 case 0x6b9ae08b:
                   if (str.equals("styleType")) {
                      i = 10;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tkTemplateDa1.mResourceType = KnownTypeAdapters$k.a(p0, tkTemplateDa1.mResourceType);
                   break;
                 case 1:
                   tkTemplateDa1.mCardDelayReplay = KnownTypeAdapters$g.a(p0, tkTemplateDa1.mCardDelayReplay);
                   break;
                 case 2:
                   tkTemplateDa1.mTemplateShowTime = KnownTypeAdapters$n.a(p0, tkTemplateDa1.mTemplateShowTime);
                   break;
                 case 3:
                   tkTemplateDa1.mCardType = KnownTypeAdapters$k.a(p0, tkTemplateDa1.mCardType);
                   break;
                 case 4:
                   tkTemplateDa1.mData = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   tkTemplateDa1.mShowControlType = KnownTypeAdapters$k.a(p0, tkTemplateDa1.mShowControlType);
                   break;
                 case 6:
                   tkTemplateDa1.mDisplayLocation = KnownTypeAdapters$k.a(p0, tkTemplateDa1.mDisplayLocation);
                   break;
                 case 7:
                   tkTemplateDa1.mActionBarType = KnownTypeAdapters$k.a(p0, tkTemplateDa1.mActionBarType);
                   break;
                 case 8:
                   tkTemplateDa1.mTemplateId = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   tkTemplateDa1.mTemplateDelayTime = KnownTypeAdapters$n.a(p0, tkTemplateDa1.mTemplateDelayTime);
                   break;
                 case 10:
                   tkTemplateDa1.mStyleType = KnownTypeAdapters$k.a(p0, tkTemplateDa1.mStyleType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tkTemplateDa1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TkTemplateData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TkTemplateData$TypeAdapter.class, "1")) {
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
          if (p1.mData != null) {
             p0.r("data");
             TypeAdapters.A.write(p0, p1.mData);
          }
          p0.r("templateShowTime");
          p0.K(p1.mTemplateShowTime);
          p0.r("templateDelayTime");
          p0.K(p1.mTemplateDelayTime);
          p0.r("showControlType");
          p0.K((long)p1.mShowControlType);
          p0.r("styleType");
          p0.K((long)p1.mStyleType);
          p0.r("resourceType");
          p0.K((long)p1.mResourceType);
          p0.r("cardType");
          p0.K((long)p1.mCardType);
          p0.r("actionBarType");
          p0.K((long)p1.mActionBarType);
          p0.r("cardDelayReplay");
          p0.P(p1.mCardDelayReplay);
          p0.r("displayLocation");
          p0.K((long)p1.mDisplayLocation);
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
