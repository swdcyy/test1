package of.b;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class b extends b	// class@002785
{

    public void b(int p0){
       super(p0);
    }
    public void b(RCTEventEmitter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       p0.receiveEvent(this.g(), "topDrawerOpen", Arguments.createMap());
       return;
    }
    public short d(){
       return 0;
    }
    public String e(){
       return "topDrawerOpen";
    }
}
