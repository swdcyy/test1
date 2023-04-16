package com.yxcorp.gifshow.loading.PullDownResourceStartupCommonPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.loading.PullDownResourceStartupCommonPojo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.loading.PullDownActivityResourceConfig;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.stream.b;

public final class PullDownResourceStartupCommonPojo$TypeAdapter extends TypeAdapter	// class@001a96
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PullDownResourceStartupCommonPojo$TypeAdapter.c = a.get(PullDownResourceStartupCommonPojo.class);
    }
    public void PullDownResourceStartupCommonPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(PullDownActivityResourceConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PullDownResourceStartupCommonPojo$TypeAdapter.class, "2");
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
             obj = new PullDownResourceStartupCommonPojo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("pullDownActivityResourceConfig")) {
                   p0.Q();
                }else {
                   obj.mPullDownActivityResourceConfig = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PullDownResourceStartupCommonPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPullDownActivityResourceConfig != null) {
             p0.r("pullDownActivityResourceConfig");
             this.b.write(p0, p1.mPullDownActivityResourceConfig);
          }
          p0.j();
       }
       return;
    }
}
