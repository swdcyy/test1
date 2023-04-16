package b66.p;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import b66.o;
import ok.x;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.a;
import com.kwai.logger.KwaiLog;
import com.google.gson.JsonElement;
import android.content.SharedPreferences$Editor;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import oe6.g;

public class p extends ConfigAutoParseJsonConsumer	// class@00042b
{
    public final SharedPreferences e;
    public JsonObject f;
    public static p g;

    public void p(){
       super(o.b);
       this.e = b.c("StartupCache", 0);
    }
    public static synchronized p d(){
       _monitor_enter(p.class);
       Object obj = PatchProxy.apply(null, null, p.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(p.class);
          return obj;
       }else if(p.g == null){
          p.g = new p();
       }
       _monitor_exit(p.class);
       return p.g;
    }
    public void b(Object p0){
    }
    public void c(JsonObject p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "3")) {
          return;
       }
       if (!a.t().d("startupConfigCache", false)) {
          objArray = new Object[false];
          KwaiLog.m("StartupCache", "preAccept", "startupConfigCache is false, need not cache config", objArray);
          return;
       }else {
          p0 = p0.d0();
          this.f = p0;
          p0.z0("switches");
          SharedPreferences$Editor uEditor = this.e.edit();
          uEditor.clear();
          Iterator iterator = this.f.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             JsonElement value = uEntry.getValue();
             if (value != null) {
                uEditor.putString(uEntry.getKey(), value.toString());
             }
          }
          g.a(uEditor);
          objArray = new Object[false];
          KwaiLog.m("StartupCache", "preAccept", "Success to cache startup config", objArray);
          return;
       }
    }
}
