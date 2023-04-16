package gn8.d;
import rd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import com.facebook.react.bridge.NativeModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.util.Arrays;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;

public class d implements c0	// class@00249a
{

    public void d(){
       super();
    }
    public List createNativeModules(ReactApplicationContext p0){
       NativeModule[] nativeModule = new NativeModule[]{new RNGestureHandlerModule(p0)};
       return Arrays.asList(nativeModule);
    }
    public List createViewManagers(ReactApplicationContext p0){
       ViewManager[] viewManagerA = new ViewManager[]{new RNGestureHandlerRootViewManager(),new RNGestureHandlerButtonViewManager()};
       return Arrays.asList(viewManagerA);
    }
}
