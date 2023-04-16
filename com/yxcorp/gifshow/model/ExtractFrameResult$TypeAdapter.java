package com.yxcorp.gifshow.model.ExtractFrameResult$TypeAdapter;
import com.google.gson.TypeAdapter;
import elb.f;
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
import kotlin.jvm.internal.a;
import java.io.IOException;
import com.google.gson.stream.b;

public final class ExtractFrameResult$TypeAdapter extends TypeAdapter	// class@001e0c
{
    public final Gson a;
    public static final a b;

    static {
       ExtractFrameResult$TypeAdapter.b = a.get(f.class);
    }
    public void ExtractFrameResult$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ExtractFrameResult$TypeAdapter.class, "2");
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
             obj = new f();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("extractFrameRules")) {
                   p0.Q();
                }else {
                   str1 = TypeAdapters.A.read(p0);
                   if (PatchProxy.applyVoidOneRefs(str1, obj, f.class, "1")) {
                      continue ;
                   }else {
                      a.p(str1, "<set-?>");
                      obj.extractFrameRules = str1;
                   }
                }
             }
             p0.j();
             if (obj.a() == null) {
                throw new IOException("getExtractFrameRules\(\) cannot be null");
             }
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtractFrameResult$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.a() != null) {
             p0.r("extractFrameRules");
             TypeAdapters.A.write(p0, p1.a());
          }else if(p1.a() != null){
             throw new IOException("getExtractFrameRules\(\) cannot be null");
          }
          p0.j();
       }
       return;
    }
}
