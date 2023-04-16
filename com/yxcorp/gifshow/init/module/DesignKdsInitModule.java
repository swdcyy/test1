package com.yxcorp.gifshow.init.module.DesignKdsInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.ABTestInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.kwai.resource.kds.KidIconColorConfig;
import wl7.b;
import rl7.a;
import com.kwai.sdk.switchconfig.a;
import com.kwai.resource.kds.a;
import java.util.Objects;
import com.kwai.resource.kds.KidIconResIdConfig;
import wl7.a;
import ul7.a;
import xl7.a;
import yl7.a;
import am7.a;
import em7.a;
import dm7.a;
import o46.g;
import x16.a;
import lnc.p3;
import q87.c;
import cm7.a;

public class DesignKdsInitModule extends TTIInitModule	// class@001975
{

    public void DesignKdsInitModule(){
       super();
    }
    public int f0(){
       return 23;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, DesignKdsInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{ABTestInitModule.class};
       PatchProxy.onMethodExit(DesignKdsInitModule.class, "1");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DesignKdsInitModule.class, "2")) {
          return;
       }
       String str = "3";
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, this, DesignKdsInitModule.class, str)) {
          KidIconColorConfig.INSTANCE.registerIconResource(new b());
          PatchProxy.onMethodExit(DesignKdsInitModule.class, str);
       }
       if (!PatchProxy.applyVoidWithListener(objArray, this, DesignKdsInitModule.class, "4")) {
          boolean b = a.t().d("accessOdrCdnIconResource", true);
          a uoa = a.d();
          Objects.requireNonNull(uoa);
          String str1 = "1";
          if (!PatchProxy.applyVoidOneRefs(str1, uoa, a.class, "2")) {
             uoa.a = str1;
          }
          a.d().b = b;
          KidIconResIdConfig iNSTANCE = KidIconResIdConfig.INSTANCE;
          iNSTANCE.registerIconResource(new a());
          iNSTANCE.registerIconResource(new a());
          iNSTANCE.registerIconResource(new a());
          iNSTANCE.registerIconResource(new a());
          iNSTANCE.registerIconResource(new a());
          iNSTANCE.registerIconResource(new a());
          if (!PatchProxy.applyVoid(objArray, objArray, g.class, str1) && !PatchProxy.applyVoid(objArray, objArray, a.class, str1)) {
             Object[] objArray1 = new Object[0];
             p3.D().w("PostIconsProvider", "register", objArray1);
             iNSTANCE.registerIconResource(new a());
          }
          PatchProxy.onMethodExit(DesignKdsInitModule.class, "4");
       }
       PatchProxy.onMethodExit(DesignKdsInitModule.class, "2");
       return;
    }
}
