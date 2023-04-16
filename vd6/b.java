package vd6.b;
import com.kwai.plugin.dva.install.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Number;
import ad6.b;
import android.content.SharedPreferences;
import java.lang.Thread;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Exception;
import java.lang.StringBuilder;

public final class b implements a	// class@00269e
{

    public void b(){
       super();
    }
    public void a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginManager pluginManage = PluginManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "pluginName");
       PluginManager h = PluginManager.H;
       Objects.requireNonNull(h);
       Object obj = PatchProxy.apply(null, h, pluginManage, "64");
       int i = (obj != patchProxyRe)? obj.intValue(): b.a.getInt("DelayInstallTimeInSecond", 0);
       if (i) {
          Thread.sleep(((long)i * 1000));
       }
       Objects.requireNonNull(h);
       String str = PatchProxy.apply(null, h, pluginManage, "62");
       if (str != patchProxyRe) {
       }else {
          str = b.a.getString("FakeInstallFailedPlugins", "");
          a.o(str, "DefaultPreferenceHelper.¡­akeInstallFailedPlugins\(\)");
       }
       Object obj1 = str;
       int i1 = 1;
       patchProxyRe = (obj1.length() > 0)? 1: 0;
       if (patchProxyRe) {
          char[] uocharArray = new char[i1];
          uocharArray[0] = ',';
          if (StringsKt__StringsKt.G4(obj1, uocharArray, false, 0, 6, null).contains(p0)) {
             throw new Exception("Ä£Äâ "+p0+" °²×°Ê§°Ü");
          }
       }
       return;
    }
}
