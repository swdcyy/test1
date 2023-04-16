package com.yxcorp.gifshow.init.module.DynamicPrefetchInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import wkd.b;
import zl6.d;
import java.util.Objects;
import tv6.a;
import lnc.u1;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.w$b;
import rv6.e;

public class DynamicPrefetchInitModule extends TTIInitModule	// class@001978
{

    public void DynamicPrefetchInitModule(){
       super();
    }
    public int f0(){
       return 5;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, DynamicPrefetchInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{SwitchConfigInitModule.class};
       PatchProxy.onMethodExit(DynamicPrefetchInitModule.class, "2");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DynamicPrefetchInitModule.class, "1")) {
          return;
       }
       d uod = b.a(-63867624);
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(null, uod, d.class, "1")) {
          a.e("PrefetchConfigManager", "init PrefetchConfigManager");
          u1.a(uod);
          int i = -1343064608;
          if (b.a(i).t()) {
             uod.d("init");
          }else {
             b.a(i).W(uod.e);
          }
          uod.c = d.f;
       }
       PatchProxy.onMethodExit(DynamicPrefetchInitModule.class, "1");
       return;
    }
}
