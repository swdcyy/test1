package of.a;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class a extends b	// class@002784
{

    public void a(int p0){
       super(p0);
    }
    public void b(RCTEventEmitter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       p0.receiveEvent(this.g(), "topDrawerClose", Arguments.createMap());
       return;
    }
    public short d(){
       return 0;
    }
    public String e(){
       return "topDrawerClose";
    }
}
