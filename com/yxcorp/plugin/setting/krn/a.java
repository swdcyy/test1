package com.yxcorp.plugin.setting.krn.a;
import java.lang.Runnable;
import java.lang.Object;
import qra.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import qra.l;
import com.yxcorp.gifshow.helper.PushNotifyAuthoritySource;

public final class a implements Runnable	// class@0008cc
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, null, t.class, "1")) {
       }else {
          RxBus.f.b(new l(PushNotifyAuthoritySource.Settings, true));
       }
       return;
    }
}
