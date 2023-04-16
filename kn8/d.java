package kn8.d;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.String;

public class d extends b	// class@002bc8
{

    public void d(int p0){
       super(p0);
    }
    public void b(RCTEventEmitter p0){
       p0.receiveEvent(this.g(), "topFinishTransitioning", Arguments.createMap());
    }
    public short d(){
       return 0;
    }
    public String e(){
       return "topFinishTransitioning";
    }
}
