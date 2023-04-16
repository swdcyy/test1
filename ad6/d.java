package ad6.d;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.PluginManager;
import java.util.concurrent.CountDownLatch;
import cd6.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kwai.framework.plugin.PluginManager$a;
import cd6.a;
import java.lang.System;
import ad6.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class d implements Runnable	// class@000078
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       PluginManager h = PluginManager.H;
       PluginManager.b(h).await();
       b uob = h.k();
       Objects.requireNonNull(h);
       PluginManager$a uoa = PatchProxy.apply(objArray, h, PluginManager.class, "17");
       if (uoa == PatchProxyResult.class) {
          uoa = PluginManager.x.getValue();
       }
       uob.b(uoa);
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putLong("last_clean_plugin_timestamp", System.currentTimeMillis());
       g.a(uEditor);
       h.k().c();
       return;
    }
}
