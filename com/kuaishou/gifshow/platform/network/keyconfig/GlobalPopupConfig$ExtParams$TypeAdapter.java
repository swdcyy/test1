package com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig$ExtParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig$ExtParams;
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
import com.google.gson.stream.b;

public final class GlobalPopupConfig$ExtParams$TypeAdapter extends TypeAdapter	// class@000867
{
    public final Gson a;
    public static final a b;

    static {
       GlobalPopupConfig$ExtParams$TypeAdapter.b = a.get(GlobalPopupConfig$ExtParams.class);
    }
    public void GlobalPopupConfig$ExtParams$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, GlobalPopupConfig$ExtParams$TypeAdapter.class, "2");
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
             obj = new GlobalPopupConfig$ExtParams();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("photoId")) {
                   if (!str1.equals("authorId")) {
                      p0.Q();
                   }else {
                      obj.mAuthorId = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mPhotoId = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GlobalPopupConfig$ExtParams$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mAuthorId != null) {
             p0.r("authorId");
             TypeAdapters.A.write(p0, p1.mAuthorId);
          }
          if (p1.mPhotoId != null) {
             p0.r("photoId");
             TypeAdapters.A.write(p0, p1.mPhotoId);
          }
          p0.j();
       }
       return;
    }
}
