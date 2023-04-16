package ye.a;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import rd.c0;
import rd.i0;
import ge.b;
import java.util.Map;
import java.util.Collection;
import com.facebook.react.module.model.ReactModuleInfo;
import java.lang.String;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.CxxModuleWrapper;
import ve.d0;
import com.facebook.react.bridge.NativeModule;
import yd.e;

public abstract class a extends TurboModuleManagerDelegate	// class@00311c
{
    public final List b;
    public final ReactApplicationContext c;

    public void a(ReactApplicationContext p0,List p1){
       super();
       this.b = new ArrayList();
       this.c = p0;
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          c0 uoc0 = iterator.next();
          if (uoc0 instanceof i0) {
             this.b.add(uoc0);
          }
       }
       return;
    }
    public List a(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().d().a().values().iterator();
          while (iterator1.hasNext()) {
             ReactModuleInfo reactModuleI = iterator1.next();
             if (reactModuleI.a() && reactModuleI.c()) {
                uArrayList.add(reactModuleI.b());
             }
          }
       }
       return uArrayList;
    }
    public TurboModule b(String p0){
       TurboModule turboModule = this.c(p0);
       if (turboModule == null) {
          return null;
       }
       if (turboModule instanceof CxxModuleWrapper) {
          return null;
       }
       return turboModule;
    }
    public final TurboModule c(String p0){
       Iterator iterator = this.b.iterator();
       TurboModule turboModule = null;
       do {
          if (iterator.hasNext()) {
             i0 oi0 = iterator.next();
             if (oi0 instanceof d0) {
                continue ;
             }else {
                try{
                   ReactModuleInfo reactModuleI = oi0.d().a().get(p0);
                   if (reactModuleI == null || !reactModuleI.a()) {
                   }else {
                      NativeModule nativeModule = oi0.c(p0, this.c);
                      if (turboModule == null || (nativeModule != null && nativeModule.canOverrideExistingModule())) {
                         turboModule = nativeModule;
                      }
                   }
                }catch(java.lang.IllegalArgumentException e0){
                   goto label_0008 ;
                }
             }
          }else if(turboModule instanceof TurboModule){
             return turboModule;
          }else {
             return null;
          }
       } while (e.i);
       return null;
    }
    public CxxModuleWrapper getLegacyCxxModule(String p0){
       TurboModule turboModule = this.c(p0);
       if (turboModule == null) {
          return null;
       }
       if (!turboModule instanceof CxxModuleWrapper) {
          return null;
       }
       return turboModule;
    }
}
