package com.yxcorp.gifshow.tti.module.RefreshCountryIsoModule;
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
import hlc.j;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class RefreshCountryIsoModule extends TTIInitModule	// class@001dc4
{

    public void RefreshCountryIsoModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, RefreshCountryIsoModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RefreshCountryIsoModule.class, "1")) {
          return;
       }
       e.g(new j(this), "RefreshCountryIsoModule");
       return;
    }
}
