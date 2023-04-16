package k4.a;
import rd.d;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import com.facebook.react.uimanager.ViewManager;
import com.BV.LinearGradient.LinearGradientManager;
import java.lang.Object;
import java.util.Arrays;
import java.util.Collections;
import ge.b;
import com.BV.LinearGradient.a;
import javax.inject.Provider;
import java.lang.String;
import com.facebook.react.bridge.ModuleSpec;

public class a extends d	// class@002485
{

    public void a(){
       super();
    }
    public List createViewManagers(ReactApplicationContext p0){
       ViewManager[] viewManagerA = new ViewManager[]{new LinearGradientManager()};
       return Arrays.asList(viewManagerA);
    }
    public List getNativeModules(ReactApplicationContext p0){
       return Collections.emptyList();
    }
    public b getReactModuleInfoProvider(){
       return d.getReactModuleInfoProviderViaReflection(this);
    }
    public List getViewManagers(ReactApplicationContext p0){
       return Collections.singletonList(ModuleSpec.viewManagerSpec(a.a, "BVLinearGradient"));
    }
}
