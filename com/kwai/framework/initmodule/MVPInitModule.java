package com.kwai.framework.initmodule.MVPInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import d76.k;
import im8.d;
import im8.e;
import com.yxcorp.utility.SystemUtil;
import com.smile.gifshow.annotation.inject.Injectors;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import ee7.d;

public class MVPInitModule extends a	// class@001575
{

    public void MVPInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, MVPInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 5;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, MVPInitModule.class, "1")) {
          return;
       }
       e.g(new k());
       if (SystemUtil.I()) {
          Injectors.b = true;
          Accessors.e = true;
          d.j = true;
       }
       return;
    }
}
