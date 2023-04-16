package o0d.a;
import eb.c;
import android.content.ComponentCallbacks2;
import java.lang.Object;
import java.util.ArrayList;
import eb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Iterator;
import android.content.res.Configuration;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.image.common.log.Log;

public class a implements c, ComponentCallbacks2	// class@001f94
{
    public final List b;
    public final boolean c;
    public final boolean d;

    public void a(boolean p0,boolean p1){
       super();
       this.b = new ArrayList();
       this.c = p0;
       this.d = p1;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public synchronized void c(MemoryTrimType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob == null) {
             continue ;
          }else {
             uob.o(p0);
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
    }
    public void onLowMemory(){
    }
    public void onTrimMemory(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "4")) {
          return;
       }
       if (p0 != 5) {
          if (p0 != 10 && p0 != 15) {
             if (p0 != 20 && p0 != 40) {
                if (p0 != 60) {
                   if (p0 != 80) {
                      Log.c("CustomMemoryTrimmableRegistry", "Default branch\(do nothing\) hit for memory trim with level\("+p0+"\)");
                   }
                }else if(this.d != null){
                   this.c(MemoryTrimType.OnCloseToDalvikHeapLimit);
                   Log.c("CustomMemoryTrimmableRegistry", "OnCloseToDalvikHeapLimit trim half of used memory on with level\("+p0+"\)");
                }
             }else if(this.c != null){
                this.c(MemoryTrimType.OnAppBackgrounded);
                Log.c("CustomMemoryTrimmableRegistry", "OnAppBackgrounded and trim all memory cache.");
             }
          }
          if (this.d != null) {
             this.c(MemoryTrimType.OnSystemMemoryCriticallyLowWhileAppInForeground);
             Log.c("CustomMemoryTrimmableRegistry", "OnSystemMemoryCriticallyLowWhileAppInForeground trim all used memory with level\("+p0+"\)");
          }
       }else {
          goto label_007e ;
       }
    label_009e :
       return;
    }
}
