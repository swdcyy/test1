package com.tencent.open.utils.h;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.ref.WeakReference;
import android.content.SharedPreferences;
import oe6.o;
import java.net.URL;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import java.lang.CharSequence;
import java.lang.Exception;

public class h	// class@000f7e
{
    public WeakReference b;
    public static h a;

    public void h(){
       super();
       this.b = null;
    }
    public static synchronized h a(){
       _monitor_enter(h.class);
       if (h.a == null) {
          h.a = new h();
       }
       _monitor_exit(h.class);
       return h.a;
    }
    public String a(Context p0,String p1){
       if (this.b == null || this.b.get() == null) {
          this.b = new WeakReference(o.c(p0, "ServerPrefs", 0));
       }
       try{
          String host = new URL(p1).getHost();
          if (host == null) {
             SLog.e("openSDK_LOG.ServerSetting", "Get host error. url="+p1);
             return p1;
          }else {
             String str = this.b.get().getString(host, null);
             if (str == null || host.equals(str)) {
                SLog.v("openSDK_LOG.ServerSetting", "host="+host+", envHost="+str);
                return p1;
             }else {
                p1 = p1.replace(host, str);
                SLog.v("openSDK_LOG.ServerSetting", "return environment url : "+p1);
                return p1;
             }
          }
       }catch(java.lang.Exception e5){
          SLog.e("openSDK_LOG.ServerSetting", "getEnvUrl url="+p1+"error.: "+e5.getMessage());
          return p1;
       }
    }
}
