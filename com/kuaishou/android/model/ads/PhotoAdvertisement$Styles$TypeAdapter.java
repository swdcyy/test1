package com.kuaishou.android.model.ads.PhotoAdvertisement$Styles$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo$TypeAdapter;
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
import com.google.gson.stream.b;

public final class PhotoAdvertisement$Styles$TypeAdapter extends TypeAdapter	// class@000a27
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$Styles$TypeAdapter.d = a.get(PhotoAdvertisement$Styles.class);
    }
    public void PhotoAdvertisement$Styles$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$TkTemplateInfo$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$Styles a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$Styles$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$Styles styles = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return styles;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return styles;
       }else {
          p0.c();
          PhotoAdvertisement$Styles styles1 = new PhotoAdvertisement$Styles();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("templates")) {
                p0.Q();
             }else {
                styles1.mTemplates = this.c.read(p0);
             }
          }
          p0.j();
          return styles1;
       }
    }
    public void b(b p0,PhotoAdvertisement$Styles p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$Styles$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTemplates != null) {
             p0.r("templates");
             this.c.write(p0, p1.mTemplates);
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
