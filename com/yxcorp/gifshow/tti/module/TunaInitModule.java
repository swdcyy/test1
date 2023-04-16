package com.yxcorp.gifshow.tti.module.TunaInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import xx5.a;
import u06.f;
import nmc.c;
import nmc.b;

public class TunaInitModule extends TTIInitModule	// class@001dd1
{

    public void TunaInitModule(){
       super();
    }
    public int f0(){
       return 13;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaInitModule.class, "1")) {
          return;
       }
       d.a(0x17b84847).Mv();
       d.a(-1575111559).Ka();
       d.a(0x14466a24).pB();
       d.a(-1575111559).bc();
       d.a(0x11c60373).Qf();
       return;
    }
}
