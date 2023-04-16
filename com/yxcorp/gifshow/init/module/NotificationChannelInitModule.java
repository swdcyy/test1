package com.yxcorp.gifshow.init.module.NotificationChannelInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.init.module.l0;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class NotificationChannelInitModule extends TTIInitModule	// class@001991
{
    public static final int q;

    public void NotificationChannelInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, NotificationChannelInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class,NotificationManagerInitModule.class};
       PatchProxy.onMethodExit(NotificationChannelInitModule.class, "3");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NotificationChannelInitModule.class, "1")) {
          return;
       }
       this.n0();
       PatchProxy.onMethodExit(NotificationChannelInitModule.class, "1");
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoidWithListener(null, this, NotificationChannelInitModule.class, "2")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 26) {
          PatchProxy.onMethodExit(NotificationChannelInitModule.class, "2");
          return;
       }else {
          e.j(l0.b, "NotificationChannelInitModule", true);
          PatchProxy.onMethodExit(NotificationChannelInitModule.class, "2");
          return;
       }
    }
}
