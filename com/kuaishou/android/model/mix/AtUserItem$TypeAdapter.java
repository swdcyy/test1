package com.kuaishou.android.model.mix.AtUserItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.AtUserItem;
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
import com.google.gson.stream.b;

public final class AtUserItem$TypeAdapter extends TypeAdapter	// class@000bc6
{
    public final Gson a;
    public static final a b;

    static {
       AtUserItem$TypeAdapter.b = a.get(AtUserItem.class);
    }
    public void AtUserItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public AtUserItem a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, AtUserItem$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       AtUserItem uAtUserItem = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAtUserItem;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAtUserItem;
       }else {
          p0.c();
          AtUserItem uAtUserItem1 = new AtUserItem();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x87a6188d:
                   if (str.equals("currentLivingUrl")) {
                      i = 0;
                   }
                   break;
                 case 0xce2b2e46:
                   if (str.equals("userId")) {
                      i = 1;
                   }
                   break;
                 case 0xdb15de3d:
                   if (str.equals("currentLivingId")) {
                      i = 2;
                   }
                   break;
                 case 0xfa6a8478:
                   if (str.equals("isCurrentLiving")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAtUserItem1.currentLivingUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uAtUserItem1.userId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uAtUserItem1.currentLivingId = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uAtUserItem1.isCurrentLiving = KnownTypeAdapters$g.a(p0, uAtUserItem1.isCurrentLiving);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAtUserItem1;
       }
    }
    public void b(b p0,AtUserItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AtUserItem$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.userId != null) {
             p0.r("userId");
             TypeAdapters.A.write(p0, p1.userId);
          }
          p0.r("isCurrentLiving");
          p0.P(p1.isCurrentLiving);
          if (p1.currentLivingUrl != null) {
             p0.r("currentLivingUrl");
             TypeAdapters.A.write(p0, p1.currentLivingUrl);
          }
          if (p1.currentLivingId != null) {
             p0.r("currentLivingId");
             TypeAdapters.A.write(p0, p1.currentLivingId);
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
