package rd.d;
import rd.c0;
import rd.e;
import java.lang.Object;
import ge.b;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;
import rd.d$a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.facebook.react.bridge.ModuleSpec;
import hg.b$b;
import hg.b;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import javax.inject.Provider;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.lang.Iterable;
import java.util.Map;
import rd.d$b;

public abstract class d implements c0, e	// class@002aee
{

    public void d(){
       super();
    }
    public static b getReactModuleInfoProviderViaReflection(d p0){
       String str = "Unable to instantiate ReactModuleInfoProvider for ";
       try{
          Class uClass = Class.forName(p0.getClass().getCanonicalName()+"$$ReactModuleInfoProvider");
          try{
             return uClass.newInstance();
          }catch(java.lang.InstantiationException e1){
             throw new RuntimeException(str+p0.getClass(), e1);
          }catch(java.lang.IllegalAccessException e1){
             throw new RuntimeException(str+p0.getClass(), e1);
          }
       }catch(java.lang.ClassNotFoundException e0){
          return new d$a();
       }
    }
    public final List createNativeModules(ReactApplicationContext p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.getNativeModules(p0).iterator();
       while (iterator.hasNext()) {
          ModuleSpec moduleSpec = iterator.next();
          b.a(0, "createNativeModule").d("module", moduleSpec.getType()).e();
          ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
          ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
          b.b(0, "createNativeModule").e();
          uArrayList.add(moduleSpec.getProvider().get());
       }
       return uArrayList;
    }
    public ViewManager createViewManager(ReactApplicationContext p0,String p1){
       List viewManagers = this.getViewManagers(p0);
       if (viewManagers != null && !viewManagers.isEmpty()) {
          Iterator iterator = viewManagers.iterator();
          while (iterator.hasNext()) {
             ModuleSpec moduleSpec = iterator.next();
             if (moduleSpec.getName() != null && (moduleSpec.getName()).equals(p1)) {
                return moduleSpec.getProvider().get();
             }
          }
       }
       return null;
    }
    public List createViewManagers(ReactApplicationContext p0){
       List viewManagers = this.getViewManagers(p0);
       if (viewManagers == null || viewManagers.isEmpty()) {
          return Collections.emptyList();
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = viewManagers.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getProvider().get());
       }
       return uArrayList;
    }
    public Iterable getNativeModuleIterator(ReactApplicationContext p0,int p1){
       return new d$b(this, this.getNativeModules(p0), this.getReactModuleInfoProvider().a(), p1);
    }
    public abstract List getNativeModules(ReactApplicationContext p0);
    public abstract b getReactModuleInfoProvider();
    public List getViewManagerNames(ReactApplicationContext p0){
       return null;
    }
    public List getViewManagers(ReactApplicationContext p0){
       return Collections.emptyList();
    }
}
