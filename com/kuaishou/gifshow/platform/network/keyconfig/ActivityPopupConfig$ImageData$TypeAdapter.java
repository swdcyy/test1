package com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$ImageData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$ImageData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
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

public final class ActivityPopupConfig$ImageData$TypeAdapter extends TypeAdapter	// class@00084f
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ActivityPopupConfig$ImageData$TypeAdapter.d = a.get(ActivityPopupConfig$ImageData.class);
    }
    public void ActivityPopupConfig$ImageData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ActivityPopupConfig$ImageData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new ActivityPopupConfig$ImageData();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("cdnUrls")) {
                   if (!str1.equals("resourceKey")) {
                      p0.Q();
                   }else {
                      obj.mImageResourceKey = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mImageUrls = this.c.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityPopupConfig$ImageData$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mImageUrls != null) {
             p0.r("cdnUrls");
             this.c.write(p0, p1.mImageUrls);
          }
          if (p1.mImageResourceKey != null) {
             p0.r("resourceKey");
             TypeAdapters.A.write(p0, p1.mImageResourceKey);
          }
          p0.j();
       }
       return;
    }
}
