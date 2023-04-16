package com.yxcorp.gifshow.ad.detail.b;
import erd.g;
import com.yxcorp.gifshow.ad.detail.AppInstalledReceiver;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public class b implements g	// class@001544
{
    public final AppInstalledReceiver b;

    public void b(AppInstalledReceiver p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          p0 = new Object[0];
          j0.f("AppInstalledReceiver", "reportKwaiGameAppInstalledLogger success", p0);
       }
       return;
    }
}
