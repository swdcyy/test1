package com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag$TypeAdapter;
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
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$TopTagInfo$TypeAdapter extends TypeAdapter	// class@000a3d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$TopTagInfo$TypeAdapter.d = a.get(PhotoAdvertisement$TopTagInfo.class);
    }
    public void PhotoAdvertisement$TopTagInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$TopTag$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$TopTagInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TopTagInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TopTagInfo topTagInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return topTagInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return topTagInfo;
       }else {
          p0.c();
          PhotoAdvertisement$TopTagInfo topTagInfo1 = new PhotoAdvertisement$TopTagInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("tagList")) {
                if (!str.equals("templateId")) {
                   p0.Q();
                }else {
                   topTagInfo1.mTemplateId = TypeAdapters.A.read(p0);
                }
             }else {
                topTagInfo1.mTagList = this.c.read(p0);
             }
          }
          p0.j();
          return topTagInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TopTagInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TopTagInfo$TypeAdapter.class, "1")) {
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
          if (p1.mTagList != null) {
             p0.r("tagList");
             this.c.write(p0, p1.mTagList);
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
