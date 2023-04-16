package com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter extends TypeAdapter	// class@000928
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter.d = a.get(PhotoAdvertisement$ExtraDisplayInfo.class);
    }
    public void PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$ExtraDisplayTag$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$ExtraDisplayInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ExtraDisplayInfo uExtraDispla = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uExtraDispla;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uExtraDispla;
       }else {
          p0.c();
          PhotoAdvertisement$ExtraDisplayInfo uExtraDispla1 = new PhotoAdvertisement$ExtraDisplayInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8de4a8b4:
                   if (str.equals("showStyle")) {
                      i = 0;
                   }
                   break;
                 case 0x19346d36:
                   if (str.equals("exposeTag")) {
                      i = 1;
                   }
                   break;
                 case 0x1d58bdc2:
                   if (str.equals("exposeTagInfoList")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uExtraDispla1.mShowStyle = KnownTypeAdapters$k.a(p0, uExtraDispla1.mShowStyle);
                   break;
                 case 1:
                   uExtraDispla1.mExposeTag = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uExtraDispla1.mTagInfoList = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uExtraDispla1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ExtraDisplayInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mExposeTag != null) {
             p0.r("exposeTag");
             TypeAdapters.A.write(p0, p1.mExposeTag);
          }
          p0.r("showStyle");
          p0.K((long)p1.mShowStyle);
          if (p1.mTagInfoList != null) {
             p0.r("exposeTagInfoList");
             this.c.write(p0, p1.mTagInfoList);
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
