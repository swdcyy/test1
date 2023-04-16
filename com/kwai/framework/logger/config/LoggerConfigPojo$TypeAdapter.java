package com.kwai.framework.logger.config.LoggerConfigPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import y96.e;
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

public final class LoggerConfigPojo$TypeAdapter extends TypeAdapter	// class@00165b
{
    public final Gson a;
    public static final a b;

    static {
       LoggerConfigPojo$TypeAdapter.b = a.get(e.class);
    }
    public void LoggerConfigPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LoggerConfigPojo$TypeAdapter.class, "2");
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
             obj = new e();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("clientProtoLogOff")) {
                   p0.Q();
                }else {
                   obj.mClientProtoLogOff = KnownTypeAdapters$g.a(p0, obj.mClientProtoLogOff);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LoggerConfigPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("clientProtoLogOff");
          p0.P(p1.mClientProtoLogOff);
          p0.j();
       }
       return;
    }
}
