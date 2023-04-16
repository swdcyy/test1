package dxd.a;
import rd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.util.Collections;
import com.facebook.react.uimanager.ViewManager;
import org.reactnative.maskedview.RNCMaskedViewManager;
import java.util.Arrays;

public class a implements c0	// class@000cef
{

    public void a(){
       super();
    }
    public List createNativeModules(ReactApplicationContext p0){
       return Collections.emptyList();
    }
    public List createViewManagers(ReactApplicationContext p0){
       ViewManager[] viewManagerA = new ViewManager[]{new RNCMaskedViewManager()};
       return Arrays.asList(viewManagerA);
    }
}
