package mk8.a;
import rd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import com.facebook.react.bridge.NativeModule;
import com.reactnativecommunity.cameraroll.CameraRollModule;
import java.util.Arrays;
import java.util.Collections;

public class a implements c0	// class@002e63
{

    public void a(){
       super();
    }
    public List createNativeModules(ReactApplicationContext p0){
       NativeModule[] nativeModule = new NativeModule[]{new CameraRollModule(p0)};
       return Arrays.asList(nativeModule);
    }
    public List createViewManagers(ReactApplicationContext p0){
       return Collections.emptyList();
    }
}
