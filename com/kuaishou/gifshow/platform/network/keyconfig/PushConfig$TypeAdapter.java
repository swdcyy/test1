package com.kuaishou.gifshow.platform.network.keyconfig.PushConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.PushConfig;
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
import com.google.gson.stream.b;

public final class PushConfig$TypeAdapter extends TypeAdapter	// class@00087f
{
    public final Gson a;
    public static final a b;

    static {
       PushConfig$TypeAdapter.b = a.get(PushConfig.class);
    }
    public void PushConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PushConfig$TypeAdapter.class, "2");
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
             obj = new PushConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("enablePushBindDegrade")) {
                   p0.Q();
                }else {
                   obj.mEnablePushBindDegrade = KnownTypeAdapters$g.a(p0, obj.mEnablePushBindDegrade);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PushConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enablePushBindDegrade");
          p0.P(p1.mEnablePushBindDegrade);
          p0.j();
       }
       return;
    }
}
