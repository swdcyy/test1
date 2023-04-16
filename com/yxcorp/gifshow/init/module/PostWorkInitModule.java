package com.yxcorp.gifshow.init.module.PostWorkInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.Math;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import sxa.d0;
import com.kwai.framework.init.c;
import a76.g;
import java.lang.Runnable;
import b76.a;
import iq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.init.module.t0;
import com.kwai.framework.init.e;
import sxa.c0;
import sxa.b0;

public class PostWorkInitModule extends TTIInitModule	// class@001998
{
    public boolean q;
    public boolean r;
    public a s;
    public static final int t;

    public void PostWorkInitModule(){
       super();
       boolean b = (Math.random() - 0x3f50624dd2f1a9fc < 0)? true: false;
       this.q = b;
       this.r = false;
       return;
    }
    public int f0(){
       return 2;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, PostWorkInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(PostWorkInitModule.class, "6");
       return Lists.e(obj);
    }
    public void h0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, PostWorkInitModule.class, "5")) {
          return;
       }
       d0 uod0 = new d0(this);
       if (!PatchProxy.applyVoidOneRefs(uod0, objArray, c.class, "3")) {
          c.e(new g(uod0), 5000);
       }
       PatchProxy.onMethodExit(PostWorkInitModule.class, "5");
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PostWorkInitModule.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkInitModule", "onLaunchFinish\(\) called with: event = ["+p0+"]", objArray);
       e.g(t0.b, "EditDraftInit");
       e.g(new c0(this), "DPBenchmarkConfigManager");
       e.g(new b0(this), "loadNeoDslCode");
       PatchProxy.onMethodExit(PostWorkInitModule.class, "1");
       return;
    }
}
