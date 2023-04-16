package com.kwai.component.upgrade.d;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.component.upgrade.UpgradeApkInitModule;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kwai.component.upgrade.f;

public final class d implements Runnable	// class@000bff
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       f.e(RequestTiming.ON_FOREGROUND);
    }
}
