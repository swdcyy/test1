package com.yxcorp.gifshow.model.ExtractFrameRules$TypeAdapter;
import com.google.gson.TypeAdapter;
import elb.g;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.ExtractFrameInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.yxcorp.gifshow.model.ExtractFrameInfo;
import com.google.gson.stream.b;

public final class ExtractFrameRules$TypeAdapter extends TypeAdapter	// class@001e0d
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       ExtractFrameRules$TypeAdapter.c = a.get(g.class);
    }
    public void ExtractFrameRules$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ExtractFrameInfo$TypeAdapter.d);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ExtractFrameRules$TypeAdapter.class, "2");
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
             obj = new g();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("extractFrameInfo")) {
                   p0.Q();
                }else {
                   obj.mExtractFrameInfo = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtractFrameRules$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mExtractFrameInfo != null) {
             p0.r("extractFrameInfo");
             this.b.write(p0, p1.mExtractFrameInfo);
          }
          p0.j();
       }
       return;
    }
}
