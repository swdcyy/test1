package com.kwai.performance.stability.crash.monitor.SafeModeMessageHandler$saveRootDir$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class SafeModeMessageHandler$saveRootDir$1 extends Lambda implements a	// class@000dec
{
    public final Context $context;
    public final String $dir;

    public void SafeModeMessageHandler$saveRootDir$1(Context p0,String p1){
       this.$context = p0;
       this.$dir = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       g.b(o.c(this.$context, "crash_monitor_safe_mode", 0).edit().putString("crash_file_root_dir", this.$dir));
    }
}
