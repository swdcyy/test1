package p80.t;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p80.v;
import android.app.Application;
import o56.a;
import java.io.File;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class t implements Runnable	// class@0028de
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t.class, "1")) {
          return;
       }
       try{
          if (!PatchProxy.applyVoid(objArray, objArray, v.class, "22")) {
             int i = 8;
             String[] stringArray = new String[]{"kswebview","kswebview_kwv_utils_process","kswebview_commonMiniService","kswebview_mini0","kswebview_mini1","kswebview_mini2","kswebview_mini3","kswebview_mini4"};
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                File dir = a.b().getDir(stringArray[i1], 0);
                a.o(dir, "AppEnv.getAppContext\(\).g¡­me, Context.MODE_PRIVATE\)");
                String path = dir.getPath();
                String separator = File.separator;
                String str = path+separator+"BrowserMetrics-spare.pma";
                v.a(str);
                StringBuilder str1 = str;
                v.a(str1+".tmp");
                v.a(path+separator+"BrowserMetrics");
             }
          }
       }catch(java.lang.Exception e0){
          Log.d("KsWebView", "Failed to deleteBrowserMetricsFiles exception info: "+e0);
       }
       return;
    }
}
