package com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.AryaInitManager;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.AryaInitManager$ARYA_PLUGIN$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.lang.StringBuilder;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;

public final class AryaInitManager	// class@00166b
{
    public static final p a;
    public static final AryaInitManager b;

    static {
       AryaInitManager.b = new AryaInitManager();
       AryaInitManager.a = s.c(AryaInitManager$ARYA_PLUGIN$2.INSTANCE);
    }
    public void AryaInitManager(){
       super();
    }
    public final boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AryaInitManager uAryaInitMan = AryaInitManager.class;
       b obj = PatchProxy.apply(null, this, uAryaInitMan, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       try{
          obj = Dva.instance().getPluginInstallManager();
          Object obj1 = PatchProxy.apply(null, this, uAryaInitMan, "1");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = AryaInitManager.a.getValue();
          }
          obj.j(obj1).c();
          this.b("load arya so sucesss");
          b = true;
       }catch(java.lang.Exception e0){
          this.b("load arya so failed, cused by: "+e0);
          b = false;
       }
       return b;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaInitManager.class, "2")) {
          return;
       }
       a.s(MerchantCommonLogBiz.WEBVIEW, "MerchantAudioRecorder", p0);
       return;
    }
}
