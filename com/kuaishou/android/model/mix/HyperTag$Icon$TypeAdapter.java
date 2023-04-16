package com.kuaishou.android.model.mix.HyperTag$Icon$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.HyperTag$Icon;
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

public final class HyperTag$Icon$TypeAdapter extends TypeAdapter	// class@000cad
{
    public final Gson a;
    public static final a b;

    static {
       HyperTag$Icon$TypeAdapter.b = a.get(HyperTag$Icon.class);
    }
    public void HyperTag$Icon$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public HyperTag$Icon a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HyperTag$Icon$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       HyperTag$Icon icon = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return icon;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return icon;
       }else {
          p0.c();
          HyperTag$Icon icon1 = new HyperTag$Icon();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 'h':
                   if (str.equals("h")) {
                      i = 0;
                   }
                   break;
                 case 'w':
                   if (str.equals("w")) {
                      i = 1;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   icon1.mHeight = KnownTypeAdapters$k.a(p0, icon1.mHeight);
                   break;
                 case 1:
                   icon1.mWidth = KnownTypeAdapters$k.a(p0, icon1.mWidth);
                   break;
                 case 2:
                   icon1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return icon1;
       }
    }
    public void b(b p0,HyperTag$Icon p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HyperTag$Icon$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("w");
          p0.K((long)p1.mWidth);
          p0.r("h");
          p0.K((long)p1.mHeight);
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
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
