package com.yxcorp.gifshow.init.module.ReceiverInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import tkd.b;
import tkd.d;
import nl9.p;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;

public class ReceiverInitModule extends TTIInitModule	// class@00199b
{

    public void ReceiverInitModule(){
       super();
    }
    public int f0(){
       return 6;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, ReceiverInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(ReceiverInitModule.class, "3");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ReceiverInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, ReceiverInitModule.class, "2")) {
          d.a(0x449d30cc).tO(a.a().a());
          PatchProxy.onMethodExit(ReceiverInitModule.class, "2");
       }
       PatchProxy.onMethodExit(ReceiverInitModule.class, "1");
       return;
    }
}
