package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules$TypeAdapter;
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

public final class PhotoAdvertisement$PopARRuleInfo$TypeAdapter extends TypeAdapter	// class@0009cd
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$PopARRuleInfo$TypeAdapter.d = a.get(PhotoAdvertisement$PopARRuleInfo.class);
    }
    public void PhotoAdvertisement$PopARRuleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$PopARRules$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$PopARRuleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PopARRuleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PopARRuleInfo popARRuleInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return popARRuleInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return popARRuleInf;
       }else {
          p0.c();
          PhotoAdvertisement$PopARRuleInfo popARRuleInf1 = new PhotoAdvertisement$PopARRuleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("rules")) {
                p0.Q();
             }else {
                popARRuleInf1.mPopARRules = this.c.read(p0);
             }
          }
          p0.j();
          return popARRuleInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PopARRuleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PopARRuleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mPopARRules != null) {
             p0.r("rules");
             this.c.write(p0, p1.mPopARRules);
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
