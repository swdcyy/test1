package qxa.k;
import qxa.a;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.ArrayList;
import wkd.b;
import com.kwai.framework.initmodule.FoundationInfoInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.yxcorp.gifshow.init.module.BinderProxyInitModule;
import com.yxcorp.gifshow.init.module.DebugLogInitModule;
import com.kwai.framework.initmodule.RxJavaErrorHandlerInitModule;
import com.kwai.framework.abtest.ABTestInitModule;
import com.kwai.feature.platform.misc.priavykit.PrivacyKitInitModule;
import com.kwai.feature.platform.misc.albumcontrol.AlbumControlInitModule;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import tkd.b;
import tkd.d;
import jyb.a;
import com.kwai.framework.init.a;
import com.kwai.framework.network.cronet.CronetInitModule;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import com.kwai.framework.imagebase.ImageManagerInitModule;
import jkc.d;
import com.yxcorp.gifshow.init.module.LocationKeepAliveInitModule;

public class k extends a	// class@0022f4
{

    public void k(){
       super();
    }
    public Collection d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.applyWithListener(objArray, this, k.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.class;
       String obj1 = PatchProxy.applyWithListener(objArray, this, obj, "4");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = "3";
          if (PatchProxy.isSupport2(obj, obj1)) {
             Object obj2 = PatchProxy.applyOneRefsWithListener(Boolean.FALSE, this, obj, obj1);
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             label_00a2 :
                PatchProxy.onMethodExit(obj, "4");
             }
          }
          ArrayList uArrayList = new ArrayList(64);
          uArrayList.add(b.a(-2098776724));
          uArrayList.add(new FoundationInfoInitModule());
          uArrayList.add(new SwitchConfigInitModule());
          uArrayList.add(new AzerothInitModule());
          uArrayList.add(new PerformanceMonitorInitModule());
          uArrayList.add(new BinderProxyInitModule());
          uArrayList.add(new DebugLogInitModule());
          uArrayList.add(new RxJavaErrorHandlerInitModule());
          uArrayList.add(new ABTestInitModule());
          this.a(uArrayList);
          uArrayList.add(new PrivacyKitInitModule());
          uArrayList.add(new AlbumControlInitModule());
          uArrayList.add(new NotificationManagerInitModule());
          PatchProxy.onMethodExit(obj, obj1);
          obj1 = uArrayList;
          goto label_00a2 ;
       }
       obj1.add(d.a(-1079301847).TA());
       CronetInitModule uCronetInitM = new CronetInitModule();
       uCronetInitM.c(SwitchConfigInitModule.class);
       obj1.add(uCronetInitM);
       obj1.add(new ImageManagerInitModule());
       obj1.add(d.a(0x4effc8e9).qH());
       obj1.add(new LocationKeepAliveInitModule());
       PatchProxy.onMethodExit(k.class, "1");
       return obj1;
    }
}
