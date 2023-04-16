package com.kwai.framework.config.ConfigInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import z56.a;
import com.kwai.framework.config.a;
import erd.g;
import crd.b;

public class ConfigInitModule extends a	// class@0014f7
{
    public boolean q;
    public static final int r;

    public void ConfigInitModule(){
       super();
       this.q = true;
    }
    public int f0(){
       return 21;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, ConfigInitModule.class, "1")) {
          return;
       }
       t.timer(4, TimeUnit.SECONDS).observeOn(d.c).subscribe(new a(this), a.b);
       return;
    }
    public void n(){
    }
}
