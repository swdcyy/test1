package com.kuaishou.android.model.mix.CoronaLiveMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoronaLiveMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.CoronaLive;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.stream.b;

public final class CoronaLiveMeta$TypeAdapter extends TypeAdapter	// class@000c18
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CoronaLiveMeta$TypeAdapter.c = a.get(CoronaLiveMeta.class);
    }
    public void CoronaLiveMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CoronaLive.class));
    }
    public CoronaLiveMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoronaLiveMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoronaLiveMeta uCoronaLiveM = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoronaLiveM;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoronaLiveM;
       }else {
          p0.c();
          CoronaLiveMeta uCoronaLiveM1 = new CoronaLiveMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("tvLive")) {
                p0.Q();
             }else {
                uCoronaLiveM1.mCoronaLive = this.b.read(p0);
             }
          }
          p0.j();
          return uCoronaLiveM1;
       }
    }
    public void b(b p0,CoronaLiveMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaLiveMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCoronaLive != null) {
             p0.r("tvLive");
             this.b.write(p0, p1.mCoronaLive);
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
