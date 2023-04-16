package com.yxcorp.gifshow.ad.download.intercept.b;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager$b;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager$a;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;

public final class b implements Runnable	// class@001760
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       AdDownloadVpnManager.a = new AdDownloadVpnManager$b(null);
       a.b().registerActivityLifecycleCallbacks(AdDownloadVpnManager.a);
    }
}
