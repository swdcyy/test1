package com.kwai.component.upgrade.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.component.upgrade.UpgradeApkInitModule;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kwai.component.upgrade.f;

public final class c implements Runnable	// class@000bfe
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       f.e(RequestTiming.ON_HOME_PAGE_CREATED);
    }
}
