package com.kuaishou.android.model.mix.ActivityUserIconModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
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

public final class ActivityUserIconModel$TypeAdapter extends TypeAdapter	// class@000bad
{
    public final Gson a;
    public static final a b;

    static {
       ActivityUserIconModel$TypeAdapter.b = a.get(ActivityUserIconModel.class);
    }
    public void ActivityUserIconModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public ActivityUserIconModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ActivityUserIconModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ActivityUserIconModel uActivityUse = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uActivityUse;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uActivityUse;
       }else {
          p0.c();
          ActivityUserIconModel uActivityUse1 = new ActivityUserIconModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("actionUrl")) {
                if (!str.equals("iconUrl")) {
                   p0.Q();
                }else {
                   uActivityUse1.mIconUrl = TypeAdapters.A.read(p0);
                }
             }else {
                uActivityUse1.mActionUrl = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uActivityUse1;
       }
    }
    public void b(b p0,ActivityUserIconModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityUserIconModel$TypeAdapter.class, "1")) {
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
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
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
