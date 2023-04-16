package com.kwai.feature.api.platform.antispam.AntispamInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import du5.f;
import com.kwai.robust.PatchProxyResult;
import brd.a0;
import du5.e;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import bu5.a;
import erd.g;
import crd.b;

public class AntispamInitModule extends TTIInitModule	// class@00103c
{
    public static final int q;

    public void AntispamInitModule(){
       super();
    }
    public int f0(){
       return 0;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AntispamInitModule.class, "1")) {
          return;
       }
       a0 uoa0 = PatchProxy.apply(null, null, f.class, "3");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          uoa0 = a0.y(e.b).T(d.c);
       }
       uoa0.Q(new a(this));
       return;
    }
}
