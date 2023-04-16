package com.yxcorp.gifshow.designercreation.logger.CreationReporter;
import com.yxcorp.gifshow.designercreation.logger.CreationReporter$gson$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.util.Map;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public final class CreationReporter	// class@0012fb
{
    public static final p a;
    public static final CreationReporter b;

    static {
       CreationReporter.b = new CreationReporter();
       CreationReporter.a = s.c(CreationReporter$gson$2.INSTANCE);
    }
    public void CreationReporter(){
       super();
    }
    public final String a(HashMap p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CreationReporter uCreationRep = CreationReporter.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uCreationRep, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uCreationRep, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = CreationReporter.a.getValue();
       }
       String str = obj1.q(p0);
       a.o(str, "gson.toJson\(hashMap\)");
       return str;
    }
    public final HashMap b(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, CreationReporter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("position", "template_detail");
       obj.put("app_name", "kuaiying");
       obj.put("text", p0);
       return obj;
    }
    public final void c(e0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CreationReporter.class, "4")) {
          return;
       }
       a.p(p0, "page");
       a.p(p1, "buttonText");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = this.a(this.b(p1));
       uElementPack.action2 = "ECOSYS_BUTTON";
       u1.C0("", p0, 6, uElementPack, new ClientContent$ContentPackage());
       return;
    }
}
