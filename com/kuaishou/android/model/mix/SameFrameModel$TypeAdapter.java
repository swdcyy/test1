package com.kuaishou.android.model.mix.SameFrameModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.SameFrameModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.SameFrameModel$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.SameFrameModel$TypeAdapter$a;

public final class SameFrameModel$TypeAdapter extends TypeAdapter	// class@000dee
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       SameFrameModel$TypeAdapter.c = a.get(SameFrameModel.class);
    }
    public void SameFrameModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public SameFrameModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SameFrameModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SameFrameModel sameFrameMod = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return sameFrameMod;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return sameFrameMod;
       }else {
          p0.c();
          SameFrameModel sameFrameMod1 = new SameFrameModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xd404b4fd:
                   if (str.equals("iconUrls")) {
                      i = 0;
                   }
                   break;
                 case 0x318dd7cd:
                   if (str.equals("detailPageText")) {
                      i = 1;
                   }
                   break;
                 case 0x739ebd0b:
                   if (str.equals("descAreaText")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   sameFrameMod1.mIconUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new SameFrameModel$TypeAdapter$b(this)).a(p0);
                   break;
                 case 1:
                   sameFrameMod1.mDetailPageText = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   sameFrameMod1.mDescAreaText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return sameFrameMod1;
       }
    }
    public void b(b p0,SameFrameModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SameFrameModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mDescAreaText != null) {
             p0.r("descAreaText");
             TypeAdapters.A.write(p0, p1.mDescAreaText);
          }
          if (p1.mIconUrls != null) {
             p0.r("iconUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new SameFrameModel$TypeAdapter$a(this)).b(p0, p1.mIconUrls);
          }
          if (p1.mDetailPageText != null) {
             p0.r("detailPageText");
             TypeAdapters.A.write(p0, p1.mDetailPageText);
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
