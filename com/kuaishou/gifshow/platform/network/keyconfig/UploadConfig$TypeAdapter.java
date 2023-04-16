package com.kuaishou.gifshow.platform.network.keyconfig.UploadConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.UploadConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import java.util.Set;
import java.lang.reflect.Type;
import java.lang.String;
import com.google.gson.stream.a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.stream.b;

public final class UploadConfig$TypeAdapter extends TypeAdapter	// class@000888
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       UploadConfig$TypeAdapter.c = a.get(UploadConfig.class);
    }
    public void UploadConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       Type[] typeArray = new Type[]{String.class};
       this.b = p0.j(a.getParameterized(Set.class, typeArray));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UploadConfig$TypeAdapter.class, "2");
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
             obj = new UploadConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("clientTranscodeDegradeTypes")) {
                   p0.Q();
                }else {
                   obj.clientTranscodeDegradeTypes = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UploadConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.clientTranscodeDegradeTypes != null) {
             p0.r("clientTranscodeDegradeTypes");
             this.b.write(p0, p1.clientTranscodeDegradeTypes);
          }
          p0.j();
       }
       return;
    }
}
