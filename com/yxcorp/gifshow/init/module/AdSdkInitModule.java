package com.yxcorp.gifshow.init.module.AdSdkInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import sxa.a;
import java.lang.Runnable;
import t45.c;

public class AdSdkInitModule extends a	// class@001961
{
    public static final int q;

    public void AdSdkInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 6;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, AdSdkInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(AdSdkInitModule.class, "3");
       return Lists.e(obj);
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, AdSdkInitModule.class, "1")) {
          return;
       }
       RequestTiming cOLD_START = RequestTiming.COLD_START;
       if (!PatchProxy.applyVoidOneRefsWithListener(cOLD_START, this, AdSdkInitModule.class, "2")) {
          c.a(new a(cOLD_START));
          PatchProxy.onMethodExit(AdSdkInitModule.class, "2");
       }
       PatchProxy.onMethodExit(AdSdkInitModule.class, "1");
       return;
    }
}
