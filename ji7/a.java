package ji7.a;
import dalvik.system.PathClassLoader;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import java.util.Iterator;
import java.util.List;
import java.lang.ClassNotFoundException;
import java.lang.Throwable;
import java.net.URL;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.util.Enumeration;

public class a extends PathClassLoader	// class@001b5e
{
    public final PathClassLoader a;
    public static a b;
    public static List c;

    static {
       a.c = new CopyOnWriteArrayList();
    }
    public void a(PathClassLoader p0){
       super("", p0);
       this.a = p0;
    }
    public ClassLoader a(){
       return this.a;
    }
    public Class findClass(String p0){
       Iterator iterator;
       Class uClass1;
       Class obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 0;
       Class uClass = this.a.loadClass(p0);
       if (Activity.class.isAssignableFrom(uClass)) {
          return uClass;
       }
       uClass = obj;
       obj = uClass;
       Plugin pluginByClas = Dva.instance().getPluginByClass(p0);
       if (pluginByClas != null) {
          return pluginByClas.getClassLoader().loadClass(p0);
       }
    }
    public String findLibrary(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.findLibrary(p0);
    }
    public URL getResource(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getResource(p0);
    }
    public InputStream getResourceAsStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SplitAssetHelper.getResourceAsStream(this.a, p0);
    }
    public Enumeration getResources(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getResources(p0);
    }
    public Class loadClass(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.findClass(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.toString();
    }
}
