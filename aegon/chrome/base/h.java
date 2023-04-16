package aegon.chrome.base.h;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.Class;
import dalvik.system.BaseDexClassLoader;

public class h extends ClassLoader	// class@00016e
{
    public ClassLoader a;
    public ClassLoader b;

    public Class findClass(String p0){
       try{
          return this.a.loadClass(p0);
       }catch(java.lang.ClassNotFoundException e0){
          return this.b.loadClass(p0);
       }
    }
    public String findLibrary(String p0){
       String str;
       h ta = this.a;
       if (ta instanceof BaseDexClassLoader) {
          str = ta.findLibrary(p0);
          if (str != null) {
             return str;
          }
       }else {
          str = null;
       }
       h tb = this.b;
       if (tb instanceof BaseDexClassLoader) {
          str = tb.findLibrary(p0);
       }
       return str;
    }
}
