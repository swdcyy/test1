package com.yxcorp.gifshow.ad.detail.c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.AppInstalledReceiver;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.TextUtils;
import yx.j0;

public class c implements g	// class@001545
{
    public final AppInstalledReceiver b;

    public void c(AppInstalledReceiver p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.c("AppInstalledReceiver", TextUtils.I(p0.getMessage()), objArray);
       }
       return;
    }
}
