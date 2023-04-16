package com.kuaishou.android.model.feed.VisibilityExpiration$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.feed.VisibilityExpiration;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class VisibilityExpiration$TypeAdapter extends TypeAdapter	// class@000b7d
{
    public final Gson a;
    public static final a b;

    static {
       VisibilityExpiration$TypeAdapter.b = a.get(VisibilityExpiration.class);
    }
    public void VisibilityExpiration$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public VisibilityExpiration a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, VisibilityExpiration$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       VisibilityExpiration visibilityEx = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return visibilityEx;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return visibilityEx;
       }else {
          p0.c();
          VisibilityExpiration visibilityEx1 = new VisibilityExpiration();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("expiryDays")) {
                p0.Q();
             }else {
                visibilityEx1.mExpiryDays = KnownTypeAdapters$k.a(p0, visibilityEx1.mExpiryDays);
             }
          }
          p0.j();
          return visibilityEx1;
       }
    }
    public void b(b p0,VisibilityExpiration p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VisibilityExpiration$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("expiryDays");
          p0.K((long)p1.mExpiryDays);
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
