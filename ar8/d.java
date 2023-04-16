package ar8.d;
import rd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.util.Collections;
import com.facebook.react.uimanager.ViewManager;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import com.th3rdwave.safeareacontext.SafeAreaViewManager;
import java.util.Arrays;

public class d implements c0	// class@000314
{

    public void d(){
       super();
    }
    public List createNativeModules(ReactApplicationContext p0){
       return Collections.emptyList();
    }
    public List createViewManagers(ReactApplicationContext p0){
       ViewManager[] viewManagerA = new ViewManager[]{new SafeAreaProviderManager(p0),new SafeAreaViewManager()};
       return Arrays.asList(viewManagerA);
    }
}
