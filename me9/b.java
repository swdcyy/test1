package me9.b;
import io.reactivex.g;
import me9.a$d;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicBridgeCenterRequestData;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import me9.a;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import me9.b$a;
import p55.a;
import f55.g;
import com.kwai.bridge.a;

public final class b implements g	// class@002fe0
{
    public final a$d b;
    public final MagicBridgeCenterRequestData c;

    public void b(a$d p0,MagicBridgeCenterRequestData p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       a c = this.b.b.c;
       String nameSpace = this.c.getNameSpace();
       String methodName = this.c.getMethodName();
       JsonObject params = this.c.getParams();
       if (params != null) {
          str = params.toString();
          if (str != null) {
          label_0033 :
             a.o(str, "bridgeData.params?.toString\(\) ?: \"\"");
             a.f(c, nameSpace, methodName, str, new b$a(p0));
             return;
          }
       }
       str = "";
       goto label_0033 ;
    }
}
