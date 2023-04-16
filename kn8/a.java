package kn8.a;
import rd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.util.Collections;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.rnscreens.ScreenContainerViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager;
import com.swmansion.rnscreens.ScreenStackHeaderSubviewManager;
import java.util.Arrays;

public class a implements c0	// class@002bc5
{

    public void a(){
       super();
    }
    public List createNativeModules(ReactApplicationContext p0){
       return Collections.emptyList();
    }
    public List createViewManagers(ReactApplicationContext p0){
       ViewManager[] viewManagerA = new ViewManager[]{new ScreenContainerViewManager(),new ScreenViewManager(),new ScreenStackViewManager(),new ScreenStackHeaderConfigViewManager(),new ScreenStackHeaderSubviewManager()};
       return Arrays.asList(viewManagerA);
    }
}
