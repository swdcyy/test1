package hn8.d;
import rd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import com.facebook.react.bridge.NativeModule;
import com.swmansion.reanimated.ReanimatedModule;
import java.util.Arrays;
import com.facebook.react.uimanager.ViewManager;

public class d implements c0	// class@0025bb
{

    public void d(){
       super();
    }
    public List createNativeModules(ReactApplicationContext p0){
       NativeModule[] nativeModule = new NativeModule[]{new ReanimatedModule(p0)};
       return Arrays.asList(nativeModule);
    }
    public List createViewManagers(ReactApplicationContext p0){
       ViewManager[] viewManagerA = new ViewManager[0];
       return Arrays.asList(viewManagerA);
    }
}
