package com.kuaishou.android.model.mix.PhotoCoverStyle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCoverStyle;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoCoverStyle$TypeAdapter extends TypeAdapter	// class@000d49
{
    public final Gson a;
    public static final a b;

    static {
       PhotoCoverStyle$TypeAdapter.b = a.get(PhotoCoverStyle.class);
    }
    public void PhotoCoverStyle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoCoverStyle a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoCoverStyle$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoCoverStyle photoCoverSt = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoCoverSt;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoCoverSt;
       }else {
          p0.c();
          PhotoCoverStyle photoCoverSt1 = new PhotoCoverStyle();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc839c3bf:
                   if (str.equals("leftBottomStyle")) {
                      i = 0;
                   }
                   break;
                 case 0xfe33a55f:
                   if (str.equals("leftBottomText")) {
                      i = 1;
                   }
                   break;
                 case 0x1aad80bf:
                   if (str.equals("showDescription")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoCoverSt1.mV3LeftBottomStyle = KnownTypeAdapters$k.a(p0, photoCoverSt1.mV3LeftBottomStyle);
                   break;
                 case 1:
                   photoCoverSt1.mV3LeftBottomText = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   photoCoverSt1.isShowDesc = KnownTypeAdapters$g.a(p0, photoCoverSt1.isShowDesc);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoCoverSt1;
       }
    }
    public void b(b p0,PhotoCoverStyle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoCoverStyle$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("showDescription");
          p0.P(p1.isShowDesc);
          p0.r("leftBottomStyle");
          p0.K((long)p1.mV3LeftBottomStyle);
          if (p1.mV3LeftBottomText != null) {
             p0.r("leftBottomText");
             TypeAdapters.A.write(p0, p1.mV3LeftBottomText);
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
