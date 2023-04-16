package com.kwai.framework.network.keyconfig.ApiRetryPolicy$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.network.keyconfig.ApiRetryPolicy;
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

public final class ApiRetryPolicy$TypeAdapter extends TypeAdapter	// class@000c12
{
    public final Gson a;
    public static final a b;

    static {
       ApiRetryPolicy$TypeAdapter.b = a.get(ApiRetryPolicy.class);
    }
    public void ApiRetryPolicy$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ApiRetryPolicy$TypeAdapter.class, "2");
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
             obj = new ApiRetryPolicy();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("apiRetryIntervalRandMs")) {
                   if (!str1.equals("apiRetryTimes")) {
                      p0.Q();
                   }else {
                      obj.apiRetryTimes = KnownTypeAdapters$k.a(p0, obj.apiRetryTimes);
                   }
                }else {
                   obj.apiRetryIntervalRandMs = KnownTypeAdapters$k.a(p0, obj.apiRetryIntervalRandMs);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApiRetryPolicy$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("apiRetryTimes");
          p0.K((long)p1.apiRetryTimes);
          p0.r("apiRetryIntervalRandMs");
          p0.K((long)p1.apiRetryIntervalRandMs);
          p0.j();
       }
       return;
    }
}
