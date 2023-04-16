package com.oasisfeng.condom.CondomCore$BackgroundUidFilter;
import com.oasisfeng.condom.CondomCore;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import android.app.ActivityManager;
import android.os.Build$VERSION;
import java.util.List;

public class CondomCore$BackgroundUidFilter	// class@000a73
{
    public final List a;
    public final List b;
    public final CondomCore c;

    public void CondomCore$BackgroundUidFilter(CondomCore p0){
       this.c = p0;
       super();
       ActivityManager systemServic = p0.mBase.getSystemService("activity");
       if (systemServic == null) {
          this.a = null;
          this.b = null;
       }else if(Build$VERSION.SDK_INT >= 22){
          this.a = systemServic.getRunningServices(64);
          this.b = null;
       }else {
          this.a = null;
          this.b = systemServic.getRunningAppProcesses();
       }
       return;
    }
}
