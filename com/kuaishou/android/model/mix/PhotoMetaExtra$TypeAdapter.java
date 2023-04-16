package com.kuaishou.android.model.mix.PhotoMetaExtra$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoMetaExtra;
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

public final class PhotoMetaExtra$TypeAdapter extends TypeAdapter	// class@000d5c
{
    public final Gson a;
    public static final a b;

    static {
       PhotoMetaExtra$TypeAdapter.b = a.get(PhotoMetaExtra.class);
    }
    public void PhotoMetaExtra$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoMetaExtra a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoMetaExtra$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoMetaExtra photoMetaExt = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoMetaExt;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoMetaExt;
       }else {
          p0.c();
          PhotoMetaExtra photoMetaExt1 = new PhotoMetaExtra();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("iconColor")) {
                if (!str.equals("iconText")) {
                   p0.Q();
                }else {
                   photoMetaExt1.mIconText = TypeAdapters.A.read(p0);
                }
             }else {
                photoMetaExt1.mIconColor = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return photoMetaExt1;
       }
    }
    public void b(b p0,PhotoMetaExtra p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoMetaExtra$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconText != null) {
             p0.r("iconText");
             TypeAdapters.A.write(p0, p1.mIconText);
          }
          if (p1.mIconColor != null) {
             p0.r("iconColor");
             TypeAdapters.A.write(p0, p1.mIconColor);
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
