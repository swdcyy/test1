package bg.e;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class e extends b	// class@000b2b
{

    public void e(int p0){
       super(p0);
    }
    public boolean a(){
       return false;
    }
    public void b(RCTEventEmitter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       p0.receiveEvent(this.g(), "topClick", Arguments.createMap());
       return;
    }
    public String e(){
       return "topClick";
    }
}
