package bqd.b;
import rd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import com.facebook.react.bridge.NativeModule;
import fr.greweb.reactnativeviewshot.RNViewShotModule;
import java.util.Arrays;
import java.util.Collections;

public class b implements c0	// class@0002b6
{

    public void b(){
       super();
    }
    public List createNativeModules(ReactApplicationContext p0){
       NativeModule[] nativeModule = new NativeModule[]{new RNViewShotModule(p0)};
       return Arrays.asList(nativeModule);
    }
    public List createViewManagers(ReactApplicationContext p0){
       return Collections.emptyList();
    }
}
