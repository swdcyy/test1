package com.kuaishou.android.model.mix.PhotoCommonTagIconInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo;
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

public final class PhotoCommonTagIconInfo$TypeAdapter extends TypeAdapter	// class@000d39
{
    public final Gson a;
    public static final a b;

    static {
       PhotoCommonTagIconInfo$TypeAdapter.b = a.get(PhotoCommonTagIconInfo.class);
    }
    public void PhotoCommonTagIconInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoCommonTagIconInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoCommonTagIconInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoCommonTagIconInfo photoCommonT = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoCommonT;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoCommonT;
       }else {
          p0.c();
          PhotoCommonTagIconInfo photoCommonT1 = new PhotoCommonTagIconInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xaca9e4cd:
                   if (str.equals("iconWidth")) {
                      i = 0;
                   }
                   break;
                 case 0xcec3bb00:
                   if (str.equals("iconHeight")) {
                      i = 1;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoCommonT1.mIconWidth = KnownTypeAdapters$k.a(p0, photoCommonT1.mIconWidth);
                   break;
                 case 1:
                   photoCommonT1.mIconHeight = KnownTypeAdapters$k.a(p0, photoCommonT1.mIconHeight);
                   break;
                 case 2:
                   photoCommonT1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoCommonT1;
       }
    }
    public void b(b p0,PhotoCommonTagIconInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoCommonTagIconInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          p0.r("iconWidth");
          p0.K((long)p1.mIconWidth);
          p0.r("iconHeight");
          p0.K((long)p1.mIconHeight);
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
