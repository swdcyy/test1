package com.yxcorp.gifshow.tti.module.KLogScreenShotUploadInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import t45.d;
import brd.z;
import hlc.e;
import android.content.Context;
import com.yxcorp.gifshow.tti.module.c;
import erd.g;
import crd.b;

public class KLogScreenShotUploadInitModule extends TTIInitModule	// class@001dbd
{
    public static final int q;

    public void KLogScreenShotUploadInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLogScreenShotUploadInitModule.class, "1")) {
          return;
       }
       Application uApplication = a.b();
       if (!PatchProxy.applyVoidOneRefs(uApplication, this, KLogScreenShotUploadInitModule.class, "2")) {
          RxBus.f.f(b.class).observeOn(d.c).subscribe(new e(uApplication), c.b);
       }
       return;
    }
}
